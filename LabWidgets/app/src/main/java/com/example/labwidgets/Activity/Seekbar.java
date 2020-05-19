package com.example.labwidgets.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.labwidgets.R;

public class Seekbar extends AppCompatActivity {
    private SeekBar sBar1;
    private SeekBar sBar2;
    private TextView tView2;
    private Button btnRating;
    private Button btnVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);

        sBar1 = (SeekBar) findViewById(R.id.seekBar);
        tView2 = (TextView) findViewById(R.id.textView3);
        tView2.setText(sBar1.getProgress() + "/" + sBar1.getMax());

        btnRating = (Button) findViewById(R.id.ratingBTN);
        btnVideo = (Button) findViewById(R.id.videoBTN);

        sBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int pval = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                pval = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //write custom code to on start progress
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                tView2.setText(pval + "/" + seekBar.getMax());
            }
        });


        sBar2 = (SeekBar) findViewById(R.id.seekBar2);

        sBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int pval = 0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                pval = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //write custom code to on start progress
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), pval + "/" + seekBar.getMax(), Toast.LENGTH_LONG).show();

            }
        });

        btnRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toRatingStars();
            }
        });

        btnVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toVideo();
            }
        });

    }

    public void toRatingStars() {
        Intent i = new Intent(getBaseContext(), RatingStars.class);
        startActivity(i);
        finish();
    }

    public void toVideo() {
        Intent i = new Intent(getBaseContext(), VideoView_Activity.class);
        startActivity(i);
        finish();
    }
}


























































































