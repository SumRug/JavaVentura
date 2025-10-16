/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adventuregameapp;

/**
 *
 * @author megac
 */
public class Personaje {
    private String nombre;
    private String rol;
    private boolean tieneLlave;
    private boolean tieneAntorcha;
    private boolean tieneLaptop;
    private boolean tienePocion;
    private boolean tieneFlauta;
    private boolean tieneDado;
    private String objetoEspecial;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isTieneLlave() {
        return tieneLlave;
    }

    public void setTieneLlave(boolean tieneLlave) {
        this.tieneLlave = tieneLlave;
    }

    public boolean isTieneAntorcha() {
        return tieneAntorcha;
    }

    public void setTieneAntorcha(boolean tieneAntorcha) {
        this.tieneAntorcha = tieneAntorcha;
    }

    public boolean isTieneLaptop() {
        return tieneLaptop;
    }

    public void setTieneLaptop(boolean tieneLaptop) {
        this.tieneLaptop = tieneLaptop;
    }

    public boolean isTienePocion() {
        return tienePocion;
    }

    public void setTienePocion(boolean tienePocion) {
        this.tienePocion = tienePocion;
    }
    
    
    public String getObjetoEspecial() {
        return objetoEspecial;
    }
    
    
    public boolean isTieneFlauta() {
        return tieneFlauta;
    }

    

    
    
    public void ElegirRol(int numero) {
        switch (numero) {
            case 0:
                rol = "Guerrero";
                break;
            case 1:
                rol = "Mago";
                break;
            case 2:
                rol = "Hacker";
                break;
            case 3:
                rol = "Explorador";
                break;
            default:
                System.exit(0);
        }
    }
    
    
    public void LlaveAleatoria() {
        int Posibilidad = (int) (Math.random() * 5);
        tieneLlave = Posibilidad == 0;
    }
    
    public void AntorchaAleatoria() {
        int Posibilidad = (int) (Math.random() * 2);
        tieneAntorcha = Posibilidad == 0;
    }
    
        public void objetoEspecial() {
        switch (rol) {
            case "Guerrero":
                tieneDado = true;
                 objetoEspecial = "Dado";
                break;
            case "Explorador":
                 tienePocion = true;
                  objetoEspecial = "Pocion";
                break;
            case "hacker":
                tieneLaptop = true;
                 objetoEspecial = "Computadora";
                break;
            case "Mago":
                tieneFlauta = true;
                 objetoEspecial = "Flauta";
                break;
            default:
                break;
         }
        }
    
     public void gameOver() {
        System.out.println("\n+++++++ GAME OVER +++++++");
    }
     
     public void win() {
        System.out.println("\n+++++++ #1 VICTORY +++++++");
    }

    
    

    
    
    
    
    
    
    
    
}






