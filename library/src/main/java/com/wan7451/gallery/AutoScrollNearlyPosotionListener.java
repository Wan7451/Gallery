package com.wan7451.gallery;

import android.support.v7.widget.RecyclerView;


/**
 * Created by Administrator on 2016/6/6 0006.
 */
public class AutoScrollNearlyPosotionListener extends RecyclerView.OnScrollListener {

    private int itemWidth;


    public void setItemWidth(int itemWidth) {
        this.itemWidth = itemWidth;
    }

    @Override
    public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
        super.onScrollStateChanged(recyclerView, newState);
        switch (newState) {
            case RecyclerView.SCROLL_STATE_IDLE:
                int p = Math.abs(Math.round(totalX / itemWidth));
                recyclerView.smoothScrollToPosition(p);
                break;
            case RecyclerView.SCROLL_STATE_DRAGGING:
                break;
            case RecyclerView.SCROLL_STATE_SETTLING:
                break;
        }
    }

    private int totalX;

    @Override
    public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);
        totalX += dx;
    }

}
