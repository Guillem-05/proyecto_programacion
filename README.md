<p align="center"><small>Desarrollado por Guillem Sanchis Lloris · 1.º DAW</small></p>

# **EL DESPERTAR DEL HÉROE**
## *Descripción del proyecto - El Despertar del Héroe*
**El despertar del Héroe** es un proyecto de videojuego desarrollado en Java que consiste en una aventura de rol por turnos en la que el jugador toma el control de un héroe y debe enfrentarse a diferentes enemigos para superar los desafíos que se presentan durante la partida.

El juego está desarrollado mediante programación orientada a objetos y está organizado en diferentes clases, cada una con una responsabilidad específica dentro del funcionamiento del programa.
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

### **Combate.java**
Se encarga de controlar el sistema de combate, gestionar los enfrentamientos y coordinar las acciones del héroe y de los enemigos.

### **Inventario.java**
Gestiona los objetos disponibles para el héroe, especialmente las pociones de curación, su cantidad y su consumo.

### **ranking.xml**
Archivo externo utilizado para almacenar la información relacionada con las puntuaciones de los jugadores.


