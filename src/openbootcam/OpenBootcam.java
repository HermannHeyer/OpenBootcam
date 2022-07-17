/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package openbootcam;

/**
 *
 * @author fox
 */
public class OpenBootcam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int resultado = 0;
       int numero;
       resultado = suma(3,4,5);
        System.out.println("El resultado es :"+resultado);
       
        
        Coche miCoche = new Coche();
        
       numero = miCoche.aumentarpuerta(5);
        System.out.println("El numero de puertas del coche es:"+numero);
    }
    
    public static int suma(int n1,int n2, int n3){
        int resultado=0;
        
        resultado = n1+n2+n3;
        
        return resultado;
    }
    
}
