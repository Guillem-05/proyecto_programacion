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
                public ElDespertarDelHeroe(){

                }

    
                // CONSTRUCTOR CON PARAMETROS
                


                // GETTERS Y SETTERS
                public static int getVidaMaxima() {
                    return VIDA_MAXIMA;
                }
                public static int[] setVidaMaxima(){
                    
        }
                public static int getVidaInicial() {
                    return VIDA_INICIAL;
                }
                public static int[] setVidaInicial(){

        }
                public static int getNumPociones() {
                    return NUM_POCIONES;
                }
                public static int[] setNumPociones(){

        }
                public static int getCuracionPocion() {
                    return CURACION_POCION;
                }
                public static int[] setCuracionPocion(){

        }
                public static int getAtaqueMinimoHeroe() {
                    return ATAQUE_MINIMO_HEROE;
                }
                public static int[] setAtaqueMinimoHeroe(){

        }
                public static int getAtaqueMaximoHeroe() {
                    return ATAQUE_MAXIMO_HEROE;
                }
                public static int[] setAtaqueMaximoHeroe(){

        }
                public static int getAtaqueMinimoEnemigo() {
                    return ATAQUE_MINIMO_ENEMIGO;
                }
                public static int[] setAtaqueMinimoEnemigo(){

        }
                public static int getAtaqueMaximoEnemigo() {
                    return ATAQUE_MAXIMO_ENEMIGO;
                }
                public static int[] setAtaqueMaximoEnemigo(){

        }
                public static int getPuntosPorEnemigo() {
                    return PUNTOS_POR_ENEMIGO;
                }
                public static int[] setPuntosPorEnemigo(){

        }
                public static int getCapacidadRanking() {
                    return CAPACIDAD_RANKING;
                }
                public static int[] setCapacidadRanking(){

        }
                public static String[] getNombresEnemigos() {
                    return NOMBRES_ENEMIGOS;
                }
                public static int[] setNombresEnemigos(){

        }
        public static int[] getVidasEnemigos() {
            return VIDAS_ENEMIGOS;
        }
        public static int[] setVidasEnemigos(){

        }
        
        

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

private static int usarPocion(){

}
// registrarPuntuacion() — introduce el resultado en el ranking.

private static int registrarPuntuacion(){

}
// mostrarRanking() — enseña las cinco mejores puntuaciones.    
private static int mostrarRanking(){

}
// mostrarAyuda() — explica las reglas.                            
private static int mostrarAyuda(){

}
}
