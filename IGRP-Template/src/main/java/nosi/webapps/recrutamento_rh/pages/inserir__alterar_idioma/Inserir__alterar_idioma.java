package nosi.webapps.recrutamento_rh.pages.inserir__alterar_idioma;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Inserir__alterar_idioma extends Model{		

	@RParam(rParamName = "p_idioma_text")
	private String idioma_text;

	@RParam(rParamName = "p_codigo")
	private String codigo;

	@RParam(rParamName = "p_tp_idioma")
	private String tp_idioma;

	@RParam(rParamName = "p_estado")
	private String estado;

	@RParam(rParamName = "p_id_idioma")
	private String id_idioma;
	
	public void setIdioma_text(String idioma_text){
		this.idioma_text = idioma_text;
	}
	public String getIdioma_text(){
		return this.idioma_text;
	}
	
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	public String getCodigo(){
		return this.codigo;
	}
	
	public void setTp_idioma(String tp_idioma){
		this.tp_idioma = tp_idioma;
	}
	public String getTp_idioma(){
		return this.tp_idioma;
	}
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	public String getEstado(){
		return this.estado;
	}
	
	public void setId_idioma(String id_idioma){
		this.id_idioma = id_idioma;
	}
	public String getId_idioma(){
		return this.id_idioma;
	}



}
