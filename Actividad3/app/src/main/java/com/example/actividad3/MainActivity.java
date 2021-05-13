package com.example.actividad3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button suma;
    private Button resta;
    private Button multiplicacion;
    private Button division;

    private EditText numero1;

    private EditText numero2;

    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);

        resultado = findViewById(R.id.resultado);

        suma = findViewById(R.id.button_suma);
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(suma(Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString())) + "");
            }
        });

        resta = findViewById(R.id.button_resta);
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(resta(Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString())) + "");

            }
        });

        division = findViewById(R.id.button_division);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(division(Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString())) + "");

            }
        });

        multiplicacion = findViewById(R.id.button_multiplicacion);
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(multiplicacion(Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString())) + "");

            }
        });


    }


    public double suma(int a, int b) {
        return a + b;
    }

    public double resta(int a, int b) {
        return a - b;
    }

    public double multiplicacion(int a, int b) {
        return a * b;
    }

    public double division(int a, int b) {

        int respuesta = 0;
        if (b != 0) {
            respuesta = a / b;
        }
        return respuesta;
    }
}