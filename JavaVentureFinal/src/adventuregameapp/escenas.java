/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adventuregameapp;

/**
 *
 * @author megac
 */
public abstract class escenas {
    protected String nombreEscena;

    public escenas(String nombreEscena) {
        this.nombreEscena = nombreEscena;
    }
    
    public abstract boolean iniciar(Personaje personaje);
    
    
    public void mostrarTitulo() {
        System.out.println("\n" + this.nombreEscena);
    }
    
    
}
