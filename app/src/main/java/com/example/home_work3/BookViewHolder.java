package com.example.home_work3;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.home_work3.databinding.ItemBookBinding;

public class BookViewHolder extends RecyclerView.ViewHolder {

    private ItemBookBinding binding;

    public BookViewHolder(ItemBookBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void bind(String book){
        binding.tvBook.setText(book);

    }

}
