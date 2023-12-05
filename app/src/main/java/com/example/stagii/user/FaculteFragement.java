package com.example.stagii.user;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stagii.R;
import com.example.stagii.globalActivity.StudentAcceuil;
import com.example.stagii.job.JobAdapter;
import com.example.stagii.job.JobFind;
import com.example.stagii.job.JobOffer;
import com.example.stagii.notification.Alert;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class FaculteFragement extends AppCompatActivity {
    ArrayList<User> userList = new ArrayList<>();
    private RecyclerView recyclerView;
    private UserAdapter userAdapter;
    private BottomNavigationView bottomNavigationView;
    final int homeFragmentId = R.id.homeFragment;
    final int alertFragmentId = R.id.alertFragment;
    final int mockTestFragmentId = R.id.mockTestFragment;
    final int jobsFragmentId = R.id.jobsFragment;
    TextInputEditText etSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        userList.add(new User(1, "Ilyess.BenAli", "ilyess.benali@isima.u-monastir.tn", "Ilyess ", "Ben ALi", "RH SOPRA Tunis", "RH SOPRA Tunis", "27330975", "Sfax"));
        userList.add(new User(2, "Bob", "bob@example.com", "Salim ", "Messedi", "Section2", "RH Telecom", "1234567892", "Marsa"));
        userList.add(new User(3, "Charlie", "charlie@example.com", "Hani", "Moussa", "Section3", "RH UBC", "1234567893", "Megrine,Tunsie"));
        userList.add(new User(4, "David", "david@example.com", "Nour", "Alem", "Section4", "RH AREA", "1234567894", "Ariana ,Tunisie"));
        userList.add(new User(5, "Emma", "emma@example.com", "Alia", "Soussi", "Section5", "RH ACTIIA", "1234567895", "SFAX"));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_users);

         recyclerView = findViewById(R.id.lits);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        userAdapter = new UserAdapter(userList);
        recyclerView.setAdapter(userAdapter);
        etSearch = findViewById(R.id.etSearch);

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

        bottomNavigationView = findViewById(R.id.btm);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();

            if (itemId == R.id.homeFragment) {
                startActivity(new Intent(FaculteFragement.this, StudentAcceuil.class));
                return true;
            } else if (itemId == R.id.alertFragment) {
                startActivity(new Intent(FaculteFragement.this, Alert.class));
                return true;
            } else if (itemId == R.id.mockTestFragment) {
                startActivity(new Intent(FaculteFragement.this, FaculteFragement.class));
                return true;
            } else if (itemId == R.id.jobsFragment) {
                startActivity(new Intent(FaculteFragement.this, JobFind.class));
                return true;
            }

            return false;
        });


      }

    private void filter(String text) {
        ArrayList<User> filteredList = new ArrayList<>();
        for (User user : userList) {
            if (user.getNom().toLowerCase().contains(text.toLowerCase())||user.getPrenom().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(user);
            }
        }
        userAdapter.filterList(filteredList);
    }

}

