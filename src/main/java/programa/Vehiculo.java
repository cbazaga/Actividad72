/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

/**
 *
 * @author ciclost
 */
public class Vehiculo {
    private String modelo = null;
    private String matricula = null;
    enum tipoVehiculo{
    coche, microbus, furgoneta, camion;
    }
    private tipoVehiculo tipo;

    public Vehiculo(tipoVehiculo tipo) {
        this.tipo = tipo;
    }
    
    public Vehiculo(String matricula, String modelo){
        this.matricula = matricula;
        this.modelo = modelo;
    }
    
    public Vehiculo(String matricula, String modelo, tipoVehiculo tipo){
        this(matricula, modelo);
        this.tipo = tipo;
    }
    
    public tipoVehiculo pedir(){
        GestorIO entrada = new GestorIO();
        String tipo=null;
        System.out.println("Introduce el tipo de vehículo");
        tipo = entrada.inString();
        while(tipo.equals(tipoVehiculo.camion)){
            System.out.println("Vuelve a intentarlo");
            tipo = entrada.inString();
        }
    }
    
    
}

