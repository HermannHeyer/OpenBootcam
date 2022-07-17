/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package openbootcam;

/**
 *
 * @author fox
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Eejercicio If");
        int numeroif = 5;
        int numerowhile = 1;
        String estacion;

        if (numeroif > 0) {
            System.out.println("Es Positivo");
        } else {
            System.out.println("Es Negativo");
        }
        System.out.println("----------------------------");
        System.out.println("Eejercicio While");

        while (numerowhile <= 3) {
            System.out.println("" + numerowhile);
            numerowhile++;

        }

        System.out.println("----------------------------");
        System.out.println("Eejercicio Do While");
        do {
            System.out.println("" + numerowhile);
        } while (numerowhile == 3);

        System.out.println("----------------------------");
        System.out.println("Eejercicio For");

        for (int i = 0; i <= 3; i++) {
            System.out.println("" + i);
        }

        System.out.println("----------------------------");
        System.out.println("Eejercicio Switch");
        estacion = "primavera";

        switch (estacion) {

            case "verano":
                System.out.println("Verano");
                break;

            case "otoño":
                 System.out.println("Otoño");
                break;

            case "invierno":
                 System.out.println("Invierno");
                break;

            case "primavera":
                 System.out.println("Primavera");
                break;
                
                default:
 
            // Print statement corresponding case
            System.out.println("no Existe esa estación");
        }

    }

}
