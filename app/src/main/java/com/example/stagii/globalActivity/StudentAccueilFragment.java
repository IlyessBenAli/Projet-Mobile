package com.example.stagii.globalActivity;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.stagii.R;
import com.example.stagii.job.JobAdapter;
import com.example.stagii.job.JobOffer;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link StudentAccueilFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class StudentAccueilFragment extends Fragment {

    JobOffer job1 = new JobOffer(1, "Software Developer", "ACTIA Engineering Services", "Temps Plein", 1700.0, R.drawable.logo_actia);
    JobOffer job2 = new JobOffer(2, "Marketing Manager", "Sopra HR Software", "4 jours", 2000.0, R.drawable.sopra);
    JobOffer job3 = new JobOffer(3, "Data Analyst", "Tunisie Telecom", "2 jours", 3000.0, R.drawable.tt);
    JobOffer job4 = new JobOffer(4, "Sales Representative", "Handle sales operations", "Sales", 4800.0);
    ArrayList<JobOffer> jobList = new ArrayList<>();

    public StudentAccueilFragment() {
        jobList.add(job1);
        jobList.add(job2);
        jobList.add(job3);
    }

    public static StudentAccueilFragment newInstance(String param1, String param2) {

        return new StudentAccueilFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_student_accueil, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.rvRecentJobs);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext())); // or getContext() in Fragment

        // Assuming jobList is already populated with JobOffer instances
        JobAdapter adapter = new JobAdapter(jobList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}