<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:fo="http://www.w3.org/1999/XSL/Format">
    <xsl:output method="xml" indent="yes"/>
    <xsl:template match="/">
        <fo:root>
            <fo:layout-master-set>
                <fo:simple-page-master master-name="A4-portrait" page-height="29.7cm" page-width="21.0cm" margin="2cm">
                    <fo:region-body/>
                </fo:simple-page-master>
            </fo:layout-master-set>
            <fo:page-sequence master-reference="A4-portrait">
                <fo:flow flow-name="xsl-region-body">
                    <fo:block text-align="center">
                    <fo:block>
                    !Estais invitados a nuestra boda!
                    </fo:block>
                    <fo:block>
                    <xsl:value-of select="invitacion/nombre"/>
                    </fo:block>
                    <fo:block>
                    Ubicación: <xsl:value-of select="invitacion/lugarCeremonia"/>
                    </fo:block>
                    <fo:block>
                    Fecha: <xsl:value-of select="FechaHora"/>
                    </fo:block>
                    <fo:block>
                    Ceremonia: <xsl:value-of select="invitacion/lugarCeremonia"/>
                    </fo:block>
                    <fo:block>
                    Celebración: <xsl:value-of select="invitacion/lugarCelebracion"/>
                    </fo:block>
                    <fo:block>
                    Telefono: <xsl:value-of select="invitacion/telefonoConfirmacion"/>
                    </fo:block>
                    </fo:block>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>
</xsl:stylesheet>
