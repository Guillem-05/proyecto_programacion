import java.util.Scanner;

public class ElDespertarDelHeroe {
    private static final int CAPACIDAD_RANKING = 5;

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
        } while (!salir);
        teclado.close();
    }

    // CONSTRUCTOR VACIO
    public ElDespertarDelHeroe() {

    }

    // CONSTRUCTOR CON PARAMETROS

    // GETTERS Y SETTERS
    public static int getCapacidadRanking() {
        return CAPACIDAD_RANKING;
    }

    public static void setCapacidadRanking() {

    }
    // METODOS

    // mostrarMenu muestra las opciones principales
    private static void mostrarMenu() {

    };

    // leerEnteroEnRango valida las entradas.
    private static int leerEnteroEnRango(Scanner teclado, String mensaje, int minimo, int maximo) {

    }

    // iniciarPartida prepara al héroe y la partida.
    private static int iniciarPartida() {

    }

    // simularCombate controla los turnos.
    private static int simularCombate() {

    }

    // consultarInventario() — muestra las pociones disponibles.
    private static int consultarInventario() {

    }
    // usarPocion() — cura al héroe y consume una poción.

    private static int usarPocion() {

    }
    // registrarPuntuacion() — introduce el resultado en el ranking.

    private static int registrarPuntuacion() {

    }

    // mostrarRanking() — enseña las cinco mejores puntuaciones.
    private static int mostrarRanking() {

    }

    // mostrarAyuda() — explica las reglas.
    private static int mostrarAyuda() {

    }
}
