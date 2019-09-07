    package com.example.myapplication11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity {

    EditText cajaNumero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaNumero = findViewById(R.id.cajaDeTexto);
    }

    public void botonGuardar(View view){
        Context context = this;
        Toast.makeText(context , "EJEMPLO DE TOAST" , Toast.LENGTH_SHORT).show();
    }





}
