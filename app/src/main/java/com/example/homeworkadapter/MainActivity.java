package com.example.homeworkadapter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> foodlist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        FoodAdapter adapter=new FoodAdapter(foodlist);
        recyclerView.setAdapter(adapter);

    }

    private void loadData() {
        foodlist.add("Burger");
        foodlist.add("Shaurma");
        foodlist.add("Pizza");
        foodlist.add("Sushi");
    }
}