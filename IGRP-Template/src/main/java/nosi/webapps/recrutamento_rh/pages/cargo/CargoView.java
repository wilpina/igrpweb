package nosi.webapps.recrutamento_rh.pages.cargo;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class CargoView extends View {

	public Field ins_alt_cargo_text;
	public Field codigo;
	public Field descricao;
	public Field estado;
	public Field id_cargo;
	public IGRPSectionHeader ins_alt_cargo;
	public IGRPForm form_cargo;

	public IGRPToolsBar gravar;
	public IGRPButton btn_gravar;

	public CargoView(){

		this.setPageTitle("Inserir / Alterar Cargo");
			
		ins_alt_cargo = new IGRPSectionHeader("ins_alt_cargo","");

		form_cargo = new IGRPForm("form_cargo","");

		ins_alt_cargo_text = new TextField(model,"ins_alt_cargo_text");
		ins_alt_cargo_text.setLabel(gt(""));
		ins_alt_cargo_text.setValue(gt("<p>Inserir / Alterar Cargo</p>"));
		ins_alt_cargo_text.propertie().add("type","text").add("name","p_ins_alt_cargo_text").add("maxlength","1000");
		
		codigo = new TextField(model,"codigo");
		codigo.setLabel(gt("Código"));
		codigo.propertie().add("name","p_codigo").add("type","text").add("maxlength","20").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		descricao = new TextField(model,"descricao");
		descricao.setLabel(gt("Descrição"));
		descricao.propertie().add("name","p_descricao").add("type","text").add("maxlength","50").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		estado = new ListField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","select").add("multiple","false").add("tags","false").add("domain","srs_estado « recrutamento_rh").add("maxlength","20").add("required","false").add("disabled","false").add("java-type","");
		
		id_cargo = new HiddenField(model,"id_cargo");
		id_cargo.setLabel(gt(""));
		id_cargo.propertie().add("name","p_id_cargo").add("type","hidden").add("maxlength","20").add("java-type","").add("tag","id_cargo");
		

		gravar = new IGRPToolsBar("gravar");

		btn_gravar = new IGRPButton("Gravar","recrutamento_rh","Cargo","gravar","submit","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		ins_alt_cargo.addField(ins_alt_cargo_text);


		form_cargo.addField(codigo);
		form_cargo.addField(descricao);
		form_cargo.addField(estado);
		form_cargo.addField(id_cargo);

		gravar.addButton(btn_gravar);
		this.addToPage(ins_alt_cargo);
		this.addToPage(form_cargo);
		this.addToPage(gravar);
	}
		
	@Override
	public void setModel(Model model) {
		
		codigo.setValue(model);
		descricao.setValue(model);
		estado.setValue(model);
		id_cargo.setValue(model);	

		}
}
