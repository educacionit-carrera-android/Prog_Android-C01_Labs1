package com.example.username.clase01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView txtNumero;
    private Button btnSumar;
    private Button btnRestar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumero = findViewById(R.id.txtNumero);
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = Integer.parseInt(txtNumero.getText().toString()) + 1;
                String resultado = String.valueOf(numero);
                txtNumero.setText(resultado);
                mostrarResultado(resultado);
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero = Integer.parseInt(txtNumero.getText().toString()) - 1;
                String resultado = String.valueOf(numero);
                txtNumero.setText(resultado);
                mostrarResultado(resultado);
            }
        });
    }

    private void mostrarResultado(String resultado) {
        Toast.makeText(this, "El resltado es: " + resultado, Toast.LENGTH_SHORT).show();
    }
}
