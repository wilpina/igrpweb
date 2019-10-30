package nosi.webapps.recrutamento_rh.pages.ins__alt_func;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Ins__alt_func extends Model{		

	@RParam(rParamName = "p_ins__alt_func_text")
	private String ins__alt_func_text;

	@RParam(rParamName = "p_codigo")
	private String codigo;

	@RParam(rParamName = "p_descricao")
	private String descricao;

	@RParam(rParamName = "p_estado")
	private String estado;

	@RParam(rParamName = "p_id_funcao")
	private String id_funcao;
	
	public void setIns__alt_func_text(String ins__alt_func_text){
		this.ins__alt_func_text = ins__alt_func_text;
	}
	public String getIns__alt_func_text(){
		return this.ins__alt_func_text;
	}
	
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	public String getCodigo(){
		return this.codigo;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	public String getDescricao(){
		return this.descricao;
	}
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	public String getEstado(){
		return this.estado;
	}
	
	public void setId_funcao(String id_funcao){
		this.id_funcao = id_funcao;
	}
	public String getId_funcao(){
		return this.id_funcao;
	}



}
