public class Enemigo {
    private static final int VIDA_MAXIMA = 40;
    private int vidaInicial = 100;
    private static final int ATAQUE_MINIMO_ENEMIGO = 5;
    private static final int ATAQUE_MAXIMO_ENEMIGO = 15;
    private int vidaActual = 100;
    private String nombre;

    // CONSTRUCTOR
    public Enemigo(String nombre, int vida) {
        this.nombre = nombre;
        this.vidaInicial = vida;
        this.vidaActual = vida;


    }

    // GETTERS Y SETTERS
    public int getVidaMaxima() {
        return VIDA_MAXIMA;
    }

    public void setVidaMaxima() {

    }

    public int getVidaInicial() {
        return vidaInicial;
    }

    public void setVidaInicial() {

    }

    public int getAtaqueMinimoEnemigo() {
        return ATAQUE_MINIMO_ENEMIGO;
    }

    public void setAtaqueMinimoEnemigo() {

    }

    public int getAtaqueMaximoEnemigo() {
        return ATAQUE_MAXIMO_ENEMIGO;
    }

    public void setAtaqueMaximoEnemigo() {

    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaRestante) {
        vidaActual = vidaRestante;
    }

    // METODOS
    public int atacarAlHeroe() {
        int damage = (int) (Math.random() * (ATAQUE_MAXIMO_ENEMIGO - ATAQUE_MINIMO_ENEMIGO + 1))
                + ATAQUE_MINIMO_ENEMIGO;

        return damage;
    }

    public void recibirDamageHeroe(int damage) {
        int vidaRestante = vidaActual - damage;
        setVidaActual(vidaRestante);
    }

}
