public class Inventario {

    private String[] pociones;
    private int cantidadPociones;

    public Inventario() {
        pociones = new String[3];
        pociones[0] = "Pocion";
        pociones[1] = "Pocion";
        pociones[2] = "Pocion";
        cantidadPociones = 3;
    }

    public void mostrarPociones() {
        System.out.println("Pociones disponibles: " + cantidadPociones);

        for (int i = 0; i < cantidadPociones; i++) {
            System.out.println((i + 1) + ". " + pociones[i]);
        }
    }

    public boolean consumirPocion(int posicion) {
        if (posicion < 0 || posicion >= cantidadPociones) {
            return false;
        }

        for (int i = posicion; i < cantidadPociones - 1; i++) {
            pociones[i] = pociones[i + 1];
        }

        pociones[cantidadPociones - 1] = null;
        cantidadPociones--;

        return true;
    }

    public int getCantidadPociones() {
        return cantidadPociones;
    }

    public boolean hayPociones() {
        return cantidadPociones > 0;
    }
    
}

