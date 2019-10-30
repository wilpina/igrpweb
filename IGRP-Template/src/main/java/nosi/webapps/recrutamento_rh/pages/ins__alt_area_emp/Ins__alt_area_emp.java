package nosi.webapps.recrutamento_rh.pages.ins__alt_area_emp;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Ins__alt_area_emp extends Model{		

	@RParam(rParamName = "p_ins_alt_area_emp_text")
	private String ins_alt_area_emp_text;

	@NotNull()
	@RParam(rParamName = "p_codigo")
	private String codigo;

	@NotNull()
	@RParam(rParamName = "p_descricao")
	private String descricao;

	@RParam(rParamName = "p_estado")
	private String estado;

	@RParam(rParamName = "p_id_area_emp")
	private String id_area_emp;
	
	public void setIns_alt_area_emp_text(String ins_alt_area_emp_text){
		this.ins_alt_area_emp_text = ins_alt_area_emp_text;
	}
	public String getIns_alt_area_emp_text(){
		return this.ins_alt_area_emp_text;
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
	
	public void setId_area_emp(String id_area_emp){
		this.id_area_emp = id_area_emp;
	}
	public String getId_area_emp(){
		return this.id_area_emp;
	}



}
