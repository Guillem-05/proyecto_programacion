public class Enemigo {
    private static final int VIDA_MAXIMA = 40;
    private int VIDA_INICIAL = 100;
    private static final int ATAQUE_MINIMO_ENEMIGO = 5;
    private static final int ATAQUE_MAXIMO_ENEMIGO = 15;
    private int vidaActual = 100;
    private int[] VIDAS_ENEMIGOS = { 40, 60, 80 };
    private String[] NOMBRES_ENEMIGOS = { "Guardian de piedra", "Caballero oscuro", "Dragón ancestral" };


    // CONSTRUCTOR 





    // GETTERS Y SETTERS 
    public int getVidaMaxima() {
        return VIDA_MAXIMA;
    }

    public void setVidaMaxima() {

    }

    public int getVidaInicial() {
        return VIDA_INICIAL;
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

    public String[] getNombresEnemigos() {
        return NOMBRES_ENEMIGOS;
    }

    public void setNombresEnemigos() {

    }

    public int[] getVidasEnemigos() {
        return VIDAS_ENEMIGOS;
    }

    public void setVidasEnemigos() {

    }
     public int getVidaActual(){
        return vidaActual;
    }
    public void setVidaActual(int vidaRestante){
        vidaActual = vidaRestante;
    }
    // METODOS 
    public int atacarAlHeroe(){
        int damage = (int) (Math.random() * (ATAQUE_MAXIMO_ENEMIGO - ATAQUE_MINIMO_ENEMIGO + 1))
        + ATAQUE_MINIMO_ENEMIGO;


        return damage;
    }

     public void recibirDamageHeroe(int damage){
        int vidaRestante = vidaActual - damage;
        setVidaActual(vidaRestante);
    }

}
