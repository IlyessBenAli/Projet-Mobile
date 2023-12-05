package com.example.stagii.globalActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stagii.user.FaculteFragement;
import com.example.stagii.R;
import com.example.stagii.job.JobAdapter;
import com.example.stagii.job.JobFind;
import com.example.stagii.job.JobOffer;
import com.example.stagii.notification.Alert;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class StudentAcceuil extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    private TextView tvWelcomeHeading, tvStatusHeading, tvCompaniesCount, tvJobAppliedCount, tvRecentJobList;
    private ImageView ivProfileImage, ivHomeBanner, ivCompanies, ivJobApplied;
    private RecyclerView recyclerView;
    JobAdapter adapter;
    ArrayList<JobOffer> jobList = new ArrayList<>();

    // Create JobOffer instances and add them to the list
    JobOffer job1 = new JobOffer(1, "Software Developer", "ACTIA Engineering Services", "Temps Plein", 1700.0, R.drawable.logo_actia);
    JobOffer job2 = new JobOffer(2, "Marketing Manager", "Sopra HR Software", "4 jours", 2000.0, R.drawable.sopra);
    JobOffer job3 = new JobOffer(3, "Data Analyst", "Tunisie Telecom", "2 jours", 3000.0, R.drawable.tt);
    JobOffer job4 = new JobOffer(4, "Sales Representative", "Handle sales operations", "Sales", 4800.0);
    // Add the JobOffer instances to the list

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_acceuil);
        jobList.add(job1);
        jobList.add(job2);
        jobList.add(job3);
        // Initializing TextViews
        tvWelcomeHeading = findViewById(R.id.tvWelcomeHeading);
        tvStatusHeading = findViewById(R.id.tvStatusHeading);
        tvCompaniesCount = findViewById(R.id.tvCompaniesCount);
        tvJobAppliedCount = findViewById(R.id.tvJobAppliedCount);
        tvRecentJobList = findViewById(R.id.tvRecentJobList);

        // Initializing ImageViews
        ivProfileImage = findViewById(R.id.ivProfileImage);
        ivHomeBanner = findViewById(R.id.ivHomeBanner);
        ivCompanies = findViewById(R.id.ivCompanies);
        ivJobApplied = findViewById(R.id.ivJobApplied);
        RecyclerView recyclerView = findViewById(R.id.rvRecentJobs);
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // or getContext() in Fragment

        // Assuming jobList is already populated with JobOffer instances
        JobAdapter adapter = new JobAdapter(jobList);
        recyclerView.setAdapter(adapter);

        bottomNavigationView = findViewById(R.id.btm);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.homeFragment) {
                startActivity(new Intent(StudentAcceuil.this, StudentAcceuil.class));
                return true;
            } else if (itemId == R.id.alertFragment) {
                startActivity(new Intent(StudentAcceuil.this, Alert.class));
                return true;
            } else if (itemId == R.id.mockTestFragment) {
                startActivity(new Intent(StudentAcceuil.this, FaculteFragement.class));
                return true;
            } else if (itemId == R.id.jobsFragment) {
                startActivity(new Intent(StudentAcceuil.this, JobFind.class));
                return true;
            }

            return false;
        });
    }


    }



