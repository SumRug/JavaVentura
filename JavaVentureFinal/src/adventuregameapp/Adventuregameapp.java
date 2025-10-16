/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adventuregameapp;
import java.util.Scanner;
/**
 *
 * @author megac
 */
public class Adventuregameapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("::::::::::::::::::::::::::::::::::::::");
        System.out.println("::: BIENVENIDOS A LA AVENTURA JAVA :::");
        System.out.println("::::::::::::::::::::::::::::::::::::::");
        System.out.println("Presione Enter para continuar...");
        sc.nextLine();
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("+----------------------------------+");
        System.out.println("|        >>  Elija un rol  <<      |");
        System.out.println("+----------------------------------+");
        System.out.println("| [0] Guerrero                     |");
        System.out.println("| [1] Mago                         |");
        System.out.println("| [2] Hacker                       |");
        System.out.println("| [3] Explorador                   |");
        System.out.println("+----------------------------------+");
        int rolElegido = sc.nextInt();
        
        //Comprobacion de rol valido 
        if(rolElegido == 0 || rolElegido == 1 || rolElegido == 2 ||rolElegido == 3){
            
        //Creacion del personaje tras los datos datos
        Personaje miPersonaje = new Personaje (nombre);
        miPersonaje.ElegirRol(rolElegido);
        System.out.println("TU NOMBRE Y ROL SON:");
        System.out.print(miPersonaje.getNombre() + " " + miPersonaje.getRol());

        System.out.println("\nPRESIONA ENTER PARA CONFIRMAR E INICIAR LA AVENTURA...");
        sc.nextLine();
        sc.nextLine();
        
        
        
        
        //Interaccion de objetos
        escenas escena1 = new lapuertamagica();
        escenas escena2 = new Bosque();
        escenas escena3 = new ElDragonFinal();
        escenas escena4 = new Cofre();
       
        System.out.println(" \n\n");
        miPersonaje.LlaveAleatoria();
        boolean puedeContinuar = true;
        
        
        //Escena 1
        puedeContinuar = escena1.iniciar(miPersonaje);
        System.out.println("PRESIONA ENTER PARA CONTINUAR");
        System.out.println(" \n\n");
        sc.nextLine();
        //De escena 1 a escena 2
        if(puedeContinuar){
            puedeContinuar = escena2.iniciar(miPersonaje);
        System.out.println("PRESIONA ENTER PARA CONTINUAR");
        sc.nextLine();
        }
        //De escena 2 a escena 3
        if(puedeContinuar){
            puedeContinuar = escena3.iniciar(miPersonaje);
        }
        if(puedeContinuar){
            puedeContinuar = escena4.iniciar(miPersonaje);
            System.out.println("PRESIONA ENTER PARA CONTINUAR");
            sc.nextLine();  
        }
        //Mensaje final
        System.out.println("-----------------------------------------");
        
        }else{
            System.out.println("Tu rol no es valido");
        }

        
        
    }
    
}
