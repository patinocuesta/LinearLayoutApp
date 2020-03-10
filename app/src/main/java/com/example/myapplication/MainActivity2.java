package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
/*

// Activity pour affichage
public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    // Creation d'un gestionnaire de jpresentation
    Personnes collPersonnes;
    LinearLayout l, l1, l2,l3,l3bis,l4,l5, l6, l7, l8, l9;
    TextView t1, t2, t3, t4, t5, t6, t7, t8;
    EditText e1, e2, e3;
    Button b1;
    LinearLayout.LayoutParams p;
    int idCounter=0;
    List<String> appart = new ArrayList();
    //Composants boutons radio
    RadioGroup rg;
    //Bouton radio
    RadioButton r1, r2, r3, r4;
    //Checkbox
    CheckBox c1, c2, c3, c4;
    //Combobox
    Spinner s1;
    //Adaptateur Spinner. Ver Design patterns
    ArrayAdapter ar;
    //Liste à montrer dans Spinner
    String[] liste={"FR","ANG", "ESP"};
    //Calendar fecha = Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        collPersonnes = new Personnes();
        //String [] appart = new String[0];
        l=new LinearLayout( this);
        l1=new LinearLayout( this);
        l2=new LinearLayout( this);
        l3=new LinearLayout( this);
        //l3bis=new LinearLayout( this);
        l4=new LinearLayout( this);
        l5=new LinearLayout( this);
        l6=new LinearLayout( this);
        l7=new LinearLayout( this);
        l8=new LinearLayout( this);
        l9=new LinearLayout( this);
        l.setOrientation(LinearLayout.VERTICAL);
        p = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
        t1=new TextView(this);
        t2=new TextView(this);
        t3=new TextView(this);
        t4=new TextView(this);
        t5=new TextView(this);
        t6=new TextView(this);
        t7=new TextView(this);
        e1= new EditText(this);
        e2= new EditText(this);
        e3= new EditText(this);
        b1= new Button(this);
        rg= new RadioGroup(this);
        rg.setOrientation(LinearLayout.HORIZONTAL);
        r1 = new RadioButton(this);
        r2 = new RadioButton(this);
        r3 = new RadioButton(this);
        r4 = new RadioButton(this);
        c1 = new CheckBox(this);
        c2 = new CheckBox(this);
        c3 = new CheckBox(this);
        c4 = new CheckBox(this);
        s1=new Spinner(this);
        ar= new ArrayAdapter(this,android.R.layout.simple_list_item_1, liste);

        //Set text labels
        t1.setText("Nom:");
        t2.setText("Prenom:");
        t3.setText("Age:");
        t4.setText("Langue:");
        b1.setText("envoyer");
        t5.setText("Situation familiale");
        r1.setText("celibatire");
        r2.setText("marrié");
        r3.setText("divorcé");
        r4.setText("veuf");
        t6.setText("Appartement recherché");
        c1.setText("Studio");
        c2.setText("f2");
        c3.setText("f3");
        c4.setText("f4");
        ar.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(ar);

        //Addview to layour
        l1.addView(t1);
        l1.addView(e1);
        l2.addView(t2);
        l2.addView(e2);
        l3.addView(t3);
        l3.addView(e3);
        l3.addView(t4);
        l3.addView(s1);
        rg.addView(r1);
        rg.addView(r2);
        rg.addView(r3);
        rg.addView(r4);
        l4.addView(t5);
        l5.addView(rg);
        l6.addView(t6);
        l7.addView(c1);
        l7.addView(c2);
        l7.addView(c3);
        l7.addView(c4);
        l9.addView(b1);
        l.addView(l1);
        l.addView(l2);
        l.addView(l3);
        l.addView(l4);
        l.addView(l5);
        l.addView(l6);
        l.addView(l7);
        l.addView(l8);
        l.addView(l9);


        //Param d'affichage
        e1.setLayoutParams(p);
        e2.setLayoutParams(p);
        l3.setLayoutParams(p);
        l9.setGravity(Gravity.CENTER_HORIZONTAL);

        //affichage du LinearLayout
        setContentView(l);

        b1.setOnClickListener(this);
        e1.setOnClickListener(this);
        e2.setOnClickListener(this);
        e3.setOnClickListener(this);
        t2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
/*
        int selectedRadioButtonID = rg.getCheckedRadioButtonId();
            RadioButton selectedRadioButton = (RadioButton) findViewById(selectedRadioButtonID);
            String selectedRadioButtonText = selectedRadioButton.getText().toString();
*/
/*
        if (c1.isChecked()) {
            String textCb1 = String.valueOf(((c1).getText()));
            appart.add(textCb1);
        }
        if (c2.isChecked()) {
            String textCb2 = String.valueOf(((c2).getText()));
            appart.add(textCb2);
        }
        if (c3.isChecked()) {
            String textCb3 = String.valueOf(((c3).getText()));
            appart.add(textCb3);
        }
        if (c4.isChecked()) {
            String textCb4 = String.valueOf(((c4).getText()));
            appart.add(textCb4);
        }


        idCounter++;
        Personne p = new Personne(idCounter,
                e1.getText().toString(),
                e2.getText().toString(),
                Integer.parseInt(e3.getText().toString()),
                "marriéD",
                s1.getSelectedItem().toString(),
                appart
        );

        //p.setId(idCounter);
        //p.setPrenom(e2.getText().toString());
        //p.setNom(e1.getText().toString());
        //p.setAge(Integer.parseInt(e3.getText().toString()));

        collPersonnes.addPersonne(p);
        Log.d("personTest", p.toString());
        e1.setText("");
        e2.setText("");
        e3.setText("");
        c1.setChecked(false);
        c2.setChecked(false);
        c3.setChecked(false);
        c4.setChecked(false);

    }

}
*/
