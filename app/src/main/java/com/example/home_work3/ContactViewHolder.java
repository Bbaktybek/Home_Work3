package com.example.home_work3;

import android.view.View;

import androidx.annotation.NonNull;

import androidx.recyclerview.widget.RecyclerView;

import com.example.home_work3.databinding.ItemContactBinding;

public class ContactViewHolder extends RecyclerView.ViewHolder {

    private ItemContactBinding binding;

    public ContactViewHolder(ItemContactBinding binding) {
        super(binding.getRoot());
        this.binding = binding;

    }
    public void bind(String contact){
        binding.tvContact.setText(contact);

    }
}
