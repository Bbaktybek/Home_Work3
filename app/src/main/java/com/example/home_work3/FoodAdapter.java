package com.example.home_work3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.example.home_work3.databinding.ItemFoodBinding;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodViewHolder> {

    private ArrayList<String> foodList;

    public FoodAdapter(ArrayList<String> foodList) {
        this.foodList = foodList;
    }


    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FoodViewHolder(ItemFoodBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
      holder.bind(foodList.get(position));
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }
}
