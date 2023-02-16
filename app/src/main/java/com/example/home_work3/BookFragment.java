package com.example.home_work3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.home_work3.databinding.FragmentBookBinding;

import java.util.ArrayList;


public class BookFragment extends Fragment {
private FragmentBookBinding binding;

private ArrayList<String> bookList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBookBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        BookAdapter bookAdapter = new BookAdapter(bookList);
        binding.recyclerView.setAdapter(bookAdapter);


    }

    private void loadData() {
        bookList = new ArrayList<>();

        bookList.add("История");
        bookList.add("Алгебра");
        bookList.add("Геометрия");
        bookList.add("Информатика");
        bookList.add("Литература");
        bookList.add("Русский Язык");
        bookList.add("Черчения");
        bookList.add("К.литература");
        bookList.add("К.Язык");
        bookList.add("Физика");
        bookList.add("Химия");
        bookList.add("Биялогия");
        bookList.add("Ф.Компанент");
    }
}