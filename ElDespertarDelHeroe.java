import java.util.Scanner;

public class ElDespertarDelHeroe {
   
    private int[] VIDAS_ENEMIGOS = { 40, 60, 80 };
    private String[] NOMBRES_ENEMIGOS = { "Guardian de piedra", "Caballero oscuro", "Dragón ancestral" };

    // main() inicia el programa
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ElDespertarDelHeroe juego = new ElDespertarDelHeroe();
        RankingXML.cargarRanking();

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
                    System.out.println("Consultar ranking");
                    RankingXML.mostrarRanking();
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
        int puntos = 0;
        int puntosBonus = 0;

        Inventario inventario = new Inventario();
        Heroe jugador = new Heroe(nombre, inventario);
        System.out.println("Encantado Sr/a. " + nombre);

        boolean combateGanado = false;

        Enemigo villano1 = new Enemigo(NOMBRES_ENEMIGOS[0], VIDAS_ENEMIGOS[0]);
        combateGanado = simularCombate(teclado, jugador, villano1);
        if (combateGanado) {
            puntos = puntos + 100;
            Enemigo villano2 = new Enemigo(NOMBRES_ENEMIGOS[1], VIDAS_ENEMIGOS[1]);
            combateGanado = simularCombate(teclado, jugador, villano2);
            if (combateGanado) {
                puntos = puntos + 100;
                Enemigo villano3 = new Enemigo(NOMBRES_ENEMIGOS[2], VIDAS_ENEMIGOS[2]);
                combateGanado = simularCombate(teclado, jugador, villano3);
                if (combateGanado) {
                    puntosBonus = jugador.getVidaActual();
                    puntos = puntos + 100 + puntosBonus;
                    System.out.println(" Enhorabuena, has derrotado a los 3 enemigos. \n Te has pasado el juego!! ");

                }

            }

        }
        System.out.println(" Tu puntuación total ha sido " + puntos + " y la puntuación bonus ha sido " + puntosBonus);

        RankingXML.registrarPuntuacion(jugador.getNombre(), puntos);

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
    private boolean simularCombate(Scanner teclado, Heroe jugador, Enemigo villano) {
        boolean combateTerminado = false;
        boolean gastarTurno = false;
        System.err.println("Te vas a enfrentar contra el " + villano.getNombre());

        while (!combateTerminado) {
            System.out.println("¿Que acción quieres realizar? ");
            System.out.println("1- Atacar 2- Usar pocion 3- Consultar Inventario 4- Abandonar ");
            int respuesta = teclado.nextInt();
            switch (respuesta) {
                case 1:

                    int dano = jugador.atacarAlEnemigo();
                    villano.recibirDamageHeroe(dano);
                    System.out.println("Le has hecho " + dano + " de daño ");
                    System.out.println(
                            "Al " + villano.getNombre() + " le queda " + villano.getVidaActual() + " de vida ");
                    gastarTurno = true;
                    break;

                case 2:
                    gastarTurno = jugador.usarPocion();
                    break;

                case 3:
                    jugador.getInventario().mostrarPociones();
                    gastarTurno = false;
                    break;
                case 4:
                    combateTerminado = true;
                    System.out.println("Hasta la próxima " + jugador.getNombre() + ", el " + villano.getNombre()
                            + " se ha quedado con las ganas... ");
                    gastarTurno = false;
                    return false;

                default:
                    System.out.println("Respuesta no válida ");
                    break;
            }
            if (gastarTurno) {

                if (villano.getVidaActual() <= 0) {
                    System.out.println("El " + villano.getNombre() + "ha muerto ");
                    combateTerminado = true;

                } else {
                    System.out.println("El " + villano.getNombre() + " te ataca");
                    int dano = villano.atacarAlHeroe();
                    jugador.recibirDamageEnemigo(dano);
                    System.out.println("Te ha hecho " + dano + " de daño");
                    System.out.println(jugador.getNombre() + " te queda " + jugador.getVidaActual() + " de vida ");
                    if (jugador.getVidaActual() <= 0) {
                        System.out.println(" Has muerto, " + jugador.getNombre());
                        combateTerminado = true;
                        return false;
                    }

                }
            }
        }
        return true;
    }

    private static void mostrarAyuda() {

    }

}
