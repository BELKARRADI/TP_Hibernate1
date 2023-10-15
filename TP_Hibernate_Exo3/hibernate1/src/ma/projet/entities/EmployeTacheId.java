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
public class EmployeTacheId implements Serializable {
    
    private int EmployeId;
    private int TacheId;

    public EmployeTacheId() {
    }

    public EmployeTacheId(int EmployeId, int TacheId) {
        this.EmployeId = EmployeId;
        this.TacheId = TacheId;
    }

    public int getEmployeId() {
        return EmployeId;
    }

    public void setEmployeId(int EmployeId) {
        this.EmployeId = EmployeId;
    }

    public int getTacheId() {
        return TacheId;
    }

    public void setTacheId(int TacheId) {
        this.TacheId = TacheId;
    }

    @Override
    public String toString() {
        return "EmployeTacheId{" + "EmployeId=" + EmployeId + ", TacheId=" + TacheId + '}';
    }
    
    
    
}
