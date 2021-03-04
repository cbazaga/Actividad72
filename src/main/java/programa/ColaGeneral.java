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
public class ColaGeneral {
    public Vehiculo[] cola = null;
    final private int cantidad = 10;
    private int numeroVehiculos =0;
    
    public ColaGeneral(){
        cola = new Vehiculo[cantidad];
        this.aNull();
    }
    
    public void aNull(){
        for(int i=0; i<cola.length; i++){
            cola[i] = null;
        }
    }
    
    public void insertarEnCola(Vehiculo vehiculo){
        if(cola[cola.length-1]==null){
            for(int i=0; i<cola.length-1;i++){
                if(cola[i]==null){
                    cola[i] = vehiculo;
                    System.out.println("Se ha insertado el vehículo en la posición "+(i+1));
                    i=cola.length-1;
                }
            }
        }
    }
    
    public void actualizarCola(){
        for(int i=0; i<cola.length-1; i++){
            if(i<cola.length-2){
                cola[i] = cola[i++];
            }
            else cola[i] = null;
        }
    }
    
    public boolean comprobarCola(){
        if(cola[cola.length-1] == null){
            System.out.println("La cola no está completa");
            return true; 
        }
        else {
            System.out.println("La cola general está completa");
            return false;
        }
    }
    
    public boolean comprobarMatricula(String matricula){
        if(numeroVehiculos > 0){
            for(int i=0; i<cola.length;i++){
                if(cola[i].getMatricula().equals(matricula)){
                    System.out.println("Esta matricula ya ha sido insertada. ");
                    return true;
                }
            }
        } 
        return false;
    }
    
    public Vehiculo primeroCola(){
        return cola[0];
    }
    public boolean hayPrimero(){
        if(cola[0] != null){
            return true;
        }
        else return false;
    }
}
