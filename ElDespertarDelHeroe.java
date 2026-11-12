import java.util.Scanner;

public class ElDespertarDelHeroe {
    private static final int CAPACIDAD_RANKING = 5;
    private int[] VIDAS_ENEMIGOS = { 40, 60, 80 };
    private String[] NOMBRES_ENEMIGOS = { "Guardian de piedra", "Caballero oscuro", "Dragón ancestral" };

    // main() inicia el programa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] nombresRanking = new String[CAPACIDAD_RANKING];
        int[] puntosRanking = new int[CAPACIDAD_RANKING];
        int cantidadRanking = 0;
        ElDespertarDelHeroe juego = new ElDespertarDelHeroe();

        boolean salir = false;
        do {
            mostrarMenu();
            int opcion = leerEnteroEnRango(teclado, "\nElige una opción: \n");
            switch (opcion) {
                case 1:
                    System.out.println("Iniciar partida ");
                    juego.iniciarPartida(teclado);

                    break;

                case 2:
                    System.out.println("Consultar ranking ");
                    break;

                case 3:
                    System.out.println("Ayuda");
                    break;
                case 4:
                    System.out.println("Salir");
                    System.out.println("HASTA LA PRÓXIMA");
                    salir = true;
                    break;
                default:
                    System.out.println("Respuesta no válida ");
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
    private static void mostrarMenu() {
        System.out.println(
                "Bienvenido al 'DESPERTAR DEL HEROE' \n Opciones: \n\n 1- Iniciar partida \n 2- Consultar ranking \n 3- Ayuda \n 4- Salir");
    };

    private static int leerEnteroEnRango(Scanner teclado, String mensaje) {

        System.out.println(mensaje + "\n");
        int opcion = teclado.nextInt();

        return opcion;
    }

    // iniciarPartida prepara al héroe y la partida.
    private void iniciarPartida(Scanner teclado) {
        System.out.println("Bienvenido héroe");

        String nombre = crearNombre(teclado);

        Inventario inventario = new Inventario();
        Heroe jugador = new Heroe(nombre, inventario);

        Enemigo villano1 = new Enemigo(NOMBRES_ENEMIGOS[0], VIDAS_ENEMIGOS[0]);
        System.out.println("Encantado Sr. " + nombre);
        simularCombate(teclado, jugador, villano1);
    }

    private static String crearNombre(Scanner teclado) {
        boolean nombreCorrecto = false;
        String nombre = "";
        teclado.nextLine();
        do {

            System.out.println("¿Como te llamas?");
            nombre = teclado.nextLine();
            if (!nombre.trim().equals("")) {
                nombreCorrecto = true;
            }
            ;
        } while (!nombreCorrecto);

        return nombre;
    }

    // simularCombate controla los turnos.
    private void simularCombate(Scanner teclado, Heroe jugador, Enemigo villano) {
        boolean combateTerminado = false;
        boolean gastarTurno = false;
        while (!combateTerminado) {
            System.out.println("¿Que accion quieres realizar? ");
            System.out.println("1- Atacar 2- Usar pocion 3- Consultar Inventario 4- Abandonar ");
            int respuesta = teclado.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.println("1- Atacar");
                    int dano = jugador.atacarAlEnemigo();
                    villano.recibirDamageHeroe(dano);
                    System.out.println("Le has hecho " + dano);
                    System.out.println(
                            "Al " + villano.getNombre() + " le queda " + villano.getVidaActual() + " de vida ");
                    gastarTurno = true;
                    break;

                case 2:
                    System.out.println("Usar pocion ");
                    gastarTurno = jugador.usarPocion();
                    break;

                case 3:
                    System.out.println("Consultar inventario");
                    jugador.getInventario().mostrarPociones();
                    gastarTurno = false;
                    break;
                case 4:
                    System.out.println("Salir");
                    combateTerminado = true;
                    System.out.println("Hasta la proxima " + jugador.getNombre() + ", el " + villano.getNombre()
                            + " se ha quedado con las ganas... ");
                    gastarTurno = false;
                    break;
                default:
                    System.out.println("Respuesta no válida ");
                    break;
            }
            if (gastarTurno) {

                if (villano.getVidaActual() <= 0) {
                    System.out.println("Villano muerto ");
                    combateTerminado = true;
                } else {
                    System.out.println(villano.getNombre() + " Te ataca");
                    int dano = villano.atacarAlHeroe();
                    jugador.recibirDamageEnemigo(dano);
                    System.out.println("Te ha hecho " + dano + " de daño");
                    System.out.println(jugador.getNombre() + " te queda " + jugador.getVidaActual() + " de vida ");
                    if (jugador.getVidaActual() <= 0) {
                        System.out.println(" Has muerto, " + jugador.getNombre());
                        combateTerminado = true;
                    }

                }
            }
        }
    }

    // consultarInventario() — muestra las pociones disponibles.
    private static void consultarInventario() {

    }
    // usarPocion() — cura al héroe y consume una poción.

    private static void usarPocion() {

    }
    // registrarPuntuacion() — introduce el resultado en el ranking.

    private static void registrarPuntuacion() {

    }

    // mostrarRanking() — enseña las cinco mejores puntuaciones.
    private static void mostrarRanking() {

    }

    // mostrarAyuda() — explica las reglas.
    private static void mostrarAyuda() {

    }

    private static void vidaActual() {

    }

    private static void vidaEnemigo() {

    }

    private static void puntuaciones() {

    }

    private static void nombreJugador() {

    }

    private static void enemigosDerrotados() {

    }

    private static void pocionesDisponibles() {

    }

}
