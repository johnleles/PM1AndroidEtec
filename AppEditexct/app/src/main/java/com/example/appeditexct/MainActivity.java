package com.example.appeditexct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Objetos java para referenciar aos objetivos xml
    EditText editNomeDigitado;
    Button btConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //referenciando o xml da tela ao java
        setContentView(R.layout.activity_main);
        //referenciar os objetos desenhados no xml aos objetos do java
        editNomeDigitado = findViewById(R.id.edtNome);
        btConfirmar = findViewById(R.id.btnConfirma);

        //Preparar o botão para clique
        btConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //variavel auxiliar
                String nome;
                //recuperar o texto digitado
                nome = editNomeDigitado.getText().toString();
                Toast.makeText(MainActivity.this, "Bem vindo " + nome, Toast.LENGTH_LONG).show();


            }
        });
    }
}