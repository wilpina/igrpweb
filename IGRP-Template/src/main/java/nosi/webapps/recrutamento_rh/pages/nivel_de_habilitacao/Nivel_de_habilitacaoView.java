package nosi.webapps.recrutamento_rh.pages.nivel_de_habilitacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Nivel_de_habilitacaoView extends View {

	public Field ins_alt__nivel_habilitacao_text;
	public Field descricao;
	public Field n_nivel;
	public Field anoclassefase;
	public Field estado;
	public IGRPSectionHeader ins_alt__nivel_habilitacao;
	public IGRPForm form_1;

	public IGRPToolsBar gravar;
	public IGRPButton btn_gravar;

	public Nivel_de_habilitacaoView(){

		this.setPageTitle("Inserir / Alterar Nível de Habilitação");
			
		ins_alt__nivel_habilitacao = new IGRPSectionHeader("ins_alt__nivel_habilitacao","");

		form_1 = new IGRPForm("form_1","");

		ins_alt__nivel_habilitacao_text = new TextField(model,"ins_alt__nivel_habilitacao_text");
		ins_alt__nivel_habilitacao_text.setLabel(gt(""));
		ins_alt__nivel_habilitacao_text.setValue(gt("<p>Inserir / Alterar N&iacute;vel de Habilita&ccedil;&atilde;o</p>"));
		ins_alt__nivel_habilitacao_text.propertie().add("type","text").add("name","p_ins_alt__nivel_habilitacao_text").add("maxlength","4000");
		
		descricao = new TextField(model,"descricao");
		descricao.setLabel(gt("Descrição"));
		descricao.propertie().add("name","p_descricao").add("type","text").add("maxlength","100").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		n_nivel = new NumberField(model,"n_nivel");
		n_nivel.setLabel(gt("Nº Nível"));
		n_nivel.propertie().add("name","p_n_nivel").add("type","number").add("min","").add("max","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","");
		
		anoclassefase = new NumberField(model,"anoclassefase");
		anoclassefase.setLabel(gt("Ano/Classe/Fase"));
		anoclassefase.propertie().add("name","p_anoclassefase").add("type","number").add("min","").add("max","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","");
		
		estado = new ListField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		

		gravar = new IGRPToolsBar("gravar");

		btn_gravar = new IGRPButton("Gravar","recrutamento_rh","Nivel_de_habilitacao","gravar","submit","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		ins_alt__nivel_habilitacao.addField(ins_alt__nivel_habilitacao_text);


		form_1.addField(descricao);
		form_1.addField(n_nivel);
		form_1.addField(anoclassefase);
		form_1.addField(estado);

		gravar.addButton(btn_gravar);
		this.addToPage(ins_alt__nivel_habilitacao);
		this.addToPage(form_1);
		this.addToPage(gravar);
	}
		
	@Override
	public void setModel(Model model) {
		
		descricao.setValue(model);
		n_nivel.setValue(model);
		anoclassefase.setValue(model);
		estado.setValue(model);	

		}
}
