package com.example.myapplication;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.List;
import java.util.Objects;

public class Personne {
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private String familyStatus;
    private String langue;
    private List<String>  appart;

    public Personne(int id, String nom, String prenom, int age, String langue, String familyStatus, List<String> appart) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.familyStatus = familyStatus;
        this.langue = langue;
        this.appart = appart;
    }
    //Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }

    public String getLangue() {
        return langue;
    }

    public void setLangue(String langue) {
        this.langue = langue;
    }

    public List<String>  getAppart() {
        return appart;
    }

    public void setAppart(List<String> appart) {
        this.appart = appart;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", familyStatus='" + familyStatus + '\'' +
                ", Origine='" + langue + '\'' +
                ", permis='" + appart + '\'' +
                '}';
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personne personne = (Personne) o;
        return id == personne.id &&
                age == personne.age &&
                Objects.equals(nom, personne.nom) &&
                Objects.equals(prenom, personne.prenom) &&
                Objects.equals(familyStatus, personne.familyStatus) &&
                Objects.equals(langue, personne.langue) &&
                Objects.equals(appart, personne.appart);
    }

}
