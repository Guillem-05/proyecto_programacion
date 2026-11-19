
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class RankingXML {

    private static final int CAPACIDAD_RANKING = 5;
    private static String[] nombresRanking = new String[CAPACIDAD_RANKING];
    private static int[] puntosRanking = new int[CAPACIDAD_RANKING];
    private static int cantidadRanking = 0;

    public static void cargarRanking() {
        try {
            File archivo = new File("ranking.xml");

            if (!archivo.exists()) {
                System.out.println("No se encuentra el archivo ranking.xml");
                return;
            }

            DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
            fabrica.setValidating(true);

            DocumentBuilder constructor = fabrica.newDocumentBuilder();

            Document documento = constructor.parse(archivo);

            NodeList lista = documento.getElementsByTagName("jugador");

            cantidadRanking = 0;

            for (int i = 0; i < lista.getLength(); i++) {
                Element jugador = (Element) lista.item(i);

                String nombre = jugador
                        .getElementsByTagName("nombre")
                        .item(0)
                        .getTextContent();

                int puntuacion = Integer.parseInt(
                        jugador.getElementsByTagName("puntuacion")
                                .item(0)
                                .getTextContent());

                insertarRanking(nombre, puntuacion);
            }

        } catch (Exception e) {
            System.out.println("Error al cargar el ranking: " + e.getMessage());
        }
    }

    public static void registrarPuntuacion(String nombre, int puntuacion) {

        int posicionJugador = -1;

        for (int i = 0; i < cantidadRanking; i++) {
            if (nombresRanking[i].equalsIgnoreCase(nombre)) {
                posicionJugador = i;
                break;
            }
        }

        if (posicionJugador != -1) {

            if (puntuacion <= puntosRanking[posicionJugador]) {
                return;
            }

            for (int i = posicionJugador; i < cantidadRanking - 1; i++) {
                nombresRanking[i] = nombresRanking[i + 1];
                puntosRanking[i] = puntosRanking[i + 1];
            }

            cantidadRanking--;
        }

        insertarRanking(nombre, puntuacion);

        guardarRanking();
    }

    private static void insertarRanking(String nombre, int puntuacion) {

        int posicion = 0;

        while (posicion < cantidadRanking &&
                puntosRanking[posicion] >= puntuacion) {
            posicion++;
        }

        if (posicion >= CAPACIDAD_RANKING) {
            return;
        }

        int ultimo = Math.min(cantidadRanking, CAPACIDAD_RANKING - 1);

        for (int i = ultimo; i > posicion; i--) {
            nombresRanking[i] = nombresRanking[i - 1];
            puntosRanking[i] = puntosRanking[i - 1];
        }

        nombresRanking[posicion] = nombre;
        puntosRanking[posicion] = puntuacion;

        if (cantidadRanking < CAPACIDAD_RANKING) {
            cantidadRanking++;
        }
    }

    public static void mostrarRanking() {

        System.out.println("\n===== RANKING EL DESPERTAR DEL HEROE =====");

        if (cantidadRanking == 0) {
            System.out.println("Todavía no hay puntuaciones registradas.");
            return;
        }

        for (int i = 0; i < cantidadRanking; i++) {
            System.out.println((i + 1) + ". " + nombresRanking[i]
                    + " - " + puntosRanking[i] + " puntos");
        }
    }

    public static void guardarRanking() {

        try {
            File archivo = new File("ranking.xml");

            DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();

            DocumentBuilder constructor = fabrica.newDocumentBuilder();

            Document documento = constructor.parse(archivo);

            Element jugadores = (Element) documento
                    .getElementsByTagName("jugadores")
                    .item(0);

            while (jugadores.hasChildNodes()) {
                jugadores.removeChild(jugadores.getFirstChild());
            }

            for (int i = 0; i < cantidadRanking; i++) {

                Element jugador = documento.createElement("jugador");

                Element nombre = documento.createElement("nombre");
                nombre.setTextContent(nombresRanking[i]);

                Element puntuacion = documento.createElement("puntuacion");
                puntuacion.setTextContent(String.valueOf(puntosRanking[i]));

                jugador.appendChild(nombre);
                jugador.appendChild(puntuacion);

                jugadores.appendChild(jugador);
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();

            Transformer transformer = transformerFactory.newTransformer();

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

            DOMSource origen = new DOMSource(documento);

            StreamResult destino = new StreamResult(archivo);

            transformer.transform(origen, destino);

            System.out.println("Ranking guardado correctamente.");

        } catch (Exception e) {
            System.out.println("Error al guardar el ranking: " + e.getMessage());
        }
    }
}
