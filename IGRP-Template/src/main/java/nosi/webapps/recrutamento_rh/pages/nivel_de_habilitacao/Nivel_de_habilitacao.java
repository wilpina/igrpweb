package nosi.webapps.recrutamento_rh.pages.nivel_de_habilitacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Nivel_de_habilitacao extends Model{		

	@RParam(rParamName = "p_ins_alt__nivel_habilitacao_text")
	private String ins_alt__nivel_habilitacao_text;

	@RParam(rParamName = "p_descricao")
	private String descricao;

	@RParam(rParamName = "p_n_nivel")
	private Integer n_nivel;

	@RParam(rParamName = "p_anoclassefase")
	private Integer anoclassefase;

	@RParam(rParamName = "p_estado")
	private String estado;
	
	public void setIns_alt__nivel_habilitacao_text(String ins_alt__nivel_habilitacao_text){
		this.ins_alt__nivel_habilitacao_text = ins_alt__nivel_habilitacao_text;
	}
	public String getIns_alt__nivel_habilitacao_text(){
		return this.ins_alt__nivel_habilitacao_text;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	public String getDescricao(){
		return this.descricao;
	}
	
	public void setN_nivel(Integer n_nivel){
		this.n_nivel = n_nivel;
	}
	public Integer getN_nivel(){
		return this.n_nivel;
	}
	
	public void setAnoclassefase(Integer anoclassefase){
		this.anoclassefase = anoclassefase;
	}
	public Integer getAnoclassefase(){
		return this.anoclassefase;
	}
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	public String getEstado(){
		return this.estado;
	}



}
