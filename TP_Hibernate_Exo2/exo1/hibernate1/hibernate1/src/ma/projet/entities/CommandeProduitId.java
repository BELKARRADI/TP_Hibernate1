/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.entities;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class CommandeProduitId implements Serializable {
    
    private int commandeId;
    private int produitId;

    public CommandeProduitId(int commandeId, int produitId) {
        this.commandeId = commandeId;
        this.produitId = produitId;
    }

    public CommandeProduitId() {
    }

    public int getCommandeId() {
        return commandeId;
    }

    public void setCommandeId(int commandeId) {
        this.commandeId = commandeId;
    }

    public int getProduitId() {
        return produitId;
    }

    public void setProduitId(int produitId) {
        this.produitId = produitId;
    }

    @Override
    public String toString() {
        return "CommandeProduitId{" + "commandeId=" + commandeId + ", produitId=" + produitId + '}';
    }

 
    
    
    
    
    
    
}
