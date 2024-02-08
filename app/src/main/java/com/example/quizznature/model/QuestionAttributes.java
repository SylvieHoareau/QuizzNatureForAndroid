package com.example.quizznature.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuestionAttributes extends BaseAttributes {
    @SerializedName("text")
    @Expose
    private String text;

    @SerializedName("a")
    @Expose
    private String a;

    @SerializedName("b")
    @Expose
    private String b;

    @SerializedName("c")
    @Expose
    private String c;

    @SerializedName("d")
    @Expose
    private String d;

    @SerializedName("answer")
    @Expose
    private String answer;

    // Clé étrangère en lien avec questions
    // Relation OneToOne
    @SerializedName("quizzes")
    @Expose
    private Quizz quizzes;

    public QuestionAttributes(String text, String a, String b, String c, String d, String answer, Quizz quizzes) {
        this.text = text;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.answer = answer;
        this.quizzes = quizzes;
    }

    public String getText() {
        return text;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getD() {
        return d;
    }

    public String getAnswer() {
        return answer;
    }

    public Quizz getQuizzes() {
        return quizzes;
    }

}
