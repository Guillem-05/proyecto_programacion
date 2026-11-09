import java.util.Scanner;
public class Menu {
    // main() inicia el programa
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    boolean salir = false;

    do {
            mostrarMenu();
            int opcion = leerEnteroEnRango(teclado, "Elige una opcion: ", 1, 6);
            switch (opcion) {
                case 1:
                    System.out.println("Usar Pocion ");
                    break;

                case 2:
                    System.out.println("Usar Atacar ");
                    break;

                case 3:
                    System.out.println("Usar Defender ");
                    break;
                case 4:
                    System.out.println("Ver Ranking ");
                    break;
                    case 5:
                    System.out.println("Consultar vida \n Vida enemiga: \n Vida Heroe");

                    break;
                    case 6:
                    System.out.println("Salir");
                    salir = true;
                    break;
                default:
                    break;
            }
        } while (!salir);
        teclado.close();
}

// CONSTRUCTOR VACIO

// CONSTRUCTOR CON PARAMETROS

// GETTERS Y SETTERS

// METODOS

// leerEnteroEnRango valida las entradas.
private static int leerEnteroEnRango(Scanner teclado, String mensaje, int minimo, int maximo) {
 return 0;
}

// mostrarMenu muestra las opciones principales
private static void mostrarMenu() {

};
}
