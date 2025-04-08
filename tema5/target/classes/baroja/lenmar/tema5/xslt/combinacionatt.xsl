<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" />
    <xsl:template match="/">
        <html>
            <body>
                <h1>Catálogo</h1>
                <xsl:for-each select="catalogo/categoria">
                    <h2>
                        <xsl:value-of select="@nombre" />
                    </h2>
                    <table border= "1" cellpadding="5" cellspacing="0">
                        <tr bgcolor="#cccccc">
                            <td>Nombre</td>
                            <td>Marca</td>
                            <td>Precio</td>
                            <td>Stock</td>
                        </tr>
                        <xsl:for-each select="producto">
                            <tr>
                                <td>
                                    <xsl:value-of select="nombre" />
                                </td>
                                <td>
                                    <xsl:value-of select="marca" />
                                </td>
                                <td>
                                    <xsl:value-of select="precio" />
                                </td>
                                <td>
                                    <xsl:value-of select="stock" />
                                </td>
                            </tr>
                        </xsl:for-each>

                    </table>
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>