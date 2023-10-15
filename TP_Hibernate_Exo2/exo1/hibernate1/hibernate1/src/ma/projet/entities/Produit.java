/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entities;

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String reference;
    private double prix;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Categorie categorie;
    
    
    @OneToMany(mappedBy = "produit", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CommandeProduit> CommandeProduits=new ArrayList<>();

    public List<CommandeProduit> getCommandeProduits() {
        return CommandeProduits;
    }

    public void setCommandeProduits(List<CommandeProduit> CommandeProduits) {
        this.CommandeProduits = CommandeProduits;
    }
    
    /*
    @OneToMany(mappedBy="produit" , fetch = FetchType.EAGER)
    List<LigneCommande> ligneCommandes=new ArrayList<>();

    /*
    public List<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }
    
    

     @ManyToMany(cascade=CascadeType.ALL,mappedBy="produits")
     List<Commande> commandes= new ArrayList<>();

     public List<Commande> getCommandes() {
     return commandes;
     }

     public void setCommandes(List<Commande> commandes) {
     this.commandes = commandes;
     }
     */
    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public Produit() {
    }

    public Produit(String reference, double prix) {
        this.reference = reference;
        this.prix = prix;
    }

    public Produit(int id, String reference, double prix) {
        this.id = id;
        this.reference = reference;
        this.prix = prix;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", reference=" + reference + ", prix=" + prix + '}';
    }

}
