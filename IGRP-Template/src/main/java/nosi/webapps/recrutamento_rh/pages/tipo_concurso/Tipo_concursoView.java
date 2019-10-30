package nosi.webapps.recrutamento_rh.pages.tipo_concurso;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Tipo_concursoView extends View {

	public Field ins_alt_tp_concurso_text;
	public Field codigo;
	public Field descricao;
	public Field estado;
	public Field id_tp_con;
	public IGRPSectionHeader ins_alt_tp_concurso;
	public IGRPForm form_tpconcurso;

	public IGRPToolsBar gravar;
	public IGRPButton btn_gravar;

	public Tipo_concursoView(){

		this.setPageTitle("Inserir / Aletrar Tipos de concurso");
			
		ins_alt_tp_concurso = new IGRPSectionHeader("ins_alt_tp_concurso","");

		form_tpconcurso = new IGRPForm("form_tpconcurso","");

		ins_alt_tp_concurso_text = new TextField(model,"ins_alt_tp_concurso_text");
		ins_alt_tp_concurso_text.setLabel(gt(""));
		ins_alt_tp_concurso_text.setValue(gt("<p>Inserir / Alterar Tipo&nbsp;de Concurso</p>"));
		ins_alt_tp_concurso_text.propertie().add("type","text").add("name","p_ins_alt_tp_concurso_text").add("maxlength","4000");
		
		codigo = new TextField(model,"codigo");
		codigo.setLabel(gt("Código"));
		codigo.propertie().add("name","p_codigo").add("type","text").add("maxlength","10").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		descricao = new TextField(model,"descricao");
		descricao.setLabel(gt("Descrição"));
		descricao.propertie().add("name","p_descricao").add("type","text").add("maxlength","50").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		estado = new ListField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","select").add("multiple","false").add("tags","false").add("domain","srs_estado « recrutamento_rh").add("maxlength","10").add("required","false").add("disabled","false").add("java-type","");
		
		id_tp_con = new HiddenField(model,"id_tp_con");
		id_tp_con.setLabel(gt(""));
		id_tp_con.propertie().add("name","p_id_tp_con").add("type","hidden").add("maxlength","10").add("java-type","").add("tag","id_tp_con");
		

		gravar = new IGRPToolsBar("gravar");

		btn_gravar = new IGRPButton("Gravar","recrutamento_rh","Tipo_concurso","gravar","submit","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("flg_transaction","true").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		ins_alt_tp_concurso.addField(ins_alt_tp_concurso_text);


		form_tpconcurso.addField(codigo);
		form_tpconcurso.addField(descricao);
		form_tpconcurso.addField(estado);
		form_tpconcurso.addField(id_tp_con);

		gravar.addButton(btn_gravar);
		this.addToPage(ins_alt_tp_concurso);
		this.addToPage(form_tpconcurso);
		this.addToPage(gravar);
	}
		
	@Override
	public void setModel(Model model) {
		
		codigo.setValue(model);
		descricao.setValue(model);
		estado.setValue(model);
		id_tp_con.setValue(model);	

		}
}
