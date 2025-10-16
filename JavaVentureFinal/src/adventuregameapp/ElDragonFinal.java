/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adventuregameapp;

import java.util.Scanner;

public class ElDragonFinal extends escenas {
    
    public ElDragonFinal() {
        super("==================================================\n                 ESCENARIO 3                      \n==================================================");
    }

    @Override
    public boolean iniciar(Personaje personaje) {
        this.mostrarTitulo();
        System.out.println("Despues de una epica aventura, logras ver los anhelados tesoros...");
        System.out.println("De repente, un temible dragon despierta y te impide el paso. \nEs la batalla final!");
        System.out.println("============================================================\n");
        
        String rol = personaje.getRol();
        Scanner sc = new Scanner (System.in);
        System.out.println("PRESIONA ENTER PARA CONTINUAR");
        sc.nextLine();
        
        if (rol.equals("Hacker") && personaje.isTieneLaptop()) {
            System.out.println("\n¡Usas la laptop para activar las defensas de la guarida y atrapas al dragon! Escapas con el tesoro.");
            personaje.win();
            return true;
        } 
        
        else if (rol.equals("Explorador") && personaje.isTienePocion()) { 
            System.out.println("\nLanzas la pocion encontrada en el bosque! Duermes al dragon. Escapas con el tesoro.");
            personaje.win();
            return true;
        } 
        else if (rol.equals("Guerrero")) {
            System.out.println("El Guerrero se prepara para el combate. Lanzas un dado!\n");
            System.out.println("PRESIONA ENTER PARA CONTINUAR");
            sc.nextLine();
            int dado = (int) (Math.random() * 6 + 1);
            System.out.println("El resultado del dado es: " + dado);
            
            if (dado >= 4) {
                System.out.println("\nTu golpe es critico! Derrotas al dragon y reclamas el tesoro.");
                personaje.win();
                return true;
            } else {
                System.out.println("\nEl dragon es muy poderoso. Tu ataque falla y eres derrotado.");
                personaje.gameOver();
                return false;
            }
        }else if (personaje.getRol().equals("Mago") && personaje.isTieneFlauta()) {
                System.out.println("usa la flauta potenciada con su magia para controlar al dragon");
                System.out.println("obtienen un nuevo aliado y ¡GANAN EL TESORO!");
                personaje.win();
        // Si no se cumple ninguna de las condiciones de victoria:
        } else {
            System.out.println("\nNo tienes las habilidades o el equipo necesario para esta situacion. Eres derrotado.");
            personaje.gameOver();
            return false;
        }
        return false;
    }
}
