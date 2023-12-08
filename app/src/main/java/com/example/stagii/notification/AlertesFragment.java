package com.example.stagii.notification;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.stagii.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AlertesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AlertesFragment extends Fragment {
    ArrayList<Notification> notificationList = new ArrayList<>();
    Notification notification1 = new Notification("Check Your Email", "Des informations importantes vous ont été envoyées par e-mail", "1 Hour Ago");

    Notification notification2 = new Notification("CANDIDATURE RAILENIUM", "Nous vous remercions pour l’intérêt porté à notre IRT RAILENIUM.\n" +
            "\n" +
            "Toutefois, votre candidature n’a pas été sélectionné pour ce stage", "5 Hour Ago");

    public AlertesFragment() {
        // Required empty public constructor
        notificationList.add(notification1);
        notificationList.add(notification2);
    }

    public static AlertesFragment newInstance(String param1, String param2) {

        return new AlertesFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_alertes, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rvNotification);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext())); // or getContext() in Fragment

        // Create an instance of your NotificationAdapter
        NotificationAdapter adapter = new NotificationAdapter(notificationList); // 'this' refers to the context

// Set the adapter to your RecyclerView
        recyclerView.setAdapter(adapter);
        return view;
    }
}