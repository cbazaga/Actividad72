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
public class Taller {
        //ARRAY DE BOXES
    private Box[] arrayBox = null;
    private int cantidad = 6;
        //COLA GENERAL
    private ColaGeneral colageneral = null;
    private Vehiculo vehiculo = null;
    
        //Inicializamos el array de boxes, la cola general y el vehículo
    public Taller(){
        arrayBox = new Box[cantidad];
        for(int i=0; i< cantidad; i++){
            arrayBox[i] = new Box();        
        }
        colageneral = new ColaGeneral();
        vehiculo = new Vehiculo();
    }
    
    public void AltaVehiculo(){
        if (colageneral.comprobarCola() == false){
            System.exit(0);
        }
        else{
            vehiculo.pedir(colageneral);
            colageneral.insertarEnCola(vehiculo);
        }
    }
    
    public void ReclamarVehiculo(){
        
    }
    
    public void MoverVehiculos(){
        arrayBox[pedirNumero()].MoverVehiculos();
    }
    
    public void InfoBox(){
        
        arrayBox[pedirNumero()].EstadoBox();
    }
    
    public void InfoTodosBoxes(){
        for(int i=0; i<arrayBox.length; i++){
            System.out.print("Box "+(i+1)+":\n");
            arrayBox[i].EstadoBox();
        }
    }
    
    public static int pedirNumero(){
        GestorIO entrada = new GestorIO();
        int numero=-1;
        System.out.println("Introduce un número de box entre 1 y 6:");
        numero = entrada.inInt();
        while(numero<1 && numero>6 ){
            System.out.println("Intentalo de nuevo");
            numero = entrada.inInt();
        }
        numero--;
        return numero;
        
    }
    
    
    
}
