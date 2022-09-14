package com.example.androiduicheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    CheckBox arroz, leite, carne, feijao, refrigerante;
    Double total = 0.0;
    TextView resultText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arroz = findViewById(R.id.arroz);
        feijao = findViewById(R.id.feijao);
        leite = findViewById(R.id.leite);
        carne = findViewById(R.id.carne);
        refrigerante = findViewById(R.id.refrigerante);
        resultText = findViewById(R.id.resultText);
        button = findViewById(R.id.button);

    }

    public void handleCalc(View v){

        DecimalFormat form = new DecimalFormat("0.00");

        if (arroz.isChecked()){
            total += 3.35;
            resultText.setText(form.format(total));
        }else {
            total = total;
            resultText.setText(form.format(total));
        }
        if (leite.isChecked()){
            total += 5.54;
            resultText.setText(form.format(total));
        }else {
            total = total;
            resultText.setText(form.format(total));
        }
        if (carne.isChecked()){
            total += 22.00;
            resultText.setText(form.format(total));
        }else {
            total = total;
            resultText.setText(form.format(total));
        }
        if (feijao.isChecked()){
            total += 6.65;
            resultText.setText(form.format(total));
        }else {
            total = total;
            resultText.setText(form.format(total));
        }
        if (refrigerante.isChecked()){
            total += 7.30;
            resultText.setText(form.format(total));
        }else {
            total = total;
            resultText.setText(form.format(total));
        }









    }
}