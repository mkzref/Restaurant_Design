package com.example.restaurant_design;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Resturant> myListData = Arrays.asList(new Resturant[]{
                new Resturant(R.drawable.pizza, "Pizza", "20 item = one item $ 3"  ),
                new Resturant(R.drawable.pasta, "Pasta", "5 item = one item $ 5" ),
                new Resturant(R.drawable.s, "Salads", "10 item = one item $ 7" ),
                new Resturant(R.drawable.hum, "Hamburger ", "50 item = one item $ 4"),
                new Resturant(R.drawable.rink, "Drinks", "30 item = one item $ 3"),
                new Resturant(R.drawable.hotdog, "Hot Dog", "8 item = one item $ 5" ),
                new Resturant(R.drawable.fries, "Fries ", "100 item = one item $ 8" ),

        });

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        MyListAdapter adapter = new MyListAdapter(this, myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}