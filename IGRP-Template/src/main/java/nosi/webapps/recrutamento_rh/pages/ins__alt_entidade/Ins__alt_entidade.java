package nosi.webapps.recrutamento_rh.pages.ins__alt_entidade;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Ins__alt_entidade extends Model{		

	@RParam(rParamName = "p_ins_alt_entidade_text")
	private String ins_alt_entidade_text;

	@NotNull()
	@RParam(rParamName = "p_nrc")
	private String nrc;

	@RParam(rParamName = "p_nif")
	private String nif;

	@RParam(rParamName = "p_codigo")
	private String codigo;

	@RParam(rParamName = "p_nome")
	private String nome;

	@RParam(rParamName = "p_id_entidade")
	private int id_entidade;
	
	public void setIns_alt_entidade_text(String ins_alt_entidade_text){
		this.ins_alt_entidade_text = ins_alt_entidade_text;
	}
	public String getIns_alt_entidade_text(){
		return this.ins_alt_entidade_text;
	}
	
	public void setNrc(String nrc){
		this.nrc = nrc;
	}
	public String getNrc(){
		return this.nrc;
	}
	
	public void setNif(String nif){
		this.nif = nif;
	}
	public String getNif(){
		return this.nif;
	}
	
	public void setCodigo(String codigo){
		this.codigo = codigo;
	}
	public String getCodigo(){
		return this.codigo;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setId_entidade(int id_entidade){
		this.id_entidade = id_entidade;
	}
	public int getId_entidade(){
		return this.id_entidade;
	}



}
