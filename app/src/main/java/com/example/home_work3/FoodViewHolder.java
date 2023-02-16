package com.example.home_work3;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.home_work3.databinding.ItemFoodBinding;

public class FoodViewHolder extends RecyclerView.ViewHolder {
    private ItemFoodBinding binding;
    public FoodViewHolder(ItemFoodBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(String food){
        binding.tvFood.setText(food);
    }

}
