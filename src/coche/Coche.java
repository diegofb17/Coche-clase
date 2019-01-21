/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

public class Coche {
    private String id;
    
    //Composicion de clases
    private Motor motor;
    private Rueda ruedaDD, ruedaDI, ruedaTD, ruedaTI;
    private Puerta puertaPiloto, puertaCopiloto;

    //Inyeccion de dependencias mediante constructor
    public Coche(String id, Motor motor, Rueda ruedaDD, Rueda ruedaDI, Rueda ruedaTD, Rueda ruedaTI, Puerta puertaPiloto, Puerta puertaCopiloto) {
        this.id = id;
        this.motor = motor;
        this.ruedaDD = ruedaDD;
        this.ruedaDI = ruedaDI;
        this.ruedaTD = ruedaTD;
        this.ruedaTI = ruedaTI;
        this.puertaPiloto = puertaPiloto;
        this.puertaCopiloto = puertaCopiloto;
    }
    
    public Coche(){
        id = "Coche por defecto";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Rueda getRuedaDD() {
        return ruedaDD;
    }

    public void setRuedaDD(Rueda ruedaDD) {
        this.ruedaDD = ruedaDD;
    }

    public Rueda getRuedaDI() {
        return ruedaDI;
    }

    public void setRuedaDI(Rueda ruedaDI) {
        this.ruedaDI = ruedaDI;
    }

    public Rueda getRuedaTD() {
        return ruedaTD;
    }

    public void setRuedaTD(Rueda ruedaTD) {
        this.ruedaTD = ruedaTD;
    }

    public Rueda getRuedaTI() {
        return ruedaTI;
    }

    public void setRuedaTI(Rueda ruedaTI) {
        this.ruedaTI = ruedaTI;
    }

    public Puerta getPuertaPiloto() {
        return puertaPiloto;
    }

    public void setPuertaPiloto(Puerta puertaPiloto) {
        this.puertaPiloto = puertaPiloto;
    }

    public Puerta getPuertaCopiloto() {
        return puertaCopiloto;
    }

    public void setPuertaCopiloto(Puerta puertaCopiloto) {
        this.puertaCopiloto = puertaCopiloto;
    }

    @Override
    public String toString() {
        return "Coche{" + "id=" + id + ", motor=" + motor + ", ruedaDD=" + ruedaDD + ", ruedaDI=" + ruedaDI + ", ruedaTD=" + ruedaTD + ", ruedaTI=" + ruedaTI + ", puertaPiloto=" + puertaPiloto + ", puertaCopiloto=" + puertaCopiloto + '}';
    }
    
    public void arrancar(){
        // Si no está arrancado
        if(!getMotor().getIsOn()){
            this.motor.arrancar();
        }
    }
    
    public void parar(){
        //Si está arrancado lo para
        if(this.motor.getIsOn()){
            this.motor.apagar(); 
        }
    }
    
    public void bajarVentanillaCopiloto(){
        if(!this.puertaCopiloto.getVentana().getIsAbierta()){ 
            this.puertaCopiloto.getVentana().abrir();
        }
    }
    
    public void llenarRuedaDelanteraDerecha(){
        if(!this.ruedaDD.getIsInflada()){
            this.ruedaDD.llenar();
        }
    }
    
    
    
}
