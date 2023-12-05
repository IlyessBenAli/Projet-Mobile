package com.example.stagii.job;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stagii.user.FaculteFragement;
import com.example.stagii.R;
import com.example.stagii.globalActivity.StudentAcceuil;
import com.example.stagii.notification.Alert;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
public class JobFind extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    TextInputEditText etSearch;
    RecyclerView recyclerView;
    ArrayList<JobOffer> jobList = new ArrayList<>();
    JobAdapter adapter;

    JobOffer job1 = new JobOffer(1, "Software Developer", "ACTIA Engineering Services", "Temps Plein", 1700.0, R.drawable.logo_actia);
    JobOffer job2 = new JobOffer(2, "Marketing Manager", "Sopra HR Software", "4 jours", 2000.0,R.drawable.sopra);
    JobOffer job3 = new JobOffer(3, "Data Analyst", "Tunisie Telecom", "2 jours", 3000.0,R.drawable.tt);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_job);

        jobList.add(job1);
        jobList.add(job2);
        jobList.add(job3);

        etSearch = findViewById(R.id.etSearch);
        recyclerView = findViewById(R.id.rvJobs);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new JobAdapter(jobList);
        recyclerView.setAdapter(adapter);

        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {}

            @Override
            public void afterTextChanged(Editable editable) {
                filter(editable.toString());
            }
        });

        bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.homeFragment) {
                startActivity(new Intent(JobFind.this, StudentAcceuil.class));
                return true;
            } else if (itemId == R.id.alertFragment) {
                startActivity(new Intent(JobFind.this, Alert.class));
                return true;
            } else if (itemId == R.id.mockTestFragment) {
                startActivity(new Intent(JobFind.this, FaculteFragement.class));
                return true;
            } else if (itemId == R.id.jobsFragment) {
                startActivity(new Intent(JobFind.this, JobFind.class));
                return true;
            }

            return false;
        });
    }



    private void filter(String text) {
        ArrayList<JobOffer> filteredList = new ArrayList<>();
        for (JobOffer offer : jobList) {
            if (offer.getTitle().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(offer);
            }
        }
        adapter.filterList(filteredList);
    }

}
