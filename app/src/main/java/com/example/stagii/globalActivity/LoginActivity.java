package com.example.stagii.globalActivity;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.stagii.AppHomeActivity;
import com.example.stagii.R;
import com.example.stagii.user.User;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class LoginActivity  extends  AppCompatActivity{
    ArrayList<User> userList = new ArrayList<>();
    boolean credentialsValid=false;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        userList.add(new User(1, "Ilyess.BenAli", "ilyess.benali@isima.u-monastir.tn", "NomAlice", "PrenomAlice", "Section1", "Specialite1", "27330975", "Address1"));
        userList.add(new User(2, "Bob", "bob@example.com", "NomBob", "PrenomBob", "Section2", "Specialite2", "1234567892", "Address2"));
        userList.add(new User(3, "Charlie", "charlie@example.com", "NomCharlie", "PrenomCharlie", "Section3", "Specialite3", "1234567893", "Address3"));
        userList.add(new User(4, "David", "david@example.com", "NomDavid", "PrenomDavid", "Section4", "Specialite4", "1234567894", "Address4"));
        userList.add(new User(5, "Emma", "emma@example.com", "NomEmma", "PrenomEmma", "Section5", "Specialite5", "1234567895", "Address5"));
        userList.add(new User(5, "Mouhamed  Sghaier ALoui", "aloui.sghair@gmail.com" , "NomEmma", "PrenomEmma", "Section5", "Specialite5", "50303224", "Address5"));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        mediaPlayer  = MediaPlayer.create(this, R.raw.success_1_6297);

        // Récupération des vues
        TextInputEditText etEmail = findViewById(R.id.etEmail);
        TextInputEditText etPassword = findViewById(R.id.etPassword);
        MaterialButton btnLogin = findViewById(R.id.btnLogin);

        // Ajout d'un OnClickListener pour le bouton de connexion
        btnLogin.setOnClickListener(v -> {
            String enteredEmail = etEmail.getText().toString();
            String enteredPassword = etPassword.getText().toString();
            this.credentialsValid = checkCredentials(enteredEmail, enteredPassword);

            if (this.credentialsValid) {

                // Affichage d'une alerte verte
                showAlert("Connexion réussie!", Color.GREEN);

            }
            if(this.credentialsValid==false){
                showToast("Identifiants incorrects!", Color.RED);

            }
        });
    }

    // Méthode pour vérifier les informations d'identification


    // Méthode pour afficher une alerte
    private void showAlert(String message, int color) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(message)
                .setPositiveButton("OK", (dialog, which) -> {
                    // Start StudentAcceuil activity here
                    Intent intent = new Intent(this, AppHomeActivity.class);
                    startActivity(intent);
                    dialog.dismiss();
                });

        AlertDialog alert = builder.create();
        alert.setOnShowListener(dialogInterface -> {
            alert.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(color);
        });

        alert.show();
    }


    // Méthode pour afficher un toast
    private void showToast(String message, int textColor) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_SHORT);
        View view = toast.getView();
        TextView text = view.findViewById(android.R.id.message);
        text.setTextColor(textColor);
        toast.show();
    }
    private boolean checkCredentials(String email, String password) {

        for (User user : this.userList) {
            String userEnteredEmail = user.getEmail().toLowerCase();
            String desiredEmail = email.toLowerCase();
            if (userEnteredEmail.equals(desiredEmail) && user.getNumTel().equals(password)) {
                mediaPlayer.start(); // Pour démarrer la lecture

                return true;
             }
        }
        return false;
    }
}