package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Collaborateur {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Column(length = 5, nullable = false)
	    private int matricule;

	    @Column(nullable = false)
	    private String nom;

	    @Column(nullable = false)
	    private String prenom;

	    @Column(length = 3)
	    private String abreviation;

	    private String ancienManager;
	    private String managerActuel;

	    @Column(length = 1, nullable = false)
	    private String sexe;

	    private String site;

	    @Column(length = 4, nullable = false)
	    private String bu;

	    private Date dateEmbauche;
	    private String moisBap;
	    private Date dateDepart;

	  

	    @Column(length = 3)
	    private String posteApp;

	    @Column(length = 4)
	    private String posteActuel;

	    private double salaire;
	    
	    
	    public Long getId() {
	        return id;
	    }

	    public int getMatricule() {
	        return matricule;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public String getPrenom() {
	        return prenom;
	    }

	    public String getAbreviation() {
	        return abreviation;
	    }

	    public String getAncienManager() {
	        return ancienManager;
	    }

	    public String getManagerActuel() {
	        return managerActuel;
	    }

	    public String getSexe() {
	        return sexe;
	    }

	    public String getSite() {
	        return site;
	    }

	    public String getBu() {
	        return bu;
	    }

	    public Date getDateEmbauche() {
	        return dateEmbauche;
	    }

	    public String getMoisBap() {
	        return moisBap;
	    }

	    public Date getDateDepart() {
	        return dateDepart;
	    }

	   
	    public String getPosteApp() {
	        return posteApp;
	    }

	    public String getPosteActuel() {
	        return posteActuel;
	    }

	    public double getSalaire() {
	        return salaire;
	    }

		
}
