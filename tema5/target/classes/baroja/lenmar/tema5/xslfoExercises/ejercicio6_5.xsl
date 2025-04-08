<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format">
    <xsl:output method="xml" version="1.0" encoding="UTF-8" indent="yes"/>

    <xsl:template match="/">
        <fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">
            <fo:layout-master-set>
                <fo:simple-page-master master-name="A4" page-height="29.7cm" page-width="21cm" margin-top="2cm" margin-bottom="2cm" margin-left="2cm" margin-right="2cm">
                    <fo:region-body/>
                </fo:simple-page-master>
            </fo:layout-master-set>

            <fo:page-sequence master-reference="A4">
                <fo:flow flow-name="xsl-region-body">
                    
                    <fo:table border="1px solid black" text-align="center">
                        <fo:table-column column-width="6cm"/>
                        <fo:table-column column-width="6cm"/>

                        <fo:table-header>
                            <fo:table-row background-color="#93C572">
                                <fo:table-cell border="1px solid black" padding="5px">
                                    <fo:block font-weight="bold">nombre</fo:block>
                                </fo:table-cell>
                                <fo:table-cell border="1px solid black">
                                    <fo:block font-weight="bold">habitantes</fo:block>
                                </fo:table-cell>
                            </fo:table-row>
                        </fo:table-header>

                        <fo:table-body>
                            <xsl:for-each select="ciudades/ciudad">
                                <fo:table-row>
                                    <fo:table-cell border="1px solid black">
                                        <fo:block><xsl:value-of select="nombre"/></fo:block>
                                    </fo:table-cell>
                                    <fo:table-cell border="1px solid black">
                                        <fo:block><xsl:value-of select="habitantes"/></fo:block>
                                    </fo:table-cell>
                                </fo:table-row>
                            </xsl:for-each>
                        </fo:table-body>
                    </fo:table>
                </fo:flow>
            </fo:page-sequence>
        </fo:root>
    </xsl:template>

</xsl:stylesheet>