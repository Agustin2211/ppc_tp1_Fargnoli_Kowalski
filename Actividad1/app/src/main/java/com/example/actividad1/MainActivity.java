package com.example.actividad1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView)findViewById(R.id.tv1);

        String textoRecibido = getIntent().getStringExtra("dato");
        tv1.setText(textoRecibido);
    }

    //Metodo para el boton Cambiar
    public void Cambiar(View view){
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }

}
