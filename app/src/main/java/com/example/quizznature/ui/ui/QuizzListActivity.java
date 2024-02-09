package com.example.quizznature.ui.ui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quizznature.R;
import com.example.quizznature.adapter.QuizzAdapter;
import com.example.quizznature.model.QuizzAttributes;

import java.util.ArrayList;
import java.util.List;

public class QuizzListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private QuizzAdapter quizzAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_list);

        recyclerView = findViewById(R.id.recyclerViewQuizz);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Remplacez cette liste fictive par la liste de Quizz
        List<QuizzAttributes> quizzList = getQuizzListFromApi();

        quizzAdapter = new QuizzAdapter(quizzList);
        recyclerView.setAdapter(quizzAdapter);
    }

    // Méthode d'obtention
    private List<QuizzAttributes> getQuizzListFromApi() {
        return new ArrayList<>();
    }
}
