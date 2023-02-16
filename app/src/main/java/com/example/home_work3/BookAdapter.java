package com.example.home_work3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.home_work3.databinding.ItemBookBinding;

import java.util.ArrayList;

public class BookAdapter extends RecyclerView.Adapter<BookViewHolder> {
    private ArrayList<String> bookList;

    public BookAdapter(ArrayList<String> bookList) {
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BookViewHolder(ItemBookBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
    holder.bind(bookList.get(position));
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }
}
