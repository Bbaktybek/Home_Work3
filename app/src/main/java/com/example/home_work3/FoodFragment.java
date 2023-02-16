package com.example.home_work3;

import android.media.tv.TsRequest;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.home_work3.databinding.FragmentFoodBinding;

import java.util.ArrayList;


public class FoodFragment extends Fragment {

private FragmentFoodBinding binding;

private ArrayList<String> foodList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFoodBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
    FoodAdapter adapter = new FoodAdapter(foodList);
    binding.recyclerView.setAdapter(adapter);
    GoToNextFragment();
    }

    private void GoToNextFragment() {
        binding.btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().
                        replace(R.id.container, new BookFragment()).addToBackStack(null).commit();
            }
        });
    }

    private void loadData() {
        foodList = new ArrayList<>();
        foodList.add("Макароны");
        foodList.add("Самсы");
        foodList.add("Беш бармак");
        foodList.add("Плов");
        foodList.add("Манты");
        foodList.add("Гречка");
        foodList.add("Лагман");
        foodList.add("Лагман Гуру");
        foodList.add("Стейк");
        foodList.add("Бекон");
        foodList.add("Пудинг");
        foodList.add("Вафли");
        foodList.add("Бобовый Пирог");
        foodList.add("Пирог");
        foodList.add("Блинчики");
        foodList.add("Бифштекс");


        }
    }
