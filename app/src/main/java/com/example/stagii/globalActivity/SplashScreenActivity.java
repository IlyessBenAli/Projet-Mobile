package com.example.stagii.globalActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
 import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.stagii.R;

public class SplashScreenActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 2500; // 2 secondes
    private ImageView spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        spinner = findViewById(R.id.spinnerImageView); // Remplacez avec votre ImageView pour le spinner

        // Animation pour le spinner (optionnel, utilisez votre propre animation)
        Animation rotate = AnimationUtils.loadAnimation(this, R.anim.rotate_animation);
        spinner.startAnimation(rotate);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                spinner.clearAnimation(); // Arrête l'animation du spinner
                Intent homeIntent = new Intent(SplashScreenActivity.this, HomeActivity.class);
                startActivity(homeIntent);
                finish(); // Termine cette activité pour qu'elle ne soit pas dans la pile de retour
            }
        }, SPLASH_TIME_OUT);
    }
}
