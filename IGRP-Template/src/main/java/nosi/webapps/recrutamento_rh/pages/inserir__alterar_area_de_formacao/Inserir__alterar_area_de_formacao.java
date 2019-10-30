package nosi.webapps.recrutamento_rh.pages.inserir__alterar_area_de_formacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Inserir__alterar_area_de_formacao extends Model{		

	@RParam(rParamName = "p_ins_alt_area_formacao_text")
	private String ins_alt_area_formacao_text;

	@RParam(rParamName = "p_codigo_")
	private String codigo_;

	@RParam(rParamName = "p_descicao")
	private String descicao;

	@RParam(rParamName = "p_estado")
	private String estado;

	@RParam(rParamName = "p_id_area_formacao")
	private String id_area_formacao;
	
	public void setIns_alt_area_formacao_text(String ins_alt_area_formacao_text){
		this.ins_alt_area_formacao_text = ins_alt_area_formacao_text;
	}
	public String getIns_alt_area_formacao_text(){
		return this.ins_alt_area_formacao_text;
	}
	
	public void setCodigo_(String codigo_){
		this.codigo_ = codigo_;
	}
	public String getCodigo_(){
		return this.codigo_;
	}
	
	public void setDescicao(String descicao){
		this.descicao = descicao;
	}
	public String getDescicao(){
		return this.descicao;
	}
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	public String getEstado(){
		return this.estado;
	}
	
	public void setId_area_formacao(String id_area_formacao){
		this.id_area_formacao = id_area_formacao;
	}
	public String getId_area_formacao(){
		return this.id_area_formacao;
	}



}
