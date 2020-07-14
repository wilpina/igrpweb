package nosi.webapps.map_competencias.pages.subscricao;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import nosi.core.webapp.Core;

public class SubscricaoView extends View {

	public Field sectionheader_1_text;
	public Field picture;
	public Field click_na_foto_clicando;
	public Field nome;
	public Field email;
	public Field data_nascimento;
	public Field habilitacao_literaria;
	public Field tipo_colaborador;
	public Field anos_exp_professional;
	public Field ver_cv;
	public Field seu_curriculum_vitae_cv;
	public Field data_de_entrada_nosi;
	public Field salario_atual_bruto;
	public Field departamento_atual;
	public Field enquadramento_pccs;
	public Field categoria;
	public Field nivel;
	public Field foto_pccs_deliberado_em_2016;
	public Field uuid;
	public Field funcao_desempenhada;
	public Field produto;
	public Field em_curso;
	public Field em_curso_check;
	public Field formacao_certificacao;
	public Field ano_de_conclusao;
	public Field fornecida_pela_nosi;
	public Field fornecida_pela_nosi_check;
	public Field competencias_importantes;
	public Field comportamental;
	public Field organizacionais;
	public Field estrategica;
	public Field extra;
	public Field observacao;
	public Field fase;
	public Field nota_ca;
	public IGRPSectionHeader sectionheader_1;
	public IGRPForm form_1;
	public IGRPSeparatorList separatorlist_1;
	public IGRPSeparatorList separatorlist_2;
	public IGRPForm form_2;
	public IGRPForm form_nota_ca;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_enviar;
	public IGRPButton btn_guardar;

	public SubscricaoView(){

		this.setPageTitle("Subscrição");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		form_1 = new IGRPForm("form_1","");

		separatorlist_1 = new IGRPSeparatorList("separatorlist_1","Função e Projeto / Produto que fez parte ou que está fazendo parte (em curso)");

		separatorlist_2 = new IGRPSeparatorList("separatorlist_2","Conhecimento Técnico/Formação Especifica para desempenho das funções");

		form_2 = new IGRPForm("form_2","");

		form_nota_ca = new IGRPForm("form_nota_ca","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p>Mapeamento de Compet&ecirc;ncias</p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		picture = new TextField(model,"picture");
		picture.setLabel(gt("Img"));
		picture.setValue(gt("/IGRP/images/IGRP/IGRP2.3/assets/img/jon_doe.jpg"));
		picture.propertie().add("name","p_picture").add("type","img").add("img","/IGRP/images/IGRP/IGRP2.3/assets/img/jon_doe.jpg").add("width","250").add("height","250").add("croppie","true").add("rounded","true").add("autoupload","true").add("maxlength","250").add("placeholder",gt("click aqui")).add("desclabel","true");
		
		click_na_foto_clicando = new PlainTextField(model,"click_na_foto_clicando");
		click_na_foto_clicando.setLabel(gt("Click na foto clicando"));
		click_na_foto_clicando.propertie().add("name","p_click_na_foto_clicando").add("type","plaintext").add("clear","false").add("disable_output_escaping","false").add("html_class","").add("maxlength","250");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		email = new EmailField(model,"email");
		email.setLabel(gt("Email institucional"));
		email.propertie().add("name","p_email").add("type","email").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("@nosi.cv")).add("desclabel","false");
		
		data_nascimento = new DateField(model,"data_nascimento");
		data_nascimento.setLabel(gt("Data nascimento"));
		data_nascimento.propertie().add("name","p_data_nascimento").add("type","date").add("range","false").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("dd-MM-aaaa")).add("desclabel","false").add("class","danger");
		
		habilitacao_literaria = new ListField(model,"habilitacao_literaria");
		habilitacao_literaria.setLabel(gt("Habilitação literária"));
		habilitacao_literaria.propertie().add("name","p_habilitacao_literaria").add("type","select").add("multiple","false").add("tags","false").add("domain","habilitacao « map_competencias").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		tipo_colaborador = new ListField(model,"tipo_colaborador");
		tipo_colaborador.setLabel(gt("Tipo de colaborador"));
		tipo_colaborador.propertie().add("name","p_tipo_colaborador").add("type","select").add("multiple","false").add("tags","false").add("domain","tipo_colaborador « map_competencias").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		anos_exp_professional = new NumberField(model,"anos_exp_professional");
		anos_exp_professional.setLabel(gt("Anos de experiência profissional"));
		anos_exp_professional.propertie().add("name","p_anos_exp_professional").add("type","number").add("min","").add("max","300").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("Anos de experiência")).add("desclabel","false").add("java-type","");
		
		ver_cv = new LinkField(model,"ver_cv");
		ver_cv.setLabel(gt("Ver curriculum vitae (CV)"));
		ver_cv.setValue(Core.getIGRPLink("map_competencias","Subscricao","index"));

									ver_cv.propertie().add("name","p_ver_cv").add("type","link").add("target","modal").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("class","link").add("img","fa-address-card").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		seu_curriculum_vitae_cv = new FileField(model,"seu_curriculum_vitae_cv");
		seu_curriculum_vitae_cv.setLabel(gt("Seu curriculum vitae (CV)"));
		seu_curriculum_vitae_cv.propertie().add("name","p_seu_curriculum_vitae_cv").add("type","file").add("accept","application/pdf").add("targetrend","").add("multiple","false").add("rendvalue","false").add("maxlength","250").add("required","false").add("disabled","false").add("class","primary");
		
		data_de_entrada_nosi = new DateField(model,"data_de_entrada_nosi");
		data_de_entrada_nosi.setLabel(gt("Data de entrada no NOSi"));
		data_de_entrada_nosi.propertie().add("name","p_data_de_entrada_nosi").add("type","date").add("range","false").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("dd-MM-aaaa")).add("desclabel","false").add("class","primary");
		
		salario_atual_bruto = new NumberField(model,"salario_atual_bruto");
		salario_atual_bruto.setLabel(gt("Salário bruto atual"));
		salario_atual_bruto.propertie().add("name","p_salario_atual_bruto").add("type","number").add("min","").add("max","300").add("maxlength","3").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("Em contos ex: 100")).add("desclabel","true").add("java-type","");
		
		departamento_atual = new ListField(model,"departamento_atual");
		departamento_atual.setLabel(gt("Ultimo departamento alocado"));
		departamento_atual.propertie().add("name","p_departamento_atual").add("type","select").add("multiple","false").add("tags","false").add("domain","departamentos « map_competencias").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","");
		
		enquadramento_pccs = new SeparatorField(model,"enquadramento_pccs");
		enquadramento_pccs.setLabel(gt("Enquadramento  tabela Salarial em vigor"));
		enquadramento_pccs.propertie().add("name","p_enquadramento_pccs").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		categoria = new ListField(model,"categoria");
		categoria.setLabel(gt("Categoria"));
		categoria.propertie().add("name","p_categoria").add("type","select").add("multiple","false").add("tags","false").add("domain","pccs « map_competencias").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		nivel = new ListField(model,"nivel");
		nivel.setLabel(gt("Nível"));
		nivel.propertie().add("name","p_nivel").add("type","select").add("multiple","false").add("tags","false").add("domain","pccs_nivel « map_competencias").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		foto_pccs_deliberado_em_2016 = new LinkField(model,"foto_pccs_deliberado_em_2016");
		foto_pccs_deliberado_em_2016.setLabel(gt("Consultar pccs"));
		foto_pccs_deliberado_em_2016.setValue(Core.getIGRPLink("map_competencias","Subscricao","index"));

									foto_pccs_deliberado_em_2016.propertie().add("name","p_foto_pccs_deliberado_em_2016").add("type","link").add("target","modal").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("class","link").add("img","fa-link").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		uuid = new HiddenField(model,"uuid");
		uuid.setLabel(gt(""));
		uuid.propertie().add("name","p_uuid").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","uuid");
		
		funcao_desempenhada = new ListField(model,"funcao_desempenhada");
		funcao_desempenhada.setLabel(gt("Função desempenhada"));
		funcao_desempenhada.propertie().add("name","p_funcao_desempenhada").add("type","select").add("multiple","false").add("tags","false").add("domain","funcao « map_competencias").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("desc","true");
		
		produto = new ListField(model,"produto");
		produto.setLabel(gt("Produto (opcional not DDS)"));
		produto.propertie().add("name","p_produto").add("type","select").add("multiple","false").add("tags","false").add("domain","projeto_produto « map_competencias").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("desc","true");
		
		em_curso = new CheckBoxField(model,"em_curso");
		em_curso.setLabel(gt("Projeto ativo (em curso)"));
		em_curso.propertie().add("name","p_em_curso").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","int").add("check","true").add("desc","true");
		
		em_curso_check = new CheckBoxField(model,"em_curso_check");
		em_curso_check.propertie().add("name","p_em_curso").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","int").add("check","true").add("desc","true");
		
		formacao_certificacao = new TextField(model,"formacao_certificacao");
		formacao_certificacao.setLabel(gt("Formação /Certificação"));
		formacao_certificacao.propertie().add("name","p_formacao_certificacao").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("Ex: PASP /PALOP - Arquitetura de sistemas")).add("desclabel","false").add("desc","true");
		
		ano_de_conclusao = new NumberField(model,"ano_de_conclusao");
		ano_de_conclusao.setLabel(gt("Ano de conclusão"));
		ano_de_conclusao.propertie().add("name","p_ano_de_conclusao").add("type","number").add("min","1975").add("max","").add("maxlength","4").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("Ex: 2019")).add("desclabel","false").add("java-type","").add("desc","true");
		
		fornecida_pela_nosi = new CheckBoxField(model,"fornecida_pela_nosi");
		fornecida_pela_nosi.setLabel(gt("Fornecida pela NOSi"));
		fornecida_pela_nosi.propertie().add("name","p_fornecida_pela_nosi").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","int").add("check","true").add("desc","true");
		
		fornecida_pela_nosi_check = new CheckBoxField(model,"fornecida_pela_nosi_check");
		fornecida_pela_nosi_check.propertie().add("name","p_fornecida_pela_nosi").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","int").add("check","true").add("desc","true");
		
		competencias_importantes = new SeparatorField(model,"competencias_importantes");
		competencias_importantes.setLabel(gt("Competências importantes que tens para desempenho das funções e que vão de acordo com a missão e visão da organização: "));
		competencias_importantes.propertie().add("name","p_competencias_importantes").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		comportamental = new ListField(model,"comportamental");
		comportamental.setLabel(gt("Comportamental"));
		comportamental.propertie().add("name","p_comportamental").add("type","select").add("multiple","true").add("tags","false").add("domain","comportamental « map_competencias").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		organizacionais = new ListField(model,"organizacionais");
		organizacionais.setLabel(gt("Organizacionais"));
		organizacionais.propertie().add("name","p_organizacionais").add("type","select").add("multiple","true").add("tags","false").add("domain","Organizacionais « map_competencias").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		estrategica = new ListField(model,"estrategica");
		estrategica.setLabel(gt("Estratégica"));
		estrategica.propertie().add("name","p_estrategica").add("type","select").add("multiple","true").add("tags","false").add("domain","Estratégica « map_competencias").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		extra = new SeparatorField(model,"extra");
		extra.setLabel(gt("Extra"));
		extra.propertie().add("name","p_extra").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		observacao = new TextAreaField(model,"observacao");
		observacao.setLabel(gt("Observação"));
		observacao.propertie().add("name","p_observacao").add("type","textarea").add("maxlength","4000").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("Ex: Queria fazer parte de outro departamento...")).add("desclabel","false");
		
		fase = new ListField(model,"fase");
		fase.setLabel(gt("Fase"));
		fase.propertie().add("name","p_fase").add("type","select").add("multiple","false").add("tags","false").add("domain","fases « map_competencias").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		nota_ca = new TextAreaField(model,"nota_ca");
		nota_ca.setLabel(gt("Nota do Conselho de Administração (CA)"));
		nota_ca.propertie().add("name","p_nota_ca").add("type","textarea").add("maxlength","4000").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_enviar = new IGRPButton("Enviar","map_competencias","Subscricao","enviar","submit_ajax","primary|fa-send","","");
		btn_enviar.propertie.add("type","specific").add("rel","enviar").add("refresh_components","form_1,separatorlist_1,separatorlist_2,form_2");

		btn_guardar = new IGRPButton("Guardar","map_competencias","Subscricao","guardar","submit_ajax","primary|fa-save","","");
		btn_guardar.propertie.add("type","form").add("class","primary").add("rel","guardar").add("refresh_components","form_nota_ca");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);


		form_1.addField(picture);
		form_1.addField(click_na_foto_clicando);
		form_1.addField(nome);
		form_1.addField(email);
		form_1.addField(data_nascimento);
		form_1.addField(habilitacao_literaria);
		form_1.addField(tipo_colaborador);
		form_1.addField(anos_exp_professional);
		form_1.addField(ver_cv);
		form_1.addField(seu_curriculum_vitae_cv);
		form_1.addField(data_de_entrada_nosi);
		form_1.addField(salario_atual_bruto);
		form_1.addField(departamento_atual);
		form_1.addField(enquadramento_pccs);
		form_1.addField(categoria);
		form_1.addField(nivel);
		form_1.addField(foto_pccs_deliberado_em_2016);
		form_1.addField(uuid);

		separatorlist_1.addField(funcao_desempenhada);
		separatorlist_1.addField(produto);
		separatorlist_1.addField(em_curso);
		separatorlist_1.addField(em_curso_check);

		separatorlist_2.addField(formacao_certificacao);
		separatorlist_2.addField(ano_de_conclusao);
		separatorlist_2.addField(fornecida_pela_nosi);
		separatorlist_2.addField(fornecida_pela_nosi_check);

		form_2.addField(competencias_importantes);
		form_2.addField(comportamental);
		form_2.addField(organizacionais);
		form_2.addField(estrategica);
		form_2.addField(extra);
		form_2.addField(observacao);

		form_nota_ca.addField(fase);
		form_nota_ca.addField(nota_ca);

		toolsbar_1.addButton(btn_enviar);
		form_nota_ca.addButton(btn_guardar);
		this.addToPage(sectionheader_1);
		this.addToPage(form_1);
		this.addToPage(separatorlist_1);
		this.addToPage(separatorlist_2);
		this.addToPage(form_2);
		this.addToPage(form_nota_ca);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		click_na_foto_clicando.setValue(model);
		nome.setValue(model);
		email.setValue(model);
		data_nascimento.setValue(model);
		habilitacao_literaria.setValue(model);
		tipo_colaborador.setValue(model);
		anos_exp_professional.setValue(model);
		ver_cv.setValue(model);
		seu_curriculum_vitae_cv.setValue(model);
		data_de_entrada_nosi.setValue(model);
		salario_atual_bruto.setValue(model);
		departamento_atual.setValue(model);
		enquadramento_pccs.setValue(model);
		categoria.setValue(model);
		nivel.setValue(model);
		foto_pccs_deliberado_em_2016.setValue(model);
		uuid.setValue(model);
		funcao_desempenhada.setValue(model);
		produto.setValue(model);
		em_curso.setValue(model);
		formacao_certificacao.setValue(model);
		ano_de_conclusao.setValue(model);
		fornecida_pela_nosi.setValue(model);
		competencias_importantes.setValue(model);
		comportamental.setValue(model);
		organizacionais.setValue(model);
		estrategica.setValue(model);
		extra.setValue(model);
		observacao.setValue(model);
		fase.setValue(model);
		nota_ca.setValue(model);	

		separatorlist_1.loadModel(((Subscricao) model).getSeparatorlist_1());
		separatorlist_2.loadModel(((Subscricao) model).getSeparatorlist_2());
		}
}
