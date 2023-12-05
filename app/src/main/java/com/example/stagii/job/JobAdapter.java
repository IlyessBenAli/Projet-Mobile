package com.example.stagii.job;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stagii.R;

import java.util.ArrayList;
import java.util.List;

public class JobAdapter extends RecyclerView.Adapter<JobViewHolder> {

    private List<JobOffer> jobList;
    private List<JobOffer> filteredList; // Ajoutez une liste filtrée pour stocker les résultats filtrés
    Button btnApply;

    public JobAdapter(List<JobOffer> jobList) {

        this.jobList = jobList;
        this.filteredList = new ArrayList<>(jobList); // Initialisez la liste filtrée avec toutes les offres au départ
    }

    // Ajoutez une méthode pour filtrer la liste d'offres
    public void filterList(ArrayList<JobOffer> filteredList) {
        this.filteredList = filteredList;
        notifyDataSetChanged(); // Notifiez le RecyclerView du changement dans la liste filtrée
    }
    @NonNull
    @Override
    public JobViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.job_detail_card, parent, false);
        return new JobViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull JobViewHolder holder, int position) {
        JobOffer job = filteredList.get(position); // Utilisez la liste filtrée au lieu de la liste complète
        holder.bind(job);
        holder.bind(job);


    }

    @Override
    public int getItemCount() {
        return filteredList.size(); // Utilisez la taille de la liste filtrée
    }

}
