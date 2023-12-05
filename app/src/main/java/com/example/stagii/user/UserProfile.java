package com.example.stagii.user;

 import android.os.Bundle;
 import android.view.View;
 import android.widget.ImageView;

 import androidx.appcompat.app.AppCompatActivity;

import com.example.stagii.R;

public class UserProfile extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile);
        ImageView ivPopOut = findViewById(R.id.ivPopOut);
        ivPopOut.setOnClickListener(v -> {
            finish();
        });


    }
}