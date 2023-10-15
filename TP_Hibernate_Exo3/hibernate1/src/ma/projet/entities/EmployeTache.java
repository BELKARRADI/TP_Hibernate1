/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entities;

import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author ADMIN
 */
@Entity
public class EmployeTache {

    @EmbeddedId
    private EmployeTacheId id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateDebutRelle;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateFinRelle;
    
    @ManyToOne
    @JoinColumn(name = "tacheId", insertable = false, updatable = false)
    private Tache tache;
    
    @ManyToOne
    @JoinColumn(name = "EmployeId", insertable = false, updatable = false)
    private Employe employe;

    public Tache getTache() {
        return tache;
    }

    public void setTache(Tache tache) {
        this.tache = tache;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public EmployeTache() {
    }

    public EmployeTache( Employe employe,Tache tache,Date dateDebutRelle, Date dateFinRelle){
        
        this.dateDebutRelle = dateDebutRelle;
        this.dateFinRelle = dateFinRelle;
        this.tache = tache;
        this.employe = employe;
    }
    
    

    public EmployeTache(Date dateDebutRelle, Date dateFinRelle) {
        this.dateDebutRelle = dateDebutRelle;
        this.dateFinRelle = dateFinRelle;
    }

    public EmployeTache(EmployeTacheId Id, Date dateDebutRelle, Date dateFinRelle) {
        this.id = id;
        this.dateDebutRelle = dateDebutRelle;
        this.dateFinRelle = dateFinRelle;
    }

    public EmployeTacheId getId() {
        return id;
    }

    public void setId(EmployeTacheId id) {
        this.id = id;
    }

    public Date getDateDebutRelle() {
        return dateDebutRelle;
    }

    public void setDateDebutRelle(Date dateDebutRelle) {
        this.dateDebutRelle = dateDebutRelle;
    }

    public Date getDateFinRelle() {
        return dateFinRelle;
    }

    public void setDateFinRelle(Date dateFinRelle) {
        this.dateFinRelle = dateFinRelle;
    }

    @Override
    public String toString() {
        return "EmployeTache{" + "Id=" + id + ", dateDebutRelle=" + dateDebutRelle + ", dateFinRelle=" + dateFinRelle + '}';
    }

}
