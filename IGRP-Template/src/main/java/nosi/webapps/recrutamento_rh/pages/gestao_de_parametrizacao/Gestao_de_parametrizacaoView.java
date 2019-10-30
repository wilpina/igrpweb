package nosi.webapps.recrutamento_rh.pages.gestao_de_parametrizacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Gestao_de_parametrizacaoView extends View {

	public Field gest_parametrizacao_text;
	public Field entidade;
	public Field areas_formacao;
	public Field area_de_emprego;
	public Field tp_doc;
	public Field tipo_de_concurso;
	public Field tp_form;
	public Field idioma;
	public Field profissao;
	public Field cargos;
	public Field f_nome;
	public Field f_codigo;
	public Field f_nif;
	public Field area_de_formacao;
	public Field f_estado;
	public Field id_area_formacao;
	public Field emp_codigo;
	public Field emp_descricao;
	public Field estado_emp;
	public Field id_area_emprego;
	public Field doc_codigo;
	public Field doc_descricao;
	public Field doc_estado;
	public Field id_tp_doc;
	public Field codigo;
	public Field descricao_tpconcurso;
	public Field estado_tc;
	public Field id_tp_con;
	public Field codigo_tp_form;
	public Field descri_tp_form;
	public Field estado_tp_form;
	public Field id_tp_for;
	public Field codigo_idioma;
	public Field tp_idioma;
	public Field estado_idioma;
	public Field id_idioma;
	public Field codigo_prof;
	public Field descricao_profissao;
	public Field estado_prof;
	public Field id_profissao;
	public Field cargo;
	public Field estado_cargo;
	public Field id_cargo;
	public Field codigo_entidade;
	public Field nif;
	public Field nome;
	public Field estado;
	public Field id_entidade;
	public IGRPSectionHeader gest_parametrizacao;
	public IGRPTabContent menu;
	public IGRPForm form_entidade;
	public IGRPTable lista_af;
	public IGRPTable table_3;
	public IGRPTable table_2;
	public IGRPTable tp_concurso;
	public IGRPTable lista_forma;
	public IGRPTable lista_idioma;
	public IGRPTable lista_profissao;
	public IGRPTable list_cargo;
	public IGRPTable lista_entidade;

	public IGRPToolsBar novo;
	public IGRPToolsBar novo_area_emp;
	public IGRPToolsBar novo_doc;
	public IGRPToolsBar novo_concurso;
	public IGRPToolsBar novo_tp_form;
	public IGRPToolsBar novo_idioma;
	public IGRPToolsBar novo_profissao;
	public IGRPToolsBar novo_cargo;
	public IGRPToolsBar novo_entidade;
	public IGRPButton btn_novo;
	public IGRPButton btn_novo_emp;
	public IGRPButton btn_doc_novo;
	public IGRPButton btn_novo_concurso;
	public IGRPButton btn_novo_tp_form;
	public IGRPButton btn_novo_idi;
	public IGRPButton btn_novo_prof;
	public IGRPButton btn_novo_carg;
	public IGRPButton btn_novo_entidades;
	public IGRPButton btn_pesquisar;
	public IGRPButton btn_editar;
	public IGRPButton btn_eliminar;

	public Gestao_de_parametrizacaoView(){

		this.setPageTitle("Gestão de Parametrização");
			
		gest_parametrizacao = new IGRPSectionHeader("gest_parametrizacao","");

		menu = new IGRPTabContent("menu","");

		form_entidade = new IGRPForm("form_entidade","");

		lista_af = new IGRPTable("lista_af","");

		table_3 = new IGRPTable("table_3","");

		table_2 = new IGRPTable("table_2","");

		tp_concurso = new IGRPTable("tp_concurso","");

		lista_forma = new IGRPTable("lista_forma","");

		lista_idioma = new IGRPTable("lista_idioma","");

		lista_profissao = new IGRPTable("lista_profissao","");

		list_cargo = new IGRPTable("list_cargo","");

		lista_entidade = new IGRPTable("lista_entidade","");

		gest_parametrizacao_text = new TextField(model,"gest_parametrizacao_text");
		gest_parametrizacao_text.setLabel(gt(""));
		gest_parametrizacao_text.setValue(gt("<p>Gest&atilde;o de Parametriza&ccedil;&atilde;o</p>"));
		gest_parametrizacao_text.propertie().add("type","text").add("name","p_gest_parametrizacao_text").add("maxlength","4000");
		
		entidade = new TextField(model,"entidade");
		entidade.setLabel(gt("Entidade"));
		entidade.propertie().add("name","p_entidade").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("maxlength","50");
		
		areas_formacao = new TextField(model,"areas_formacao");
		areas_formacao.setLabel(gt("Áreas de Formação"));
		areas_formacao.propertie().add("name","p_areas_formacao").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("maxlength","50");
		
		area_de_emprego = new TextField(model,"area_de_emprego");
		area_de_emprego.setLabel(gt("Área de Emprego"));
		area_de_emprego.propertie().add("name","p_area_de_emprego").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("maxlength","50");
		
		tp_doc = new TextField(model,"tp_doc");
		tp_doc.setLabel(gt("Tipo Documento"));
		tp_doc.propertie().add("name","p_tp_doc").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("maxlength","50");
		
		tipo_de_concurso = new TextField(model,"tipo_de_concurso");
		tipo_de_concurso.setLabel(gt("Tipo de Concurso"));
		tipo_de_concurso.propertie().add("name","p_tipo_de_concurso").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("maxlength","50");
		
		tp_form = new TextField(model,"tp_form");
		tp_form.setLabel(gt("Tipo Formação"));
		tp_form.propertie().add("name","p_tp_form").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("maxlength","50");
		
		idioma = new TextField(model,"idioma");
		idioma.setLabel(gt("Idioma"));
		idioma.propertie().add("name","p_idioma").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("maxlength","50");
		
		profissao = new TextField(model,"profissao");
		profissao.setLabel(gt("Profissão"));
		profissao.propertie().add("name","p_profissao").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("maxlength","50");
		
		cargos = new TextField(model,"cargos");
		cargos.setLabel(gt("Cargo"));
		cargos.propertie().add("name","p_cargos").add("type","button").add("request_fields","").add("refresh_components","").add("refresh_submit","false").add("maxlength","50");
		
		f_nome = new TextField(model,"f_nome");
		f_nome.setLabel(gt("Nome"));
		f_nome.propertie().add("name","p_f_nome").add("type","text").add("maxlength","50").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		f_codigo = new TextField(model,"f_codigo");
		f_codigo.setLabel(gt("Código"));
		f_codigo.propertie().add("name","p_f_codigo").add("type","text").add("maxlength","15").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		f_nif = new NumberField(model,"f_nif");
		f_nif.setLabel(gt("Nif"));
		f_nif.propertie().add("name","p_f_nif").add("type","number").add("min","").add("max","").add("maxlength","15").add("required","false").add("readonly","true").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","");
		
		area_de_formacao = new TextField(model,"area_de_formacao");
		area_de_formacao.setLabel(gt("Área de Formação"));
		area_de_formacao.propertie().add("name","p_area_de_formacao").add("type","text").add("maxlength","100").add("showLabel","true").add("group_in","");
		
		f_estado = new TextField(model,"f_estado");
		f_estado.setLabel(gt("Estado"));
		f_estado.propertie().add("name","p_f_estado").add("type","text").add("maxlength","100").add("showLabel","true").add("group_in","");
		
		id_area_formacao = new HiddenField(model,"id_area_formacao");
		id_area_formacao.setLabel(gt(""));
		id_area_formacao.propertie().add("name","p_id_area_formacao").add("type","hidden").add("maxlength","100").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_area_formacao");
		
		emp_codigo = new TextField(model,"emp_codigo");
		emp_codigo.setLabel(gt("Código"));
		emp_codigo.propertie().add("name","p_emp_codigo").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		emp_descricao = new TextField(model,"emp_descricao");
		emp_descricao.setLabel(gt("Descrição"));
		emp_descricao.propertie().add("name","p_emp_descricao").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		estado_emp = new TextField(model,"estado_emp");
		estado_emp.setLabel(gt("Estado"));
		estado_emp.propertie().add("name","p_estado_emp").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_area_emprego = new HiddenField(model,"id_area_emprego");
		id_area_emprego.setLabel(gt(""));
		id_area_emprego.propertie().add("name","p_id_area_emprego").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_area_emprego");
		
		doc_codigo = new TextField(model,"doc_codigo");
		doc_codigo.setLabel(gt("Código"));
		doc_codigo.propertie().add("name","p_doc_codigo").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		doc_descricao = new TextField(model,"doc_descricao");
		doc_descricao.setLabel(gt("Descrição"));
		doc_descricao.propertie().add("name","p_doc_descricao").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		doc_estado = new TextField(model,"doc_estado");
		doc_estado.setLabel(gt("Estado"));
		doc_estado.propertie().add("name","p_doc_estado").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_tp_doc = new HiddenField(model,"id_tp_doc");
		id_tp_doc.setLabel(gt(""));
		id_tp_doc.propertie().add("name","p_id_tp_doc").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_tp_doc");
		
		codigo = new TextField(model,"codigo");
		codigo.setLabel(gt("Código"));
		codigo.propertie().add("name","p_codigo").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		descricao_tpconcurso = new TextField(model,"descricao_tpconcurso");
		descricao_tpconcurso.setLabel(gt("Descrição"));
		descricao_tpconcurso.propertie().add("name","p_descricao_tpconcurso").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		estado_tc = new TextField(model,"estado_tc");
		estado_tc.setLabel(gt("Estado"));
		estado_tc.propertie().add("name","p_estado_tc").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_tp_con = new HiddenField(model,"id_tp_con");
		id_tp_con.setLabel(gt(""));
		id_tp_con.propertie().add("name","p_id_tp_con").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_tp_con");
		
		codigo_tp_form = new TextField(model,"codigo_tp_form");
		codigo_tp_form.setLabel(gt("Código"));
		codigo_tp_form.propertie().add("name","p_codigo_tp_form").add("type","text").add("maxlength","15").add("showLabel","true").add("group_in","");
		
		descri_tp_form = new TextField(model,"descri_tp_form");
		descri_tp_form.setLabel(gt("Descrição"));
		descri_tp_form.propertie().add("name","p_descri_tp_form").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		estado_tp_form = new TextField(model,"estado_tp_form");
		estado_tp_form.setLabel(gt("Estado"));
		estado_tp_form.propertie().add("name","p_estado_tp_form").add("type","text").add("maxlength","10").add("showLabel","true").add("group_in","");
		
		id_tp_for = new HiddenField(model,"id_tp_for");
		id_tp_for.setLabel(gt(""));
		id_tp_for.propertie().add("name","p_id_tp_for").add("type","hidden").add("maxlength","10").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_tp_for");
		
		codigo_idioma = new TextField(model,"codigo_idioma");
		codigo_idioma.setLabel(gt("Codigo"));
		codigo_idioma.propertie().add("name","p_codigo_idioma").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		tp_idioma = new TextField(model,"tp_idioma");
		tp_idioma.setLabel(gt("Tipo de Idioma"));
		tp_idioma.propertie().add("name","p_tp_idioma").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		estado_idioma = new TextField(model,"estado_idioma");
		estado_idioma.setLabel(gt("Estado"));
		estado_idioma.propertie().add("name","p_estado_idioma").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_idioma = new HiddenField(model,"id_idioma");
		id_idioma.setLabel(gt(""));
		id_idioma.propertie().add("name","p_id_idioma").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_idioma");
		
		codigo_prof = new TextField(model,"codigo_prof");
		codigo_prof.setLabel(gt("Código"));
		codigo_prof.propertie().add("name","p_codigo_prof").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		descricao_profissao = new TextField(model,"descricao_profissao");
		descricao_profissao.setLabel(gt("Descrição"));
		descricao_profissao.propertie().add("name","p_descricao_profissao").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		estado_prof = new TextField(model,"estado_prof");
		estado_prof.setLabel(gt("Estado"));
		estado_prof.propertie().add("name","p_estado_prof").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_profissao = new HiddenField(model,"id_profissao");
		id_profissao.setLabel(gt(""));
		id_profissao.propertie().add("name","p_id_profissao").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_profissao");
		
		cargo = new TextField(model,"cargo");
		cargo.setLabel(gt("Cargo"));
		cargo.propertie().add("name","p_cargo").add("type","text").add("maxlength","50").add("showLabel","true").add("group_in","");
		
		estado_cargo = new TextField(model,"estado_cargo");
		estado_cargo.setLabel(gt("Estado"));
		estado_cargo.propertie().add("name","p_estado_cargo").add("type","text").add("maxlength","50").add("showLabel","true").add("group_in","");
		
		id_cargo = new HiddenField(model,"id_cargo");
		id_cargo.setLabel(gt(""));
		id_cargo.propertie().add("name","p_id_cargo").add("type","hidden").add("maxlength","50").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_cargo");
		
		codigo_entidade = new TextField(model,"codigo_entidade");
		codigo_entidade.setLabel(gt("Código"));
		codigo_entidade.propertie().add("name","p_codigo_entidade").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		nif = new NumberField(model,"nif");
		nif.setLabel(gt("Nif"));
		nif.propertie().add("name","p_nif").add("type","number").add("min","").add("max","").add("maxlength","30").add("showLabel","true").add("total_footer","false").add("group_in","").add("java-type","");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		estado = new TextField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_entidade = new HiddenField(model,"id_entidade");
		id_entidade.setLabel(gt(""));
		id_entidade.propertie().add("name","p_id_entidade").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_entidade");
		

		novo = new IGRPToolsBar("novo");
		novo_area_emp = new IGRPToolsBar("novo_area_emp");
		novo_doc = new IGRPToolsBar("novo_doc");
		novo_concurso = new IGRPToolsBar("novo_concurso");
		novo_tp_form = new IGRPToolsBar("novo_tp_form");
		novo_idioma = new IGRPToolsBar("novo_idioma");
		novo_profissao = new IGRPToolsBar("novo_profissao");
		novo_cargo = new IGRPToolsBar("novo_cargo");
		novo_entidade = new IGRPToolsBar("novo_entidade");

		btn_novo = new IGRPButton("Novo","recrutamento_rh","Gestao_de_parametrizacao","novo","modal","success|fa-plus","","");
		btn_novo.propertie.add("type","specific").add("rel","novo").add("refresh_components","");

		btn_novo_emp = new IGRPButton("Novo","recrutamento_rh","Gestao_de_parametrizacao","novo_emp","_blank","success|fa-plus","","");
		btn_novo_emp.propertie.add("type","specific").add("rel","novo_emp").add("refresh_components","");

		btn_doc_novo = new IGRPButton("Novo","recrutamento_rh","Gestao_de_parametrizacao","doc_novo","_blank","success|fa-plus","","");
		btn_doc_novo.propertie.add("type","specific").add("rel","doc_novo").add("refresh_components","");

		btn_novo_concurso = new IGRPButton("Novo","recrutamento_rh","Gestao_de_parametrizacao","novo_concurso","_blank","success|fa-plus","","");
		btn_novo_concurso.propertie.add("type","specific").add("rel","novo_concurso").add("refresh_components","");

		btn_novo_tp_form = new IGRPButton("Novo","recrutamento_rh","Gestao_de_parametrizacao","novo_tp_form","_blank","success|fa-plus","","");
		btn_novo_tp_form.propertie.add("type","specific").add("rel","novo_tp_form").add("refresh_components","");

		btn_novo_idi = new IGRPButton("Novo","recrutamento_rh","Gestao_de_parametrizacao","novo_idi","_blank","success|fa-plus","","");
		btn_novo_idi.propertie.add("type","specific").add("rel","novo_idi").add("refresh_components","");

		btn_novo_prof = new IGRPButton("Novo","recrutamento_rh","Gestao_de_parametrizacao","novo_prof","_blank","success|fa-plus","","");
		btn_novo_prof.propertie.add("type","specific").add("rel","novo_prof").add("refresh_components","");

		btn_novo_carg = new IGRPButton("Novo","recrutamento_rh","Gestao_de_parametrizacao","novo_carg","_blank","success|fa-plus","","");
		btn_novo_carg.propertie.add("type","specific").add("rel","novo_carg").add("refresh_components","");

		btn_novo_entidades = new IGRPButton("Novo","recrutamento_rh","Gestao_de_parametrizacao","novo_entidades","_blank","success|fa-plus","","");
		btn_novo_entidades.propertie.add("type","specific").add("rel","novo_entidades").add("refresh_components","");

		btn_pesquisar = new IGRPButton("Pesquisar","recrutamento_rh","Gestao_de_parametrizacao","pesquisar","submit","info|fa-search","","");
		btn_pesquisar.propertie.add("type","form").add("rel","pesquisar").add("refresh_components","");

		btn_editar = new IGRPButton("Editar","recrutamento_rh","Gestao_de_parametrizacao","editar","_blank","warning|fa-pencil","","");
		btn_editar.propertie.add("type","specific").add("rel","editar").add("refresh_components","");

		btn_eliminar = new IGRPButton("Eliminar","recrutamento_rh","Gestao_de_parametrizacao","eliminar","alert_submit","danger|fa-times","","");
		btn_eliminar.propertie.add("type","specific").add("rel","eliminar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		gest_parametrizacao.addField(gest_parametrizacao_text);

		menu.addField(entidade);
		menu.addField(areas_formacao);
		menu.addField(area_de_emprego);
		menu.addField(tp_doc);
		menu.addField(tipo_de_concurso);
		menu.addField(tp_form);
		menu.addField(idioma);
		menu.addField(profissao);
		menu.addField(cargos);

		form_entidade.addField(f_nome);
		form_entidade.addField(f_codigo);
		form_entidade.addField(f_nif);









		lista_af.addField(area_de_formacao);
		lista_af.addField(f_estado);
		lista_af.addField(id_area_formacao);

		table_3.addField(emp_codigo);
		table_3.addField(emp_descricao);
		table_3.addField(estado_emp);
		table_3.addField(id_area_emprego);

		table_2.addField(doc_codigo);
		table_2.addField(doc_descricao);
		table_2.addField(doc_estado);
		table_2.addField(id_tp_doc);

		tp_concurso.addField(codigo);
		tp_concurso.addField(descricao_tpconcurso);
		tp_concurso.addField(estado_tc);
		tp_concurso.addField(id_tp_con);

		lista_forma.addField(codigo_tp_form);
		lista_forma.addField(descri_tp_form);
		lista_forma.addField(estado_tp_form);
		lista_forma.addField(id_tp_for);

		lista_idioma.addField(codigo_idioma);
		lista_idioma.addField(tp_idioma);
		lista_idioma.addField(estado_idioma);
		lista_idioma.addField(id_idioma);

		lista_profissao.addField(codigo_prof);
		lista_profissao.addField(descricao_profissao);
		lista_profissao.addField(estado_prof);
		lista_profissao.addField(id_profissao);

		list_cargo.addField(cargo);
		list_cargo.addField(estado_cargo);
		list_cargo.addField(id_cargo);


		lista_entidade.addField(codigo_entidade);
		lista_entidade.addField(nif);
		lista_entidade.addField(nome);
		lista_entidade.addField(estado);
		lista_entidade.addField(id_entidade);

		novo.addButton(btn_novo);
		novo_area_emp.addButton(btn_novo_emp);
		novo_doc.addButton(btn_doc_novo);
		novo_concurso.addButton(btn_novo_concurso);
		novo_tp_form.addButton(btn_novo_tp_form);
		novo_idioma.addButton(btn_novo_idi);
		novo_profissao.addButton(btn_novo_prof);
		novo_cargo.addButton(btn_novo_carg);
		novo_entidade.addButton(btn_novo_entidades);
		form_entidade.addButton(btn_pesquisar);
		lista_af.addButton(btn_editar);
		lista_af.addButton(btn_eliminar);
		table_3.addButton(btn_editar);
		table_3.addButton(btn_eliminar);
		table_2.addButton(btn_editar);
		table_2.addButton(btn_eliminar);
		tp_concurso.addButton(btn_editar);
		tp_concurso.addButton(btn_eliminar);
		lista_forma.addButton(btn_editar);
		lista_forma.addButton(btn_editar);
		lista_idioma.addButton(btn_editar);
		lista_idioma.addButton(btn_eliminar);
		lista_profissao.addButton(btn_editar);
		lista_profissao.addButton(btn_eliminar);
		list_cargo.addButton(btn_editar);
		list_cargo.addButton(btn_eliminar);
		lista_entidade.addButton(btn_editar);
		lista_entidade.addButton(btn_eliminar);
		this.addToPage(gest_parametrizacao);
		this.addToPage(menu);
		this.addToPage(form_entidade);
		this.addToPage(lista_af);
		this.addToPage(table_3);
		this.addToPage(table_2);
		this.addToPage(tp_concurso);
		this.addToPage(lista_forma);
		this.addToPage(lista_idioma);
		this.addToPage(lista_profissao);
		this.addToPage(list_cargo);
		this.addToPage(lista_entidade);
		this.addToPage(novo);
		this.addToPage(novo_area_emp);
		this.addToPage(novo_doc);
		this.addToPage(novo_concurso);
		this.addToPage(novo_tp_form);
		this.addToPage(novo_idioma);
		this.addToPage(novo_profissao);
		this.addToPage(novo_cargo);
		this.addToPage(novo_entidade);
	}
		
	@Override
	public void setModel(Model model) {
		
		entidade.setValue(model);
		areas_formacao.setValue(model);
		area_de_emprego.setValue(model);
		tp_doc.setValue(model);
		tipo_de_concurso.setValue(model);
		tp_form.setValue(model);
		idioma.setValue(model);
		profissao.setValue(model);
		cargos.setValue(model);
		f_nome.setValue(model);
		f_codigo.setValue(model);
		f_nif.setValue(model);
		area_de_formacao.setValue(model);
		f_estado.setValue(model);
		id_area_formacao.setValue(model);
		emp_codigo.setValue(model);
		emp_descricao.setValue(model);
		estado_emp.setValue(model);
		id_area_emprego.setValue(model);
		doc_codigo.setValue(model);
		doc_descricao.setValue(model);
		doc_estado.setValue(model);
		id_tp_doc.setValue(model);
		codigo.setValue(model);
		descricao_tpconcurso.setValue(model);
		estado_tc.setValue(model);
		id_tp_con.setValue(model);
		codigo_tp_form.setValue(model);
		descri_tp_form.setValue(model);
		estado_tp_form.setValue(model);
		id_tp_for.setValue(model);
		codigo_idioma.setValue(model);
		tp_idioma.setValue(model);
		estado_idioma.setValue(model);
		id_idioma.setValue(model);
		codigo_prof.setValue(model);
		descricao_profissao.setValue(model);
		estado_prof.setValue(model);
		id_profissao.setValue(model);
		cargo.setValue(model);
		estado_cargo.setValue(model);
		id_cargo.setValue(model);
		codigo_entidade.setValue(model);
		nif.setValue(model);
		nome.setValue(model);
		estado.setValue(model);
		id_entidade.setValue(model);	

		lista_af.loadModel(((Gestao_de_parametrizacao) model).getLista_af());
		table_3.loadModel(((Gestao_de_parametrizacao) model).getTable_3());
		table_2.loadModel(((Gestao_de_parametrizacao) model).getTable_2());
		tp_concurso.loadModel(((Gestao_de_parametrizacao) model).getTp_concurso());
		lista_forma.loadModel(((Gestao_de_parametrizacao) model).getLista_forma());
		lista_idioma.loadModel(((Gestao_de_parametrizacao) model).getLista_idioma());
		lista_profissao.loadModel(((Gestao_de_parametrizacao) model).getLista_profissao());
		list_cargo.loadModel(((Gestao_de_parametrizacao) model).getList_cargo());
		lista_entidade.loadModel(((Gestao_de_parametrizacao) model).getLista_entidade());
		}
}
