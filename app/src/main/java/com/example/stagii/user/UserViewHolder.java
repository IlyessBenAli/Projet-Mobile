package com.example.stagii.user;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stagii.R;

public class UserViewHolder extends RecyclerView.ViewHolder{

        private TextView userNameTextView;
        private TextView userEmailTextView;
        Button btnApply;

        UserViewHolder(@NonNull View itemView) {
            super(itemView);
            userNameTextView = itemView.findViewById(R.id.tvMockTestName);
            userEmailTextView = itemView.findViewById(R.id.tvMockTestAttemptStatus);
            btnApply = itemView.findViewById(R.id.btnApply);

        }

        void bind(User user) {
            userNameTextView.setText(user.getNom() + " " + user.getPrenom());
            userEmailTextView.setText(user.getEmail());

            btnApply.setOnClickListener(v -> {
                // Code to open another activity
                Intent intent = new Intent(v.getContext(), UserProfile.class);
                v.getContext().startActivity(intent);
            });
        }
    }
