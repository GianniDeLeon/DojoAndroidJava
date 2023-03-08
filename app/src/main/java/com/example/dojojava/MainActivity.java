package com.example.dojojava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.txholamundo);
        button = findViewById(R.id.button);
        textView.setOnClickListener(this::onClick);
        button.setOnClickListener(this::onClick);
    }

    void cambiarText(){
        String texto = textView.getText().toString();
        textView.setText(R.string.hola_mundo);
        button.setText(texto);
    }

    void cambiarTextButton(){
        textView.setText("nuevo string");
        button.setText(R.string.hola_mundo);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.button:
                cambiarTextButton();
                break;
            case R.id.txholamundo:
                cambiarText();
                break;
        }
    }
}