package nosi.webapps.recrutamento_rh.pages.ins__alt_curso;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Ins__alt_curso extends Model{		

	@RParam(rParamName = "p_ins_alt_curso_text")
	private String ins_alt_curso_text;

	@RParam(rParamName = "p_codigo_")
	private String codigo_;

	@RParam(rParamName = "p_descicao")
	private String descicao;

	@RParam(rParamName = "p_pais")
	private String pais;

	@RParam(rParamName = "p_estabelecimento")
	private String estabelecimento;

	@RParam(rParamName = "p_data_fim")
	private String data_fim;

	@RParam(rParamName = "p_data_inicio")
	private String data_inicio;

	@RParam(rParamName = "p_duracao")
	private String duracao;

	@RParam(rParamName = "p_estado")
	private String estado;

	@RParam(rParamName = "p_id_curso")
	private String id_curso;
	
	public void setIns_alt_curso_text(String ins_alt_curso_text){
		this.ins_alt_curso_text = ins_alt_curso_text;
	}
	public String getIns_alt_curso_text(){
		return this.ins_alt_curso_text;
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
	
	public void setPais(String pais){
		this.pais = pais;
	}
	public String getPais(){
		return this.pais;
	}
	
	public void setEstabelecimento(String estabelecimento){
		this.estabelecimento = estabelecimento;
	}
	public String getEstabelecimento(){
		return this.estabelecimento;
	}
	
	public void setData_fim(String data_fim){
		this.data_fim = data_fim;
	}
	public String getData_fim(){
		return this.data_fim;
	}
	
	public void setData_inicio(String data_inicio){
		this.data_inicio = data_inicio;
	}
	public String getData_inicio(){
		return this.data_inicio;
	}
	
	public void setDuracao(String duracao){
		this.duracao = duracao;
	}
	public String getDuracao(){
		return this.duracao;
	}
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	public String getEstado(){
		return this.estado;
	}
	
	public void setId_curso(String id_curso){
		this.id_curso = id_curso;
	}
	public String getId_curso(){
		return this.id_curso;
	}



}
