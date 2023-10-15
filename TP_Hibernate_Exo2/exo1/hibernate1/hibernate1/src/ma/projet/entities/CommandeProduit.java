/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author ADMIN
 */
@Entity
public class CommandeProduit {
    
    @EmbeddedId
    private CommandeProduitId id;
    
       
    @ManyToOne
    @JoinColumn(name = "produitId", insertable = false, updatable = false)
    private Produit produit;
    
    @ManyToOne
    @JoinColumn(name = "commandeId", insertable = false, updatable = false)
    private Commande commande;
    
    private int qte;

    public CommandeProduitId getId() {
        return id;
    }

    public void setId(CommandeProduitId id) {
        this.id = id;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public CommandeProduit(Produit produit, Commande commande, int qte) {
        this.produit = produit;
        this.commande = commande;
        this.qte = qte;
    }

    public CommandeProduit() {
    }

    public CommandeProduit(CommandeProduitId id, Produit produit, Commande commande, int qte) {
        this.id = id;
        this.produit = produit;
        this.commande = commande;
        this.qte = qte;
    }

 
    
    
    
    
    
}
