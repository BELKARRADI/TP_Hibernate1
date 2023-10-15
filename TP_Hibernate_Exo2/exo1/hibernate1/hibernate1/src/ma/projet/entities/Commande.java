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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

@Entity
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date date;
    
    @OneToMany(mappedBy = "commande", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CommandeProduit> CommandeProduits=new ArrayList<>();

    public List<CommandeProduit> getCommandeProduits() {
        return CommandeProduits;
    }

    public void setCommandeProduits(List<CommandeProduit> CommandeProduits) {
        this.CommandeProduits = CommandeProduits;
    }
    
    
    /*
    @OneToMany(mappedBy="commande",fetch = FetchType.EAGER)
    List<LigneCommande> ligneCommandes=new ArrayList<>();

    
    
    public List<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }
    
    
     @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)

     @JoinTable(
     name = "Commande_Produit_table",
     joinColumns = @JoinColumn(name = "commande_id"),
     inverseJoinColumns = @JoinColumn(name = "produit_id")
     )
            
     List<Produit> produits = new ArrayList<>();
    
    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
 */
    public Commande() {
    }

    public Commande(Date date) {
        this.date = date;
    }

    public Commande(int id, Date date) {
        this.id = id;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Commande{" + "id=" + id + ", date=" + date + '}';
    }

}
