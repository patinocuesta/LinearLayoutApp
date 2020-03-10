package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;


public class MainActivity extends AppCompatActivity {
    EditText nom, prenom, age;
    Spinner origin;
    ArrayAdapter ar;
    String[] liste={"FR","ANG", "ESP"};
    Button b;
    int idCounter;
    List<String> appart;
    List<Personne> listePersonnes = new ArrayList<Personne>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom = findViewById(R.id.nom);
        prenom = findViewById(R.id.prenom);
        origin = findViewById(R.id.origin);
        age = findViewById(R.id.age);
        b = findViewById(R.id.envoyer);


       /* b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chaine = "nom " + nom.getText().toString() + " prenom " + prenom.getText().toString();
                Toast.makeText(getBaseContext(), chaine, Toast.LENGTH_LONG).show();
            }
        });*/

    }

    public void afficher(View view) {
        String chaine = "nom " + nom.getText().toString() + " prenom " + prenom.getText().toString();
        //Toast.makeText(this, chaine, Toast.LENGTH_LONG).show();
        idCounter++;

      Personne p = new Personne(idCounter,
                prenom.getText().toString(),
                nom.getText().toString(),
                Integer.parseInt(age.getText().toString()),
                origine.getSelectedItem().toString(),


              );
        listePersonnes.add(p);
        Log.d("perlist", listePersonnes.toString());
        Intent intent =  new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("nom",nom.getText().toString());
        intent.putExtra("prenom", prenom.getText().toString());
        startActivity(intent);*/
    }
}
