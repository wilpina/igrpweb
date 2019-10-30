package nosi.webapps.recrutamento_rh.pages.ins__alt_curso;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Ins__alt_cursoView extends View {

	public Field ins_alt_curso_text;
	public Field codigo_;
	public Field descicao;
	public Field pais;
	public Field estabelecimento;
	public Field data_fim;
	public Field data_inicio;
	public Field duracao;
	public Field estado;
	public Field id_curso;
	public IGRPSectionHeader ins_alt_curso;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar;

	public Ins__alt_cursoView(){

		this.setPageTitle("Inserir / Alterar Curso");
			
		ins_alt_curso = new IGRPSectionHeader("ins_alt_curso","");

		form_1 = new IGRPForm("form_1","");

		ins_alt_curso_text = new TextField(model,"ins_alt_curso_text");
		ins_alt_curso_text.setLabel(gt(""));
		ins_alt_curso_text.setValue(gt("<p>Inserir / Alterar Curso</p>"));
		ins_alt_curso_text.propertie().add("type","text").add("name","p_ins_alt_curso_text").add("maxlength","4000");
		
		codigo_ = new TextField(model,"codigo_");
		codigo_.setLabel(gt("Código "));
		codigo_.propertie().add("name","p_codigo_").add("type","text").add("maxlength","10").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		descicao = new TextField(model,"descicao");
		descicao.setLabel(gt("Descrição"));
		descicao.propertie().add("name","p_descicao").add("type","text").add("maxlength","100").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		pais = new LookupField(model,"pais");
		pais.setLabel(gt("País"));
		pais.setLookup("recrutamento_rh","Inserir__alterar_area_de_formacao","index");
		pais.addParam("target","_blank");
		pais.propertie().add("name","p_pais").add("type","lookup").add("lookup_eraser","false").add("lookup_type","LOOKUP").add("maxlength","100").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		estabelecimento = new TextField(model,"estabelecimento");
		estabelecimento.setLabel(gt("Estabelecimento"));
		estabelecimento.propertie().add("name","p_estabelecimento").add("type","text").add("maxlength","100").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		data_fim = new DateField(model,"data_fim");
		data_fim.setLabel(gt("Data Fim"));
		data_fim.propertie().add("name","p_data_fim").add("type","date").add("range","false").add("maxlength","100").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		data_inicio = new DateField(model,"data_inicio");
		data_inicio.setLabel(gt("Data Inicio"));
		data_inicio.propertie().add("name","p_data_inicio").add("type","date").add("range","false").add("maxlength","100").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		duracao = new TextField(model,"duracao");
		duracao.setLabel(gt("Duração"));
		duracao.propertie().add("name","p_duracao").add("type","text").add("maxlength","100").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false");
		
		estado = new ListField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","select").add("multiple","false").add("tags","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		id_curso = new HiddenField(model,"id_curso");
		id_curso.setLabel(gt(""));
		id_curso.propertie().add("name","p_id_curso").add("type","hidden").add("maxlength","250").add("java-type","").add("tag","id_curso");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_gravar = new IGRPButton("Gravar","recrutamento_rh","Ins__alt_curso","gravar","submit","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		ins_alt_curso.addField(ins_alt_curso_text);


		form_1.addField(codigo_);
		form_1.addField(descicao);
		form_1.addField(pais);
		form_1.addField(estabelecimento);
		form_1.addField(data_fim);
		form_1.addField(data_inicio);
		form_1.addField(duracao);
		form_1.addField(estado);
		form_1.addField(id_curso);

		toolsbar_1.addButton(btn_gravar);
		this.addToPage(ins_alt_curso);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		codigo_.setValue(model);
		descicao.setValue(model);
		pais.setValue(model);
		estabelecimento.setValue(model);
		data_fim.setValue(model);
		data_inicio.setValue(model);
		duracao.setValue(model);
		estado.setValue(model);
		id_curso.setValue(model);	

		}
}
