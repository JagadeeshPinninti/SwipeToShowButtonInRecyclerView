package com.example.swipetoshowbuttoninrecyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.swipetoshowbuttoninrecyclerview.Model.Item;
import com.example.swipetoshowbuttoninrecyclerview.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    Context context;
    List<Item> itemList;

    public MyAdapter(Context context, List<Item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Glide.with(context).load(itemList.get(position).getImage()).into(holder.cart_image);
        holder.cart_item_name.setText(itemList.get(position).getName());
        holder.cart_item_price.setText(itemList.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
