package com.example.homework_4_3m.continent;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.homework_4_3m.OnClick;
import com.example.homework_4_3m.databinding.ItemContinentBinding;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<Continent> continentArrayList;
    private OnClick onClick;

    public ContinentAdapter(ArrayList<Continent> continentArrayList, OnClick onClick) {
        this.continentArrayList = continentArrayList;
        this.onClick = onClick;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ItemContinentBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.onBind(continentArrayList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return continentArrayList.size();
    }
}

class ViewHolder extends RecyclerView.ViewHolder{
    private ItemContinentBinding binding;
    public ViewHolder(@NonNull ItemContinentBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void onBind(Continent continent){
        binding.tvContinent.setText(continent.getName());
        Glide.with(binding.imgContinent).load(continent.getImg()).into(binding.imgContinent);
    }
}
