package com.example.livescore;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ForYouActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_you);

        // Reference the RecyclerView
        RecyclerView forYouRecyclerView = findViewById(R.id.forYouRecyclerView);

        // TODO: Set up RecyclerView with an adapter for displaying recommended matches
    }
}