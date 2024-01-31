package com.example.eshopping.activities.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;

import com.example.eshopping.R;
import com.example.eshopping.activities.adapters.CategoryAdapter;
import com.example.eshopping.activities.model.Category;
import com.example.eshopping.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    CategoryAdapter categoryAdapter;
    ArrayList<Category> categories;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categories=new ArrayList<>();
        categoryAdapter=new CategoryAdapter(this,categories);

        GridLayoutManager layoutManager=new GridLayoutManager(this,4);
        binding.categoriesList.setLayoutManager(layoutManager);
        binding.categoriesList.setAdapter(categoryAdapter);
    }
}