/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adventuregameapp;

/**
 *
 * @author megac
 */
public class lapuertamagica extends escenas {

public lapuertamagica(){
    super ("==================================================\n                 ESCENARIO 1                      \n==================================================");
}

    @Override
    public boolean iniciar(Personaje personaje) {
        
        
        if (personaje.isTieneLlave()) {
            System.out.println("ENHORABUENA, han conseguido una *Llave* para ayudarles en su aventura!!");
            System.out.println("   +----+===============");
            System.out.println("   |o   |         ||  ||");
            System.out.println("   +----+             ||");
            System.out.println();
            System.out.println();
        }
        
        this.mostrarTitulo();
        
        System.out.println("Los aventureros entran a una habitacion misteriosa");
        System.out.println("y se encuentran con una enorme puerta de piedra...");
        System.out.println();
        System.out.println("   >>> SOLO ABRIRA LA PUERTA SI SON MAGOS");
        System.out.println("       O POSEAN LA LLAVE SECRETA <<<");
        System.out.println();
        System.out.println("La tension aumenta mientras se acercan a la puerta");
        System.out.println("==================================================");
        
        
        
        
        if(personaje.getRol().equals("Mago") || personaje.isTieneLlave()){
            System.out.println("\nLos aventureros se adentran por la puerta encontrando un bosque...");
            return true;
        }
        else{
            System.out.println("\nLa puerta no se abre, no eres apto");
            personaje.gameOver();
            return false;
        }
        
    }

        
        
        
        
    
    

    
}
