package nosi.webapps.recrutamento_rh.pages.ins_alt_mt_selecao;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Ins_alt_mt_selecaoView extends View {

	public Field ins_alt_mt_selecao_text;
	public Field codigo;
	public Field descricao;
	public Field estado;
	public Field id_met_sel;
	public IGRPSectionHeader ins_alt_mt_selecao;
	public IGRPForm form_tp_vinc;

	public IGRPToolsBar mt_selecao;
	public IGRPButton btn_gravar;

	public Ins_alt_mt_selecaoView(){

		this.setPageTitle("Inserir_Alterar Métodos de seleção");
			
		ins_alt_mt_selecao = new IGRPSectionHeader("ins_alt_mt_selecao","");

		form_tp_vinc = new IGRPForm("form_tp_vinc","");

		ins_alt_mt_selecao_text = new TextField(model,"ins_alt_mt_selecao_text");
		ins_alt_mt_selecao_text.setLabel(gt(""));
		ins_alt_mt_selecao_text.setValue(gt("<p>Inserir Alterar M&eacute;todos de Sele&ccedil;&atilde;o</p>"));
		ins_alt_mt_selecao_text.propertie().add("type","text").add("name","p_ins_alt_mt_selecao_text").add("maxlength","4000");
		
		codigo = new TextField(model,"codigo");
		codigo.setLabel(gt("Código"));
		codigo.propertie().add("name","p_codigo").add("type","text").add("maxlength","20").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		descricao = new TextField(model,"descricao");
		descricao.setLabel(gt("Descrição"));
		descricao.propertie().add("name","p_descricao").add("type","text").add("maxlength","50").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		estado = new ListField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","select").add("multiple","false").add("tags","false").add("domain","d_estado « recrutamento_rh").add("maxlength","10").add("required","false").add("disabled","false").add("java-type","");
		
		id_met_sel = new HiddenField(model,"id_met_sel");
		id_met_sel.setLabel(gt(""));
		id_met_sel.propertie().add("name","p_id_met_sel").add("type","hidden").add("maxlength","10").add("java-type","").add("tag","id_met_sel");
		

		mt_selecao = new IGRPToolsBar("mt_selecao");

		btn_gravar = new IGRPButton("Gravar","recrutamento_rh","Ins_alt_mt_selecao","gravar","submit","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		ins_alt_mt_selecao.addField(ins_alt_mt_selecao_text);


		form_tp_vinc.addField(codigo);
		form_tp_vinc.addField(descricao);
		form_tp_vinc.addField(estado);
		form_tp_vinc.addField(id_met_sel);

		mt_selecao.addButton(btn_gravar);
		this.addToPage(ins_alt_mt_selecao);
		this.addToPage(form_tp_vinc);
		this.addToPage(mt_selecao);
	}
		
	@Override
	public void setModel(Model model) {
		
		codigo.setValue(model);
		descricao.setValue(model);
		estado.setValue(model);
		id_met_sel.setValue(model);	

		}
}
