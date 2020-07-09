package nosi.webapps.map_competencias.pages.colaboradorlist;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import nosi.core.webapp.Core;
import java.util.Map;
import java.util.LinkedHashMap;

public class ColaboradorListView extends View {

	public Field departamento;
	public Field tipo_colaborador;
	public Field form_1_img_1;
	public Field fase;
	public Field picture;
	public Field nome;
	public Field email;
	public Field data_nascimento;
	public Field departamento_atual;
	public Field salario_atual_bruto;
	public Field data_de_entrada_nosi;
	public Field pccs;
	public Field habilitacao_literaria;
	public Field id;
	public Field uuid;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPButton btn_update;
	public IGRPButton btn_delete;

	public ColaboradorListView(){

		this.setPageTitle("Listar colaborador");
			
		form_1 = new IGRPForm("form_1","Filtro");

		table_1 = new IGRPTable("table_1","Lista de colaboradores");

		departamento = new ListField(model,"departamento");
		departamento.setLabel(gt("Departamento"));
		departamento.propertie().add("remote",Core.getIGRPLink("map_competencias","ColaboradorList","index")).add("name","p_departamento").add("type","select").add("multiple","false").add("tags","false").add("domain","departamentos « map_competencias").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		tipo_colaborador = new ListField(model,"tipo_colaborador");
		tipo_colaborador.setLabel(gt("Tipo colaborador"));
		tipo_colaborador.propertie().add("remote",Core.getIGRPLink("map_competencias","ColaboradorList","index")).add("name","p_tipo_colaborador").add("type","select").add("multiple","false").add("tags","false").add("domain","tipo_colaborador « map_competencias").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","");
		
		form_1_img_1 = new TextField(model,"form_1_img_1");
		form_1_img_1.setLabel(gt("Img"));
		form_1_img_1.setValue(gt("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg"));
		form_1_img_1.propertie().add("name","p_form_1_img_1").add("type","img").add("img","../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg").add("width","").add("height","").add("croppie","false").add("rounded","false").add("autoupload","false").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false");
		
		fase = new ColorField(model,"fase");
		fase.setLabel(gt("Fase"));
		fase.propertie().add("name","p_fase").add("type","color").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		picture = new TextField(model,"picture");
		picture.setLabel(gt("Picture"));
		picture.setValue(gt(""));
		picture.propertie().add("name","p_picture").add("type","img").add("img","../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg").add("width","").add("height","").add("croppie","false").add("rounded","true").add("autoupload","false").add("maxlength","255").add("showLabel","true").add("group_in","");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","255").add("showLabel","true").add("group_in","");
		
		email = new TextField(model,"email");
		email.setLabel(gt("Email"));
		email.propertie().add("name","p_email").add("type","text").add("maxlength","255").add("showLabel","true").add("group_in","nome");
		
		data_nascimento = new DateField(model,"data_nascimento");
		data_nascimento.setLabel(gt("Data nascimento"));
		data_nascimento.propertie().add("name","p_data_nascimento").add("type","date").add("range","false").add("maxlength","30").add("showLabel","true").add("group_in","nome");
		
		departamento_atual = new TextField(model,"departamento_atual");
		departamento_atual.setLabel(gt("Departamento atual"));
		departamento_atual.propertie().add("name","p_departamento_atual").add("type","text").add("maxlength","255").add("showLabel","true").add("group_in","");
		
		salario_atual_bruto = new NumberField(model,"salario_atual_bruto");
		salario_atual_bruto.setLabel(gt("Salario atual bruto"));
		salario_atual_bruto.propertie().add("name","p_salario_atual_bruto").add("type","number").add("maxlength","11").add("java-type","Integer").add("min","").add("max","").add("showLabel","true").add("total_footer","false").add("group_in","");
		
		data_de_entrada_nosi = new TextField(model,"data_de_entrada_nosi");
		data_de_entrada_nosi.setLabel(gt("Data de entrada nosi"));
		data_de_entrada_nosi.propertie().add("name","p_data_de_entrada_nosi").add("type","text").add("maxlength","255").add("showLabel","true").add("group_in","");
		
		pccs = new TextField(model,"pccs");
		pccs.setLabel(gt("PCCS:"));
		pccs.propertie().add("name","p_pccs").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","salario_atual_bruto");
		
		habilitacao_literaria = new TextField(model,"habilitacao_literaria");
		habilitacao_literaria.setLabel(gt("Habilitação literária"));
		habilitacao_literaria.propertie().add("name","p_habilitacao_literaria").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("maxlength","11").add("showLabel","true").add("group_in","").add("java-type","Integer").add("tag","id");
		
		uuid = new HiddenField(model,"uuid");
		uuid.setLabel(gt(""));
		uuid.propertie().add("name","p_uuid").add("type","hidden").add("maxlength","50").add("showLabel","true").add("group_in","").add("java-type","").add("tag","uuid");
		


		btn_update = new IGRPButton("Editar","map_competencias","ColaboradorList","update","mpsubmit","warning|fa-pencil","","");
		btn_update.propertie.add("type","specific").add("class","warning").add("rel","update").add("refresh_components","");

		btn_delete = new IGRPButton("Eliminar","map_competencias","ColaboradorList","delete","confirm","danger|fa-trash","","");
		btn_delete.propertie.add("type","specific").add("flg_transaction","true").add("class","danger").add("rel","delete").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(departamento);
		form_1.addField(tipo_colaborador);
		form_1.addField(form_1_img_1);

		table_1.addField(fase);
		table_1.addField(picture);
		table_1.addField(nome);
		table_1.addField(email);
		table_1.addField(data_nascimento);
		table_1.addField(departamento_atual);
		table_1.addField(salario_atual_bruto);
		table_1.addField(data_de_entrada_nosi);
		table_1.addField(pccs);
		table_1.addField(habilitacao_literaria);
		table_1.addField(id);
		table_1.addField(uuid);
		/* start table_1 legend colors*/
		Map<Object, Map<String, String>> table_1_colors= new LinkedHashMap<>();
		Map<String, String> color_95c11f_table_1 = new LinkedHashMap<>();
		color_95c11f_table_1.put("#95c11f","1 Recolha");
		table_1_colors.put("1REC",color_95c11f_table_1);
		Map<String, String> color_ea9126_table_1 = new LinkedHashMap<>();
		color_ea9126_table_1.put("#ea9126","2 Análise");
		table_1_colors.put("2ANA",color_ea9126_table_1);
		Map<String, String> color_c12d1f_table_1 = new LinkedHashMap<>();
		color_c12d1f_table_1.put("#c12d1f","3 Entrevista");
		table_1_colors.put("3ENT",color_c12d1f_table_1);
		Map<String, String> color_000000_table_1 = new LinkedHashMap<>();
		color_000000_table_1.put("#000000","4 Conclusão");
		table_1_colors.put("4CON",color_000000_table_1);
		this.table_1.setLegendColors(table_1_colors);
		/* end table_1 legend colors*/
		table_1.addButton(btn_update);
		table_1.addButton(btn_delete);
		this.addToPage(form_1);
		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		departamento.setValue(model);
		tipo_colaborador.setValue(model);
		fase.setValue(model);
		nome.setValue(model);
		email.setValue(model);
		data_nascimento.setValue(model);
		departamento_atual.setValue(model);
		salario_atual_bruto.setValue(model);
		data_de_entrada_nosi.setValue(model);
		pccs.setValue(model);
		habilitacao_literaria.setValue(model);
		id.setValue(model);
		uuid.setValue(model);	

		table_1.loadModel(((ColaboradorList) model).getTable_1());
		}
}
