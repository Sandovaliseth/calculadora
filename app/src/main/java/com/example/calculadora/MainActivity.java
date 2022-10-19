package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button btnsuma, btnresta, btnmult, btndivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.numero1);
        num2 = findViewById(R.id.numero2);

        //calcular operaciones
        btnsuma = findViewById(R.id.btn_suma);
        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //pasar a la otra pagina
                double n1 = Integer.parseInt(num1.getText().toString());
                double n2 = Integer.parseInt(num2.getText().toString());
                String btnsuma= (String.valueOf(n1+n2));
                compartirR(btnsuma);
            }
        });

        btnresta = findViewById(R.id.btn_resta);
        btnresta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Integer.parseInt(num1.getText().toString());
                double n2 = Integer.parseInt(num2.getText().toString());
                String btnresta= (String.valueOf(n1-n2));
                compartirR(btnresta);
            }
        });

        btnmult = findViewById(R.id.btn_mult);
        btnmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Integer.parseInt(num1.getText().toString());
                double n2 = Integer.parseInt(num2.getText().toString());
                String btnmulti= (String.valueOf(n1*n2));
                compartirR(btnmulti);
            }
        });

        btndivision= findViewById(R.id.btn_div);
        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Integer.parseInt(num1.getText().toString());
                double n2 = Integer.parseInt(num2.getText().toString());
                String btndivision= (String.valueOf(n1/n2));
                compartirR(btndivision);
            }
        });
    }

    public void compartirR(String result) {
        Intent resultadoR = new Intent(getApplicationContext(), MainActivity2.class);
        resultadoR.putExtra("resultado", result);
        startActivity(resultadoR);
    }
}