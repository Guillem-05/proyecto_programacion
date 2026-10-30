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

    public Heroe(String nombre) {
        this.nombre = nombre;
        this.vidaActual = 100;
    }

    public static int getVidaMaxima() {
        return VIDA_MAXIMA;
    }

    public static void setVidaMaxima() {

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
    public int getVidaActual(){
        return vidaActual;
    }
    public void setVidaActual(int vidaRestante){
        vidaActual = vidaRestante;
    }

    // METODOS

    public static int atacarAlEnemigo(){
         int damage = (int) (Math.random() * (ATAQUE_MAXIMO_HEROE - ATAQUE_MINIMO_HEROE + 1))
        + ATAQUE_MINIMO_HEROE;

        return damage;
    }
    public void recibirDamageEnemigo(int damage){
        int vidaRestante = vidaActual - damage;
        setVidaActual(vidaRestante);
    }
    
}
