package com.example.stagii.notification;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.stagii.R;

public class NotificationViewHolder extends RecyclerView.ViewHolder {
    private ImageView ivNotification;
    private TextView tvNotificationTitle;
    private TextView tvMessage;
    private TextView tvTimestamp;

    public NotificationViewHolder(@NonNull View itemView) {
        super(itemView);
        ivNotification = itemView.findViewById(R.id.ivNotification);
        tvNotificationTitle = itemView.findViewById(R.id.tvNotificationTitle);
        tvMessage = itemView.findViewById(R.id.tvMessage);
        tvTimestamp = itemView.findViewById(R.id.tvTimestamp);
    }

    public void bind(Notification notification) {
        ivNotification.setImageResource(R.drawable.ic_notification); // Set your image here
        tvNotificationTitle.setText(notification.getTitle());
        tvMessage.setText(notification.getMessage());
        tvTimestamp.setText(notification.getTimestamp());
    }
}
