package com.example.eshopping.activities.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.eshopping.R;
import com.example.eshopping.activities.model.Product;
import com.example.eshopping.databinding.ItemCartBinding;

import java.util.ArrayList;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder>{
    Context context;
    ArrayList<Product> products;

    public CartAdapter(Context context, ArrayList<Product> products) {
        this.context = context;
        this.products = products;
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CartViewHolder(LayoutInflater.from(context).inflate(R.layout.item_cart,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        Product product=products.get(position);
        Glide.with(context)
                .load(product.getImage())
                .into(holder.binding.imagecart);
        holder.binding.name.setText(product.getName());
        holder.binding.pricecart.setText(product.getPrize()+" BDT");
    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class CartViewHolder extends RecyclerView.ViewHolder {
        ItemCartBinding binding;

        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
            binding=ItemCartBinding.bind(itemView);
        }
    }
}

