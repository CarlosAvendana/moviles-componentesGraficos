package com.example.labwidgets.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.labwidgets.R;

public class RatingStars extends AppCompatActivity {
    private RatingBar rBar;
    private TextView tView;
    private Button btn;
    private Button btnInicio;
    private Button btnSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rBar = (RatingBar) findViewById(R.id.estrellas);
        tView = (TextView) findViewById(R.id.campoTexto);
        btn = (Button) findViewById(R.id.btnGet);

        btnInicio = (Button) findViewById(R.id.InicioBTN);
        btnSeekBar = (Button) findViewById(R.id.seekbarBTN);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int noofstars = rBar.getNumStars();
                float getrating = rBar.getRating();
                tView.setText("Rating: " + getrating + "/" + noofstars);
            }
        });

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toInico();
            }
        });

        btnSeekBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toSeekBar();
            }
        });


    }

    public void toInico() {
        Intent i = new Intent(getBaseContext(), Inicio.class);
        startActivity(i);
        finish();
    }

    public void toSeekBar() {
        Intent i = new Intent(getBaseContext(), Seekbar
                .class);
        startActivity(i);
        finish();
    }

}
