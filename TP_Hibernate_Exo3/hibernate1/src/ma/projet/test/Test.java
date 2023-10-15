/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ma.projet.entities.Employe;
import ma.projet.entities.EmployeTache;
import ma.projet.entities.EmployeTacheId;
import ma.projet.entities.Projet;
import ma.projet.entities.Tache;
import ma.projet.service.EmployeService;
import ma.projet.service.EmployeTacheService;
import ma.projet.service.ProjetService;
import ma.projet.service.TacheService;
import ma.projet.util.HibernateUtil;
import org.hibernate.Hibernate;

/**
 *
 * @author ADMIN
 */
public class Test {

    public static void main(String[] args) {

        EmployeTacheService ets = new EmployeTacheService();
        TacheService ts = new TacheService();
        EmployeService es = new EmployeService();
        ProjetService ps = new ProjetService();

        Employe e1 = new Employe("belkarradi", "Mohammed", "0604130990");
        Employe e2 = new Employe("isawi", "zakaria", "0604130990");
        Employe e3 = new Employe("salmi", "reda", "0604130990");
        Employe e4 = new Employe("nafaty", "khalil", "0604130990");

        es.create(e1);
        es.create(e2);
        es.create(e3);
        es.create(e4);

        Projet p1 = new Projet("Projet1", new Date(), new Date());
        p1.setEmploye(e3);
        ps.create(p1);
       

        Projet p2 = new Projet("Projet2", new Date(), new Date());
        ps.create(p2);
        p2.setEmploye(e4);
        
        

        Projet p3 = new Projet("Projet3", new Date(), new Date());
        ps.create(p3);
        p3.setEmploye(e4);

        Projet p4 = new Projet("Projet4", new Date(), new Date());
        ps.create(p4);
        p4.setEmploye(e1);

        Tache t1 = new Tache("tache1", new Date(), new Date(), 900);
        t1.setProjet(p1);
        ts.create(t1);

        Tache t2 = new Tache("tache2", new Date(), new Date(), 1000);
        t2.setProjet(p1);
        ts.create(t2);

        Tache t3 = new Tache("tache3", new Date(), new Date(), 1200);
        t3.setProjet(p1);
        ts.create(t3);

        Tache t4 = new Tache("tache4", new Date(), new Date(), 1400);
        t4.setProjet(p2);
        ts.create(t4);

        EmployeTacheId eti = new EmployeTacheId(e1.getId(), t1.getId());
        EmployeTache et = new EmployeTache(e1, t1, new Date(), new Date());
        et.setId(eti);
        ets.create(et);

        EmployeTacheId eti2 = new EmployeTacheId(e2.getId(), t2.getId());
        EmployeTache et2 = new EmployeTache(e2, t2, new Date(), new Date());
        et2.setId(eti2);
        ets.create(et2);

        EmployeTacheId eti3 = new EmployeTacheId(e3.getId(), t3.getId());
        EmployeTache et3 = new EmployeTache(e3, t3, new Date(), new Date());
        et3.setId(eti3);
        ets.create(et3);

        EmployeTacheId eti4 = new EmployeTacheId(e4.getId(), t4.getId());
        EmployeTache et4 = new EmployeTache(e4, t4, new Date(), new Date());
        et.setId(eti4);
        ets.create(et4);

        ps.ProjetInfo(ps.findById(1));
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        List<Tache> tachesPrix = new ArrayList<>();

        tachesPrix = ts.findByPrice(1000);

        for (Tache tP : tachesPrix) {

            System.out.println(tP);
        }

        List<Tache> tachesEmploye = new ArrayList<>();

        tachesPrix = es.findByEmploye(1);

        for (Tache tE : tachesEmploye) {

            System.out.println(tE);
        }

        List<Tache> tachesProjet = new ArrayList<>();

        tachesProjet = ps.findByProjet(ps.findById(1));

        for (Tache tPr : tachesProjet) {

            System.out.println(tPr);
        }

    }

}
