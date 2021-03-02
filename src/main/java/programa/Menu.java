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
public class Menu {
    
    
    public static void menu(){
        GestorIO entrada = new GestorIO();
        System.out.println("                         Menú    ");
        System.out.println("------------------------------------------------------");
        System.out.println("1.Alta y recepción de vehículos:");
        System.out.println("2.Reclamar vehículo para entrar en box:");
        System.out.println("3.Mover todos los vehículos de fase dentro de un box:");
        System.out.println("4.Información del estado de un box concreto:");
        System.out.println("5.Información general de todos los boxes:");
        System.out.println("6.Salir:");
        int numero = entrada.inInt();
        
        switch(numero){
            case 1: 
                
            case 2:
                
            case 3:
                
            case 4:
                
            case 5:
                
            case 6: break;
        }
    }
}
