/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ma.projet.service;

import java.util.ArrayList;
import java.util.List;
import ma.projet.dao.IDao;
import ma.projet.entities.Client;
import ma.projet.entities.Student;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Lachgar
 */
public class StudentService implements IDao<Student> {

    @Override
    public boolean create(Student o) {
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
    public boolean delete(Student o) {
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
    public boolean update(Student o) {
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
    public List<Student> findAll(Student o) {
        List<Student> students = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            students = session.createQuery("from Student").list();
            tx.commit();
            return students;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return students;
        } finally {
            if(session != null)
                session.close();
        }
    }

    @Override
    public Student findById(int id) {
        Student student = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            student = (Student) session.get(Student.class, id);
            tx.commit();
            return student;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return student;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

}


