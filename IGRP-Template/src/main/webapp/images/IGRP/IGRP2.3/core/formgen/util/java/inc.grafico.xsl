<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	
	<xsl:template name="blockly.element.grafico" >
	
		<xsl:variable name="mutation" select="mutation/@count"/>

		<xsl:variable name="grafico" select="substring-after(@type,'grafico_')"/>
	
		<xsl:variable name="rowtypechildX" select="substring-before(value[@name='eixoX']/block/field,'::')"/>
		
		<xsl:variable name="rowtypechildY" select="substring-before(value[@name='eixoY']/block/field,'::')"/>
		
		<xsl:variable name="rowtypechildZ" select="substring-before(value[@name='eixoZ']/block/field,'::')"/>
		
		<xsl:variable name="dao" select="field[@name='dao']"/>
		
		<xsl:variable name="checkbox" select="field[@name='3D']"/>
		
		<xsl:variable name="graficoup">
		
			<xsl:call-template name="InitCap">
			
				<xsl:with-param name="text" select="$grafico"/>
				
			</xsl:call-template>
			
		</xsl:variable>
		
		<xsl:variable name="daolow">
		
	       	<xsl:call-template name="LowerCase">
	       	
	       		<xsl:with-param name="text" select="$dao"/>
	       		
	       	</xsl:call-template>
	       	
		</xsl:variable>
		
		<xsl:variable name="daofilter" select="concat($daolow,'filter')"/>
		
		<xsl:variable name="andWheres">
			
			<xsl:call-template name="listar.andWheres">
			
				<xsl:with-param name="daofilter" select="$daofilter"/>
			
				<xsl:with-param name="total" select="$mutation"/>
				
				<xsl:with-param name="valueAttrName" select="'ADD'"/>
				
				<xsl:with-param name="values" select="value"/>
			
			</xsl:call-template>
			
		</xsl:variable>
		
		<xsl:variable name="eixoz">
			
			<xsl:call-template name="blockly.getValue">
			
				<xsl:with-param name="value" select="*[@name='eixoZ']"/>
				
				<xsl:with-param name="parent" select="."></xsl:with-param>
				
			</xsl:call-template>
			
		</xsl:variable>
		
	
		<xsl:variable name="z_split_1">
		
			<xsl:call-template name="replace-all">
			
				<xsl:with-param name="text" select="$eixoz"/>
				
				<xsl:with-param name="replace" select="'()'"/>
				
				<xsl:with-param name="by" select="''"/>
				
			</xsl:call-template>
						
		</xsl:variable>
		
		<xsl:variable name="z_split_2">
		
			<xsl:call-template name="replace-all">
			
				<xsl:with-param name="text" select="$z_split_1"/>
				
				<xsl:with-param name="replace" select="substring-before($z_split_1,'.')"/>
				
				<xsl:with-param name="by" select="''"/>
				
			</xsl:call-template>
						
		</xsl:variable>
		
		<xsl:variable name="z_split">
		
			<xsl:call-template name="replace-all">
			
				<xsl:with-param name="text" select="$z_split_2"/>
				
				<xsl:with-param name="replace" select="'.'"/>
				
				<xsl:with-param name="by" select="''"/>
				
			</xsl:call-template>
						
		</xsl:variable>
		
		<xsl:variable name="options">
		
			<xsl:call-template name="blockly.getValue">
			
				<xsl:with-param name="value" select="*[@name='value2']"/>
				
			</xsl:call-template>
			
		</xsl:variable>
		
		<xsl:value-of select="$newlineTab1"/>
			 
		<xsl:text>try{</xsl:text>
			
		<xsl:value-of select="$newlineTab1"/>
		
		<xsl:value-of select="$dao"/><xsl:text> </xsl:text><xsl:value-of select="$daofilter"/><xsl:text> = new </xsl:text><xsl:value-of select="$dao"/><xsl:text>().find();</xsl:text>
			
		<xsl:value-of select="$andWheres"/>
		
		<xsl:value-of select="$newlineTab1"/>
		
		<xsl:text>List&lt;</xsl:text><xsl:value-of select="$dao"/><xsl:text>&gt; p  = </xsl:text><xsl:value-of select="$daofilter"/><xsl:text>.all();</xsl:text>
		
		<xsl:value-of select="$newlineTab1"/>
		
		<xsl:text>Map&lt;String, Long&gt; z_value = p.stream().collect(Collectors.groupingBy(</xsl:text><xsl:value-of select="$dao"/><xsl:text>::</xsl:text><xsl:value-of select="$z_split"/><xsl:text>,Collectors.counting()));</xsl:text>
		
		<xsl:value-of select="$newlineTab1"/>
		
		<xsl:text>if(p != null &amp;&amp; !p.isEmpty()){</xsl:text>
		
		<xsl:value-of select="$newlineTab2"/>

		<xsl:text>model.set</xsl:text><xsl:value-of select="$graficoup"/><xsl:text>(new ArrayList&lt;</xsl:text><xsl:value-of select="$graficoup"/><xsl:text>&gt;());</xsl:text>
		
		<xsl:value-of select="$newlineTab2"/>
		
		<xsl:text>p.stream().forEach(</xsl:text><xsl:value-of select="$daolow"></xsl:value-of><xsl:text>->{</xsl:text>
		
		<xsl:value-of select="$newlineTab3"></xsl:value-of>
		
		<xsl:value-of select="$graficoup"/><xsl:text> c = new </xsl:text><xsl:value-of select="$graficoup"/><xsl:text>();</xsl:text>
		
		<xsl:value-of select="$options"/>
	
		<xsl:choose>
		
				<xsl:when test="$checkbox = 'TRUE'">
				
					<xsl:choose>
					
						<xsl:when test="$rowtypechildZ = 'Date'">
						
							<xsl:value-of select="$newlineTab3"></xsl:value-of>
							
							<xsl:text>c.setEixoZ(z_value.get(""+</xsl:text><xsl:value-of select="$eixoz"/><xsl:text>));</xsl:text>
			
						</xsl:when>
						
						<xsl:otherwise>
						
							<xsl:value-of select="$newlineTab3"></xsl:value-of>
							
							<xsl:text>c.setEixoZ(z_value.get(</xsl:text><xsl:value-of select="$eixoz"/><xsl:text>));</xsl:text>
						
						</xsl:otherwise>
							
					</xsl:choose>
					
				</xsl:when>
				
				<xsl:otherwise>
				
						<xsl:value-of select="$newlineTab3"></xsl:value-of>
						
				</xsl:otherwise>
				
		</xsl:choose>
	
		<xsl:value-of select="$newlineTab3"></xsl:value-of>
		
		<xsl:text>model.get</xsl:text><xsl:value-of select="$graficoup"/><xsl:text>().add(c);</xsl:text>
		
		<xsl:value-of select="$newlineTab2">
		
		</xsl:value-of><xsl:text>});</xsl:text>
		
		<xsl:value-of select="$newlineTab1"></xsl:value-of>
		
		<xsl:text>}</xsl:text>
		
		<xsl:value-of select="$newlineTab1"></xsl:value-of>
		
		<xsl:text>}catch ( Exception e ) {</xsl:text>
		
		<xsl:value-of select="$newlineTab2"></xsl:value-of>
		
		<xsl:text>e.printStackTrace();</xsl:text>
		
		<xsl:value-of select="$newlineTab1"></xsl:value-of>
		
		<xsl:text>}</xsl:text> 
		
		<xsl:value-of select="$newlineTab1"></xsl:value-of>

	</xsl:template>
	
	
	
	<xsl:template name="blockly.element.eixxos" >
	
		<xsl:variable name="nome_eixo" select="@type"/>
		
		<xsl:variable name="rowtypechild" select="substring-before(value[@name='eixo']/block/field,'::')"/>
	
		<xsl:variable name="eixo">
		
			<xsl:call-template name="blockly.getValue">
			
				<xsl:with-param name="value" select="*[@name='eixo']"/>
				
			</xsl:call-template>
			
		</xsl:variable>
		
		<xsl:choose>
		
			<xsl:when test="$rowtypechild != 'String'">
			
				<xsl:value-of select="$newlineTab3"></xsl:value-of>
				
				<xsl:text>c.set</xsl:text><xsl:value-of select="$nome_eixo"/><xsl:text>(""+</xsl:text><xsl:value-of select="$eixo"/><xsl:text>);</xsl:text>
			
			</xsl:when>
			
			<xsl:otherwise>
		
				<xsl:value-of select="$newlineTab3"></xsl:value-of>
	
				<xsl:text>c.set</xsl:text><xsl:value-of select="$nome_eixo"/><xsl:text>(</xsl:text><xsl:value-of select="$eixo"/><xsl:text>);</xsl:text>
	
			</xsl:otherwise>
				
		</xsl:choose>
		
		
	</xsl:template>
	
</xsl:stylesheet>