package com.example.stagii.job;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stagii.R;

public class JobViewHolder extends RecyclerView.ViewHolder {

    private TextView tvJobRole;
    private TextView tvCompanyNameLocation;
    private TextView tvSalary;
        private ImageView img;
    private TextView   chipWorkType;
    Button btnApply;

    public JobViewHolder(@NonNull View itemView) {
        super(itemView);
        tvJobRole = itemView.findViewById(R.id.tvJobRole);
        tvCompanyNameLocation = itemView.findViewById(R.id.tvCompanyNameLocation);
        tvSalary = itemView.findViewById(R.id.tvSalary);
        img=itemView.findViewById(R.id.ivCompanyLogo);
        chipWorkType= itemView.findViewById(R.id.chipWorkType);
        btnApply = itemView.findViewById(R.id.btnApply);



    }

    public void bind(JobOffer job) {
        tvJobRole.setText(job.getTitle());
        tvCompanyNameLocation.setText(job.getDescription());
        tvSalary.setText(String.valueOf(job.getSalary())+" TND");
        img=itemView.findViewById(R.id.ivCompanyLogo);

        // Suppose que job a une méthode getImageResourceId() pour obtenir l'identifiant de la ressource de l'image
        int imageResId = job.getImageResourceId();
        img.setImageResource(imageResId);
        chipWorkType.setText(String.valueOf(job.getCategory()));
        System.out.println("ok");

        btnApply.setOnClickListener(v -> {
            // Code to open another activity
            Intent intent = new Intent(v.getContext(), Postulate.class);
            v.getContext().startActivity(intent);
        });

    }
}

