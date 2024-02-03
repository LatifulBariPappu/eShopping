package com.example.eshopping.activities.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import android.os.Bundle;
import com.example.eshopping.activities.adapters.CategoryAdapter;
import com.example.eshopping.activities.adapters.ProductAdapter;
import com.example.eshopping.activities.model.Category;
import com.example.eshopping.activities.model.Product;
import com.example.eshopping.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    CategoryAdapter categoryAdapter;
    ArrayList<Category> categories;

    ProductAdapter productAdapter;
    ArrayList<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initCategories();
        initProducts();
    }
    void initCategories(){
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
    void initProducts(){
        products=new ArrayList<>();

        products.add(new Product("Men's Jacket","https://wewhoroam.com/wp-content/uploads/2020/10/legendary-whitetails-mens-rugged-full-zip-dakota-utility-jacket2-scaled.jpg","",2290,140,1,1));
        products.add(new Product("Ladies Fancy Suit","https://i.pinimg.com/originals/d6/0c/ae/d60cae213c52ae8111a55da8ff28e5b8.png","",3110,220,1,2));

        products.add(new Product("shoes","https://images-na.ssl-images-amazon.com/images/I/81fqm6+eP8L.jpg","",1210,70,1,3));
        products.add(new Product("Best Quality Furniture","https://www.staples-3p.com/s7/is/image/Staples/sp107186154_sc7?wid=512&hei=512","",20110,520,1,4));

        products.add(new Product("Shirt","https://bogdangawlik.com/data/gfx/pictures/medium/4/2/18424_1.jpg","",1110,50,1,5));
        products.add(new Product("Pearl Necklace","https://th.bing.com/th/id/R.fabbfe7f092434644d2e02468bdc8db7?rik=13pCzsdfWBGZfA&pid=ImgRaw&r=0","",3110,220,1,6));
        productAdapter=new ProductAdapter(this,products);

        GridLayoutManager layoutManager=new GridLayoutManager(this,2);
        binding.productList.setLayoutManager(layoutManager);
        binding.productList.setAdapter(productAdapter);

    }
}