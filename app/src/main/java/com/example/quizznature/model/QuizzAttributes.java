package com.example.quizznature.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuizzAttributes extends BaseAttributes {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("description")
    @Expose
    private String description;

    @SerializedName("questions")
    @Expose
    private Question questions;

    public QuizzAttributes(String name, String description, Question questions) {
        this.name = name;
        this.description = description;
        this.questions = questions;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Question getQuestions() {
        return questions;
    }
}


