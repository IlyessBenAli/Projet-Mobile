package com.example.stagii.job;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.stagii.R;

public class Postulate extends AppCompatActivity  {
    MediaPlayer mediaPlayer;
    Button btnConfirmation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consulter_job);
        mediaPlayer = MediaPlayer.create(this, R.raw.success_1_6297);
        TextView tvJobDescription = findViewById(R.id.tvJobDescription);
        TextView  tvResponsibility = findViewById(R.id.tvResponsibility);
        // Définir le texte pour les TextViews
        tvJobDescription.setText("Intitule du sujet :"+"\n"+" Conception d'une application pour la génération automatique des numéros de relevés séquentiels par banque. Objectif du sujet  Concevoir une application pour la génération automatique des numéros de pièces de relevés séquentielles par banque dans l'environnement SAP S/4 HANA."+"\n"+" Cette interface permettra également aux utilisateurs de personnaliser leurs vues et de filtrer les données en fonction de leurs besoins spécifiques.");
          btnConfirmation = findViewById(R.id.btnApply);
        btnConfirmation.setOnClickListener(v -> {

                afficherAlerteRetourActivity();
            });
    }



        private void afficherAlerteRetourActivity() {
            mediaPlayer.start(); // Pour démarrer la lecture

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage("Message de confirmation")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // L'utilisateur a appuyé sur "OK", retour à l'activité précédente
                            retourActivitePrecedente(); // Revenir à l'activité précédente
                        }
                    })
                    .setNegativeButton("Annuler", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // L'utilisateur a appuyé sur "Annuler", ne rien faire
                            dialog.dismiss(); // Ferme la boîte de dialogue
                        }
                    });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
        }
    private void retourActivitePrecedente() {
        finish(); // Termine l'activité actuelle et revient à l'activité précédente
            }



    }


