package nosi.webapps.recrutamento_rh.pages.ins__alt_profissao;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Ins__alt_profissaoView extends View {

	public Field ins__alt_profissao_text;
	public Field codigo;
	public Field descricao;
	public Field estado;
	public Field id_profissao;
	public IGRPSectionHeader ins__alt_profissao;
	public IGRPForm form_1;

	public IGRPToolsBar gravar_formacao;
	public IGRPButton btn_gravar;

	public Ins__alt_profissaoView(){

		this.setPageTitle("Inserir / Aletrar Profissão");
			
		ins__alt_profissao = new IGRPSectionHeader("ins__alt_profissao","");

		form_1 = new IGRPForm("form_1","");

		ins__alt_profissao_text = new TextField(model,"ins__alt_profissao_text");
		ins__alt_profissao_text.setLabel(gt(""));
		ins__alt_profissao_text.setValue(gt("<p>Inserir / Alterar Profiss&atilde;o</p>"));
		ins__alt_profissao_text.propertie().add("type","text").add("name","p_ins__alt_profissao_text").add("maxlength","4000");
		
		codigo = new TextField(model,"codigo");
		codigo.setLabel(gt("Código"));
		codigo.propertie().add("name","p_codigo").add("type","text").add("maxlength","10").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		descricao = new TextField(model,"descricao");
		descricao.setLabel(gt("Descrição"));
		descricao.propertie().add("name","p_descricao").add("type","text").add("maxlength","20").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		estado = new ListField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","select").add("multiple","false").add("tags","false").add("domain","srs_estado « recrutamento_rh").add("maxlength","10").add("required","false").add("disabled","false").add("java-type","");
		
		id_profissao = new HiddenField(model,"id_profissao");
		id_profissao.setLabel(gt(""));
		id_profissao.propertie().add("name","p_id_profissao").add("type","hidden").add("maxlength","10").add("java-type","").add("tag","id_profissao");
		

		gravar_formacao = new IGRPToolsBar("gravar_formacao");

		btn_gravar = new IGRPButton("Gravar","recrutamento_rh","Ins__alt_profissao","gravar","submit","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		ins__alt_profissao.addField(ins__alt_profissao_text);


		form_1.addField(codigo);
		form_1.addField(descricao);
		form_1.addField(estado);
		form_1.addField(id_profissao);

		gravar_formacao.addButton(btn_gravar);
		this.addToPage(ins__alt_profissao);
		this.addToPage(form_1);
		this.addToPage(gravar_formacao);
	}
		
	@Override
	public void setModel(Model model) {
		
		codigo.setValue(model);
		descricao.setValue(model);
		estado.setValue(model);
		id_profissao.setValue(model);	

		}
}
