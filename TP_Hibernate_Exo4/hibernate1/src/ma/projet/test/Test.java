/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.test;

import java.util.Date;
import ma.projet.entities.Femme;
import ma.projet.entities.Homme;
import ma.projet.entities.Mariage;
import ma.projet.entities.Personne;

import ma.projet.service.FemmeService;
import ma.projet.service.HommeService;
import ma.projet.service.MariageService;

import ma.projet.util.HibernateUtil;
import org.hibernate.Hibernate;

/**
 *
 * @author Lachgar
 */
public class Test {
    
    public static void main(String[] args) {
        
        FemmeService fs=new FemmeService();
        HommeService hs=new HommeService();
        MariageService ms=new MariageService();

        //fs.create());
        Femme f1=new Femme("sbaa","leila","0604130990","El jadida",new Date());
        Homme h1=new Homme("belkarradi","Mohammed","0604130990","Mohammedia",new Date());
        
        
        fs.create(f1);
        hs.create(h1);

        
        Mariage mariage=new Mariage(new Date(),null,3,h1,f1);
        
        ms.create(mariage);
        
        
    }
   
    
}
