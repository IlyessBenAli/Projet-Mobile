// Generated by view binder compiler. Do not edit!
package com.example.stagii.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.stagii.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class JobDetailCardBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final Chip btnApply;

  @NonNull
  public final Chip chipDesignation;

  @NonNull
  public final Chip chipWorkType;

  @NonNull
  public final MaterialCardView cvJob;

  @NonNull
  public final CircleImageView ivCompanyLogo;

  @NonNull
  public final ConstraintLayout llCompanyDetailContainer;

  @NonNull
  public final LinearLayout llCtaContainer;

  @NonNull
  public final TextView tvCompanyNameLocation;

  @NonNull
  public final TextView tvJobRole;

  @NonNull
  public final TextView tvSalary;

  private JobDetailCardBinding(@NonNull MaterialCardView rootView, @NonNull Chip btnApply,
      @NonNull Chip chipDesignation, @NonNull Chip chipWorkType, @NonNull MaterialCardView cvJob,
      @NonNull CircleImageView ivCompanyLogo, @NonNull ConstraintLayout llCompanyDetailContainer,
      @NonNull LinearLayout llCtaContainer, @NonNull TextView tvCompanyNameLocation,
      @NonNull TextView tvJobRole, @NonNull TextView tvSalary) {
    this.rootView = rootView;
    this.btnApply = btnApply;
    this.chipDesignation = chipDesignation;
    this.chipWorkType = chipWorkType;
    this.cvJob = cvJob;
    this.ivCompanyLogo = ivCompanyLogo;
    this.llCompanyDetailContainer = llCompanyDetailContainer;
    this.llCtaContainer = llCtaContainer;
    this.tvCompanyNameLocation = tvCompanyNameLocation;
    this.tvJobRole = tvJobRole;
    this.tvSalary = tvSalary;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static JobDetailCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static JobDetailCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.job_detail_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static JobDetailCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnApply;
      Chip btnApply = ViewBindings.findChildViewById(rootView, id);
      if (btnApply == null) {
        break missingId;
      }

      id = R.id.chipDesignation;
      Chip chipDesignation = ViewBindings.findChildViewById(rootView, id);
      if (chipDesignation == null) {
        break missingId;
      }

      id = R.id.chipWorkType;
      Chip chipWorkType = ViewBindings.findChildViewById(rootView, id);
      if (chipWorkType == null) {
        break missingId;
      }

      MaterialCardView cvJob = (MaterialCardView) rootView;

      id = R.id.ivCompanyLogo;
      CircleImageView ivCompanyLogo = ViewBindings.findChildViewById(rootView, id);
      if (ivCompanyLogo == null) {
        break missingId;
      }

      id = R.id.llCompanyDetailContainer;
      ConstraintLayout llCompanyDetailContainer = ViewBindings.findChildViewById(rootView, id);
      if (llCompanyDetailContainer == null) {
        break missingId;
      }

      id = R.id.llCtaContainer;
      LinearLayout llCtaContainer = ViewBindings.findChildViewById(rootView, id);
      if (llCtaContainer == null) {
        break missingId;
      }

      id = R.id.tvCompanyNameLocation;
      TextView tvCompanyNameLocation = ViewBindings.findChildViewById(rootView, id);
      if (tvCompanyNameLocation == null) {
        break missingId;
      }

      id = R.id.tvJobRole;
      TextView tvJobRole = ViewBindings.findChildViewById(rootView, id);
      if (tvJobRole == null) {
        break missingId;
      }

      id = R.id.tvSalary;
      TextView tvSalary = ViewBindings.findChildViewById(rootView, id);
      if (tvSalary == null) {
        break missingId;
      }

      return new JobDetailCardBinding((MaterialCardView) rootView, btnApply, chipDesignation,
          chipWorkType, cvJob, ivCompanyLogo, llCompanyDetailContainer, llCtaContainer,
          tvCompanyNameLocation, tvJobRole, tvSalary);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
