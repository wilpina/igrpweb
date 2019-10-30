package nosi.webapps.recrutamento_rh.pages.pedido_de_concurso;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Pedido_de_concursoView extends View {

	public Field pedido_concurso_text;
	public Field perfil_e_requisitos_do_cargofuncao;
	public Field requisitos_preferenciais;
	public Field designacao_do_cargo_a_concurso;
	public Field numero_de_vagas;
	public Field tipo_de_vinculo;
	public Field orcamento;
	public Field observacao;
	public Field form_comp_rel_textarea_1;
	public Field experiencia_profissional_textarea_1;
	public Field area_espec__pref_textarea_1;
	public Field out_requisitos_textarea_1;
	public Field atri_comp_esp;
	public Field requisitos_obrigatorios_textarea_1;
	public Field imped_incompat_textarea_1;
	public IGRPSectionHeader pedido_concurso;
	public IGRPTabContent pdd_concurso;
	public IGRPForm form_1;
	public IGRPForm form_comp_rel;
	public IGRPForm experiencia_profissional;
	public IGRPForm area_espec__pref;
	public IGRPForm out_requisitos;
	public IGRPForm atribuicoes_competencias_especificas;
	public IGRPForm requisitos_obrigatorios;
	public IGRPForm imped_incompat;


	public Pedido_de_concursoView(){

		this.setPageTitle("Pedido de Concurso");
			
		pedido_concurso = new IGRPSectionHeader("pedido_concurso","");

		pdd_concurso = new IGRPTabContent("pdd_concurso","");

		form_1 = new IGRPForm("form_1","");

		form_comp_rel = new IGRPForm("form_comp_rel","Formações Complementares Relevantes");

		experiencia_profissional = new IGRPForm("experiencia_profissional","Experiência Profissional");

		area_espec__pref = new IGRPForm("area_espec__pref","Área de Especialização Preferencial");

		out_requisitos = new IGRPForm("out_requisitos","Outros Requisitos");

		atribuicoes_competencias_especificas = new IGRPForm("atribuicoes_competencias_especificas","Atribuições e Competências específicas:");

		requisitos_obrigatorios = new IGRPForm("requisitos_obrigatorios","Requisitos Obrigatórios");

		imped_incompat = new IGRPForm("imped_incompat","Impedimentos e Incompatibilidades");

		pedido_concurso_text = new TextField(model,"pedido_concurso_text");
		pedido_concurso_text.setLabel(gt(""));
		pedido_concurso_text.setValue(gt("<p>Pedido de Concurso</p>"));
		pedido_concurso_text.propertie().add("type","text").add("name","p_pedido_concurso_text").add("maxlength","4000");
		
		perfil_e_requisitos_do_cargofuncao = new TextField(model,"perfil_e_requisitos_do_cargofuncao");
		perfil_e_requisitos_do_cargofuncao.setLabel(gt("PERFIL E REQUISITOS DO CARGO/FUNÇÃO"));
		perfil_e_requisitos_do_cargofuncao.propertie().add("name","p_perfil_e_requisitos_do_cargofuncao").add("type","button").add("request_fields","").add("refresh_submit","false").add("maxlength","50");
		
		requisitos_preferenciais = new TextField(model,"requisitos_preferenciais");
		requisitos_preferenciais.setLabel(gt("REQUISITOS PREFERENCIAIS"));
		requisitos_preferenciais.propertie().add("name","p_requisitos_preferenciais").add("type","button").add("request_fields","").add("refresh_submit","false").add("maxlength","50");
		
		designacao_do_cargo_a_concurso = new TextField(model,"designacao_do_cargo_a_concurso");
		designacao_do_cargo_a_concurso.setLabel(gt("Designação do Cargo a Concurso"));
		designacao_do_cargo_a_concurso.propertie().add("name","p_designacao_do_cargo_a_concurso").add("type","text").add("maxlength","100").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		numero_de_vagas = new NumberField(model,"numero_de_vagas");
		numero_de_vagas.setLabel(gt("Número de Vagas"));
		numero_de_vagas.propertie().add("name","p_numero_de_vagas").add("type","number").add("min","").add("max","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","");
		
		tipo_de_vinculo = new ListField(model,"tipo_de_vinculo");
		tipo_de_vinculo.setLabel(gt("Tipo de Vínculo"));
		tipo_de_vinculo.propertie().add("name","p_tipo_de_vinculo").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		orcamento = new TextField(model,"orcamento");
		orcamento.setLabel(gt("Orçamento"));
		orcamento.propertie().add("name","p_orcamento").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		observacao = new TextAreaField(model,"observacao");
		observacao.setLabel(gt("Observação"));
		observacao.propertie().add("name","p_observacao").add("type","textarea").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		form_comp_rel_textarea_1 = new TextAreaField(model,"form_comp_rel_textarea_1");
		form_comp_rel_textarea_1.setLabel(gt(""));
		form_comp_rel_textarea_1.propertie().add("name","p_form_comp_rel_textarea_1").add("type","textarea").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		experiencia_profissional_textarea_1 = new TextAreaField(model,"experiencia_profissional_textarea_1");
		experiencia_profissional_textarea_1.setLabel(gt(""));
		experiencia_profissional_textarea_1.propertie().add("name","p_experiencia_profissional_textarea_1").add("type","textarea").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		area_espec__pref_textarea_1 = new TextAreaField(model,"area_espec__pref_textarea_1");
		area_espec__pref_textarea_1.setLabel(gt(""));
		area_espec__pref_textarea_1.propertie().add("name","p_area_espec__pref_textarea_1").add("type","textarea").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		out_requisitos_textarea_1 = new TextAreaField(model,"out_requisitos_textarea_1");
		out_requisitos_textarea_1.setLabel(gt(""));
		out_requisitos_textarea_1.propertie().add("name","p_out_requisitos_textarea_1").add("type","textarea").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		atri_comp_esp = new TextAreaField(model,"atri_comp_esp");
		atri_comp_esp.setLabel(gt(""));
		atri_comp_esp.propertie().add("name","p_atri_comp_esp").add("type","textarea").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		requisitos_obrigatorios_textarea_1 = new TextAreaField(model,"requisitos_obrigatorios_textarea_1");
		requisitos_obrigatorios_textarea_1.setLabel(gt(""));
		requisitos_obrigatorios_textarea_1.propertie().add("name","p_requisitos_obrigatorios_textarea_1").add("type","textarea").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		imped_incompat_textarea_1 = new TextAreaField(model,"imped_incompat_textarea_1");
		imped_incompat_textarea_1.setLabel(gt(""));
		imped_incompat_textarea_1.propertie().add("name","p_imped_incompat_textarea_1").add("type","textarea").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		


		
	}
		
	@Override
	public void render(){
		
		pedido_concurso.addField(pedido_concurso_text);

		pdd_concurso.addField(perfil_e_requisitos_do_cargofuncao);
		pdd_concurso.addField(requisitos_preferenciais);

		form_1.addField(designacao_do_cargo_a_concurso);
		form_1.addField(numero_de_vagas);
		form_1.addField(tipo_de_vinculo);
		form_1.addField(orcamento);
		form_1.addField(observacao);

		form_comp_rel.addField(form_comp_rel_textarea_1);

		experiencia_profissional.addField(experiencia_profissional_textarea_1);

		area_espec__pref.addField(area_espec__pref_textarea_1);

		out_requisitos.addField(out_requisitos_textarea_1);

		atribuicoes_competencias_especificas.addField(atri_comp_esp);

		requisitos_obrigatorios.addField(requisitos_obrigatorios_textarea_1);

		imped_incompat.addField(imped_incompat_textarea_1);

		this.addToPage(pedido_concurso);
		this.addToPage(pdd_concurso);
		this.addToPage(form_1);
		this.addToPage(form_comp_rel);
		this.addToPage(experiencia_profissional);
		this.addToPage(area_espec__pref);
		this.addToPage(out_requisitos);
		this.addToPage(atribuicoes_competencias_especificas);
		this.addToPage(requisitos_obrigatorios);
		this.addToPage(imped_incompat);
	}
		
	@Override
	public void setModel(Model model) {
		
		perfil_e_requisitos_do_cargofuncao.setValue(model);
		requisitos_preferenciais.setValue(model);
		designacao_do_cargo_a_concurso.setValue(model);
		numero_de_vagas.setValue(model);
		tipo_de_vinculo.setValue(model);
		orcamento.setValue(model);
		observacao.setValue(model);
		form_comp_rel_textarea_1.setValue(model);
		experiencia_profissional_textarea_1.setValue(model);
		area_espec__pref_textarea_1.setValue(model);
		out_requisitos_textarea_1.setValue(model);
		atri_comp_esp.setValue(model);
		requisitos_obrigatorios_textarea_1.setValue(model);
		imped_incompat_textarea_1.setValue(model);	

		}
}
