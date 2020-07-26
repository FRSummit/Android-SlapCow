package com.frsummit.slapcow;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Index extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }

    public void slapCowAssBtnClick(View view) {
        startActivity(new Intent(Index.this, SlapCowAss.class));
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void aboutBtnClick(View view) {
        startActivity(new Intent(Index.this, About.class));
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    public void rateBtnClick(View view) {
        Uri uri = Uri.parse("https://play.google.com/store/apps/developer?id=$FRSummit$&hl=en");
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }

    public void exitBtnClick(View view) {
        finish();
    }

    @Override
    public void finish() {
        super.finish();
//        Intent intent = getIntent();
//        if(intent.getExtras() != null) {
//            if(intent.getExtras().get("activity").equals("MainActivity")) {
//            }
//        }
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
