package nosi.webapps.recrutamento_rh.pages.ins__alt_profissao;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Ins__alt_profissao extends Model{		

	@RParam(rParamName = "p_ins__alt_profissao_text")
	private String ins__alt_profissao_text;

	@NotNull()
	@RParam(rParamName = "p_codigo")
	private String codigo;

	@NotNull()
	@RParam(rParamName = "p_descricao")
	private String descricao;

	@RParam(rParamName = "p_estado")
	private String estado;

	@RParam(rParamName = "p_id_profissao")
	private String id_profissao;
	
	public void setIns__alt_profissao_text(String ins__alt_profissao_text){
		this.ins__alt_profissao_text = ins__alt_profissao_text;
	}
	public String getIns__alt_profissao_text(){
		return this.ins__alt_profissao_text;
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
	
	public void setId_profissao(String id_profissao){
		this.id_profissao = id_profissao;
	}
	public String getId_profissao(){
		return this.id_profissao;
	}



}
