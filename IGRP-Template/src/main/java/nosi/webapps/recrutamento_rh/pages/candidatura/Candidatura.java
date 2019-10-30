package nosi.webapps.recrutamento_rh.pages.candidatura;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.uploadfile.UploadFile;

public class Candidatura extends Model{		

	@RParam(rParamName = "p_informacao_profissional_text")
	private String informacao_profissional_text;

	@RParam(rParamName = "p_copia_de_bi")
	private UploadFile copia_de_bi;

	@RParam(rParamName = "p_curriculinm_")
	private UploadFile curriculinm_;

	@RParam(rParamName = "p_certificado_conclusao_do_curso")
	private UploadFile certificado_conclusao_do_curso;

	@RParam(rParamName = "p_certificado_de_equivalencia_")
	private UploadFile certificado_de_equivalencia_;

	@RParam(rParamName = "p_outro_documento")
	private UploadFile outro_documento;

	@RParam(rParamName = "p_exper_profissional")
	private String exper_profissional;

	@RParam(rParamName = "p_funcao")
	private String funcao;

	@RParam(rParamName = "p_entidade_empregadora")
	private String entidade_empregadora;

	@RParam(rParamName = "p_data_inicio")
	private String data_inicio;

	@RParam(rParamName = "p_dt_fim")
	private String dt_fim;

	@RParam(rParamName = "p_forma_academica")
	private String forma_academica;

	@RParam(rParamName = "p_descricao")
	private String descricao;

	@RParam(rParamName = "p_area_de_formacao")
	private String area_de_formacao;

	@RParam(rParamName = "p_habilitacao_academica")
	private String habilitacao_academica;

	@RParam(rParamName = "p_nivel_de_habilitacao")
	private String nivel_de_habilitacao;

	@RParam(rParamName = "p_text_1")
	private String text_1;

	@RParam(rParamName = "p_data_de_inicio_")
	private String data_de_inicio_;

	@RParam(rParamName = "p_data_fim")
	private String data_fim;

	@RParam(rParamName = "p_certificado")
	private UploadFile certificado;
	
	public void setInformacao_profissional_text(String informacao_profissional_text){
		this.informacao_profissional_text = informacao_profissional_text;
	}
	public String getInformacao_profissional_text(){
		return this.informacao_profissional_text;
	}
	
	public void setCopia_de_bi(UploadFile copia_de_bi){
		this.copia_de_bi = copia_de_bi;
	}
	public UploadFile getCopia_de_bi(){
		return this.copia_de_bi;
	}
	
	public void setCurriculinm_(UploadFile curriculinm_){
		this.curriculinm_ = curriculinm_;
	}
	public UploadFile getCurriculinm_(){
		return this.curriculinm_;
	}
	
	public void setCertificado_conclusao_do_curso(UploadFile certificado_conclusao_do_curso){
		this.certificado_conclusao_do_curso = certificado_conclusao_do_curso;
	}
	public UploadFile getCertificado_conclusao_do_curso(){
		return this.certificado_conclusao_do_curso;
	}
	
	public void setCertificado_de_equivalencia_(UploadFile certificado_de_equivalencia_){
		this.certificado_de_equivalencia_ = certificado_de_equivalencia_;
	}
	public UploadFile getCertificado_de_equivalencia_(){
		return this.certificado_de_equivalencia_;
	}
	
	public void setOutro_documento(UploadFile outro_documento){
		this.outro_documento = outro_documento;
	}
	public UploadFile getOutro_documento(){
		return this.outro_documento;
	}
	
	public void setExper_profissional(String exper_profissional){
		this.exper_profissional = exper_profissional;
	}
	public String getExper_profissional(){
		return this.exper_profissional;
	}
	
	public void setFuncao(String funcao){
		this.funcao = funcao;
	}
	public String getFuncao(){
		return this.funcao;
	}
	
	public void setEntidade_empregadora(String entidade_empregadora){
		this.entidade_empregadora = entidade_empregadora;
	}
	public String getEntidade_empregadora(){
		return this.entidade_empregadora;
	}
	
	public void setData_inicio(String data_inicio){
		this.data_inicio = data_inicio;
	}
	public String getData_inicio(){
		return this.data_inicio;
	}
	
	public void setDt_fim(String dt_fim){
		this.dt_fim = dt_fim;
	}
	public String getDt_fim(){
		return this.dt_fim;
	}
	
	public void setForma_academica(String forma_academica){
		this.forma_academica = forma_academica;
	}
	public String getForma_academica(){
		return this.forma_academica;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	public String getDescricao(){
		return this.descricao;
	}
	
	public void setArea_de_formacao(String area_de_formacao){
		this.area_de_formacao = area_de_formacao;
	}
	public String getArea_de_formacao(){
		return this.area_de_formacao;
	}
	
	public void setHabilitacao_academica(String habilitacao_academica){
		this.habilitacao_academica = habilitacao_academica;
	}
	public String getHabilitacao_academica(){
		return this.habilitacao_academica;
	}
	
	public void setNivel_de_habilitacao(String nivel_de_habilitacao){
		this.nivel_de_habilitacao = nivel_de_habilitacao;
	}
	public String getNivel_de_habilitacao(){
		return this.nivel_de_habilitacao;
	}
	
	public void setText_1(String text_1){
		this.text_1 = text_1;
	}
	public String getText_1(){
		return this.text_1;
	}
	
	public void setData_de_inicio_(String data_de_inicio_){
		this.data_de_inicio_ = data_de_inicio_;
	}
	public String getData_de_inicio_(){
		return this.data_de_inicio_;
	}
	
	public void setData_fim(String data_fim){
		this.data_fim = data_fim;
	}
	public String getData_fim(){
		return this.data_fim;
	}
	
	public void setCertificado(UploadFile certificado){
		this.certificado = certificado;
	}
	public UploadFile getCertificado(){
		return this.certificado;
	}



}
