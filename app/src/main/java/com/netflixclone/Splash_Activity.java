package com.netflixclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class Splash_Activity extends AppCompatActivity {

    //Thats for duration
    static int durationofpass=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Methods
        splashscreenstart();


    }
    public void splashscreenstart(){

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splash_Activity.this,NetflixSignIn.class));
                finish();
            }
        },durationofpass);

    }

}
