package nosi.webapps.map_competencias.pages.colaboradorlist;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
import java.util.ArrayList;
import java.util.List;
import nosi.webapps.map_competencias.dao.Colaborador;
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.Map;

/*----#end-code----*/
		
public class ColaboradorListController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		ColaboradorList model = new ColaboradorList();
		model.load();
		ColaboradorListView view = new ColaboradorListView();
		view.id.setParam(true);
		view.uuid.setParam(true);
		view.departamento.loadDomain("departamentos","map_competencias","-- Selecionar --");
		view.tipo_colaborador.loadDomain("tipo_colaborador","map_competencias","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT '1REC' as fase,'../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg' as picture,'Lorem dolor natus anim ipsum' as nome,'Adipiscing magna lorem officia sit' as email,'08-02-2012' as data_nascimento,'Anim officia aliqua sit perspiciatis' as departamento_atual,'8' as salario_atual_bruto,'Rem ipsum lorem adipiscing sit' as data_de_entrada_nosi,'Sit sed deserunt omnis rem' as pccs,'Perspiciatis anim elit totam i' as habilitacao_literaria,'hidden-64f5_a6d5' as id,'hidden-a90d_56ee' as uuid "));
		  ----#gen-example */
	/*
	try{
	
	Colaborador colaboradorfilter = new Colaborador().find();
	if(Core.isNotNullOrZero(model.getDepartamento())){
		colaboradorfilter.andWhere("departamento_atual","=",model.getDepartamento());
	}
	if(Core.isNotNullOrZero(model.getTipo_colaborador())){
		colaboradorfilter.andWhere("tipo_colaborador","=",model.getTipo_colaborador());
	}
	List<Colaborador> colaboradorList = colaboradorfilter.all();
	List<ColaboradorList.Table_1> colaboradorTable = new ArrayList<>();
	if(colaboradorList != null){
		for(Colaborador colaborador : colaboradorList){
			ColaboradorList.Table_1 row = new ColaboradorList.Table_1();
			row.setPicture(Core.getLinkFileByUuid(colaborador.getPicture()));
			row.setDepartamento_atual(colaborador.getDepartamento_atual());
			row.setNome(colaborador.getNome());
			row.setData_de_entrada_nosi(colaborador.getData_de_entrada_nosi());
			row.setEmail(colaborador.getEmail());
			row.setSalario_atual_bruto(colaborador.getSalario_atual_bruto());
			row.setFase(colaborador.getFase());
			row.setId(colaborador.getId());
			row.setUuid(colaborador.getUuid());
			row.setHabilitacao_literaria(colaborador.getHabilitacao_literaria());
			row.setData_nascimento(colaborador.getData_nascimento());
			row.setPccs(colaborador.getCategoria());
			colaboradorTable.add(row);
		}
	}
	model.setTable_1(colaboradorTable);
	}catch(Exception e){
	e.printStackTrace();
	}
	
	*/
		/*----#start-code(index)----*/
			try{

	Colaborador colaboradorfilter = new Colaborador().find();
	if(Core.isNotNullOrZero(model.getDepartamento())){
		colaboradorfilter.andWhere("departamento_atual","=",model.getDepartamento());
	}
	if(Core.isNotNullOrZero(model.getTipo_colaborador())){
		colaboradorfilter.andWhere("tipo_colaborador","=",model.getTipo_colaborador());
	}
	List<Colaborador> colaboradorList = colaboradorfilter.all();
	List<ColaboradorList.Table_1> colaboradorTable = new ArrayList<>();
	if(colaboradorList != null){		
		Map<String, String> map= (Map<String, String>) Core.toMap(Core.findDomainByCode("habilitacao","map_competencias"), "valor", "description");
		for(Colaborador colaborador : colaboradorList){
			ColaboradorList.Table_1 row = new ColaboradorList.Table_1();
          	if(Core.isNotNull(colaborador.getPicture()))
				row.setPicture(Core.getLinkFileByUuid(colaborador.getPicture()));
          	
          		
			row.setDepartamento_atual(colaborador.getDepartamento_atual());
			row.setNome(colaborador.getNome());
			row.setData_de_entrada_nosi(colaborador.getData_de_entrada_nosi());
			row.setEmail(colaborador.getEmail());
			row.setSalario_atual_bruto(colaborador.getSalario_atual_bruto());
			row.setFase(colaborador.getFase());
			row.setId(colaborador.getId());
			row.setUuid(colaborador.getUuid());
     	    row.setData_nascimento(colaborador.getData_nascimento());     	    
          	row.setHabilitacao_literaria(map.get(colaborador.getHabilitacao_literaria()));
			row.setPccs(colaborador.getCategoria()+" - "+colaborador.getNivel());
			colaboradorTable.add(row);
		}
	}
	model.setTable_1(colaboradorTable);
	}catch(Exception e){
	e.printStackTrace();
	}
	
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionUpdate() throws IOException, IllegalArgumentException, IllegalAccessException{
		ColaboradorList model = new ColaboradorList();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  this.addQueryString("p_uuid",Core.getParam("p_uuid"));
		  return this.forward("map_competencias","Subscricao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(update)----*/
		this.addQueryString("p_uuid",Core.getParam("p_uuid"));
		this.addQueryString("CA","true");
		/*----#end-code----*/
		return this.redirect("map_competencias","Subscricao","index", this.queryString());	
	}
	
	public Response actionDelete() throws IOException, IllegalArgumentException, IllegalAccessException{
		ColaboradorList model = new ColaboradorList();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  this.addQueryString("p_uuid",Core.getParam("p_uuid"));
		  return this.forward("map_competencias","Subscricao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(delete)----*/
		
		
		/*----#end-code----*/
		return this.redirect("map_competencias","Subscricao","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
