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
public class ArrayBox {
    private Box[] arrayBox = null;
    private int cantidad = 6;
    
    public ArrayBox(){
        arrayBox = new Box[cantidad];
        for(int i=0; i< cantidad; i++){
            arrayBox[i] = new Box();        }
    }
}
