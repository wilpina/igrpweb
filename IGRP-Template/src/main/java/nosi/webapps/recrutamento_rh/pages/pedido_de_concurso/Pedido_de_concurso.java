package nosi.webapps.recrutamento_rh.pages.pedido_de_concurso;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Pedido_de_concurso extends Model{		

	@RParam(rParamName = "p_pedido_concurso_text")
	private String pedido_concurso_text;

	@RParam(rParamName = "p_perfil_e_requisitos_do_cargofuncao")
	private String perfil_e_requisitos_do_cargofuncao;

	@RParam(rParamName = "p_requisitos_preferenciais")
	private String requisitos_preferenciais;

	@RParam(rParamName = "p_designacao_do_cargo_a_concurso")
	private String designacao_do_cargo_a_concurso;

	@RParam(rParamName = "p_numero_de_vagas")
	private Integer numero_de_vagas;

	@RParam(rParamName = "p_tipo_de_vinculo")
	private String tipo_de_vinculo;

	@RParam(rParamName = "p_orcamento")
	private String orcamento;

	@RParam(rParamName = "p_observacao")
	private String observacao;

	@RParam(rParamName = "p_form_comp_rel_textarea_1")
	private String form_comp_rel_textarea_1;

	@RParam(rParamName = "p_experiencia_profissional_textarea_1")
	private String experiencia_profissional_textarea_1;

	@RParam(rParamName = "p_area_espec__pref_textarea_1")
	private String area_espec__pref_textarea_1;

	@RParam(rParamName = "p_out_requisitos_textarea_1")
	private String out_requisitos_textarea_1;

	@RParam(rParamName = "p_atri_comp_esp")
	private String atri_comp_esp;

	@RParam(rParamName = "p_requisitos_obrigatorios_textarea_1")
	private String requisitos_obrigatorios_textarea_1;

	@RParam(rParamName = "p_imped_incompat_textarea_1")
	private String imped_incompat_textarea_1;
	
	public void setPedido_concurso_text(String pedido_concurso_text){
		this.pedido_concurso_text = pedido_concurso_text;
	}
	public String getPedido_concurso_text(){
		return this.pedido_concurso_text;
	}
	
	public void setPerfil_e_requisitos_do_cargofuncao(String perfil_e_requisitos_do_cargofuncao){
		this.perfil_e_requisitos_do_cargofuncao = perfil_e_requisitos_do_cargofuncao;
	}
	public String getPerfil_e_requisitos_do_cargofuncao(){
		return this.perfil_e_requisitos_do_cargofuncao;
	}
	
	public void setRequisitos_preferenciais(String requisitos_preferenciais){
		this.requisitos_preferenciais = requisitos_preferenciais;
	}
	public String getRequisitos_preferenciais(){
		return this.requisitos_preferenciais;
	}
	
	public void setDesignacao_do_cargo_a_concurso(String designacao_do_cargo_a_concurso){
		this.designacao_do_cargo_a_concurso = designacao_do_cargo_a_concurso;
	}
	public String getDesignacao_do_cargo_a_concurso(){
		return this.designacao_do_cargo_a_concurso;
	}
	
	public void setNumero_de_vagas(Integer numero_de_vagas){
		this.numero_de_vagas = numero_de_vagas;
	}
	public Integer getNumero_de_vagas(){
		return this.numero_de_vagas;
	}
	
	public void setTipo_de_vinculo(String tipo_de_vinculo){
		this.tipo_de_vinculo = tipo_de_vinculo;
	}
	public String getTipo_de_vinculo(){
		return this.tipo_de_vinculo;
	}
	
	public void setOrcamento(String orcamento){
		this.orcamento = orcamento;
	}
	public String getOrcamento(){
		return this.orcamento;
	}
	
	public void setObservacao(String observacao){
		this.observacao = observacao;
	}
	public String getObservacao(){
		return this.observacao;
	}
	
	public void setForm_comp_rel_textarea_1(String form_comp_rel_textarea_1){
		this.form_comp_rel_textarea_1 = form_comp_rel_textarea_1;
	}
	public String getForm_comp_rel_textarea_1(){
		return this.form_comp_rel_textarea_1;
	}
	
	public void setExperiencia_profissional_textarea_1(String experiencia_profissional_textarea_1){
		this.experiencia_profissional_textarea_1 = experiencia_profissional_textarea_1;
	}
	public String getExperiencia_profissional_textarea_1(){
		return this.experiencia_profissional_textarea_1;
	}
	
	public void setArea_espec__pref_textarea_1(String area_espec__pref_textarea_1){
		this.area_espec__pref_textarea_1 = area_espec__pref_textarea_1;
	}
	public String getArea_espec__pref_textarea_1(){
		return this.area_espec__pref_textarea_1;
	}
	
	public void setOut_requisitos_textarea_1(String out_requisitos_textarea_1){
		this.out_requisitos_textarea_1 = out_requisitos_textarea_1;
	}
	public String getOut_requisitos_textarea_1(){
		return this.out_requisitos_textarea_1;
	}
	
	public void setAtri_comp_esp(String atri_comp_esp){
		this.atri_comp_esp = atri_comp_esp;
	}
	public String getAtri_comp_esp(){
		return this.atri_comp_esp;
	}
	
	public void setRequisitos_obrigatorios_textarea_1(String requisitos_obrigatorios_textarea_1){
		this.requisitos_obrigatorios_textarea_1 = requisitos_obrigatorios_textarea_1;
	}
	public String getRequisitos_obrigatorios_textarea_1(){
		return this.requisitos_obrigatorios_textarea_1;
	}
	
	public void setImped_incompat_textarea_1(String imped_incompat_textarea_1){
		this.imped_incompat_textarea_1 = imped_incompat_textarea_1;
	}
	public String getImped_incompat_textarea_1(){
		return this.imped_incompat_textarea_1;
	}



}
