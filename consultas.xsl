<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    

    <xsl:output method="html" encoding="UTF-8" indent="yes"/>

    <xsl:template match="/">

        <html lang="es">
            <head>
                <meta charset="UTF-8"/>
                <title>Consultas XPath - El Despertar del Héroe</title>

                <style>
                    body {
                    font-family: Arial, sans-serif;
                    background-color: #f2f2f2;
                    margin: 30px;
                    }

                    h1 {
                    text-align: center;
                    color: #333333;
                    }

                    h2 {
                    color: #444444;
                    margin-top: 30px;
                    }

                    table {
                    width: 100%;
                    border-collapse: collapse;
                    background-color: white;
                    margin-bottom: 20px;
                    }

                    th {
                    background-color: #333333;
                    color: white;
                    padding: 12px;
                    }

                    td {
                    border: 1px solid #cccccc;
                    padding: 10px;
                    text-align: center;
                    }

                    tr:nth-child(even) {
                    background-color: #eeeeee;
                    }

                    .sin-resultados {
                    color: #777777;
                    }
                </style>
            </head>

            <body>

                <h1>Ranking - El Despertar del Héroe</h1>

                <h2>1. Jugadores con puntuación igual a 0</h2>

                <table>
                    <tr>
                        <th>Nombre</th>
                        <th>Puntuación</th>
                    </tr>

                    <xsl:for-each select="/ranking/jugadores/jugador[number(puntuacion) = 0]">

                        <xsl:sort select="number(puntuacion)"
                                  data-type="number"
                                  order="descending"/>

                        <xsl:sort select="count(preceding-sibling::jugador)"
                                  data-type="number"
                                  order="ascending"/>

                        <tr>
                            <td><xsl:value-of select="nombre"/></td>
                            <td><xsl:value-of select="puntuacion"/></td>
                        </tr>
                    </xsl:for-each>
                </table>

                <xsl:if test="not(/ranking/jugadores/jugador[number(puntuacion) = 0])">
                    <p class="sin-resultados">No hay jugadores con 0 puntos.</p>
                </xsl:if>


                <h2>2. Jugadores con puntuaciones superiores a 300</h2>

                <table>
                    <tr>
                        <th>Nombre</th>
                        <th>Puntuación</th>
                    </tr>

                    <xsl:for-each select="/ranking/jugadores/jugador[number(puntuacion) &gt; 300]">

                        <xsl:sort select="number(puntuacion)"
                                  data-type="number"
                                  order="descending"/>

                        <xsl:sort select="count(preceding-sibling::jugador)"
                                  data-type="number"
                                  order="ascending"/>

                        <tr>
                            <td><xsl:value-of select="nombre"/></td>
                            <td><xsl:value-of select="puntuacion"/></td>
                        </tr>
                    </xsl:for-each>
                </table>

                <xsl:if test="not(/ranking/jugadores/jugador[number(puntuacion) &gt; 300])">
                    <p class="sin-resultados">No hay jugadores con más de 300 puntos.</p>
                </xsl:if>


                <h2>3. Jugadores cuyo nombre sea Guillem</h2>

                <table>
                    <tr>
                        <th>Nombre</th>
                        <th>Puntuación</th>
                    </tr>

                    <xsl:for-each select="/ranking/jugadores/jugador[normalize-space(nombre) = 'Guillem']">

                        <xsl:sort select="number(puntuacion)"
                                  data-type="number"
                                  order="descending"/>

                        <xsl:sort select="count(preceding-sibling::jugador)"
                                  data-type="number"
                                  order="ascending"/>

                        <tr>
                            <td><xsl:value-of select="nombre"/></td>
                            <td><xsl:value-of select="puntuacion"/></td>
                        </tr>
                    </xsl:for-each>
                </table>

                <xsl:if test="not(/ranking/jugadores/jugador[normalize-space(nombre) = 'Guillem'])">
                    <p class="sin-resultados">No se ha encontrado ningún jugador llamado Guillem.</p>
                </xsl:if>


                <h2>4. Jugadores con puntuaciones entre 100 y 200</h2>

                <table>
                    <tr>
                        <th>Nombre</th>
                        <th>Puntuación</th>
                    </tr>

                    <xsl:for-each select="/ranking/jugadores/jugador[number(puntuacion) &gt;= 100 and number(puntuacion) &lt;= 200]">

                        <xsl:sort select="number(puntuacion)"
                                  data-type="number"
                                  order="descending"/>

                        <xsl:sort select="count(preceding-sibling::jugador)"
                                  data-type="number"
                                  order="ascending"/>

                        <tr>
                            <td><xsl:value-of select="nombre"/></td>
                            <td><xsl:value-of select="puntuacion"/></td>
                        </tr>
                    </xsl:for-each>
                </table>

                <xsl:if test="not(/ranking/jugadores/jugador[number(puntuacion) &gt;= 100 and number(puntuacion) &lt;= 200])">
                    <p class="sin-resultados">No hay jugadores con puntuaciones entre 100 y 200.</p>
                </xsl:if>


                <h2>5. Jugadores cuyo nombre contiene la letra a</h2>

                <table>
                    <tr>
                        <th>Nombre</th>
                        <th>Puntuación</th>
                    </tr>

                    <xsl:for-each select="/ranking/jugadores/jugador[contains(nombre, 'a')]">

                        <xsl:sort select="number(puntuacion)"
                                  data-type="number"
                                  order="descending"/>

                        <xsl:sort select="count(preceding-sibling::jugador)"
                                  data-type="number"
                                  order="ascending"/>

                        <tr>
                            <td><xsl:value-of select="nombre"/></td>
                            <td><xsl:value-of select="puntuacion"/></td>
                        </tr>
                    </xsl:for-each>
                </table>

                <xsl:if test="not(/ranking/jugadores/jugador[contains(nombre, 'a')])">
                    <p class="sin-resultados">No hay jugadores cuyo nombre contenga la letra a.</p>
                </xsl:if>

            </body>
        </html>

    </xsl:template>

</xsl:stylesheet>
