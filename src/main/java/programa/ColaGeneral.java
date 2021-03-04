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
    
    public ColaGeneral(){
        cola = new Vehiculo[cantidad];
        this.aNull();
    }
    
    public void aNull(){
        for(int i=0; i<cola.length; i++){
            cola[i] = null;
        }
    }
    
    public void comprobarCola(Vehiculo vehiculo){
        for(int i=cola.length; i>0;i--){
            if(cola[cola.length-1] !=null){
                System.out.println("La cola general está completa");
            }
            else if(cola[i]==null && cola[i-1]!=null){
                cola[i]=vehiculo;
            }
        }
    }
    
    public boolean comprobarMatricula(String matricula){
        for(int i=0; i<cola.length;i++){
            if(cola[i].getMatricula().equals(matricula)){
                System.out.println("Esta matricula ya ha sido insertada. ");
                return true;
            }
        }
        return false;
    }
}
