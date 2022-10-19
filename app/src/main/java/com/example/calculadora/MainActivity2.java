package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

   TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        resultado= findViewById(R.id.resultadoF);
        Bundle bundle= getIntent().getExtras();
        resultado.setText(bundle.getString("resultado"));
    }

    public void Regresar(View view){
            Intent Regresar= new Intent(this, MainActivity.class);
            startActivity(Regresar);
    }
}