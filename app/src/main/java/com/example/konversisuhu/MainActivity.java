package com.example.konversisuhu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etCelci;
    Button konversi, kalkulator;
    TextView tvkelvin, tvfahrenheit, tvreamur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etCelci = findViewById(R.id.celcius);
        konversi =findViewById(R.id.btnKonversi);
        tvkelvin = findViewById(R.id.kelvin);
        tvfahrenheit = findViewById(R.id.Fahrenheit);
        tvreamur = findViewById(R.id.reamur);
        kalkulator = findViewById(R.id.btnKalku);

        konversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float celcius = Float.parseFloat(etCelci.getText().toString());
                float kelvin = celcius + 273;
                float fahrenheit = celcius * 9/5 + 32;
                float reamur = celcius *4/5;

                tvkelvin.setText(Float.toString(kelvin));
                tvfahrenheit.setText(Float.toString(fahrenheit));
                tvreamur.setText(Float.toString(reamur));
            }
        });

        kalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kalkuIntent = new Intent(MainActivity.this, Kalkulator.class);
                startActivity(kalkuIntent);
            }
        });
    }
}
