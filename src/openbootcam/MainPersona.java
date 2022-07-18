/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package openbootcam;

/**
 *
 * @author fox
 */
public class MainPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona persona = new Persona();
       
       persona.setNombre("Hermann Heyer");
       persona.setEdad(32);
       persona.setTelefono("+569 6714 4430");
       
        System.out.println("El nombre es : "+persona.getNombre());
        System.out.println("La Edad es : "+persona.getEdad());
         System.out.println("El número de teléfono es  : "+persona.getTelefono());
    }
    
}
