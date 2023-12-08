package com.example.stagii;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.stagii.globalActivity.StudentAccueilFragment;
import com.example.stagii.job.JobFindFragment;
import com.example.stagii.notification.AlertesFragment;
import com.example.stagii.user.ContactsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.HashMap;
import java.util.Map;

public class AppHomeActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    Map<Integer, Fragment> fragments = new HashMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_home);
        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null) {
            actionBar.hide();
        }
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(this);
        StudentAccueilFragment studentAccueilFragment = new StudentAccueilFragment();
        AlertesFragment alertesFragment = new AlertesFragment();
        ContactsFragment contactsFragment = new ContactsFragment();
        JobFindFragment jobFindFragment = new JobFindFragment();


        fragments.put(R.id.homeFragment, studentAccueilFragment);
        fragments.put(R.id.alertFragment, alertesFragment);
        fragments.put(R.id.mockTestFragment, contactsFragment);
        fragments.put(R.id.jobsFragment, jobFindFragment);

        bottomNavigationView.setSelectedItemId(R.id.homeFragment);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = fragments.get(item.getItemId());
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.replaceableFragment, fragment)
                    .commit();
            return true;
        }


        return false;
    }
}