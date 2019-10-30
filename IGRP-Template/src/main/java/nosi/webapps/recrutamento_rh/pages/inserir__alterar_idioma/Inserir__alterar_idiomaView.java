package nosi.webapps.recrutamento_rh.pages.inserir__alterar_idioma;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Inserir__alterar_idiomaView extends View {

	public Field idioma_text;
	public Field codigo;
	public Field tp_idioma;
	public Field estado;
	public Field id_idioma;
	public IGRPSectionHeader idioma;
	public IGRPForm form_1;

	public IGRPToolsBar gravar;
	public IGRPButton btn_gravar;

	public Inserir__alterar_idiomaView(){

		this.setPageTitle("Inserir / Alterar Idioma");
			
		idioma = new IGRPSectionHeader("idioma","");

		form_1 = new IGRPForm("form_1","");

		idioma_text = new TextField(model,"idioma_text");
		idioma_text.setLabel(gt(""));
		idioma_text.setValue(gt("<p>Inserir / Alterar Idioma</p>"));
		idioma_text.propertie().add("type","text").add("name","p_idioma_text").add("maxlength","1000");
		
		codigo = new TextField(model,"codigo");
		codigo.setLabel(gt("Código"));
		codigo.propertie().add("name","p_codigo").add("type","text").add("maxlength","15").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		tp_idioma = new TextField(model,"tp_idioma");
		tp_idioma.setLabel(gt("Tipo de Idioma"));
		tp_idioma.propertie().add("name","p_tp_idioma").add("type","text").add("maxlength","20").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		estado = new ListField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","select").add("multiple","false").add("tags","false").add("domain","srs_estado « recrutamento_rh").add("maxlength","10").add("required","false").add("disabled","false").add("java-type","");
		
		id_idioma = new HiddenField(model,"id_idioma");
		id_idioma.setLabel(gt(""));
		id_idioma.propertie().add("name","p_id_idioma").add("type","hidden").add("maxlength","10").add("java-type","").add("tag","id_idioma");
		

		gravar = new IGRPToolsBar("gravar");

		btn_gravar = new IGRPButton("Gravar","recrutamento_rh","Inserir__alterar_idioma","gravar","submit","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		idioma.addField(idioma_text);


		form_1.addField(codigo);
		form_1.addField(tp_idioma);
		form_1.addField(estado);
		form_1.addField(id_idioma);

		gravar.addButton(btn_gravar);
		this.addToPage(idioma);
		this.addToPage(form_1);
		this.addToPage(gravar);
	}
		
	@Override
	public void setModel(Model model) {
		
		codigo.setValue(model);
		tp_idioma.setValue(model);
		estado.setValue(model);
		id_idioma.setValue(model);	

		}
}
