package com.carlosag;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class pantalla_dos extends AppCompatActivity {

    TextView txtMensaje;
    Button btnVolveralMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_dos);

        txtMensaje = findViewById(R.id.txtMensaje);
        btnVolveralMain = findViewById(R.id.btnVolveralMain);

        String mensaje = getIntent().getStringExtra("mensaje");

        if (mensaje != null) {
            txtMensaje.setText(mensaje);
        }

        btnVolveralMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(pantalla_dos.this, MainActivity.class);

                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("pantalla_dos", "Estoy en onResume");
    }
}
