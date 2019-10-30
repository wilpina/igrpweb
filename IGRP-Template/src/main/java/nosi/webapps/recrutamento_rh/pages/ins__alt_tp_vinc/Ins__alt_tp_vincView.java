package nosi.webapps.recrutamento_rh.pages.ins__alt_tp_vinc;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Ins__alt_tp_vincView extends View {

	public Field ins__alt_tp_vinc_text;
	public Field codigo;
	public Field descricao;
	public Field estado;
	public Field id_tp_vinc;
	public IGRPSectionHeader ins__alt_tp_vinc;
	public IGRPForm form_tp_vinc;

	public IGRPToolsBar gravar_tp_vinc;
	public IGRPButton btn_gravar;

	public Ins__alt_tp_vincView(){

		this.setPageTitle("Inserir / Alterar Tipo de Vinculo");
			
		ins__alt_tp_vinc = new IGRPSectionHeader("ins__alt_tp_vinc","");

		form_tp_vinc = new IGRPForm("form_tp_vinc","");

		ins__alt_tp_vinc_text = new TextField(model,"ins__alt_tp_vinc_text");
		ins__alt_tp_vinc_text.setLabel(gt(""));
		ins__alt_tp_vinc_text.setValue(gt("<p>Inserir / Atrear Tipo de V&iacute;nculo</p>"));
		ins__alt_tp_vinc_text.propertie().add("type","text").add("name","p_ins__alt_tp_vinc_text").add("maxlength","4000");
		
		codigo = new TextField(model,"codigo");
		codigo.setLabel(gt("Código"));
		codigo.propertie().add("name","p_codigo").add("type","text").add("maxlength","20").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		descricao = new TextField(model,"descricao");
		descricao.setLabel(gt("Descrição"));
		descricao.propertie().add("name","p_descricao").add("type","text").add("maxlength","50").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		estado = new ListField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","select").add("multiple","false").add("tags","false").add("domain","d_estado « recrutamento_rh").add("maxlength","10").add("required","false").add("disabled","false").add("java-type","");
		
		id_tp_vinc = new HiddenField(model,"id_tp_vinc");
		id_tp_vinc.setLabel(gt(""));
		id_tp_vinc.propertie().add("name","p_id_tp_vinc").add("type","hidden").add("maxlength","20").add("java-type","").add("tag","id_tp_vinc");
		

		gravar_tp_vinc = new IGRPToolsBar("gravar_tp_vinc");

		btn_gravar = new IGRPButton("Gravar","recrutamento_rh","Ins__alt_tp_vinc","gravar","_blank","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		ins__alt_tp_vinc.addField(ins__alt_tp_vinc_text);


		form_tp_vinc.addField(codigo);
		form_tp_vinc.addField(descricao);
		form_tp_vinc.addField(estado);
		form_tp_vinc.addField(id_tp_vinc);

		gravar_tp_vinc.addButton(btn_gravar);
		this.addToPage(ins__alt_tp_vinc);
		this.addToPage(form_tp_vinc);
		this.addToPage(gravar_tp_vinc);
	}
		
	@Override
	public void setModel(Model model) {
		
		codigo.setValue(model);
		descricao.setValue(model);
		estado.setValue(model);
		id_tp_vinc.setValue(model);	

		}
}
