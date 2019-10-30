package nosi.webapps.recrutamento_rh.pages.ins__alt_area_emp;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Ins__alt_area_empView extends View {

	public Field ins_alt_area_emp_text;
	public Field codigo;
	public Field descricao;
	public Field estado;
	public Field id_area_emp;
	public IGRPSectionHeader ins_alt_area_emp;
	public IGRPForm form_area_emp;

	public IGRPToolsBar gravar;
	public IGRPButton btn_gravar;

	public Ins__alt_area_empView(){

		this.setPageTitle("inserir / Alterar Área de Emprego");
			
		ins_alt_area_emp = new IGRPSectionHeader("ins_alt_area_emp","");

		form_area_emp = new IGRPForm("form_area_emp","");

		ins_alt_area_emp_text = new TextField(model,"ins_alt_area_emp_text");
		ins_alt_area_emp_text.setLabel(gt(""));
		ins_alt_area_emp_text.setValue(gt("<p>Inserir / Alterar &Aacute;rea de Emprego</p>"));
		ins_alt_area_emp_text.propertie().add("type","text").add("name","p_ins_alt_area_emp_text").add("maxlength","4000");
		
		codigo = new TextField(model,"codigo");
		codigo.setLabel(gt("Código"));
		codigo.propertie().add("name","p_codigo").add("type","text").add("maxlength","10").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		descricao = new TextField(model,"descricao");
		descricao.setLabel(gt("Descrição"));
		descricao.propertie().add("name","p_descricao").add("type","text").add("maxlength","20").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		estado = new ListField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","select").add("multiple","false").add("tags","false").add("domain","srs_estado « recrutamento_rh").add("maxlength","10").add("required","false").add("disabled","false").add("java-type","");
		
		id_area_emp = new HiddenField(model,"id_area_emp");
		id_area_emp.setLabel(gt(""));
		id_area_emp.propertie().add("name","p_id_area_emp").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id_area_emp");
		

		gravar = new IGRPToolsBar("gravar");

		btn_gravar = new IGRPButton("Gravar","recrutamento_rh","Ins__alt_area_emp","gravar","submit","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		ins_alt_area_emp.addField(ins_alt_area_emp_text);


		form_area_emp.addField(codigo);
		form_area_emp.addField(descricao);
		form_area_emp.addField(estado);
		form_area_emp.addField(id_area_emp);

		gravar.addButton(btn_gravar);
		this.addToPage(ins_alt_area_emp);
		this.addToPage(form_area_emp);
		this.addToPage(gravar);
	}
		
	@Override
	public void setModel(Model model) {
		
		codigo.setValue(model);
		descricao.setValue(model);
		estado.setValue(model);
		id_area_emp.setValue(model);	

		}
}
