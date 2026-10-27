import java.util.Scanner;

public class ElDespertarDelHeroe extends Heroe{
    private static final int VIDA_MAXIMA = 100;
    private static final int VIDA_INICIAL = 100;
    private static final int NUM_POCIONES = 3;
    private static final int CURACION_POCION = 25;
    private static final int ATAQUE_MINIMO_HEROE = 10;
    private static final int ATAQUE_MAXIMO_HEROE = 20; 
    private static final int ATAQUE_MINIMO_ENEMIGO = 5;
    private static final int ATAQUE_MAXIMO_ENEMIGO = 15;
    private static final int PUNTOS_POR_ENEMIGO = 100;
    private static final int CAPACIDAD_RANKING = 5;
    private static final int[] VIDAS_ENEMIGOS = (40, 60, 80);
    private static final String[] NOMBRES_ENEMIGOS = ("Guardian de piedra", "Caballero oscuro", "Dragón ancestral");

    // main() inicia el programa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nombresRanking = new String[CAPACIDAD_RANKING];
        int[] puntosRanking = new int[CAPACIDAD_RANKING];
        int cantidadRanking = 0;
        boolean salir = false;
        do {
            mostrarMenu();
            int opcion = leerEnteroEnRango(teclado, "Elige una opcion: ", 1, 4);
        switch (opcion) {
            case 1:
                
                break;
        
            default:
                break;
        }
        }
        while (!salir);
        teclado.close();
    }
        
                // CONSTRUCTOR VACIO


    
                // CONSTRUCTOR CON PARAMETROS



                // GETTERS Y SETTERS
        

                //METODOS 
        
    // mostrarMenu muestra las opciones principales 
    private static void mostrarMenu(){

    };
    // leerEnteroEnRango valida las entradas.
    private static int leerEnteroEnRango(Scanner teclado, String mensaje, int minimo, int maximo){
        
    }
    // iniciarPartida prepara al héroe y la partida.
    private static int iniciarPartida(){

    }
    // simularCombate controla los turnos.
    private static int simularCombate(){

    }
// consultarInventario() — muestra las pociones disponibles.    
private static int consultarInventario(){
    
}
// usarPocion() — cura al héroe y consume una poción.           

// registrarPuntuacion() — introduce el resultado en el ranking.

// mostrarRanking() — enseña las cinco mejores puntuaciones.    

// mostrarAyuda() — explica las reglas.                            

}
