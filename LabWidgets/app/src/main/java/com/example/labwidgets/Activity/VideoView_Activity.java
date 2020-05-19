package com.example.labwidgets.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.labwidgets.R;

public class VideoView_Activity extends AppCompatActivity {

    private Button btnweb;
    private Button btnSeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view_);

        btnweb = (Button) findViewById(R.id.webBTN);
        btnSeekBar = (Button) findViewById(R.id.seekbarVBTN);

        btnSeekBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toSeekBar();
            }
        });

        btnweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toWeb();
            }
        });

        VideoView videoView = findViewById(R.id.video_view);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videoplayback;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }

    public void toSeekBar() {
        Intent i = new Intent(getBaseContext(), Seekbar.class);
        startActivity(i);
        finish();
    }

    public void toWeb() {
        Intent i = new Intent(getBaseContext(), WebView_Activity
                .class);
        startActivity(i);
        finish();
    }

}
