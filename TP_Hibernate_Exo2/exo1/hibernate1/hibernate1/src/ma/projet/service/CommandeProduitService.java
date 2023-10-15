/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.service;


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

public class CommandeProduitService implements IDao<CommandeProduit> {

    @Override
    public boolean create(CommandeProduit o) {
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
    public boolean delete(CommandeProduit o) {
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
    public boolean update(CommandeProduit o) {
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
    public List<CommandeProduit> findAll(CommandeProduit o) {
        List<CommandeProduit> commandeProduits = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            commandeProduits = session.createQuery("from CommandeProduit").list();
            tx.commit();
            return commandeProduits;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return commandeProduits;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    @Override
    public CommandeProduit findById(int id) {
        CommandeProduit commandeProduit = null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            commandeProduit = (CommandeProduit) session.get(CommandeProduit.class, id);
            tx.commit();
            return commandeProduit;
        } catch (HibernateException ex) {
            if (tx != null) {
                tx.rollback();
            }
            return commandeProduit;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    /* public void CommandeInfo(Commande o) {
        List<LigneCommande> lignes = o.getLigneCommandes();
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

        for (LigneCommande l : lignes) {
            System.out.println("   " + l.getProduit().getReference() + "              " + l.getProduit().getPrix() + "Dhs            " + l.getQte());

        }

    }
   
      public List<Produit> findByDate(Date dateDebut,Date dateFin) {
        List<Commande> commandes = null;
        List<LigneCommande> lignecommandes = null;
        List<Produit>produits =null;
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            commandes = session.createQuery("from Commande c  where c.date BETWEEN :dateDebut AND :dateFin")
                    .setParameter("dateDebut", dateDebut)
                    .setParameter("dateFin", dateFin)
                    .list();
          for(Commande c:commandes){
              lignecommandes.addAll(c.getLigneCommandes());
          }
            
           for(LigneCommande lc:lignecommandes){
              produits.add(lc.getProduit());
          }
            
            tx.commit();
            return produits;
        } catch (HibernateException ex) {
            if(tx != null)
                tx.rollback();
            return produits;
        } finally {
            if(session != null)
                session.close();
        }
   
}*/

}
