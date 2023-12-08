package com.example.stagii.user;

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


public class ContactsFragment extends Fragment {
    private TextInputEditText etSearch;
    private RecyclerView recyclerView;
    private UserAdapter userAdapter;

    ArrayList<User> userList = new ArrayList<>();


    public ContactsFragment() {
        userList.add(new User(1, "Ilyess.BenAli", "ilyess.benali@isima.u-monastir.tn", "Ilyess ", "Ben ALi", "RH SOPRA Tunis", "RH SOPRA Tunis", "27330975", "Sfax"));
        userList.add(new User(2, "Bob", "bob@example.com", "Salim ", "Messedi", "Section2", "RH Telecom", "1234567892", "Marsa"));
        userList.add(new User(3, "Charlie", "charlie@example.com", "Hani", "Moussa", "Section3", "RH UBC", "1234567893", "Megrine,Tunsie"));
        userList.add(new User(4, "David", "david@example.com", "Nour", "Alem", "Section4", "RH AREA", "1234567894", "Ariana ,Tunisie"));
        userList.add(new User(5, "Emma", "emma@example.com", "Alia", "Soussi", "Section5", "RH ACTIIA", "1234567895", "SFAX"));

    }

    public static ContactsFragment newInstance(String param1, String param2) {
        return new ContactsFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_contacts, container, false);
        etSearch = view.findViewById(R.id.etSearch);
        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                filter(editable.toString());
            }
        });

        recyclerView = view.findViewById(R.id.lits);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        userAdapter = new UserAdapter(userList);
        recyclerView.setAdapter(userAdapter);

        return view;
    }

    private void filter(String text) {
        ArrayList<User> filteredList = new ArrayList<>();
        for (User user : userList) {
            if (user.getNom().toLowerCase().contains(text.toLowerCase()) || user.getPrenom().toLowerCase().contains(text.toLowerCase())) {
                filteredList.add(user);
            }
        }
        userAdapter.filterList(filteredList);
    }
}