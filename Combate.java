public class Combate {
    private Inventario inventario;
    // CONSTRUCTOR VACIO
    public Combate(){
        inventario = new Inventario();
    }
    public void comprobarPociones(){
    if (inventario.hayPociones()){
        System.out.println("Tienes pociones disponibles");
    } else {
        System.out.println("No quedan pociones disponibles");
        System.out.println(inventario.getCantidadPociones());
        inventario.consumirPocion(0);
    }}
    // CONSTRUCTOR CON PARAMETROS


    // GETTERS Y SETTERS


    // METODOS
   
    // iniciarPartida prepara al héroe y la partida.
    private static void iniciarPartida() {
        

    }

    // simularCombate controla los turnos.
    private static void simularCombate() {
 
    }

    // consultarInventario() — muestra las pociones disponibles.
    private static void consultarInventario() {

    }
    // usarPocion() — cura al héroe y consume una poción.

    private void usarPocion() {
        if (inventario.getCantidadPociones() == 0){
            System.out.println("No tienes pociones disponibles");
            return;
        }
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

    private static void vidaActual(){

    }

    private static void vidaEnemigo(){

    }

    private static void puntuaciones(){

    }

    private static void nombreJugador(){

    }

    private static void enemigosDerrotados(){

    }

    private static void pocionesDisponibles(){

    }
}
