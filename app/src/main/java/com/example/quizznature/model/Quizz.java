package com.example.quizznature.model;

import com.google.gson.annotations.SerializedName;

public class Quizz {

    @SerializedName("id")
    private int id;

    @SerializedName("quizzAttributes")
    private QuizzAttributes quizzAttributes;

    public Quizz(int id, QuizzAttributes quizzAttributes) {
        this.id = id;
        this.quizzAttributes = quizzAttributes;
    }

    public int getId() {
        return id;
    }

    public QuizzAttributes getQuizzAttributes() {
        return quizzAttributes;
    }
}
