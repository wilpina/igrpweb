package nosi.webapps.recrutamento_rh.pages.tipos_de_formacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Tipos_de_formacao extends Model{		

	@RParam(rParamName = "p_ins_alt_tp_forma_text")
	private String ins_alt_tp_forma_text;

	@RParam(rParamName = "p_codigo")
	private String codigo;

	@RParam(rParamName = "p_descricao")
	private String descricao;

	@RParam(rParamName = "p_estado")
	private String estado;

	@RParam(rParamName = "p_id_tp_for")
	private int id_tp_for;
	
	public void setIns_alt_tp_forma_text(String ins_alt_tp_forma_text){
		this.ins_alt_tp_forma_text = ins_alt_tp_forma_text;
	}
	public String getIns_alt_tp_forma_text(){
		return this.ins_alt_tp_forma_text;
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
	
	public void setId_tp_for(int id_tp_for){
		this.id_tp_for = id_tp_for;
	}
	public int getId_tp_for(){
		return this.id_tp_for;
	}



}
