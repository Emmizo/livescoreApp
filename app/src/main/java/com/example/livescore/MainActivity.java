package com.example.livescore;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set up RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Mock Data
        ArrayList<String> matches = new ArrayList<>();
        matches.add("Southampton vs Liverpool");
        matches.add("Ipswich Town vs Manchester United");

        MatchAdapter adapter = new MatchAdapter(matches);
        recyclerView.setAdapter(adapter);

        // Set up Bottom Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.menu_favourites) {
                    startActivity(new Intent(MainActivity.this, FavouritesActivity.class));
                    return true;
                } else if (itemId == R.id.menu_for_you) {
                    startActivity(new Intent(MainActivity.this, ForYouActivity.class));
                    return true;
                } else if (itemId == R.id.menu_football) {
                    // Stay in the current activity
                    return true;
                } else {
                    return false;
                }
            }
        });
    }
}