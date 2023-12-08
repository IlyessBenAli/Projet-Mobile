package com.example.stagii.job;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.stagii.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;


public class JobFindFragment extends Fragment {
    private ArrayList<JobOffer> jobList = new ArrayList<>();
    private TextInputEditText etSearch;
    private RecyclerView recyclerView;
    private JobAdapter adapter;


    public JobFindFragment() {
        JobOffer job1 = new JobOffer(1, "Software Developer", "ACTIA Engineering Services", "Temps Plein", 1700.0, R.drawable.logo_actia);
        JobOffer job2 = new JobOffer(2, "Marketing Manager", "Sopra HR Software", "4 jours", 2000.0,R.drawable.sopra);
        JobOffer job3 = new JobOffer(3, "Data Analyst", "Tunisie Telecom", "2 jours", 3000.0,R.drawable.tt);

        jobList.add(job1);
        jobList.add(job2);
        jobList.add(job3);
    }

    public static JobFindFragment newInstance(String param1, String param2) {

        return new JobFindFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_job_find, container, false);

        etSearch = view.findViewById(R.id.etSearch);
        recyclerView = view.findViewById(R.id.rvJobs);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

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
        return view;

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