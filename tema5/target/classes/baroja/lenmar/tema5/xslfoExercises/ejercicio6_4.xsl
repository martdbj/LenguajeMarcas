<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:fo="http://www.w3.org/1999/XSL/Format">

    <xsl:output method="xml" indent="yes"/>

    <xsl:template match="/invitacion">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master master-name="A4" page-height="29.7cm" page-width="21.0cm" margin="2cm">
                    <fo:region-body/>
                </fo:simple-page-master>
            </fo:layout-master-set>

            <fo:page-sequence master-reference="A4">
                <fo:flow flow-name="xsl-region-body">
                    <fo:block font-family="serif" font-size="14pt" line-height="18pt" space-after="10pt" text-align="center">
                        <fo:block font-size="20pt" font-weight="bold" space-after="20pt">
                            ¡Estás Invitado!
                        </fo:block>
                        <fo:block font-style="italic" space-after="15pt">
                            <xsl:value-of select="nombre"/>
                        </fo:block>
                        <fo:block space-after="15pt">
                            <xsl:value-of select="texto"/>
                        </fo:block>
                        <fo:block space-after="10pt">
                            <fo:inline font-weight="bold">Fecha y Hora: </fo:inline>
                            <xsl:value-of select="FechaHora"/>
                        </fo:block>
                        <fo:block space-after="10pt">
                            <fo:inline font-weight="bold">Lugar de la ceremonia: </fo:inline>
                            <xsl:value-of select="lugarCeremonia"/>
                        </fo:block>
                        <fo:block space-after="10pt">
                            <fo:inline font-weight="bold">Lugar de la celebración: </fo:inline>
                            <xsl:value-of select="lugarCelebracion"/>
                        </fo:block>
                        <fo:block space-after="20pt">
                            <fo:inline font-weight="bold">Confirma tu asistencia: </fo:inline>
                            <xsl:value-of select="telefonoConfirmacion"/>
                        </fo:block>
                        <fo:block font-size="10pt" font-style="italic" color="gray">
                            ¡Esperamos verte pronto!
                        </fo:block>
                    </fo:block>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>

</xsl:stylesheet>
