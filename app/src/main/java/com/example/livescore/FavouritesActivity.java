package com.example.livescore;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class FavouritesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);

        // Reference the RecyclerView
        RecyclerView favouritesRecyclerView = findViewById(R.id.favouritesRecyclerView);

        // TODO: Set up RecyclerView with an adapter for displaying favourite matches
    }
}