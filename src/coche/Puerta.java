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
public class Puerta {
    private String id;
    private Ventana ventana;
    private boolean isAbierta;

    public Puerta(String id, Ventana ventana) {
        this.id = id;
        this.ventana = ventana;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }
    
    public boolean getIsAbierta(){
        return this.isAbierta;
    }
    
    public void abrir() {
        this.isAbierta=true;
    }
    
    public void cerrar(){
        this.isAbierta=false;
    }
    
    @Override
    public String toString() {
        return "Puerta{" + "id=" + id + ", ventana=" + ventana + '}';
    }
    
    
    
}
