package nosi.webapps.recrutamento_rh.pages.candidatura;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class CandidaturaView extends View {

	public Field informacao_profissional_text;
	public Field copia_de_bi;
	public Field curriculinm_;
	public Field certificado_conclusao_do_curso;
	public Field certificado_de_equivalencia_;
	public Field outro_documento;
	public Field exper_profissional;
	public Field funcao;
	public Field entidade_empregadora;
	public Field data_inicio;
	public Field dt_fim;
	public Field forma_academica;
	public Field descricao;
	public Field area_de_formacao;
	public Field habilitacao_academica;
	public Field nivel_de_habilitacao;
	public Field text_1;
	public Field data_de_inicio_;
	public Field data_fim;
	public Field certificado;
	public IGRPSectionHeader informacao_profissional;
	public IGRPForm form_1;
	public IGRPForm form_2;
	public IGRPForm form_acd;

	public IGRPToolsBar info_profs;
	public IGRPButton btn_submeter;

	public CandidaturaView(){

		this.setPageTitle("Candidatura");
			
		informacao_profissional = new IGRPSectionHeader("informacao_profissional","");

		form_1 = new IGRPForm("form_1","");

		form_2 = new IGRPForm("form_2","");

		form_acd = new IGRPForm("form_acd","");

		informacao_profissional_text = new TextField(model,"informacao_profissional_text");
		informacao_profissional_text.setLabel(gt(""));
		informacao_profissional_text.setValue(gt("<p>Informa&ccedil;&atilde;o Profissional</p>"));
		informacao_profissional_text.propertie().add("type","text").add("name","p_informacao_profissional_text").add("maxlength","4000");
		
		copia_de_bi = new FileField(model,"copia_de_bi");
		copia_de_bi.setLabel(gt("Cópia de BI"));
		copia_de_bi.propertie().add("name","p_copia_de_bi").add("type","file").add("accept","").add("targetrend","").add("multiple","false").add("rendvalue","false").add("maxlength","250").add("required","true").add("disabled","false");
		
		curriculinm_ = new FileField(model,"curriculinm_");
		curriculinm_.setLabel(gt("Curriculum "));
		curriculinm_.propertie().add("name","p_curriculinm_").add("type","file").add("accept","").add("targetrend","").add("multiple","false").add("rendvalue","false").add("maxlength","250").add("required","true").add("disabled","false");
		
		certificado_conclusao_do_curso = new FileField(model,"certificado_conclusao_do_curso");
		certificado_conclusao_do_curso.setLabel(gt("Certificado Conclusão do Curso"));
		certificado_conclusao_do_curso.propertie().add("name","p_certificado_conclusao_do_curso").add("type","file").add("accept","").add("targetrend","").add("multiple","false").add("rendvalue","false").add("maxlength","250").add("required","true").add("disabled","false");
		
		certificado_de_equivalencia_ = new FileField(model,"certificado_de_equivalencia_");
		certificado_de_equivalencia_.setLabel(gt("Certificado de Equivalência "));
		certificado_de_equivalencia_.propertie().add("name","p_certificado_de_equivalencia_").add("type","file").add("accept","").add("targetrend","").add("multiple","false").add("rendvalue","false").add("maxlength","250").add("required","false").add("disabled","false");
		
		outro_documento = new FileField(model,"outro_documento");
		outro_documento.setLabel(gt("Outro Documento"));
		outro_documento.propertie().add("name","p_outro_documento").add("type","file").add("accept","").add("targetrend","").add("multiple","false").add("rendvalue","false").add("maxlength","250").add("required","false").add("disabled","false");
		
		exper_profissional = new SeparatorField(model,"exper_profissional");
		exper_profissional.setLabel(gt("Experiência profissional"));
		exper_profissional.propertie().add("name","p_exper_profissional").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		funcao = new TextField(model,"funcao");
		funcao.setLabel(gt("Função"));
		funcao.propertie().add("name","p_funcao").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		entidade_empregadora = new TextField(model,"entidade_empregadora");
		entidade_empregadora.setLabel(gt("Entidade Empregadora"));
		entidade_empregadora.propertie().add("name","p_entidade_empregadora").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		data_inicio = new DateField(model,"data_inicio");
		data_inicio.setLabel(gt("Data Inicio"));
		data_inicio.propertie().add("name","p_data_inicio").add("type","date").add("range","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		dt_fim = new DateField(model,"dt_fim");
		dt_fim.setLabel(gt("Data Fim"));
		dt_fim.propertie().add("name","p_dt_fim").add("type","date").add("range","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		forma_academica = new SeparatorField(model,"forma_academica");
		forma_academica.setLabel(gt("Formação Acadêmica"));
		forma_academica.propertie().add("name","p_forma_academica").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		descricao = new TextField(model,"descricao");
		descricao.setLabel(gt("Descrição"));
		descricao.propertie().add("name","p_descricao").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		area_de_formacao = new ListField(model,"area_de_formacao");
		area_de_formacao.setLabel(gt("Área de formação"));
		area_de_formacao.propertie().add("name","p_area_de_formacao").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		habilitacao_academica = new ListField(model,"habilitacao_academica");
		habilitacao_academica.setLabel(gt("Habilitação Acadêmica"));
		habilitacao_academica.propertie().add("name","p_habilitacao_academica").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		nivel_de_habilitacao = new ListField(model,"nivel_de_habilitacao");
		nivel_de_habilitacao.setLabel(gt("Nível de Habilitação"));
		nivel_de_habilitacao.propertie().add("name","p_nivel_de_habilitacao").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		text_1 = new TextField(model,"text_1");
		text_1.setLabel(gt("Instituição de Ensino"));
		text_1.propertie().add("name","p_text_1").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		data_de_inicio_ = new DateField(model,"data_de_inicio_");
		data_de_inicio_.setLabel(gt("Data de inicio "));
		data_de_inicio_.propertie().add("name","p_data_de_inicio_").add("type","date").add("range","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		data_fim = new DateField(model,"data_fim");
		data_fim.setLabel(gt("Data Fim"));
		data_fim.propertie().add("name","p_data_fim").add("type","date").add("range","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		certificado = new FileField(model,"certificado");
		certificado.setLabel(gt("Certificado"));
		certificado.propertie().add("name","p_certificado").add("type","file").add("accept","").add("targetrend","").add("multiple","false").add("rendvalue","false").add("maxlength","250").add("required","false").add("disabled","false");
		

		info_profs = new IGRPToolsBar("info_profs");

		btn_submeter = new IGRPButton("Submeter","recrutamento_rh","Candidatura","submeter","_blank","info|fa-send-o","","");
		btn_submeter.propertie.add("type","specific").add("rel","submeter");

		
	}
		
	@Override
	public void render(){
		
		informacao_profissional.addField(informacao_profissional_text);


		form_1.addField(copia_de_bi);
		form_1.addField(curriculinm_);
		form_1.addField(certificado_conclusao_do_curso);
		form_1.addField(certificado_de_equivalencia_);
		form_1.addField(outro_documento);

		form_2.addField(exper_profissional);
		form_2.addField(funcao);
		form_2.addField(entidade_empregadora);
		form_2.addField(data_inicio);
		form_2.addField(dt_fim);

		form_acd.addField(forma_academica);
		form_acd.addField(descricao);
		form_acd.addField(area_de_formacao);
		form_acd.addField(habilitacao_academica);
		form_acd.addField(nivel_de_habilitacao);
		form_acd.addField(text_1);
		form_acd.addField(data_de_inicio_);
		form_acd.addField(data_fim);
		form_acd.addField(certificado);

		info_profs.addButton(btn_submeter);
		this.addToPage(informacao_profissional);
		this.addToPage(form_1);
		this.addToPage(form_2);
		this.addToPage(form_acd);
		this.addToPage(info_profs);
	}
		
	@Override
	public void setModel(Model model) {
		
		copia_de_bi.setValue(model);
		curriculinm_.setValue(model);
		certificado_conclusao_do_curso.setValue(model);
		certificado_de_equivalencia_.setValue(model);
		outro_documento.setValue(model);
		exper_profissional.setValue(model);
		funcao.setValue(model);
		entidade_empregadora.setValue(model);
		data_inicio.setValue(model);
		dt_fim.setValue(model);
		forma_academica.setValue(model);
		descricao.setValue(model);
		area_de_formacao.setValue(model);
		habilitacao_academica.setValue(model);
		nivel_de_habilitacao.setValue(model);
		text_1.setValue(model);
		data_de_inicio_.setValue(model);
		data_fim.setValue(model);
		certificado.setValue(model);	

		}
}
