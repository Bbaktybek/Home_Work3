package com.example.home_work3;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.home_work3.databinding.FragmentContactBinding;

import java.util.ArrayList;

public class ContactFragment extends Fragment {

    private FragmentContactBinding binding;

    private ArrayList<String> contactList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContactBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        ContactAdapter adapter = new ContactAdapter(contactList);
        binding.recyclerView.setAdapter(adapter);
        goToNextFragment();
    }

    private void goToNextFragment() {
        binding.btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().
                        replace(R.id.container, new FoodFragment()).addToBackStack(null).commit();
            }
        });
    }

    private void loadData() {
        contactList = new ArrayList<>();
        contactList.add("Альберт");
        contactList.add("Дмитрий");
        contactList.add("Егорий");
        contactList.add("Султан");
        contactList.add("Бектур");
        contactList.add("Тимлид");
        contactList.add("Гена");
        contactList.add("Лена");
        contactList.add("Саша");
        contactList.add("Маша");
        contactList.add("Олег");
        contactList.add("Тимур");
    }
}