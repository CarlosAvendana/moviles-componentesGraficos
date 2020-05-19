package com.example.labwidgets.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.labwidgets.R;

public class Inicio extends AppCompatActivity {

    private ProgressBar mProgressBar;
    private TextView mLoadingText;
    private int mProgressStatus = 0;
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Button ingreso= (Button) findViewById(R.id.ingresoBtn);
        mProgressBar = (ProgressBar) findViewById(R.id.progressBar2);
        mLoadingText = (TextView) findViewById(R.id.textbarcompleto);

        ingreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  mProgressBar.setVisibility(View.VISIBLE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (mProgressStatus < 100) {
                            mProgressStatus++;
                            android.os.SystemClock.sleep(50);
                            mHandler.post(new Runnable() {
                                @Override
                                public void run() {
                                    mProgressBar.setProgress(mProgressStatus);
                                    sendToNavDra();
                                }
                            });
                        }
                        mHandler.post(new Runnable() {
                            @Override
                            public void run() {
                                mLoadingText.setVisibility(View.VISIBLE);
                            }
                        });
                    }
                }).start();
            }
        });
    }

    public void sendToNavDra() {
        Intent i = new Intent(getBaseContext(),WebView_Activity.class);
        startActivity(i);
        finish();

    }

}

