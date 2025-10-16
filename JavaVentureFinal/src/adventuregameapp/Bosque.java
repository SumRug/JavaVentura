package adventuregameapp;
import java.util.Scanner;

public class Bosque extends escenas {
    
    public Bosque() {
        super("==================================================\n                 ESCENARIO 2                      \n==================================================");
    }

    @Override
    public boolean iniciar(Personaje personaje) {
        this.mostrarTitulo();
            System.out.println("Los aventureros se encuentran con varios caminos");
            System.out.println("asi que deciden por donde seguir su camino...");
            System.out.println("==================================================");
        
            
            personaje.AntorchaAleatoria();
             if (personaje.isTieneAntorcha()) {
                System.out.println("\nENHORABUENA, han encontrado una *antorcha* en el camino para iluminar Lugares oscuros!!\n");
                        
    
            }
        Scanner sc = new Scanner(System.in);
        System.out.print("\nQue camino eliges, izquierda, derecha u otro?: "); // Usé print para que la respuesta sea en la misma línea
        String decision = sc.nextLine();
        
        // Si toma el camino de la izquierda:
        if (decision.equals("izquierda")) {
            System.out.println("\nTomas el camino de la izquierda, a pesar de la oscuridad sigues avanzando");
            
            if (personaje.isTieneAntorcha()) {
                personaje.objetoEspecial();
                System.out.println("\nLlevas una antorcha que ilumina el camino, al seguir avanzando encuentras un cofre con un obejto especial ( " + personaje.getObjetoEspecial()+" )");
                personaje.setTienePocion(true);
                return true;
            } else {
                System.out.println("\nAl no llevar nada para iluminar, caes en una trampa escondida, no puedes continuar ");
                personaje.gameOver();
                return false;
            }
        }
        
        // Si toma el camino de la derecha 
        
        else if (decision.equals("derecha")) { 
            System.out.println("\nTomas el camino de la derecha, a pesar de sentir la presencia de un poderoso ente sigues avanzando");
            if (personaje.getRol().equals("Guerrero")) {
                System.out.println("\nComo el valiente Guerrero que eres, logras vencer al caballero oscuro");
                return true;
            } else {
                System.out.println("\nAl no ser guerrero, el caballero te ha derrotado");
                personaje.gameOver();
                return false; 
            }
        }
        // Si se escribe otra cosa que no sea izquierda o derecha
        else {
            System.out.println("\nHas tomado un camino equivocado y te pierdes en el bosque");
            personaje.gameOver();
            return false; 
        }
    }
}
