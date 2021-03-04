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
    
    public void pedir(ColaGeneral cola){
        GestorIO entrada = new GestorIO();
        String tipo=null;
        String modelo=null;
        String matricula=null;
        System.out.println("Introduce el tipo de vehículo: ");
        tipo = entrada.inString();
        while(tipo.equalsIgnoreCase("camion")==false && tipo.equalsIgnoreCase("coche")==false && tipo.equalsIgnoreCase("furgoneta") && tipo.equalsIgnoreCase("microbus") == false){
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
        this.matricula = matricula;
        this.modelo = modelo;
        this.tipo = tipoVehiculo.valueOf(tipo);
    }

    //no he puesto marca en decirVehiculo porque no la pides al principio
    public String getVehiculo() {
        return (" es el vehículo matrícula "+matricula+", modelo "+modelo+" y tipo "+tipo+"\n");
    }

    public String getMatricula() {
        return matricula;
    }
    
    
    
    
    
    
    
    
    
    
}

