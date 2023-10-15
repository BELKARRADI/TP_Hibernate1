/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ma.projet.entities.Categorie;
import ma.projet.entities.Produit;
import ma.projet.entities.Commande;
import ma.projet.entities.CommandeProduit;
import ma.projet.entities.CommandeProduitId;

import ma.projet.service.CategorieService;
import ma.projet.service.CommandeProduitService;
import ma.projet.service.CommandeService;
import ma.projet.service.ProduitService;
import ma.projet.util.HibernateUtil;
import org.hibernate.Hibernate;

/**
 *
 * @author ADMIN
 */
public class Test {

    public static void main(String[] args) {
        CommandeService cmds = new CommandeService();
        CategorieService cs = new CategorieService();
        ProduitService ps = new ProduitService();
        CommandeProduitService cps = new CommandeProduitService();

        Categorie sport = new Categorie("A123", "Sport");
        Categorie classique = new Categorie("A111", "Classique");
        Categorie casual = new Categorie("A121", "Casual");

        Produit p1 = new Produit("ref1", 200);
        Produit p2 = new Produit("ref2", 150);
        Produit p3 = new Produit("ref3", 300);
        Produit p4 = new Produit("ref4", 200);
        Produit p5 = new Produit("ref5", 150);
        Produit p6 = new Produit("ref6", 300);

        
        
        
        p1.setCategorie(sport);
        p2.setCategorie(classique);
        p3.setCategorie(casual);

        p4.setCategorie(sport);
        p5.setCategorie(classique);
        p6.setCategorie(casual);

        Commande c1 = new Commande(new Date());
        Commande c2 = new Commande(new Date());
        Commande c3 = new Commande(new Date());

        cs.create(sport);
        cs.create(casual);
        cs.create(classique);

        ps.create(p1);
        ps.create(p2);
        ps.create(p3);
        ps.create(p4);
        ps.create(p5);
        ps.create(p6);

        cmds.create(c1);

        CommandeProduitId cpi1 = new CommandeProduitId(c1.getId(), p1.getId());
        CommandeProduit cp1 = new CommandeProduit(p1, c1, 1);
        cp1.setId(cpi1);
        cps.create(cp1);

        CommandeProduitId cpi2 = new CommandeProduitId(c1.getId(), p2.getId());
        CommandeProduit cp2 = new CommandeProduit(p2, c1, 3);
        cp2.setId(cpi2);
        cps.create(cp2);

        CommandeProduitId cpi3 = new CommandeProduitId(c1.getId(), p3.getId());
        CommandeProduit cp3 = new CommandeProduit(p2, c1, 5);
        cp3.setId(cpi3);
        cps.create(cp3);

        cmds.CommandeInfo(cmds.findById(1));

        List<Produit> produitP = new ArrayList<>();
        produitP = ps.findByPrice(150);
        for (Produit pp : produitP) {
            System.out.println(pp);
        }

        List<Produit> produitC = ps.findByCategorie(1);

        for (Produit pc : produitC) {
            System.out.println(pc);
        }

      //A refaire
        /*
         List<Produit> produitDates= cmds.findByDate(new Date(123, 8, 1), new Date(123, 10, 1));

         for(Produit pd : produitDates){
         System.out.println(pd);
         }
         */
    }
}
