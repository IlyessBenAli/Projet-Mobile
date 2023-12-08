package com.example.stagii.user;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.stagii.R;
import com.example.stagii.job.JobOffer;
import com.example.stagii.job.JobViewHolder;
import com.example.stagii.job.Postulate;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter  extends RecyclerView.Adapter<UserViewHolder>{

    private ArrayList<User> userList;
    private List<User> filteredList; // Ajoutez une liste filtrée pour stocker les résultats filtrés

    public UserAdapter(ArrayList<User> userList) {
        this.userList = userList;
        this.filteredList = new ArrayList<>(userList); // Initialisez la liste filtrée avec toutes les offres au départ

    }
    public void filterList(ArrayList<User> filteredList) {
        this.filteredList = filteredList;
        notifyDataSetChanged(); // Notifiez le RecyclerView du changement dans la liste filtrée
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = filteredList.get(position); // Utilisez la liste filtrée au lieu de la liste complète
        holder.bind(user);
        holder.bind(user);


    }

    @Override
    public int getItemCount() {
        return filteredList.size(); // Utilisez la taille de la liste filtrée
    }



}
