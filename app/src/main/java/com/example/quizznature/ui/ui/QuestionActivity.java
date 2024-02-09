package com.example.quizznature.ui.ui;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.quizznature.R;
import com.example.quizznature.model.QuestionAttributes;
import com.example.quizznature.model.Quizz;
import com.example.quizznature.model.QuizzAttributes;

public class QuestionActivity extends AppCompatActivity {
    private TextView textViewQuestion;
    private RadioGroup radioGroupOptions;
    private RadioButton radioButtonA, radioButtonB, radioButtonC, radioButtonD;
    private Button buttonSubmit;
    private QuestionAttributes question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        // Initialiser les vues
        textViewQuestion = findViewById(R.id.textViewQuestion);
        radioGroupOptions = findViewById(R.id.radioGroupOptions);
        radioButtonA = findViewById(R.id.radioButtonA);
        radioButtonB = findViewById(R.id.radioButtonB);
        radioButtonC = findViewById(R.id.radioButtonC);
        radioButtonD = findViewById(R.id.radioButtonD);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        Quizz quizz = new Quizz(1, new QuizzAttributes("Nom", "description", null));
        question = new QuestionAttributes("Quelle est la question ?", "Option A", "Option B", "Option C", "Option D", "Réponse correcte", quizz);

        // Affichez la question et les options
        displayQuestion();

        // Ajouter un écouteur de clic au bouton de soumission
        buttonSubmit.setOnClickListener(view -> {
            // Traiter la soumission de la réponse
            // Accéder à la réponse sélectionnée
            int selectedRadioButtonId = radioGroupOptions.getCheckedRadioButtonId();
            // Utiliser selectedRadioButtonId pour obtenir la réponse sélectionnée
            if (selectedRadioButtonId != -1) {
                // Une réponse a été sélectionnée

                // Utiliser selectedRadioButton Id pour obtenir la réponse sélectionnée
                RadioButton selectedRadioButton = findViewById(selectedRadioButtonId);
                String selectedAnswer = selectedRadioButton.getText().toString();

                // Comparer la réponse sélectionnée avec la réponse correcte
                if (selectedAnswer.equals(question.getAnswer())) {
                    // La réponse est correcte
                    displayResultMessage("Correct !");
                } else {
                    // La réponse est incorrecte
                    displayResultMessage("Incorrect. La réponse correcte est : " + question.getAnswer());
                }
            }
        });
    }
    private void displayQuestion() {
        // Affichez le texte de la question et les options dans les vues
        textViewQuestion.setText(question.getText());
        radioButtonA.setText(question.getA());
        radioButtonB.setText(question.getB());
        radioButtonC.setText(question.getC());
        radioButtonD.setText(question.getD());
    }

    private void displayResultMessage(String message) {
        Toast.makeText(QuestionActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}
