package com.example.livescore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.MatchViewHolder> {

    private final List<String> matches;

    public MatchAdapter(List<String> matches) {
        this.matches = matches;
    }

    @NonNull
    @Override
    public MatchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_match, parent, false);
        return new MatchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchViewHolder holder, int position) {
        holder.matchTitle.setText(matches.get(position));
    }

    @Override
    public int getItemCount() {
        return matches.size();
    }

    static class MatchViewHolder extends RecyclerView.ViewHolder {
        TextView matchTitle;

        public MatchViewHolder(@NonNull View itemView) {
            super(itemView);
            matchTitle = itemView.findViewById(R.id.matchTitle);
        }
    }
}
