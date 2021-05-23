package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn7, btn4, btn1, btn8, btn5, btn2, btn9, btn6, btn3,
            btn0, btnPunto, btnIgual, btnDividir, btnMultiplicar, btnResta,
            btnSuma, btnC;

    private EditText editTextNumbers, enlazar; //input
    private TextView texView; //output
    String operacion ;
    Double numero1, numero2, resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn7 = findViewById(R.id.button7);
        btn4 = findViewById(R.id.button4);
        btn1 = findViewById(R.id.button1);
        btn8 = findViewById(R.id.button8);
        btn5 = findViewById(R.id.button5);
        btn2 = findViewById(R.id.button2);
        btn9 = findViewById(R.id.button9);
        btn6 = findViewById(R.id.button6);
        btn3 = findViewById(R.id.button3);
        btn0 = findViewById(R.id.button0);

        btnIgual = findViewById(R.id.buttonIgual);
        btnDividir = findViewById(R.id.buttonDividir);
        btnMultiplicar = findViewById(R.id.buttonMultiplicar);
        btnResta = findViewById(R.id.buttonResta);
        btnSuma = findViewById(R.id.buttonSuma);
        btnPunto = findViewById(R.id.buttonPunto);
        btnC = findViewById(R.id.buttonC);

        editTextNumbers = (EditText)findViewById(R.id.editTextNumbers);
        texView = (TextView)findViewById(R.id.textViewResultado);


        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextNumbers.setText("");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enlazar = (EditText)findViewById(R.id.editTextNumbers);
                editTextNumbers.setText(enlazar.getText().toString()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enlazar = (EditText)findViewById(R.id.editTextNumbers);
                editTextNumbers.setText(enlazar.getText().toString()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enlazar = (EditText)findViewById(R.id.editTextNumbers);
                editTextNumbers.setText(enlazar.getText().toString()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enlazar = (EditText)findViewById(R.id.editTextNumbers);
                editTextNumbers.setText(enlazar.getText().toString()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enlazar = (EditText)findViewById(R.id.editTextNumbers);
                editTextNumbers.setText(enlazar.getText().toString()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enlazar = (EditText)findViewById(R.id.editTextNumbers);
                editTextNumbers.setText(enlazar.getText().toString()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enlazar = (EditText)findViewById(R.id.editTextNumbers);
                editTextNumbers.setText(enlazar.getText().toString()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enlazar = (EditText)findViewById(R.id.editTextNumbers);
                editTextNumbers.setText(enlazar.getText().toString()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enlazar = (EditText)findViewById(R.id.editTextNumbers);
                editTextNumbers.setText(enlazar.getText().toString()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enlazar = (EditText)findViewById(R.id.editTextNumbers);
                editTextNumbers.setText(enlazar.getText().toString()+"9");
            }
        });
        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enlazar = (EditText)findViewById(R.id.editTextNumbers);
                editTextNumbers.setText(enlazar.getText().toString()+"+");
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enlazar = (EditText)findViewById(R.id.editTextNumbers);
                editTextNumbers.setText(enlazar.getText().toString()+"-");
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enlazar = (EditText)findViewById(R.id.editTextNumbers);
                editTextNumbers.setText(enlazar.getText().toString()+"*");
            }
        });
        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enlazar = (EditText)findViewById(R.id.editTextNumbers);
                editTextNumbers.setText(enlazar.getText().toString()+".");
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enlazar = (EditText)findViewById(R.id.editTextNumbers);
                editTextNumbers.setText(enlazar.getText().toString()+"/");
            }
        });
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacio(v);
            }
        });

    }

    public void onClick(View v) {
        operacio(v);
    }

    @SuppressLint("SetTextI18n")
    public void operacio(View v){
        editTextNumbers = (EditText)findViewById(R.id.editTextNumbers);
        numero1 = Double.parseDouble(editTextNumbers.getText().toString());
        numero2 = Double.parseDouble(enlazar.getText().toString());
        if (operacion.equals("/")){
            editTextNumbers.setText("");
            if (numero2 != 0){
                resultado = numero1/numero2;
            }else {
                editTextNumbers.setText("No se puede dividir por 0");
            }
        }
        if (operacion.equals("-")){
            editTextNumbers.setText("");
            resultado = numero1-numero2;
        }
        if (operacion.equals("+")){
            editTextNumbers.setText("");
            resultado = numero1+numero2;
        }
        if (operacion.equals("*")){
            editTextNumbers.setText("");
            resultado = numero1*numero2;
        }
        editTextNumbers.setText(String.valueOf(resultado));

    }

}