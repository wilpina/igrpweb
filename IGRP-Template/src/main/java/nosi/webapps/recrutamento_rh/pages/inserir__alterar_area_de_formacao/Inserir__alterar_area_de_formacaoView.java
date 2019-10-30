package nosi.webapps.recrutamento_rh.pages.inserir__alterar_area_de_formacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Inserir__alterar_area_de_formacaoView extends View {

	public Field ins_alt_area_formacao_text;
	public Field codigo_;
	public Field descicao;
	public Field estado;
	public Field id_area_formacao;
	public IGRPSectionHeader ins_alt_area_formacao;
	public IGRPForm form_1;

	public IGRPToolsBar gravar;
	public IGRPButton btn_gravar;

	public Inserir__alterar_area_de_formacaoView(){

		this.setPageTitle("Inserir / Alterar Área de formação");
			
		ins_alt_area_formacao = new IGRPSectionHeader("ins_alt_area_formacao","");

		form_1 = new IGRPForm("form_1","");

		ins_alt_area_formacao_text = new TextField(model,"ins_alt_area_formacao_text");
		ins_alt_area_formacao_text.setLabel(gt(""));
		ins_alt_area_formacao_text.setValue(gt("<p>Inserir / Alterar &Aacute;rea de forma&ccedil;&atilde;o</p>"));
		ins_alt_area_formacao_text.propertie().add("type","text").add("name","p_ins_alt_area_formacao_text").add("maxlength","1000");
		
		codigo_ = new TextField(model,"codigo_");
		codigo_.setLabel(gt("Código "));
		codigo_.propertie().add("name","p_codigo_").add("type","text").add("maxlength","10").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		descicao = new TextField(model,"descicao");
		descicao.setLabel(gt("Descrição"));
		descicao.propertie().add("name","p_descicao").add("type","text").add("maxlength","100").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		estado = new ListField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","select").add("multiple","false").add("tags","false").add("domain","srs_estado « recrutamento_rh").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		id_area_formacao = new HiddenField(model,"id_area_formacao");
		id_area_formacao.setLabel(gt(""));
		id_area_formacao.propertie().add("name","p_id_area_formacao").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id_area_formacao");
		

		gravar = new IGRPToolsBar("gravar");

		btn_gravar = new IGRPButton("Gravar","recrutamento_rh","Inserir__alterar_area_de_formacao","gravar","submit","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		ins_alt_area_formacao.addField(ins_alt_area_formacao_text);


		form_1.addField(codigo_);
		form_1.addField(descicao);
		form_1.addField(estado);
		form_1.addField(id_area_formacao);

		gravar.addButton(btn_gravar);
		this.addToPage(ins_alt_area_formacao);
		this.addToPage(form_1);
		this.addToPage(gravar);
	}
		
	@Override
	public void setModel(Model model) {
		
		codigo_.setValue(model);
		descicao.setValue(model);
		estado.setValue(model);
		id_area_formacao.setValue(model);	

		}
}
