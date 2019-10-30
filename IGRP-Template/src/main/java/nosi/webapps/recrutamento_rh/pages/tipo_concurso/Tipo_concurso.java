package nosi.webapps.recrutamento_rh.pages.tipo_concurso;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Tipo_concurso extends Model{		

	@RParam(rParamName = "p_ins_alt_tp_concurso_text")
	private String ins_alt_tp_concurso_text;

	@NotNull()
	@RParam(rParamName = "p_codigo")
	private String codigo;

	@NotNull()
	@RParam(rParamName = "p_descricao")
	private String descricao;

	@RParam(rParamName = "p_estado")
	private String estado;

	@RParam(rParamName = "p_id_tp_con")
	private String id_tp_con;
	
	public void setIns_alt_tp_concurso_text(String ins_alt_tp_concurso_text){
		this.ins_alt_tp_concurso_text = ins_alt_tp_concurso_text;
	}
	public String getIns_alt_tp_concurso_text(){
		return this.ins_alt_tp_concurso_text;
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
	
	public void setId_tp_con(String id_tp_con){
		this.id_tp_con = id_tp_con;
	}
	public String getId_tp_con(){
		return this.id_tp_con;
	}



}
