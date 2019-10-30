package nosi.webapps.recrutamento_rh.pages.ins__alt_func;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Ins__alt_funcView extends View {

	public Field ins__alt_func_text;
	public Field codigo;
	public Field descricao;
	public Field estado;
	public Field id_funcao;
	public IGRPSectionHeader ins__alt_func;
	public IGRPForm form_func;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar;

	public Ins__alt_funcView(){

		this.setPageTitle("Inserir / Alterar Função");
			
		ins__alt_func = new IGRPSectionHeader("ins__alt_func","");

		form_func = new IGRPForm("form_func","");

		ins__alt_func_text = new TextField(model,"ins__alt_func_text");
		ins__alt_func_text.setLabel(gt(""));
		ins__alt_func_text.setValue(gt("<p>Inserir / Alterar Fun&ccedil;&atilde;o</p>"));
		ins__alt_func_text.propertie().add("type","text").add("name","p_ins__alt_func_text").add("maxlength","4000");
		
		codigo = new TextField(model,"codigo");
		codigo.setLabel(gt("Código"));
		codigo.propertie().add("name","p_codigo").add("type","text").add("maxlength","20").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		descricao = new TextField(model,"descricao");
		descricao.setLabel(gt("Descrição"));
		descricao.propertie().add("name","p_descricao").add("type","text").add("maxlength","100").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		estado = new ListField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","select").add("multiple","false").add("tags","false").add("domain","d_estado « recrutamento_rh").add("maxlength","10").add("required","false").add("disabled","false").add("java-type","");
		
		id_funcao = new HiddenField(model,"id_funcao");
		id_funcao.setLabel(gt(""));
		id_funcao.propertie().add("name","p_id_funcao").add("type","hidden").add("maxlength","20").add("java-type","").add("tag","id_funcao");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_gravar = new IGRPButton("Gravar","recrutamento_rh","Ins__alt_func","gravar","_blank","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		ins__alt_func.addField(ins__alt_func_text);


		form_func.addField(codigo);
		form_func.addField(descricao);
		form_func.addField(estado);
		form_func.addField(id_funcao);

		toolsbar_1.addButton(btn_gravar);
		this.addToPage(ins__alt_func);
		this.addToPage(form_func);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		codigo.setValue(model);
		descricao.setValue(model);
		estado.setValue(model);
		id_funcao.setValue(model);	

		}
}
