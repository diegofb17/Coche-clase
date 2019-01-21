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
public class Prueba {
    
    public static void main(String[] args) {
        //Para crea un coche necesito: motor, cuatro ruedas y dos puertas
        
        Coche delorean = new Coche();
        
        Motor motorD = new Motor("motorDelorean", 2000, false, "Diesel");
        Rueda ruedaDD = new Rueda("rdd", true, 225);
        Rueda ruedaDI = new Rueda("rdi", true, 225);
        Rueda ruedaTD = new Rueda("rtd", true, 225);
        Rueda ruedaTI = new Rueda("rti", true, 225);
        
        Ventana vp = new Ventana("vp", false);
        Ventana vc = new Ventana("vc", false);
        
        Puerta piloto = new Puerta("pp", vp);
        Puerta copiloto = new Puerta("pc", vc);
        
        //Instanciar el coche con el constructor
        Coche nuevo = new Coche("OtroCoche", motorD, ruedaDD, ruedaDI, ruedaTD, ruedaTI, piloto, copiloto);
        
        //Otra opcion es usar los métodos set
        delorean.setId("Delorean");
        delorean.setMotor(motorD);
        delorean.setPuertaCopiloto(copiloto);
        delorean.setPuertaPiloto(piloto);
        delorean.setRuedaDD(ruedaDD);
        delorean.setRuedaDI(ruedaDI);
        delorean.setRuedaTD(ruedaTD);
        delorean.setRuedaTI(ruedaTI);
        
        System.out.println(delorean);
        
        delorean.getPuertaPiloto().getVentana().abrir();
        
    }
}
