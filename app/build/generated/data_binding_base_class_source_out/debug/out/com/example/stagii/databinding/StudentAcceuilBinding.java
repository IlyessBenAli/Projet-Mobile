// Generated by view binder compiler. Do not edit!
package com.example.stagii.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.stagii.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class StudentAcceuilBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final BottomNavigationView btm;

  @NonNull
  public final ConstraintLayout homeHeaderContainer;

  @NonNull
  public final ImageView ivCompanies;

  @NonNull
  public final ImageView ivHomeBanner;

  @NonNull
  public final ImageView ivJobApplied;

  @NonNull
  public final CircleImageView ivProfileImage;

  @NonNull
  public final LinearLayout llCompanyCard;

  @NonNull
  public final LinearLayout llJobCard;

  @NonNull
  public final GridLayout llStatusContainer;

  @NonNull
  public final RecyclerView rvRecentJobs;

  @NonNull
  public final TextView tvCompaniesCount;

  @NonNull
  public final TextView tvJobAppliedCount;

  @NonNull
  public final TextView tvRecentJobList;

  @NonNull
  public final TextView tvStatusHeading;

  @NonNull
  public final TextView tvWelcomeHeading;

  private StudentAcceuilBinding(@NonNull ScrollView rootView, @NonNull BottomNavigationView btm,
      @NonNull ConstraintLayout homeHeaderContainer, @NonNull ImageView ivCompanies,
      @NonNull ImageView ivHomeBanner, @NonNull ImageView ivJobApplied,
      @NonNull CircleImageView ivProfileImage, @NonNull LinearLayout llCompanyCard,
      @NonNull LinearLayout llJobCard, @NonNull GridLayout llStatusContainer,
      @NonNull RecyclerView rvRecentJobs, @NonNull TextView tvCompaniesCount,
      @NonNull TextView tvJobAppliedCount, @NonNull TextView tvRecentJobList,
      @NonNull TextView tvStatusHeading, @NonNull TextView tvWelcomeHeading) {
    this.rootView = rootView;
    this.btm = btm;
    this.homeHeaderContainer = homeHeaderContainer;
    this.ivCompanies = ivCompanies;
    this.ivHomeBanner = ivHomeBanner;
    this.ivJobApplied = ivJobApplied;
    this.ivProfileImage = ivProfileImage;
    this.llCompanyCard = llCompanyCard;
    this.llJobCard = llJobCard;
    this.llStatusContainer = llStatusContainer;
    this.rvRecentJobs = rvRecentJobs;
    this.tvCompaniesCount = tvCompaniesCount;
    this.tvJobAppliedCount = tvJobAppliedCount;
    this.tvRecentJobList = tvRecentJobList;
    this.tvStatusHeading = tvStatusHeading;
    this.tvWelcomeHeading = tvWelcomeHeading;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static StudentAcceuilBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static StudentAcceuilBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.student_acceuil, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static StudentAcceuilBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btm;
      BottomNavigationView btm = ViewBindings.findChildViewById(rootView, id);
      if (btm == null) {
        break missingId;
      }

      id = R.id.homeHeaderContainer;
      ConstraintLayout homeHeaderContainer = ViewBindings.findChildViewById(rootView, id);
      if (homeHeaderContainer == null) {
        break missingId;
      }

      id = R.id.ivCompanies;
      ImageView ivCompanies = ViewBindings.findChildViewById(rootView, id);
      if (ivCompanies == null) {
        break missingId;
      }

      id = R.id.ivHomeBanner;
      ImageView ivHomeBanner = ViewBindings.findChildViewById(rootView, id);
      if (ivHomeBanner == null) {
        break missingId;
      }

      id = R.id.ivJobApplied;
      ImageView ivJobApplied = ViewBindings.findChildViewById(rootView, id);
      if (ivJobApplied == null) {
        break missingId;
      }

      id = R.id.ivProfileImage;
      CircleImageView ivProfileImage = ViewBindings.findChildViewById(rootView, id);
      if (ivProfileImage == null) {
        break missingId;
      }

      id = R.id.llCompanyCard;
      LinearLayout llCompanyCard = ViewBindings.findChildViewById(rootView, id);
      if (llCompanyCard == null) {
        break missingId;
      }

      id = R.id.llJobCard;
      LinearLayout llJobCard = ViewBindings.findChildViewById(rootView, id);
      if (llJobCard == null) {
        break missingId;
      }

      id = R.id.llStatusContainer;
      GridLayout llStatusContainer = ViewBindings.findChildViewById(rootView, id);
      if (llStatusContainer == null) {
        break missingId;
      }

      id = R.id.rvRecentJobs;
      RecyclerView rvRecentJobs = ViewBindings.findChildViewById(rootView, id);
      if (rvRecentJobs == null) {
        break missingId;
      }

      id = R.id.tvCompaniesCount;
      TextView tvCompaniesCount = ViewBindings.findChildViewById(rootView, id);
      if (tvCompaniesCount == null) {
        break missingId;
      }

      id = R.id.tvJobAppliedCount;
      TextView tvJobAppliedCount = ViewBindings.findChildViewById(rootView, id);
      if (tvJobAppliedCount == null) {
        break missingId;
      }

      id = R.id.tvRecentJobList;
      TextView tvRecentJobList = ViewBindings.findChildViewById(rootView, id);
      if (tvRecentJobList == null) {
        break missingId;
      }

      id = R.id.tvStatusHeading;
      TextView tvStatusHeading = ViewBindings.findChildViewById(rootView, id);
      if (tvStatusHeading == null) {
        break missingId;
      }

      id = R.id.tvWelcomeHeading;
      TextView tvWelcomeHeading = ViewBindings.findChildViewById(rootView, id);
      if (tvWelcomeHeading == null) {
        break missingId;
      }

      return new StudentAcceuilBinding((ScrollView) rootView, btm, homeHeaderContainer, ivCompanies,
          ivHomeBanner, ivJobApplied, ivProfileImage, llCompanyCard, llJobCard, llStatusContainer,
          rvRecentJobs, tvCompaniesCount, tvJobAppliedCount, tvRecentJobList, tvStatusHeading,
          tvWelcomeHeading);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}