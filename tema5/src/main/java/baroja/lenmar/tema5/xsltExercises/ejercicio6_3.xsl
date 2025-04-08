<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <title>Currículum Vitae</title>
                <style type="text/css">
                    body {
                        margin: 20px;
                        font-family: Arial;
                    }
                    div {
                        border: 1px solid;
                        padding: 5px;
                        margin: 10px;
                    } 
                </style>
            </head>
            <body>
                <h2><xsl:value-of select="curriculum/nombre"/></h2>
                <div>
                    <b>Información personal</b>
                    <p><xsl:value-of select="curriculum/telefono"/></p>
                    <p><xsl:value-of select="curriculum/correo"/></p>
                </div>
                <div>
                    <b>Formación</b>
                    <p><xsl:value-of select="curriculum/formacion/titulo"/></p>
                    <p><xsl:value-of select="curriculum/formacion/centro"/></p>
                    <p><xsl:value-of select="curriculum/formacion/obtencion"/></p>
                </div>
                <div>
                    <b>Experiencia</b>
                    <p><xsl:value-of select="curriculum/experiencia/puesto"/></p>
                    <p><xsl:value-of select="curriculum/experiencia/empresa"/></p>
                    <p><xsl:value-of select="curriculum/experiencia/comienzo"/></p>
                    <p><xsl:value-of select="curriculum/experiencia/finalizacion"/></p>
                </div>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>