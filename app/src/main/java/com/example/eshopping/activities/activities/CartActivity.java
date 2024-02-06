package com.example.eshopping.activities.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.eshopping.R;
import com.example.eshopping.databinding.ActivityCartBinding;

public class CartActivity extends AppCompatActivity {

    ActivityCartBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityCartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}