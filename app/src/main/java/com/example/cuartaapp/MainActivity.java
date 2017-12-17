package com.example.cuartaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView sumatx;
    Button sumaBt;
    EditText numero1input,numero2input;
    int suma=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumatx = (TextView) findViewById(R.id.sumatx);
        sumaBt = (Button) findViewById(R.id.sumaBt);
        numero1input = (EditText) findViewById(R.id.numero1input);
        numero2input = (EditText) findViewById(R.id.numero2input);

        sumaBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!numero1input.getText().toString().equals("")){
                    if(!numero2input.getText().toString().equals("")){
                          suma= Integer.parseInt(numero1input.getText().toString())+Integer.parseInt(numero2input.getText().toString());
                          sumatx.setText(getString(R.string.sumatx)+Integer.toString(suma));
                    } else{
                        Toast.makeText(MainActivity.this, "Faltan numero 2", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Faltan numero 1", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
