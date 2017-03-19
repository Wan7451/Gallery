package com.wan7451.gallery;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by wanggang on 2017/3/17.
 */

public class Gallery extends LinearLayout {

    private RecyclerView recycle;
    private int clipWidth;
    private int interval;
    private SpaceItemDecoration intervalDecoration;
    private AutoScrollNearlyPosotionListener fastScrollListener;
    private LinearLayout.LayoutParams lp;

    public Gallery(Context context) {
        super(context);
        init();
    }

    public Gallery(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Gallery(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        setClipChildren(false);
        setOrientation(VERTICAL);

        interval = dip2px(getContext(), 5);
        clipWidth = dip2px(getContext(), 10);

        //init recycleview
        recycle = new RecyclerView(getContext());
        recycle.setClipChildren(false);
        //init decoration
        reSetDecoration();
        //init fast scroll listener
        reSetFastScrollListener();
        //init layout manager
        LinearLayoutManager mgr = new LinearLayoutManager(getContext()) {
            @Override
            protected int getExtraLayoutSpace(RecyclerView.State state) {
                //设置复用更多的预留空间
                return dip2px(getContext(), 400);
            }
        };

        mgr.setReverseLayout(false);
        mgr.setOrientation(LinearLayoutManager.HORIZONTAL);
        recycle.setLayoutManager(mgr);
        recycle.setNestedScrollingEnabled(false);

        //init layoutparams
        reSetLayoutParams();

        addView(recycle);
    }



    public void setAdapter(GalleryAdapter adapter) {
        int  width = getContext().getResources().getDisplayMetrics().widthPixels
                - 2 * (interval + clipWidth);
        adapter.setItemWidth(width);
        recycle.setAdapter(adapter);
    }


    public void setClipWidth(int clipWidth) {
        this.clipWidth = clipWidth;
        reSetLayoutParams();
        reSetFastScrollListener();
        reSetAdapter();
    }


    public void setInterval(int interval) {
        this.interval = interval;
        reSetDecoration();
        reSetFastScrollListener();
        reSetAdapter();
    }


    public void reSetAdapter() {
        GalleryAdapter adapter= (GalleryAdapter) recycle.getAdapter();
        if(adapter==null)
            return;
        int  width = getContext().getResources().getDisplayMetrics().widthPixels
                - 2 * (interval + clipWidth);
        adapter.setItemWidth(width);
        recycle.setAdapter(adapter);
    }

    private void reSetLayoutParams() {
        if (lp == null)
            lp = new LayoutParams(
                    LayoutParams.MATCH_PARENT,
                    LayoutParams.WRAP_CONTENT);

        lp.setMargins(clipWidth, 0, clipWidth, 0);
        recycle.setLayoutParams(lp);
    }

    //init scrolllistener
    private void reSetFastScrollListener() {
        if (fastScrollListener != null)
            recycle.removeOnScrollListener(fastScrollListener);
        fastScrollListener = new AutoScrollNearlyPosotionListener();
        int w = getResources().getDisplayMetrics().widthPixels
                - 2 * (interval + clipWidth);
        fastScrollListener.setItemWidth(w);
        recycle.addOnScrollListener(fastScrollListener);
    }

    //init decoration
    private void reSetDecoration() {
        if (intervalDecoration != null)
            recycle.removeItemDecoration(intervalDecoration);
        intervalDecoration = new SpaceItemDecoration(interval);
        recycle.addItemDecoration(intervalDecoration);
    }

    private static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
