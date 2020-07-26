package com.frsummit.slapcow;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends Activity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = findViewById(R.id.imageView);
        imageView.post(new Runnable() {
            @Override
            public void run() {
                ((AnimationDrawable) imageView.getBackground()).start();
            }
        });
        changeActivity();
    }

    private void changeActivity() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Index.class);
                intent.putExtra("activity", "MainActivity");
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, 3200);
    }
}
