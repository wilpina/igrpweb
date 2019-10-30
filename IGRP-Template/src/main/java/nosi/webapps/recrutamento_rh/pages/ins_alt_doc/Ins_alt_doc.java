package nosi.webapps.recrutamento_rh.pages.ins_alt_doc;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Ins_alt_doc extends Model{		

	@RParam(rParamName = "p_ins_alt_doc_text")
	private String ins_alt_doc_text;

	@NotNull()
	@RParam(rParamName = "p_codigo")
	private String codigo;

	@NotNull()
	@RParam(rParamName = "p_descricao")
	private String descricao;

	@RParam(rParamName = "p_estado")
	private String estado;

	@RParam(rParamName = "p_id_tp_doc")
	private int id_tp_doc;
	
	public void setIns_alt_doc_text(String ins_alt_doc_text){
		this.ins_alt_doc_text = ins_alt_doc_text;
	}
	public String getIns_alt_doc_text(){
		return this.ins_alt_doc_text;
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
	
	public void setId_tp_doc(int id_tp_doc){
		this.id_tp_doc = id_tp_doc;
	}
	public int getId_tp_doc(){
		return this.id_tp_doc;
	}



}
