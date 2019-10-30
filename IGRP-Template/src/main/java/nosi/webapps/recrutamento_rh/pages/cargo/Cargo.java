package nosi.webapps.recrutamento_rh.pages.cargo;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Cargo extends Model{		

	@RParam(rParamName = "p_ins_alt_cargo_text")
	private String ins_alt_cargo_text;

	@RParam(rParamName = "p_codigo")
	private String codigo;

	@RParam(rParamName = "p_descricao")
	private String descricao;

	@RParam(rParamName = "p_estado")
	private String estado;

	@RParam(rParamName = "p_id_cargo")
	private String id_cargo;
	
	public void setIns_alt_cargo_text(String ins_alt_cargo_text){
		this.ins_alt_cargo_text = ins_alt_cargo_text;
	}
	public String getIns_alt_cargo_text(){
		return this.ins_alt_cargo_text;
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
	
	public void setId_cargo(String id_cargo){
		this.id_cargo = id_cargo;
	}
	public String getId_cargo(){
		return this.id_cargo;
	}



}
