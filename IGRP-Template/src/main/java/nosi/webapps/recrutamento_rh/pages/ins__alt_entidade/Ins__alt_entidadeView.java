package nosi.webapps.recrutamento_rh.pages.ins__alt_entidade;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Ins__alt_entidadeView extends View {

	public Field ins_alt_entidade_text;
	public Field nrc;
	public Field nif;
	public Field codigo;
	public Field nome;
	public Field id_entidade;
	public IGRPSectionHeader ins_alt_entidade;
	public IGRPForm form_entidade;

	public IGRPToolsBar gravar;
	public IGRPButton btn_gravar;

	public Ins__alt_entidadeView(){

		this.setPageTitle("Inserir / Alterar Entidade");
			
		ins_alt_entidade = new IGRPSectionHeader("ins_alt_entidade","");

		form_entidade = new IGRPForm("form_entidade","");

		ins_alt_entidade_text = new TextField(model,"ins_alt_entidade_text");
		ins_alt_entidade_text.setLabel(gt(""));
		ins_alt_entidade_text.setValue(gt("<p>Inserir / Alterar Entidade</p>"));
		ins_alt_entidade_text.propertie().add("type","text").add("name","p_ins_alt_entidade_text").add("maxlength","4000");
		
		nrc = new LookupField(model,"nrc");
		nrc.setLabel(gt("NRC"));
		nrc.setLookup("recrutamento_rh","Ins__alt_entidade","index");
		nrc.addParam("target","_blank");
		nrc.propertie().add("name","p_nrc").add("type","lookup").add("lookup_eraser","false").add("lookup_type","LOOKUP").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		nif = new LookupField(model,"nif");
		nif.setLabel(gt("Nif"));
		nif.setLookup("recrutamento_rh","Ins__alt_entidade","index");
		nif.addParam("target","_blank");
		nif.propertie().add("name","p_nif").add("type","lookup").add("lookup_eraser","false").add("lookup_type","LOOKUP").add("maxlength","15").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		codigo = new TextField(model,"codigo");
		codigo.setLabel(gt("Código"));
		codigo.propertie().add("name","p_codigo").add("type","text").add("maxlength","15").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","50").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		id_entidade = new HiddenField(model,"id_entidade");
		id_entidade.setLabel(gt(""));
		id_entidade.propertie().add("name","p_id_entidade").add("type","hidden").add("maxlength","50").add("java-type","int").add("tag","id_entidade");
		

		gravar = new IGRPToolsBar("gravar");

		btn_gravar = new IGRPButton("Gravar","recrutamento_rh","Ins__alt_entidade","gravar","submit","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		ins_alt_entidade.addField(ins_alt_entidade_text);


		form_entidade.addField(nrc);
		form_entidade.addField(nif);
		form_entidade.addField(codigo);
		form_entidade.addField(nome);
		form_entidade.addField(id_entidade);

		gravar.addButton(btn_gravar);
		this.addToPage(ins_alt_entidade);
		this.addToPage(form_entidade);
		this.addToPage(gravar);
	}
		
	@Override
	public void setModel(Model model) {
		
		nrc.setValue(model);
		nif.setValue(model);
		codigo.setValue(model);
		nome.setValue(model);
		id_entidade.setValue(model);	

		}
}
