package com.example.quizznature.model;

import com.google.gson.annotations.SerializedName;

public class Question {
    @SerializedName("id")
    private int id;

    @SerializedName("questionAttributes")
    private QuestionAttributes questionAttributes;

    public Question(int id, QuestionAttributes questionAttributes) {
        this.id = id;
        this.questionAttributes = questionAttributes;
    }

    public int getId() {
        return id;
    }

    public QuestionAttributes getQuestionAttributes() {
        return questionAttributes;
    }
}
