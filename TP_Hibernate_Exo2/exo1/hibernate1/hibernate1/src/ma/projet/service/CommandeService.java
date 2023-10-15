/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;

/**
 *
 * @author ADMIN
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import ma.projet.dao.IDao;
import ma.projet.entities.Commande;
import ma.projet.entities.CommandeProduit;
import ma.projet.entities.Produit;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CommandeService implements IDao<Commande> {

    @Override
    public boolean create(Commande o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public boolean delete(Commande o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.delete(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public boolean update(Commande o) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.update(o);
            tx.commit();
            return true;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return false;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public List<Commande> findAll(Commande o) {
        List<Commande> commandes = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            commandes = session.createQuery("from Commande").list();
            tx.commit();
            return commandes;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return commandes;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public Commande findById(int id) {
        Commande commande = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            commande = (Commande) session.get(Commande.class, id);
            tx.commit();
            return commande;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return commande;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    public void CommandeInfo(Commande o) {
        List<CommandeProduit> commandeProduit = o.getCommandeProduits();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Commande : " + o.getId() + "           Date : " + o.getDate());

        System.out.println("");
        System.out.println("Liste des produits :");
        System.out.println("");
        System.out.println("");

        System.out.println("   Reference          Prix          Quantité");
        System.out.println("");

        for (CommandeProduit c : commandeProduit) {
            System.out.println("   " + c.getProduit().getReference() + "              " + c.getProduit().getPrix() + " Dhs            " + c.getQte());
        }
    }

    /*
    public List<Produit> findByDate(Date dateDebut, Date dateFin) {
    List<Produit> produits = new ArrayList<>(); 
    Session session = null;
    Transaction tx = null;
    
    try {
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        
        List<Commande> commandes = session.createQuery("from Commande c where c.date BETWEEN :dateDebut AND :dateFin")
                .setParameter("dateDebut", dateDebut)
                .setParameter("dateFin", dateFin)
                .list();
        
        for (Commande c : commandes) {
            List<CommandeProduit> commandeProduits = c.getCommandeProduits();
            for (CommandeProduit cp : commandeProduits) {
                produits.add(cp.getProduit());
            }
        }
        
        tx.commit();
        return produits;
    } catch (HibernateException ex) {
        if (tx != null)
            tx.rollback();
        return produits;
    } finally {
        if (session != null)
            session.close();
    }
}
    */


}
