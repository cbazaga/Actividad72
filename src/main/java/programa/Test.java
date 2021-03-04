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
public class Test {
    public static void main(String[] args){
        //quitar public en Box.array
        //quitar public en Vehiculo.String
        //quitar public en Taller.Vehiculo[]
        Vehiculo v1 = new Vehiculo("2222DJD", "C4", tipoVehiculo.coche);
        Vehiculo v2 = new Vehiculo("2222DJF", "C3", tipoVehiculo.coche);
        Vehiculo v3 = new Vehiculo("2222DJR", "C2", tipoVehiculo.coche);
        Vehiculo v4 = new Vehiculo("2222DJT", "C1", tipoVehiculo.coche);
        
        Box caja = new Box();
        ArrayBox array = new ArrayBox();
        
        caja.array[0] = v1;
        caja.array[1] = v2;
        caja.array[2] = v3;
        caja.array[3] = v4;
        caja.EstadoBox();
        
        
        
        
        
        
    }
}
