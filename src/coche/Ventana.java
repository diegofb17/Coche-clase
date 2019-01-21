/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

/**
 *
 * @author whizrxt
 */
public class Ventana {
    private String id;
    private boolean isAbierta;

    public Ventana(String id, boolean isAbierta) {
        this.id = id;
        this.isAbierta = isAbierta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getIsAbierta() {
        return isAbierta;
    }

    public void abrir(){
        this.isAbierta=true;
    }
    
    public void cerrar(){
        this.isAbierta=false;
    }
    
    @Override
    public String toString() {
        return "Ventana{" + "id=" + id + ", isAbierta=" + isAbierta + '}';
    }
    
}
