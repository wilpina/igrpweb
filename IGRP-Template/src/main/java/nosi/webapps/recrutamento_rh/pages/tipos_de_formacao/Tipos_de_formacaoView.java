package nosi.webapps.recrutamento_rh.pages.tipos_de_formacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Tipos_de_formacaoView extends View {

	public Field ins_alt_tp_forma_text;
	public Field codigo;
	public Field descricao;
	public Field estado;
	public Field id_tp_for;
	public IGRPSectionHeader ins_alt_tp_forma;
	public IGRPForm form_1;

	public IGRPToolsBar gravar;
	public IGRPButton btn_gravar;

	public Tipos_de_formacaoView(){

		this.setPageTitle("Inserir / Alterar Tipos de formação");
			
		ins_alt_tp_forma = new IGRPSectionHeader("ins_alt_tp_forma","");

		form_1 = new IGRPForm("form_1","");

		ins_alt_tp_forma_text = new TextField(model,"ins_alt_tp_forma_text");
		ins_alt_tp_forma_text.setLabel(gt(""));
		ins_alt_tp_forma_text.setValue(gt("<p>Inserir / Alterar Tipo&nbsp;de Forma&ccedil;&atilde;o</p>"));
		ins_alt_tp_forma_text.propertie().add("type","text").add("name","p_ins_alt_tp_forma_text").add("maxlength","1000");
		
		codigo = new TextField(model,"codigo");
		codigo.setLabel(gt("Código"));
		codigo.propertie().add("name","p_codigo").add("type","text").add("maxlength","20").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		descricao = new TextField(model,"descricao");
		descricao.setLabel(gt("Descrição"));
		descricao.propertie().add("name","p_descricao").add("type","text").add("maxlength","100").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		estado = new ListField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","select").add("multiple","false").add("tags","false").add("domain","srs_estado « recrutamento_rh").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		id_tp_for = new HiddenField(model,"id_tp_for");
		id_tp_for.setLabel(gt(""));
		id_tp_for.propertie().add("name","p_id_tp_for").add("type","hidden").add("maxlength","250").add("java-type","int").add("tag","id_tp_for");
		

		gravar = new IGRPToolsBar("gravar");

		btn_gravar = new IGRPButton("Gravar","recrutamento_rh","Tipos_de_formacao","gravar","submit","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		ins_alt_tp_forma.addField(ins_alt_tp_forma_text);


		form_1.addField(codigo);
		form_1.addField(descricao);
		form_1.addField(estado);
		form_1.addField(id_tp_for);

		gravar.addButton(btn_gravar);
		this.addToPage(ins_alt_tp_forma);
		this.addToPage(form_1);
		this.addToPage(gravar);
	}
		
	@Override
	public void setModel(Model model) {
		
		codigo.setValue(model);
		descricao.setValue(model);
		estado.setValue(model);
		id_tp_for.setValue(model);	

		}
}
