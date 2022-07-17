/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package openbootcam;

/**
 *
 * @author fox
 */
public class Coche {
    
    int numero_puertas = 0;

    public Coche() {
        
    }
    
    public int aumentarpuerta(int sumar){
        
        numero_puertas = numero_puertas + sumar;
        return numero_puertas;
        
    }
}
