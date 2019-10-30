package nosi.webapps.recrutamento_rh.pages.ins_alt_doc;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Ins_alt_docView extends View {

	public Field ins_alt_doc_text;
	public Field codigo;
	public Field descricao;
	public Field estado;
	public Field id_tp_doc;
	public IGRPSectionHeader ins_alt_doc;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar;

	public Ins_alt_docView(){

		this.setPageTitle("Inserir / Alterar Documento");
			
		ins_alt_doc = new IGRPSectionHeader("ins_alt_doc","");

		form_1 = new IGRPForm("form_1","");

		ins_alt_doc_text = new TextField(model,"ins_alt_doc_text");
		ins_alt_doc_text.setLabel(gt(""));
		ins_alt_doc_text.setValue(gt("<p>Inserir / Alterar&nbsp; Documento</p>"));
		ins_alt_doc_text.propertie().add("type","text").add("name","p_ins_alt_doc_text").add("maxlength","4000");
		
		codigo = new TextField(model,"codigo");
		codigo.setLabel(gt("Código"));
		codigo.propertie().add("name","p_codigo").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		descricao = new TextField(model,"descricao");
		descricao.setLabel(gt("Descrição"));
		descricao.propertie().add("name","p_descricao").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		estado = new ListField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","select").add("multiple","false").add("tags","false").add("domain","srs_estado « recrutamento_rh").add("maxlength","10").add("required","false").add("disabled","false").add("java-type","");
		
		id_tp_doc = new HiddenField(model,"id_tp_doc");
		id_tp_doc.setLabel(gt(""));
		id_tp_doc.propertie().add("name","p_id_tp_doc").add("type","hidden").add("maxlength","20").add("java-type","int").add("tag","id_tp_doc");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_gravar = new IGRPButton("Gravar","recrutamento_rh","Ins_alt_doc","gravar","submit","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		ins_alt_doc.addField(ins_alt_doc_text);


		form_1.addField(codigo);
		form_1.addField(descricao);
		form_1.addField(estado);
		form_1.addField(id_tp_doc);

		toolsbar_1.addButton(btn_gravar);
		this.addToPage(ins_alt_doc);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		codigo.setValue(model);
		descricao.setValue(model);
		estado.setValue(model);
		id_tp_doc.setValue(model);	

		}
}
