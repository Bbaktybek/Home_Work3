package com.example.home_work3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.home_work3.databinding.ItemContactBinding;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    private ArrayList<String> contactList;

    public ContactAdapter(ArrayList<String> contactList) {
        this.contactList = contactList;
    }


    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactViewHolder(ItemContactBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
       holder.bind(contactList.get(position));
    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }
}
