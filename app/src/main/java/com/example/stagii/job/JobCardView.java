package com.example.stagii.job;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.stagii.R;

public class JobCardView  extends LinearLayout {

    private TextView tvJobRole;
    private TextView tvCompanyNameLocation;
    private TextView tvSalary;
    private TextView   chipWorkType;
    public JobCardView(Context context) {
        super(context);
        init(context);
    }

    public JobCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public JobCardView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.job_detail_card, this);

        // Find views inside the layout
        tvJobRole = findViewById(R.id.tvJobRole);
        tvCompanyNameLocation = findViewById(R.id.tvCompanyNameLocation);
        tvSalary = findViewById(R.id.tvSalary);
        chipWorkType = findViewById(R.id.chipWorkType);


    }
}