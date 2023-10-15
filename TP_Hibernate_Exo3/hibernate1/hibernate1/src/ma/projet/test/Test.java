/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ma.projet.entities.Client;
import ma.projet.entities.Produit;
import ma.projet.entities.Student;
import ma.projet.service.ClientService;
import ma.projet.service.ProduitService;
import ma.projet.service.StudentService;
import ma.projet.util.HibernateUtil;
import org.hibernate.Hibernate;

/**
 *
 * @author ADMIN
 */
public class Test {
    
    public static void main(String[] args) {
        ProduitService ps = new ProduitService();
        
        /*
        Creation des objets
        Produit p1= new Produit("LV","A123",new Date(),2020,"t shirt");
        Produit p2= new Produit("Bershka","B11",new Date(),150,"chemise");
        Produit p3= new Produit("pull and bear","B453",new Date(),200,"jeans");
        Produit p4= new Produit("Zara","CV543",new Date(),250,"chemise");
        Produit p5= new Produit("Defacto","R7633",new Date(),140,"t shirt");
        
        ps.create(p1);
        ps.create(p2);
        ps.create(p3);
        ps.create(p4);
        ps.create(p5);
        
        
        
        
        Affichage des produits
        
        List<Produit> produits=new ArrayList<>();
        produits=ps.findAll(null);
        for (Produit p: produits){
            System.out.println(produits);
        }
        
        
        
        Afficher les informations du produit dont id = 2
       
        
        Produit produit2= ps.findById(2);
        System.out.println(produit2);
        
        
        
        
        Supprimer le produit dont id = 3
        
        
        ps.delete(ps.findById(3));
        
        
        
        Modifier les informations du produit dont id = 1
        Avant:Produit("LV","A123",new Date(),2020,"t shirt");
        Apres:
        
        ps.update(new Produit(1,"Marwa","A12",new Date(),350,"Robe"));
        
        
        
        
        
        
        
        
        List<Produit> produits=new ArrayList<>();
        produits=ps.findAll(null);
        for (Produit p: produits){
            System.out.println(produits);
        }
        
        Date d1 = new Date(123, 8, 29, 14, 52, 7); 
        Date d2 = new Date(123, 9, 30, 15, 5, 56); 

        
        List<Produit> produits=new ArrayList<>();
        produits=ps.findByDate(d1,d2);
        for (Produit p: produits){
            System.out.println(produits);
        }   
        */    
        
        
        
        
       
        
    }
    
}
