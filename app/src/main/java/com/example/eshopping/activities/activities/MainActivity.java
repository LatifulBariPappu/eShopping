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
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        categories=new ArrayList<>();

        categories.add(new Category("Foods & Groceries","https://cdn-icons-png.flaticon.com/512/737/737967.png","#F8C64B","Some description",1));
        categories.add(new Category("Sports & Outdoor","https://cdn-icons-png.flaticon.com/512/4163/4163684.png","#2B91F6","Some description",2));
        categories.add(new Category("Mens fashion","https://cdn-icons-png.flaticon.com/512/12648/12648049.png","#F8C64B","Some description",3));
        categories.add(new Category("Womens fashion","https://cdn-icons-png.flaticon.com/512/3534/3534312.png","#FFA2C6","Some description",4));
        categories.add(new Category("Sports & Outdoor","https://cdn-icons-png.flaticon.com/512/4163/4163684.png","#D165FF","Some description",5));
        categories.add(new Category("Babies & Toys","https://cdn-icons-png.flaticon.com/512/2867/2867024.png","#F34040","Some description",6));
        categories.add(new Category("Sports & Outdoor","https://cdn-icons-png.flaticon.com/512/1261/1261143.png","#FFC182","Some description",7));
        categories.add(new Category("Sports & Outdoor","https://cdn-icons-png.flaticon.com/512/856/856614.png","#FFA549","Some description",8));

        categoryAdapter=new CategoryAdapter(this,categories);

        GridLayoutManager layoutManager=new GridLayoutManager(this,4);
        binding.categoriesList.setLayoutManager(layoutManager);
        binding.categoriesList.setAdapter(categoryAdapter);
    }
}