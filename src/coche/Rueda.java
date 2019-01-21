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
public class Rueda {
    private String id;
    private boolean isInflada;
    private double diametro;

    public Rueda(String id, boolean isInflada, double diametro) {
        this.id = id;
        this.isInflada = isInflada;
        this.diametro = diametro;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getIsInflada() {
        return isInflada;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    public void llenar(){
        this.isInflada=true;
    }
    
    public void vaciar(){
        this.isInflada=false;
    }

    @Override
    public String toString() {
        return "Rueda{" + "id=" + id + ", isInflada=" + isInflada + ", diametro=" + diametro + '}';
    }
    
    
    
}
