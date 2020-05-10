package com.ayoubsmatti.libreriamultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class PrincipalActivity extends AppCompatActivity {
    TextView texto_texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        texto_texto = findViewById(R.id.texto);
        texto_texto.append(" * Actividad creada * ");

    }
}
