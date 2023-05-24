package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private TextView tv_respuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_respuesta = (TextView)findViewById(R.id.txtRespuesta);
        spinner = (Spinner)findViewById(R.id.spinner_1);

        String [] respuestas = {"Sandia", "Mango", "Platano", "Uva", "fresa"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, respuestas);
        spinner.setAdapter(adapter);
    }

    public void mostrar(View view){
        String seleccionado = spinner.getSelectedItem().toString();
        if (seleccionado.equals("Sandia")){
            tv_respuesta.setText("Te gusta mucho");
        } else if (seleccionado.equals("Mango")){
            tv_respuesta.setText("Buen gusto");
        }else if (seleccionado.equals("Platano")){
            tv_respuesta.setText("Tienes buenos gustos");
        } else if (seleccionado.equals("Uva")){
            tv_respuesta.setText("Es mi favorita");
        } else if (seleccionado.equals("fresa")){
            tv_respuesta.setText("Buen sabor");
        }
    }

}
