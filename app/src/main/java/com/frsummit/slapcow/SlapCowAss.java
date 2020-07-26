package com.frsummit.slapcow;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class SlapCowAss extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slap_cow_ass);
    }

    public void backBtnClickSlap(View view) {
        Intent intent = new Intent(SlapCowAss.this, Index.class);
        intent.putExtra("activity", "SlapCowAss");
        startActivity(intent);
//        overridePendingTransition(R.anim.slide_out_left, R.anim.slide_out_right);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void cow1BtnClick(View view) {
        final MediaPlayer slap = MediaPlayer.create(getApplicationContext(), R.raw.slap);
        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.s1);
        slap.start();
        mp.start();
    }

    public void cow2BtnClick(View view) {
        final MediaPlayer slap = MediaPlayer.create(getApplicationContext(), R.raw.slap);
        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.s2);
        slap.start();
        mp.start();
    }

    public void cow3BtnClick(View view) {
        final MediaPlayer slap = MediaPlayer.create(getApplicationContext(), R.raw.slap);
        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.s3);
        slap.start();
        mp.start();
    }

    public void cow4BtnClick(View view) {
        final MediaPlayer slap = MediaPlayer.create(getApplicationContext(), R.raw.slap);
        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.s4);
        slap.start();
        mp.start();
    }

    public void cow5BtnClick(View view) {
        final MediaPlayer slap = MediaPlayer.create(getApplicationContext(), R.raw.slap);
        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.s5);
        slap.start();
        mp.start();
    }

    public void cow6BtnClick(View view) {
        final MediaPlayer slap = MediaPlayer.create(getApplicationContext(), R.raw.slap);
        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.s6);
        slap.start();
        mp.start();
    }

    public void cow7BtnClick(View view) {
        final MediaPlayer slap = MediaPlayer.create(getApplicationContext(), R.raw.slap);
        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.s7);
        slap.start();
        mp.start();
    }

    public void cow8BtnClick(View view) {
        final MediaPlayer slap = MediaPlayer.create(getApplicationContext(), R.raw.slap);
        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.s8);
        slap.start();
        mp.start();
    }

    public void cow9BtnClick(View view) {
        final MediaPlayer slap = MediaPlayer.create(getApplicationContext(), R.raw.slap);
        final MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.s9);
        slap.start();
        mp.start();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_out_left, R.anim.slide_out_right);
    }
}
