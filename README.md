<p align="center"><small>Desarrollado por Guillem Sanchis Lloris · 1.º DAW</small></p>

# **EL DESPERTAR DEL HÉROE**
## *Descripción del proyecto - El Despertar del Héroe*
**El despertar del Héroe** es un proyecto de videojuego desarrollado en Java que consiste en una aventura de rol por turnos en la que el jugador toma el control de un héroe y debe enfrentarse a diferentes enemigos para superar los desafíos que se presentan durante la partida.

El juego está desarrollado mediante programación orientada a objetos y está organizado en diferentes clases, cada una con una responsabilidad específica dentro del funcionamiento del programa.

El proyecto incorpora un sistema de ranking que almacena las puntuaciones de los jugadores en un archivo XML. También utiliza un DTD para validar la estructura del documento XML y una hoja XSLT para transformar los datos del ranking en una página HTML.

El objetivo del proyecto es aplicar los conocimientos de programación, gestión de archivos, XML, DTD, XPath y XSLT.

## ¿De que trata el juego?

El jugador comienza una aventura en la que debe controlar a un héroe, gestionar sus puntos de vida y enfrentarse a distintos enemigos.
Durante los combates, el jugador tendrá que tomar decisiones para conseguir derrotar a sus adversarios y avanzar en la aventura. 
Sin embargo, no todo consiste en atacar. También será importante administrar los recursos disponibles, especialmente las pociones de curación, que permiten recuperar puntos de vida cuando el héroe lo necesita. 
El objetivo es conseguir la mayor puntuación posible, derrotar enemigos y entrar en el ranking de los mejores jugadores.

## Funcionamiento del juego 

Al ejecutar el programa, aparece un menú principal con cuatro opciones:

1. **Nueva partida:** Inicia una aventura y prepara al héroe para comenzar los enfrentamientos.
2. **Consultar ranking:** Permite visualizar las mejores puntuaciones registradas. 
3. **Ayuda:** Muestra información sobre el funcionamiento y las reglas del juego.
4. **Salir:** Finaliza la ejecución del programa.

### Sistema de combate
Los enfrentamientos se desarrollan mediante un sistema de combate por turnos.
El héroe dispone de puntos de vida y puedes realizar ataques para reducir la vida de sus enemigos.
También puede utilizar pociones para recuperar salud y aumentar sus posibilidades de sobrevivir durante los enfrentamientos 

### Sistema de inventario

El héroe dispone inicialmente de tres pociones de curación.
El inventario permite:

    - Consultar las pociones
    - Mostrar la cantidad de pociones restantes.
    - Consumir una poción cuando sea necesario.
    - Evitar utilizar pociones cuando ya no quedan disponibles.
<small>`Cada poción permite recuperar 25 puntos de vida, sin superar el máximo de 100 puntos de vida del héroe.`</small>

## Sistema de puntuaciones

El proyecto incorpora un sistema de puntuaciones para registrar los resultados de las partidas. 
El ranking permite almacenar y consultar las cinco mejores puntuaciones de los jugadores.
Los datos del ranking se gestionan mediante un archivo XML llamado ranking.xml.

## Requisitos y versiones
Para poder ejecutar y trabajar con el proyecto se necesitan los siguientes programas y herramientas:
* Java JDK: necesario para compilar y ejecutar el juego.
* Terminal de macOS: para ejecutar los comandos de compilación, validación y transformación.
* Homebrew: gestor de paquetes que permite instalar las herramientas XML si no están disponibles.

## Estructura del proyecto
Los archivos del proyecto se organizan de la siguiente manera:
EL_DESPERTAR_DEL_HEROE/
```
│
├── ElDespertarDelHeroe.java
├── Heroe.java
├── Enemigo.java
├── Inventario.java
├── Puntuacion.java
├── RankingXML.java
│
├── ranking.xml
├── ranking.dtd
├── ranking.xsl
│
├── README.md
└── .gitignore
```

## Tecnologias utilizadas
#### Tecnología -> Utilización

- Java: Desarrollo de la lógica del videojuego.   
- XML: Almacenamiento de los datos del ranking.   
- Git: Control de versiones del proyecto.        
- GitHub: Almacenamiento y publicación del repositorio.

## Estructura del proyecto

El código está organizado en diferentes clases Java:

### **ElDespertarDelHeroe.java**
Es la clase principal del programa. Contiene el punto de entrada y se encarga de controlar el menú principal y coordinar las diferentes funcionalidades del juego.

### **Heroe.java**
Representa al protagonista de la aventura. Gestiona sus características, sus puntos de vida y las acciones que puede realizar.


### **Enemigo.java**
Representa a los enemigos que aparecen durante la aventura y contiene la información necesaria para gestionar sus características.

### **Inventario.java**
Gestiona los objetos disponibles para el héroe, especialmente las pociones de curación, su cantidad y su consumo.

### **ranking.xml**
Archivo externo utilizado para almacenar la información relacionada con las puntuaciones de los jugadores.

## Compilación y ejecución

Para compilar y ejecutar el juego, se deben seguir los siguientes pasos:
### Abrir la carpeta del proyecto.
Abrir la aplicación Terminal de macOS y acceder a la carpeta principal del proyecto mediante el comando cd, sustituyendo la ruta de ejemplo por la ubicación real:
cd /ruta/a/EL_DESPERTAR_DEL_HEROE
### Comprobar que se está en la carpeta correcta.
Ejecutar:
ls
Deben aparecer los archivos Java y los archivos XML del proyecto.
### Compilar los archivos Java.
Ejecutar el siguiente comando:
javac *.java
Este comando compila todos los archivos Java que se encuentran en la carpeta actual. Si la compilación termina sin errores, se generarán los archivos .class.
### Ejecutar el juego.
Para iniciar el programa, ejecutar:
java ElDespertarDelHeroe
El menú principal aparecerá en la terminal y permitirá comenzar una partida, consultar el ranking, acceder a la ayuda o salir del juego.
Es importante ejecutar el programa desde la carpeta principal del proyecto, ya que el programa utiliza rutas relativas para acceder al archivo ranking.xml.

## Validación DTD
El archivo ranking.dtd define la estructura que debe cumplir ranking.xml.
El documento XML utiliza la siguiente declaración para enlazar con el DTD externo:
```
<!DOCTYPE ranking SYSTEM "ranking.dtd">
```
De esta manera, el XML debe respetar la estructura definida en el DTD.
