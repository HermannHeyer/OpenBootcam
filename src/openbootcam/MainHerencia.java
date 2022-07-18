/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package openbootcam;

/**
 *
 * @author fox
 */
public class MainHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        Trabajador tra = new Trabajador();

        cli.setNombre("Hermann Heyer");
        cli.setEdad(32);
        cli.setTelefono("+569 6714 4430");
        cli.setCredito("$1.000.000");

        System.out.println("El nombre es : " + cli.getNombre());
        System.out.println("La Edad es : " + cli.getEdad());
        System.out.println("El número de teléfono es  : " + cli.getTelefono());
        System.out.println("El número Credito es  : " + cli.getCredito());

        System.out.println("---------Trabajador---------");
        
        tra.setNombre("Hermann Heyer");
        tra.setEdad(32);
        tra.setTelefono("+569 6714 4430");
        tra.setSalario(100000);

        System.out.println("El nombre del trabajador es : " + tra.getNombre());
        System.out.println("La Edad es : " + tra.getEdad());
        System.out.println("El número de teléfono es  : " + tra.getTelefono());
        System.out.println("El número Credito es  : " + tra.getSalario());

    }

}
