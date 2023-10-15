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
import ma.projet.entities.Employe;
import ma.projet.entities.EmployeTache;
import ma.projet.entities.Tache;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeService implements IDao<Employe> {

    @Override
    public boolean create(Employe o) {
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
    public boolean delete(Employe o) {
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
    public boolean update(Employe o) {
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
    public List<Employe> findAll(Employe o) {
        List<Employe> employes = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            employes= session.createQuery("from Employe").list();
            tx.commit();
            return employes;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return employes;
        } finally {
            if(session != null)
                session.close();
        }
    }

    @Override
    public Employe findById(int id) {
        Employe employe = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            employe = (Employe) session.get(Employe.class, id);
            tx.commit();
            return employe;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return employe;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
 
    public List<Tache> findByEmploye(int id) {
       List<EmployeTache> employeTaches = null;
       List<Tache> taches=null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            employeTaches = session.createQuery("from EmployeTache et where et.employeId=:id ").setParameter("id", id).list();
            for(EmployeTache et:employeTaches){
                taches.add(et.getTache());
            }
            tx.commit();
            
            return taches;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return taches;
        } finally {
            if(session != null)
                session.close();
        }
}
}
