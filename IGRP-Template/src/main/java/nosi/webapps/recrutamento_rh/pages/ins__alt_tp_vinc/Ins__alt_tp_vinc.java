package nosi.webapps.recrutamento_rh.pages.ins__alt_tp_vinc;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Ins__alt_tp_vinc extends Model{		

	@RParam(rParamName = "p_ins__alt_tp_vinc_text")
	private String ins__alt_tp_vinc_text;

	@RParam(rParamName = "p_codigo")
	private String codigo;

	@RParam(rParamName = "p_descricao")
	private String descricao;

	@RParam(rParamName = "p_estado")
	private String estado;

	@RParam(rParamName = "p_id_tp_vinc")
	private String id_tp_vinc;
	
	public void setIns__alt_tp_vinc_text(String ins__alt_tp_vinc_text){
		this.ins__alt_tp_vinc_text = ins__alt_tp_vinc_text;
	}
	public String getIns__alt_tp_vinc_text(){
		return this.ins__alt_tp_vinc_text;
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
	
	public void setId_tp_vinc(String id_tp_vinc){
		this.id_tp_vinc = id_tp_vinc;
	}
	public String getId_tp_vinc(){
		return this.id_tp_vinc;
	}



}
