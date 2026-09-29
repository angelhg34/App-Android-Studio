package com.example.apptoast;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Carga la pantalla principal
        setContentView(R.layout.activity_main);

        Context context = this;

        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_LONG;

        // Inflamos el diseño personalizado del Toast
        LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate(
                R.layout.custom_toast,
                null
        );

        // Buscamos el TextView del Toast
        TextView textToast = layout.findViewById(R.id.text_toast);

        // Colocamos el mensaje
        textToast.setText(text);

        // Creamos el Toast
        Toast toast = new Toast(context);

        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }
}