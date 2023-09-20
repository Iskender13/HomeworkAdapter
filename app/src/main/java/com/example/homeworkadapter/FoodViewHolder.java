package com.example.homeworkadapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FoodViewHolder extends RecyclerView.ViewHolder {
    private TextView tvTitle;
    public FoodViewHolder(@NonNull View itemView) {
        super(itemView);
        tvTitle=itemView.findViewById(R.id.tv_title);
    }
    public void bind(String foodName){
        tvTitle.setText(foodName);
    }
}
