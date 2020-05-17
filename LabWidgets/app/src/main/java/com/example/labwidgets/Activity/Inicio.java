package com.example.labwidgets.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.labwidgets.Activity.ProgressActivity;
import com.example.labwidgets.R;

public class Inicio extends AppCompatActivity {

    int mProgressStatus =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Button ingreso= (Button) findViewById(R.id.ingresoBtn);
        final ProgressBar progress1 = (ProgressBar) findViewById(R.id.progressBarInicio);

        ingreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progress1.setVisibility(View.VISIBLE);
            }
        });
    }
}

