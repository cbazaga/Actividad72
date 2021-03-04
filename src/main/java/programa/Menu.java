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
    
    
    public static void menu(Taller taller){
        GestorIO entrada = new GestorIO();
        int numero = -1;
        while(numero!=6){
        System.out.println("                         Menú    ");
        System.out.println("------------------------------------------------------");
        System.out.println("1.Alta y recepción de vehículos:");
        System.out.println("2.Reclamar vehículo para entrar en box:");
        System.out.println("3.Mover todos los vehículos de fase dentro de un box:");
        System.out.println("4.Información del estado de un box concreto:");
        System.out.println("5.Información general de todos los boxes:");
        System.out.println("6.Salir:");
        numero = entrada.inInt();
            switch(numero){
                case 1: 
                    taller.AltaVehiculo();
                    break;
                
                case 2: 
                    taller.ReclamarVehiculo();
                    break;
                
                case 3: 
                    taller.MoverVehiculos();
                    break;
                
                case 4: 
                    taller.InfoBox();
                    break;
                
                case 5: 
                    taller.InfoTodosBoxes();
                    break;
                
                case 6: break;
            }
        }
    }
}
