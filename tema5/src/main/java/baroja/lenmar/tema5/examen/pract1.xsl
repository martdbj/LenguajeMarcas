<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body>
                
            <table border="1">
                <tr>
                    <th>Martín Díaz Bastida</th>
                    <th>El tiempo en <xsl:value-of select="//nombre"/></th>
                    <th><xsl:value-of select="//provincia"/></th>
                    <th>08/04/2025</th>
                </tr>
                <tr bgcolor="#9acd32">
                    <th>Temperatura máxima</th>
                    <th>Temperatura mínima</th>
                    <th>Humedad máxima</th>
                    <th>Humedad mínima</th>
                </tr>
                <tr>
                    <td>
                        <xsl:value-of select="//temperatura/maxima"/>
                    </td>
                    <td>
                        <xsl:value-of select="//temperatura//minima"/>
                    </td>
                    <td>
                        <xsl:value-of select="//humedad_relativa/maxima"/>
                    </td>
                    <td>
                        <xsl:value-of select="//humedad_relativa/minima"/>
                    </td>
                </tr>
            </table>
            <img src="imagenTiempo.jpg"></img>
        </body>
    </html>
</xsl:template>
</xsl:stylesheet>   