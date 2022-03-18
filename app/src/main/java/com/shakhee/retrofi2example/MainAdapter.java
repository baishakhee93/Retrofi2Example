package com.shakhee.retrofi2example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainViewHolder> {
    private Context mContext;
    private List<Modle> mModleList;

    public MainAdapter(Context context, List<Modle> mModle) {
        mContext = context;
        mModleList = mModle;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MainViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        Modle modle = mModleList.get(position);
        holder.getTxt1().setText(modle.getEn());
        holder.getTxt2().setText(modle.getAuthor());

    }



    @Override
    public int getItemCount() {
        return mModleList.size();
    }
}


