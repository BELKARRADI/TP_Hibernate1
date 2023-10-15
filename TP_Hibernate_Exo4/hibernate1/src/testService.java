
import java.util.List;
import ma.projet.dao.IDao;
import ma.projet.entities.Homme;
import ma.projet.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ADMIN
 */
public class testService implements IDao<Homme> {

    @Override
    public boolean create(Homme o) {

        Session session = null;
        Transaction tx = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(o);
            tx.commit();
            return true;

        } catch (HibernateException e) {

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
    public boolean delete(Homme o) {
        Session session = null;
        Transaction tx = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.delete(o);
            tx.commit();
            return true;

        } catch (HibernateException e) {

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
    public boolean update(Homme o) {
        Session session = null;
        Transaction tx = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.update(o);
            tx.commit();
            return true;

        } catch (HibernateException e) {

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
    public List<Homme> findAll(Homme o) {

        Session session = null;
        Transaction tx = null;
        List<Homme> hommes = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            hommes = session.createQuery("From Homme").list();
            tx.commit();
            return hommes;

        } catch (HibernateException e) {

            if (tx != null) {
                tx.rollback();
            }

            return hommes;

        } finally {

            if (session != null) {
                session.close();
            }

        }
    }

    @Override
    public Homme findById(int id) {
        Session session = null;
        Transaction tx = null;
        Homme homme =null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            homme=(Homme)session.get(Homme.class, id);
            tx.commit();
            return homme;

        } catch (HibernateException e) {

            if (tx != null) {
                tx.rollback();
            }

            return homme;

        } finally {

            if (session != null) {
                session.close();
            }

        }
    }

}
