/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import ma.projet.entities.Femme;
import ma.projet.entities.Homme;
import ma.projet.entities.Mariage;

import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class MariageService implements IDao<Mariage> {

    @Override
    public boolean create(Mariage o) {
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
    public boolean delete(Mariage o) {
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
    public boolean update(Mariage o) {
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
    public List<Mariage> findAll(Mariage o) {
        List<Mariage> mariages = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            mariages= session.createQuery("from Mariage").list();
            tx.commit();
            return mariages;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return mariages;
        } finally {
            if(session != null)
                session.close();
        }
    }

    @Override
    public Mariage findById(int id) {
        Mariage mariage = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            mariage = (Mariage) session.get(Mariage.class, id);
            tx.commit();
            return mariage;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return mariage;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

}




