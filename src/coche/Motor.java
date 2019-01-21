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
public class Motor {
    
    private String id; // Nombre
    private int potencia;   // Caballos
    private boolean isOn; // Para saber si está encendido
    private String tipoMotor; // Gasolina, Diesel

    public Motor(String id, int potencia, boolean isOn, String tipoMotor) {
        this.id = id;
        this.potencia = potencia;
        this.isOn = isOn;
        this.tipoMotor = tipoMotor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    
    public void arrancar(){
        this.isOn = true;
    }
    
    public void apagar(){
        this.isOn=false;
    }

    @Override
    public String toString() {
        return "Motor{" + "id=" + id + ", potencia=" + potencia + ", isOn=" + isOn + ", tipoMotor=" + tipoMotor + '}';
    }

    
    
}
