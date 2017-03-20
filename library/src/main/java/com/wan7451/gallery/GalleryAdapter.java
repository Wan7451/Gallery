package com.wan7451.gallery;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wanggang on 2017/3/17.
 */

public abstract class GalleryAdapter<T> extends RecyclerView.Adapter<ViewHolder> {
    private final LayoutInflater inflater;
    private Context context;
    private List<T> list;

    private int width = 0;

    public GalleryAdapter(Context context, ArrayList<T> list) {
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(context);
    }

    protected void setItemWidth(int width) {
        this.width = width;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(getConvertLayout(), parent, false);
        ViewGroup.LayoutParams lp = view.getLayoutParams();
        lp.width = width;
        view.setLayoutParams(lp);
        return ViewHolder.createViewHolder(view);
    }

    public void setList(List<T> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public Context getContext() {
        return context;
    }

    public List<T> getList() {
        return list;
    }

    protected abstract int getConvertLayout();


    @Override
    public int getItemCount() {
        return list.size();
    }


}