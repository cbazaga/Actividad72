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
public class Box {
    public Vehiculo[] array = null;
    private static int cantidad = 4;
    
    public Box(){
        array = new Vehiculo[cantidad];
        this.BoxNull();
    }
    
    public void BoxNull(){
        for(int i=0; i<array.length; i++){
            array[i] = null;
        }
    }
    
    public boolean HayVehiculo(Vehiculo vehiculo){
        if(array[0] == null){
            System.out.println("Tu vehículo no se ha podido insertar en el box ya que hay otro vehículo ocupando la primera fase de la revisión. ");
            return true;
        }
        else array[0] = vehiculo;
        System.out.println("Tu vehículo ha sido insertado en la primera fase de revisión con éxito. ");
        return false;
    }
    
    public void MoverVehiculos(){
        int i = array.length-1;
        while (i>0){
            array[i] = array[i-1];
            i--;
        }
        array[0] = null;
    }
}
