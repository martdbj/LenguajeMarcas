<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <title>Receta</title>
            </head>
            <body>
                <table border="1">
                    <thead>
                        <tr>
                            <th>Nombre</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td><xsl:value-of select="receta/@nombre"/></td>
                        </tr>
                        <tr>
                            <th>Ingredientes</th>
                        </tr>
                        <xsl:for-each select="receta/ingrediente">
                            <tr>
                                <td><xsl:value-of select="@nombre"/></td>
                            </tr>
                        </xsl:for-each>
                    </tbody>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>