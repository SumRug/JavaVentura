/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adventuregameapp;

/**
 *
 * @author megac
 */
public class Cofre extends escenas {
    public Cofre(){
        super ("==================================================\n                 ESCENARIO EXTRA                     \n==================================================");
    } 

    @Override
    public boolean iniciar(Personaje personaje) {
        this.mostrarTitulo();
        System.out.println("\nDespues de vencer al dragon cada perosnaje obtuvo un tesoro en base a lo que mas anhela");
        System.out.println("==============================================================================================\n\n");
        
        //Como en el escenario 3 guardamos el rol en una variable para simplificar
        
        String rol = personaje.getRol();
        
        if(rol.equals("Mago")){
            System.out.println("Al ser Mago, obtuviste la formula para hacer una pocion que cura todas las enfermedades");
            return true;
        }
        else if(rol.equals("Guerrero")){
            System.out.println("Al ser Guerrero, obtuviste una espada legendaria que te ha hecho el mas fuerte de todo el reino");
            return true;
        }
        else if(rol.equals("Explorador")){
            System.out.println("Al ser explorador obtuviste el mapa de una antigua ciudad perdida llena de tesosros");
            return true;
        }
        else if(rol.equals("Hacker")){
            System.out.println("Al ser Hacker, obtuviste un dispositivo capaz de acceder a cualquier sistema");
            return true;
        }
        //Si no tiene un rol correcto
        else{
            System.out.println("Rol no reconocido, no se te asigno ningun tesoro");
            return false;
        }
        
    }
    
    
    
}
