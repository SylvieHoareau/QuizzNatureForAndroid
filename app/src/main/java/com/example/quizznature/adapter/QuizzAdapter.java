package com.example.quizznature.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quizznature.R;
import com.example.quizznature.model.QuizzAttributes;

import java.util.List;

public class QuizzAdapter extends RecyclerView.Adapter<QuizzAdapter.QuizzViewHolder> {

    private List<QuizzAttributes> quizzList;

    public QuizzAdapter(List<QuizzAttributes> quizzList) {
        this.quizzList = quizzList;
    }

    @NonNull
    @Override
    public QuizzViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.quizz_item_layout, parent, false);
        return new QuizzViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull QuizzViewHolder holder, int position) {
        QuizzAttributes quizz = quizzList.get(position);
        holder.textViewQuizzName.setText(quizz.getName());
        holder.textViewQuizzDescription.setText(quizz.getDescription());
    }

    @Override
    public int getItemCount() {
        return quizzList.size();
    }

    public static class QuizzViewHolder extends RecyclerView.ViewHolder {

        TextView textViewQuizzName;
        TextView textViewQuizzDescription;

        public QuizzViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewQuizzName = itemView.findViewById(R.id.textViewQuizzName);
            textViewQuizzDescription = itemView.findViewById(R.id.textViewQuizzDescription);
        }
    }

}
