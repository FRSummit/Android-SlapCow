package com.frsummit.slapcow;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class About extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void backBtnClickAbout(View view) {
        Intent intent = new Intent(About.this, Index.class);
        intent.putExtra("activity", "About");
        startActivity(intent);
//        overridePendingTransition(R.anim.slide_out_left, R.anim.slide_out_right);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_out_left, R.anim.slide_out_right);
    }
}
