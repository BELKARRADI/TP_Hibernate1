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


import java.util.List;
import ma.projet.dao.IDao;
import ma.projet.entities.Projet;
import ma.projet.entities.Tache;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProjetService implements IDao<Projet> {

    @Override
    public boolean create(Projet o) {
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
    public boolean delete(Projet o) {
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
    public boolean update(Projet o) {
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
    public List<Projet> findAll(Projet o) {
        List<Projet> projets = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            projets= session.createQuery("from Projet").list();
            tx.commit();
            return projets;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return projets;
        } finally {
            if(session != null)
                session.close();
        }
    }

    @Override
    public Projet findById(int id) {
        Projet projet = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            projet = (Projet) session.get(Projet.class, id);
            tx.commit();
            return projet;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return projet;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
    public void ProjetInfo(Projet o) {
        List<Tache> taches = o.getTaches();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Projet :       " + o.getId()+ "     Nom :   " + o.getNom()+ "           Date début  :      " + o.getDateDebut());

        System.out.println("");
        System.out.println("Liste des taches :");
        System.out.println("");
        System.out.println("");




        System.out.println("   Num          Nom          Date Début Réelle          Date Fin Réelle");
        System.out.println("");

        for (Tache t : taches) {
            System.out.println("   " +t.getId() + "              " + t.getNom() +"            " + t.getDateDebut()+"            " + t.getDateFin());

        }

    }
    
     
    public List<Tache> findByProjet(Projet p) {
        List<Tache> taches = p.getTaches();
        return taches;
    }
}


