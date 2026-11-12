// Clase Heroe
public class Heroe {
    private static final int VIDA_MAXIMA = 100;
    private static final int CURACION_POCION = 25;
    private static final int ATAQUE_MINIMO_HEROE = 10;
    private static final int ATAQUE_MAXIMO_HEROE = 20;
    private int vidaActual = 100;
    private String nombre;
    private Inventario inventario;
    // CONSTRUCTOR

    public Heroe(String nombre, Inventario inventario) {
        this.nombre = nombre;
        this.inventario = inventario;
    }

    public String getNombre() {
        return nombre;
    }

    public static int getVidaMaxima() {
        return VIDA_MAXIMA;
    }

    public static void setVidaMaxima() {

    }

    public Inventario getInventario() {
        return inventario;
    }

    public int getVidaInicial() {
        return vidaActual;
    }

    public static void setVidaInicial() {

    }

    public static int getAtaqueMinimoHeroe() {
        return ATAQUE_MINIMO_HEROE;
    }

    public static void setAtaqueMinimoHeroe() {

    }

    public static int getAtaqueMaximoHeroe() {
        return ATAQUE_MAXIMO_HEROE;
    }

    public static void setAtaqueMaximoHeroe() {

    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaRestante) {
        vidaActual = vidaRestante;
    }

    // METODOS

    public int atacarAlEnemigo() {
        int damage = (int) (Math.random() * (ATAQUE_MAXIMO_HEROE - ATAQUE_MINIMO_HEROE + 1))
                + ATAQUE_MINIMO_HEROE;

        return damage;
    }

    public void recibirDamageEnemigo(int damage) {
        int vidaRestante = vidaActual - damage;
        setVidaActual(vidaRestante);
    }

    public void comprobarPociones() {
        if (inventario.hayPociones()) {
            System.out.println("Tienes pociones disponibles");
        } else {
            System.out.println("No quedan pociones disponibles");
            System.out.println(inventario.getCantidadPociones());
            inventario.consumirPocion(0);
        }
    }

    // usarPocion() — cura al héroe y consume una poción.

    public boolean usarPocion() {
        if (inventario.hayPociones()) {
            if (vidaActual < VIDA_MAXIMA) {
                inventario.consumirPocion(0);
                vidaActual += CURACION_POCION;
                if (vidaActual > VIDA_MAXIMA) {
                    vidaActual = VIDA_MAXIMA;
                }
                System.out.println("Has usado una pocion");
                return true;
            } else {
                System.out.println("Tienes la vida maxima, no puedes curarte");
                return false;
            }
        } else {
            System.out.println("No tienes pociones disponibles");
            return false;
        }
    }
}