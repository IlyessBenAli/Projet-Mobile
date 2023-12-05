package com.example.stagii.notification;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.stagii.user.FaculteFragement;
import com.example.stagii.R;
import com.example.stagii.globalActivity.StudentAcceuil;
import com.example.stagii.job.JobFind;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class Alert extends AppCompatActivity {
    ArrayList<Notification> notificationList = new ArrayList<>();
    Notification notification1 = new Notification("Check Your Email", "Des informations importantes vous ont été envoyées par e-mail", "1 Hour Ago");

    Notification notification2 = new Notification("CANDIDATURE RAILENIUM", "Nous vous remercions pour l’intérêt porté à notre IRT RAILENIUM.\n" +
            "\n" +
            "Toutefois, votre candidature n’a pas été sélectionné pour ce stage", "5 Hour Ago");
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification);
        notificationList.add(notification1);
        notificationList.add(notification2);

        RecyclerView recyclerView = findViewById(R.id.rvNotification);
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // or getContext() in Fragment

        // Create an instance of your NotificationAdapter
        NotificationAdapter adapter = new NotificationAdapter(notificationList); // 'this' refers to the context

// Set the adapter to your RecyclerView
        recyclerView.setAdapter(adapter);

        bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.homeFragment) {
                startActivity(new Intent(Alert.this, StudentAcceuil.class));
                return true;
            } else if (itemId == R.id.alertFragment) {
                startActivity(new Intent(Alert.this, Alert.class));
                return true;
            } else if (itemId == R.id.mockTestFragment) {
                startActivity(new Intent(Alert.this, FaculteFragement.class));
                return true;
            } else if (itemId == R.id.jobsFragment) {
                startActivity(new Intent(Alert.this, JobFind.class));
                return true;
            }

            return false;
        });
    }
}
