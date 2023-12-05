package com.example.stagii.globalActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.stagii.user.FaculteFragement;
import com.example.stagii.R;


import com.example.stagii.job.JobFind;
import com.example.stagii.notification.Alert;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
public class firstPage extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private static final int HOME_FRAGMENT_ID = R.id.homeFragment;
    private static final int ALERT_FRAGMENT_ID = R.id.alertFragment;
    private static final int MOCK_TEST_FRAGMENT_ID = R.id.mockTestFragment;
    private static final int JOBS_FRAGMENT_ID = R.id.jobsFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage_home);

        // Configurez la barre de navigation
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            try {
                if (itemId == R.id.homeFragment) {
                    startActivity(new Intent(this, StudentAcceuil.class));
                    return true;
                } else if (itemId == R.id.alertFragment) {
                    startActivity(new Intent(this, Alert.class));
                    return true;
                } else if (itemId == R.id.mockTestFragment) {
                    startActivity(new Intent(this, FaculteFragement.class));
                    return true;
                } else if (itemId == R.id.jobsFragment) {
                    startActivity(new Intent(this, JobFind.class));
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace(); // Handle or log the exception as needed
            }

            return false;
        });

        // Chargez le fragment par défaut au lancement de l'application
        loadDefaultActivity();
    }

    private void replaceActivity(Class<?> activityClass) {
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }

    private void loadDefaultActivity() {
        replaceActivity(StudentAcceuil.class);
    }
}
