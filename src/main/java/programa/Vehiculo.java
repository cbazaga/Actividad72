/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;
import programa.tipoVehiculo;
import java.util.regex.Pattern;
import java.util.Scanner;
/**
 *
 * @author ciclost
 */
public class Vehiculo {
    private String modelo = null;
    public String matricula = null;
    private static final String PATRON = "\\d{4}[A-Z]{3}";
    private tipoVehiculo tipo = null;
    
    
    public Vehiculo(){
        
    }
    
    public Vehiculo(String matricula, String modelo, tipoVehiculo tipo){
        this.matricula = matricula;
        this.modelo = modelo;
        this.tipo = tipo;
    }
    
    public Vehiculo pedir(ColaGeneral cola){
        GestorIO entrada = new GestorIO();
        String tipo=null;
        String modelo=null;
        String matricula=null;
        System.out.println("Introduce el tipo de vehículo en minúsculas: ");
        tipo = entrada.inString();
        while(tipoVehiculo.valueOf(tipo) != tipoVehiculo.camion && tipoVehiculo.valueOf(tipo) != tipoVehiculo.coche && tipoVehiculo.valueOf(tipo) != tipoVehiculo.furgoneta && tipoVehiculo.valueOf(tipo) != tipoVehiculo.microbus){
            System.out.println("Vuelve a intentarlo");
            tipo = entrada.inString();
        }
        System.out.println("Ahora introduce el modelo del vehículo: ");
        modelo = entrada.inString();
        
        System.out.println("Por último introduce la matrícula del vehículo con las letras mayúsculas: ");
        matricula = entrada.inString();
        System.out.println("");
        while(!Pattern.matches(PATRON, matricula) || cola.comprobarMatricula(matricula) == true){
            System.out.print("Vuelve a intentarlo");
            matricula = entrada.inString();
        }
        return new Vehiculo(matricula, modelo, tipoVehiculo.valueOf(tipo));
    }

    //no he puesto marca en decirVehiculo porque no la pides al principio
    public String getVehiculo() {
        return (" es el vehículo matrícula "+matricula+", modelo "+modelo+" y tipo "+tipo);
    }

    public String getMatricula() {
        return matricula;
    }
    
    
    
    
    
    
    
    
    
    
}

