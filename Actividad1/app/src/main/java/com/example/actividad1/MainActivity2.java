package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et1 = (EditText)findViewById(R.id.et1);
    }

    //Metodo para el boton Aceptar

    public void Aceptar(View view){
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("dato", et1.getText().toString());
        startActivity(i);
    }

    //Metodo para el boton Cancelar

    public void Cancelar(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

}