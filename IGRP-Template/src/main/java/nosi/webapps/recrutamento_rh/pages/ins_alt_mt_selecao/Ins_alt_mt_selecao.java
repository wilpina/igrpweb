package nosi.webapps.recrutamento_rh.pages.ins_alt_mt_selecao;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Ins_alt_mt_selecao extends Model{		

	@RParam(rParamName = "p_ins_alt_mt_selecao_text")
	private String ins_alt_mt_selecao_text;

	@RParam(rParamName = "p_codigo")
	private String codigo;

	@RParam(rParamName = "p_descricao")
	private String descricao;

	@RParam(rParamName = "p_estado")
	private String estado;

	@RParam(rParamName = "p_id_met_sel")
	private String id_met_sel;
	
	public void setIns_alt_mt_selecao_text(String ins_alt_mt_selecao_text){
		this.ins_alt_mt_selecao_text = ins_alt_mt_selecao_text;
	}
	public String getIns_alt_mt_selecao_text(){
		return this.ins_alt_mt_selecao_text;
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
	
	public void setId_met_sel(String id_met_sel){
		this.id_met_sel = id_met_sel;
	}
	public String getId_met_sel(){
		return this.id_met_sel;
	}



}
