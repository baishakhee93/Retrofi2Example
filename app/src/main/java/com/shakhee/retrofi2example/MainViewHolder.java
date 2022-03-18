package com.shakhee.retrofi2example;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {
    private TextView txt1, txt2;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);
        txt1 = itemView.findViewById(R.id.text_item);
        txt2 = itemView.findViewById(R.id.text_item2);
    }

    public TextView getTxt1() {
        return txt1;
    }

    public void setTxt1(TextView txt1) {
        this.txt1 = txt1;
    }

    public TextView getTxt2() {
        return txt2;
    }

    public void setTxt2(TextView txt2) {
        this.txt2 = txt2;
    }
}
