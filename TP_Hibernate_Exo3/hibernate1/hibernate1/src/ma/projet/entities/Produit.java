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
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;


@Entity
@Table(name = "Product")
public class Produit {
      
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String marque;
    private String reference;
    @Temporal(javax.persistence.TemporalType.DATE)

    private Date date;
    private double prix;
    private String designation;

   
    public Produit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Produit(String marque, String reference, Date date, double prix, String designation) {
        this.marque = marque;
        this.reference = reference;
        this.date = date;
        this.prix = prix;
        this.designation = designation;
    }
      public Produit(int id,String marque, String reference, Date date, double prix, String designation) {
        this.id=id;
        this.marque = marque;
        this.reference = reference;
        this.date = date;
        this.prix = prix;
        this.designation = designation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", marque=" + marque + ", reference=" + reference + ", date=" + date + ", prix=" + prix + ", designation=" + designation + '}';
    }

   

    
    
    
}
