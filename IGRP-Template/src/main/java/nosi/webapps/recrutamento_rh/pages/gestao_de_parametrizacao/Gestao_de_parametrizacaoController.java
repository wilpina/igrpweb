package nosi.webapps.recrutamento_rh.pages.gestao_de_parametrizacao;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
import java.util.ArrayList;
import java.util.List;
import nosi.webapps.recrutamento_rh.dao.SrsTParametrizacao;
/* End-Code-Block */
/*----#start-code(packages_import)----*/

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.ArrayList;
import java.util.List;
import nosi.webapps.recrutamento_rh.dao.SrsTEntidade;

/*----#end-code----*/
		
public class Gestao_de_parametrizacaoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_parametrizacao model = new Gestao_de_parametrizacao();
		model.load();
		Gestao_de_parametrizacaoView view = new Gestao_de_parametrizacaoView();
		view.id_area_formacao.setParam(true);
		view.id_area_emprego.setParam(true);
		view.id_tp_doc.setParam(true);
		view.id_tp_con.setParam(true);
		view.id_tp_for.setParam(true);
		view.id_idioma.setParam(true);
		view.id_profissao.setParam(true);
		view.id_entidade.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadLista_af(Core.query(null,"SELECT 'Magna accusantium anim accusantium stract' as area_de_formacao,'Rem doloremque magna omnis elit' as f_estado,'hidden-445c_2624' as id_area_formacao "));
		model.loadTable_3(Core.query(null,"SELECT 'Lorem mollit perspiciatis moll' as emp_codigo,'Sit dolor iste dolor labore' as emp_descricao,'Labore aperiam stract magna si' as estado_emp,'hidden-491c_7fc9' as id_area_emprego "));
		model.loadTable_2(Core.query(null,"SELECT 'Voluptatem aperiam magna aliqu' as doc_codigo,'Adipiscing magna aliqua adipis' as doc_descricao,'Unde natus mollit anim natus' as doc_estado,'hidden-69f7_d8f9' as id_tp_doc "));
		model.loadTp_concurso(Core.query(null,"SELECT 'Omnis stract doloremque omnis' as codigo,'Sed accusantium stract amet si' as descricao_tpconcurso,'Aperiam aliqua totam elit natu' as estado_tc,'hidden-a9a7_4445' as id_tp_con "));
		model.loadLista_forma(Core.query(null,"SELECT 'Officia natus i' as codigo_tp_form,'Accusantium elit doloremque an' as descri_tp_form,'Voluptatem' as estado_tp_form,'hidden-601d_240e' as id_tp_for "));
		model.loadLista_idioma(Core.query(null,"SELECT 'Accusantium mollit sit ipsum d' as codigo_idioma,'Magna elit aliqua anim natus' as tp_idioma,'Sit adipiscing accusantium mag' as estado_idioma,'hidden-bc23_7f68' as id_idioma "));
		model.loadLista_profissao(Core.query(null,"SELECT 'Omnis totam sit adipiscing ips' as codigo_prof,'Perspiciatis deserunt accusant' as descricao_profissao,'Stract sit unde consectetur to' as estado_prof,'hidden-b1bc_0580' as id_profissao "));
		model.loadList_cargo(Core.query(null,"SELECT 'Consectetur omnis magna omnis ipsum' as cargo,'Omnis deserunt lorem sed totam' as estado_cargo,'hidden-9c3b_888a' as id_cargo "));
		model.loadLista_entidade(Core.query(null,"SELECT 'Amet deserunt elit amet dolore' as codigo_entidade,'0' as nif,'Perspiciatis adipiscing mollit' as nome,'Aliqua unde aperiam iste sit' as estado,'hidden-d7f9_962d' as id_entidade "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		try{
	
	SrsTEntidade srstentidadefilter = new SrsTEntidade().find();
	List<SrsTEntidade> srstentidadeList = srstentidadefilter.all();
	List<Gestao_de_parametrizacao.Lista_entidade> srstentidadeTable = new ArrayList<>();
	if(srstentidadeList != null){
		for(SrsTEntidade srstentidade : srstentidadeList){
			Gestao_de_parametrizacao.Lista_entidade row = new Gestao_de_parametrizacao.Lista_entidade();
			row.setCodigo_entidade(srstentidade.getCodigo());
            row.setNif(srstentidade.getNif());
            row.setNome(srstentidade.getNome());
            row.setEstado(srstentidade.getEstado());
            row.setId_entidade(""+srstentidade.getId());
			srstentidadeTable.add(row);
		}
	}
	model.setLista_entidade(srstentidadeTable);
	}catch(Exception e){
	e.printStackTrace();
	}
		
		try{
	
	SrsTParametrizacao srstparametrizacaofilter = new SrsTParametrizacao().find();
	if(Core.isNotNullOrZero("AREA_EMP")){
		srstparametrizacaofilter.andWhere("tipo","=","AREA_EMP");
	}
	List<SrsTParametrizacao> srstparametrizacaoList = srstparametrizacaofilter.all();
	List<Gestao_de_parametrizacao.Table_3> srstparametrizacaoTable = new ArrayList<>();
	if(srstparametrizacaoList != null){
		for(SrsTParametrizacao srstparametrizacao : srstparametrizacaoList){
			Gestao_de_parametrizacao.Table_3 row = new Gestao_de_parametrizacao.Table_3();
			row.setEmp_codigo(srstparametrizacao.getCodigo());
	row.setEmp_descricao(srstparametrizacao.getDescricao());
	row.setEstado_emp(srstparametrizacao.getEstado());
	row.setId_area_emprego(""+srstparametrizacao.getId());
			srstparametrizacaoTable.add(row);
		}
	}
	model.setTable_3(srstparametrizacaoTable);
	}catch(Exception e){
	e.printStackTrace();
	}
	
	
	try{
	
	SrsTParametrizacao srstparametrizacaofilter = new SrsTParametrizacao().find();
	if(Core.isNotNullOrZero("TP_DOC")){
		srstparametrizacaofilter.andWhere("tipo","=","TP_DOC");
	}
	List<SrsTParametrizacao> srstparametrizacaoList = srstparametrizacaofilter.all();
	List<Gestao_de_parametrizacao.Table_2> srstparametrizacaoTable = new ArrayList<>();
	if(srstparametrizacaoList != null){
		for(SrsTParametrizacao srstparametrizacao : srstparametrizacaoList){
			Gestao_de_parametrizacao.Table_2 row = new Gestao_de_parametrizacao.Table_2();
			row.setDoc_codigo(srstparametrizacao.getCodigo());
	row.setDoc_descricao(srstparametrizacao.getDescricao());
	row.setDoc_estado(srstparametrizacao.getEstado());
	row.setId_tp_doc(""+srstparametrizacao.getId());
			srstparametrizacaoTable.add(row);
		}
	}
	model.setTable_2(srstparametrizacaoTable);
	}catch(Exception e){
	e.printStackTrace();
	}
	
	
	try{
	
	SrsTParametrizacao srstparametrizacaofilter = new SrsTParametrizacao().find();
	if(Core.isNotNullOrZero("AREA_FORM")){
		srstparametrizacaofilter.andWhere("tipo","=","AREA_FORM");
	}
	List<SrsTParametrizacao> srstparametrizacaoList = srstparametrizacaofilter.all();
	List<Gestao_de_parametrizacao.Lista_af> srstparametrizacaoTable = new ArrayList<>();
	if(srstparametrizacaoList != null){
		for(SrsTParametrizacao srstparametrizacao : srstparametrizacaoList){
			Gestao_de_parametrizacao.Lista_af row = new Gestao_de_parametrizacao.Lista_af();
			row.setArea_de_formacao(srstparametrizacao.getDescricao());
	row.setF_estado(srstparametrizacao.getEstado());
	row.setId_area_formacao(""+srstparametrizacao.getId());
			srstparametrizacaoTable.add(row);
		}
	}
	model.setLista_af(srstparametrizacaoTable);
	}catch(Exception e){
	e.printStackTrace();
	}
	
	
	try{
	
	SrsTParametrizacao srstparametrizacaofilter = new SrsTParametrizacao().find();
	if(Core.isNotNullOrZero("TP_CONCURSO")){
		srstparametrizacaofilter.andWhere("tipo","=","TP_CONCURSO");
	}
	List<SrsTParametrizacao> srstparametrizacaoList = srstparametrizacaofilter.all();
	List<Gestao_de_parametrizacao.Tp_concurso> srstparametrizacaoTable = new ArrayList<>();
	if(srstparametrizacaoList != null){
		for(SrsTParametrizacao srstparametrizacao : srstparametrizacaoList){
			Gestao_de_parametrizacao.Tp_concurso row = new Gestao_de_parametrizacao.Tp_concurso();
			row.setCodigo(srstparametrizacao.getCodigo());
	row.setDescricao_tpconcurso(srstparametrizacao.getDescricao());
	row.setEstado_tc(srstparametrizacao.getEstado());
	row.setId_tp_con(""+srstparametrizacao.getId());
			srstparametrizacaoTable.add(row);
		}
	}
	model.setTp_concurso(srstparametrizacaoTable);
	}catch(Exception e){
	e.printStackTrace();
	}
	
	
	try{
	
	SrsTParametrizacao srstparametrizacaofilter = new SrsTParametrizacao().find();
	if(Core.isNotNullOrZero("CARGO")){
		srstparametrizacaofilter.andWhere("tipo","=","CARGO");
	}
	List<SrsTParametrizacao> srstparametrizacaoList = srstparametrizacaofilter.all();
	List<Gestao_de_parametrizacao.List_cargo> srstparametrizacaoTable = new ArrayList<>();
	if(srstparametrizacaoList != null){
		for(SrsTParametrizacao srstparametrizacao : srstparametrizacaoList){
			Gestao_de_parametrizacao.List_cargo row = new Gestao_de_parametrizacao.List_cargo();
			row.setCargo(srstparametrizacao.getDescricao());
	row.setEstado_cargo(srstparametrizacao.getEstado());
	row.setId_cargo(""+srstparametrizacao.getId());
			srstparametrizacaoTable.add(row);
		}
	}
	model.setList_cargo(srstparametrizacaoTable);
	}catch(Exception e){
	e.printStackTrace();
	}
	
	
	try{
	
	SrsTParametrizacao srstparametrizacaofilter = new SrsTParametrizacao().find();
	if(Core.isNotNullOrZero("PROFISSAO")){
		srstparametrizacaofilter.andWhere("tipo","=","PROFISSAO");
	}
	List<SrsTParametrizacao> srstparametrizacaoList = srstparametrizacaofilter.all();
	List<Gestao_de_parametrizacao.Lista_profissao> srstparametrizacaoTable = new ArrayList<>();
	if(srstparametrizacaoList != null){
		for(SrsTParametrizacao srstparametrizacao : srstparametrizacaoList){
			Gestao_de_parametrizacao.Lista_profissao row = new Gestao_de_parametrizacao.Lista_profissao();
			row.setCodigo_prof(srstparametrizacao.getCodigo());
	row.setDescricao_profissao(srstparametrizacao.getDescricao());
	row.setEstado_prof(srstparametrizacao.getEstado());
	row.setId_profissao(""+srstparametrizacao.getId());
			srstparametrizacaoTable.add(row);
		}
	}
	model.setLista_profissao(srstparametrizacaoTable);
	}catch(Exception e){
	e.printStackTrace();
	}
	
	
	try{
	
	SrsTParametrizacao srstparametrizacaofilter = new SrsTParametrizacao().find();
	if(Core.isNotNullOrZero("IDIOMA")){
		srstparametrizacaofilter.andWhere("tipo","=","IDIOMA");
	}
	List<SrsTParametrizacao> srstparametrizacaoList = srstparametrizacaofilter.all();
	List<Gestao_de_parametrizacao.Lista_idioma> srstparametrizacaoTable = new ArrayList<>();
	if(srstparametrizacaoList != null){
		for(SrsTParametrizacao srstparametrizacao : srstparametrizacaoList){
			Gestao_de_parametrizacao.Lista_idioma row = new Gestao_de_parametrizacao.Lista_idioma();
			row.setCodigo_idioma(srstparametrizacao.getCodigo());
	row.setTp_idioma(srstparametrizacao.getDescricao());
	row.setEstado_idioma(srstparametrizacao.getEstado());
	row.setId_idioma(""+srstparametrizacao.getId());
			srstparametrizacaoTable.add(row);
		}
	}
	model.setLista_idioma(srstparametrizacaoTable);
	}catch(Exception e){
	e.printStackTrace();
	}
	
	
	try{
	
	SrsTParametrizacao srstparametrizacaofilter = new SrsTParametrizacao().find();
	if(Core.isNotNullOrZero("TP_FORM")){
		srstparametrizacaofilter.andWhere("tipo","=","TP_FORM");
	}
	List<SrsTParametrizacao> srstparametrizacaoList = srstparametrizacaofilter.all();
	List<Gestao_de_parametrizacao.Lista_forma> srstparametrizacaoTable = new ArrayList<>();
	if(srstparametrizacaoList != null){
		for(SrsTParametrizacao srstparametrizacao : srstparametrizacaoList){
			Gestao_de_parametrizacao.Lista_forma row = new Gestao_de_parametrizacao.Lista_forma();
			row.setCodigo_tp_form(srstparametrizacao.getCodigo());
	row.setDescri_tp_form(srstparametrizacao.getDescricao());
	row.setEstado_tp_form(srstparametrizacao.getEstado());
	row.setId_tp_for(""+srstparametrizacao.getId());
			srstparametrizacaoTable.add(row);
		}
	}
	model.setLista_forma(srstparametrizacaoTable);
	}catch(Exception e){
	e.printStackTrace();
	}	
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionNovo() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_parametrizacao model = new Gestao_de_parametrizacao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_area_formacao",Core.getParam("p_id_area_formacao"));
		  this.addQueryString("p_id_area_emprego",Core.getParam("p_id_area_emprego"));
		  this.addQueryString("p_id_tp_doc",Core.getParam("p_id_tp_doc"));
		  this.addQueryString("p_id_tp_con",Core.getParam("p_id_tp_con"));
		  this.addQueryString("p_id_tp_for",Core.getParam("p_id_tp_for"));
		  this.addQueryString("p_id_idioma",Core.getParam("p_id_idioma"));
		  this.addQueryString("p_id_profissao",Core.getParam("p_id_profissao"));
		  this.addQueryString("p_id_entidade",Core.getParam("p_id_entidade"));
		  return this.forward("recrutamento_rh","Inserir__alterar_area_de_formacao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo)----*/
		
		
		/*----#end-code----*/
		return this.redirect("recrutamento_rh","Inserir__alterar_area_de_formacao","index", this.queryString());	
	}
	
	public Response actionNovo_emp() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_parametrizacao model = new Gestao_de_parametrizacao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_area_formacao",Core.getParam("p_id_area_formacao"));
		  this.addQueryString("p_id_area_emprego",Core.getParam("p_id_area_emprego"));
		  this.addQueryString("p_id_tp_doc",Core.getParam("p_id_tp_doc"));
		  this.addQueryString("p_id_tp_con",Core.getParam("p_id_tp_con"));
		  this.addQueryString("p_id_tp_for",Core.getParam("p_id_tp_for"));
		  this.addQueryString("p_id_idioma",Core.getParam("p_id_idioma"));
		  this.addQueryString("p_id_profissao",Core.getParam("p_id_profissao"));
		  this.addQueryString("p_id_entidade",Core.getParam("p_id_entidade"));
		  return this.forward("recrutamento_rh","Ins__alt_area_emp","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo_emp)----*/
		
		
		/*----#end-code----*/
		return this.redirect("recrutamento_rh","Ins__alt_area_emp","index", this.queryString());	
	}
	
	public Response actionDoc_novo() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_parametrizacao model = new Gestao_de_parametrizacao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_area_formacao",Core.getParam("p_id_area_formacao"));
		  this.addQueryString("p_id_area_emprego",Core.getParam("p_id_area_emprego"));
		  this.addQueryString("p_id_tp_doc",Core.getParam("p_id_tp_doc"));
		  this.addQueryString("p_id_tp_con",Core.getParam("p_id_tp_con"));
		  this.addQueryString("p_id_tp_for",Core.getParam("p_id_tp_for"));
		  this.addQueryString("p_id_idioma",Core.getParam("p_id_idioma"));
		  this.addQueryString("p_id_profissao",Core.getParam("p_id_profissao"));
		  this.addQueryString("p_id_entidade",Core.getParam("p_id_entidade"));
		  return this.forward("recrutamento_rh","Ins_alt_doc","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(doc_novo)----*/
		
		
		/*----#end-code----*/
		return this.redirect("recrutamento_rh","Ins_alt_doc","index", this.queryString());	
	}
	
	public Response actionNovo_concurso() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_parametrizacao model = new Gestao_de_parametrizacao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_area_formacao",Core.getParam("p_id_area_formacao"));
		  this.addQueryString("p_id_area_emprego",Core.getParam("p_id_area_emprego"));
		  this.addQueryString("p_id_tp_doc",Core.getParam("p_id_tp_doc"));
		  this.addQueryString("p_id_tp_con",Core.getParam("p_id_tp_con"));
		  this.addQueryString("p_id_tp_for",Core.getParam("p_id_tp_for"));
		  this.addQueryString("p_id_idioma",Core.getParam("p_id_idioma"));
		  this.addQueryString("p_id_profissao",Core.getParam("p_id_profissao"));
		  this.addQueryString("p_id_entidade",Core.getParam("p_id_entidade"));
		  return this.forward("recrutamento_rh","Tipo_concurso","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo_concurso)----*/
		
		
		/*----#end-code----*/
		return this.redirect("recrutamento_rh","Tipo_concurso","index", this.queryString());	
	}
	
	public Response actionNovo_tp_form() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_parametrizacao model = new Gestao_de_parametrizacao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_area_formacao",Core.getParam("p_id_area_formacao"));
		  this.addQueryString("p_id_area_emprego",Core.getParam("p_id_area_emprego"));
		  this.addQueryString("p_id_tp_doc",Core.getParam("p_id_tp_doc"));
		  this.addQueryString("p_id_tp_con",Core.getParam("p_id_tp_con"));
		  this.addQueryString("p_id_tp_for",Core.getParam("p_id_tp_for"));
		  this.addQueryString("p_id_idioma",Core.getParam("p_id_idioma"));
		  this.addQueryString("p_id_profissao",Core.getParam("p_id_profissao"));
		  this.addQueryString("p_id_entidade",Core.getParam("p_id_entidade"));
		  return this.forward("recrutamento_rh","Tipos_de_formacao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo_tp_form)----*/
		
		
		/*----#end-code----*/
		return this.redirect("recrutamento_rh","Tipos_de_formacao","index", this.queryString());	
	}
	
	public Response actionNovo_idi() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_parametrizacao model = new Gestao_de_parametrizacao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_area_formacao",Core.getParam("p_id_area_formacao"));
		  this.addQueryString("p_id_area_emprego",Core.getParam("p_id_area_emprego"));
		  this.addQueryString("p_id_tp_doc",Core.getParam("p_id_tp_doc"));
		  this.addQueryString("p_id_tp_con",Core.getParam("p_id_tp_con"));
		  this.addQueryString("p_id_tp_for",Core.getParam("p_id_tp_for"));
		  this.addQueryString("p_id_idioma",Core.getParam("p_id_idioma"));
		  this.addQueryString("p_id_profissao",Core.getParam("p_id_profissao"));
		  this.addQueryString("p_id_entidade",Core.getParam("p_id_entidade"));
		  return this.forward("recrutamento_rh","Inserir__alterar_idioma","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo_idi)----*/
		
		
		/*----#end-code----*/
		return this.redirect("recrutamento_rh","Inserir__alterar_idioma","index", this.queryString());	
	}
	
	public Response actionNovo_prof() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_parametrizacao model = new Gestao_de_parametrizacao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_area_formacao",Core.getParam("p_id_area_formacao"));
		  this.addQueryString("p_id_area_emprego",Core.getParam("p_id_area_emprego"));
		  this.addQueryString("p_id_tp_doc",Core.getParam("p_id_tp_doc"));
		  this.addQueryString("p_id_tp_con",Core.getParam("p_id_tp_con"));
		  this.addQueryString("p_id_tp_for",Core.getParam("p_id_tp_for"));
		  this.addQueryString("p_id_idioma",Core.getParam("p_id_idioma"));
		  this.addQueryString("p_id_profissao",Core.getParam("p_id_profissao"));
		  this.addQueryString("p_id_entidade",Core.getParam("p_id_entidade"));
		  return this.forward("recrutamento_rh","Ins__alt_profissao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo_prof)----*/
		
		
		/*----#end-code----*/
		return this.redirect("recrutamento_rh","Ins__alt_profissao","index", this.queryString());	
	}
	
	public Response actionNovo_carg() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_parametrizacao model = new Gestao_de_parametrizacao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_area_formacao",Core.getParam("p_id_area_formacao"));
		  this.addQueryString("p_id_area_emprego",Core.getParam("p_id_area_emprego"));
		  this.addQueryString("p_id_tp_doc",Core.getParam("p_id_tp_doc"));
		  this.addQueryString("p_id_tp_con",Core.getParam("p_id_tp_con"));
		  this.addQueryString("p_id_tp_for",Core.getParam("p_id_tp_for"));
		  this.addQueryString("p_id_idioma",Core.getParam("p_id_idioma"));
		  this.addQueryString("p_id_profissao",Core.getParam("p_id_profissao"));
		  this.addQueryString("p_id_entidade",Core.getParam("p_id_entidade"));
		  return this.forward("recrutamento_rh","Cargo","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo_carg)----*/
		
		
		/*----#end-code----*/
		return this.redirect("recrutamento_rh","Cargo","index", this.queryString());	
	}
	
	public Response actionNovo_entidades() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_parametrizacao model = new Gestao_de_parametrizacao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_area_formacao",Core.getParam("p_id_area_formacao"));
		  this.addQueryString("p_id_area_emprego",Core.getParam("p_id_area_emprego"));
		  this.addQueryString("p_id_tp_doc",Core.getParam("p_id_tp_doc"));
		  this.addQueryString("p_id_tp_con",Core.getParam("p_id_tp_con"));
		  this.addQueryString("p_id_tp_for",Core.getParam("p_id_tp_for"));
		  this.addQueryString("p_id_idioma",Core.getParam("p_id_idioma"));
		  this.addQueryString("p_id_profissao",Core.getParam("p_id_profissao"));
		  this.addQueryString("p_id_entidade",Core.getParam("p_id_entidade"));
		  return this.forward("recrutamento_rh","Ins__alt_entidade","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(novo_entidades)----*/
		
		
		/*----#end-code----*/
		return this.redirect("recrutamento_rh","Ins__alt_entidade","index", this.queryString());	
	}
	
	public Response actionPesquisar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_parametrizacao model = new Gestao_de_parametrizacao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_area_formacao",Core.getParam("p_id_area_formacao"));
		  this.addQueryString("p_id_area_emprego",Core.getParam("p_id_area_emprego"));
		  this.addQueryString("p_id_tp_doc",Core.getParam("p_id_tp_doc"));
		  this.addQueryString("p_id_tp_con",Core.getParam("p_id_tp_con"));
		  this.addQueryString("p_id_tp_for",Core.getParam("p_id_tp_for"));
		  this.addQueryString("p_id_idioma",Core.getParam("p_id_idioma"));
		  this.addQueryString("p_id_profissao",Core.getParam("p_id_profissao"));
		  this.addQueryString("p_id_entidade",Core.getParam("p_id_entidade"));
		  return this.forward("recrutamento_rh","Gestao_de_parametrizacao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(pesquisar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("recrutamento_rh","Gestao_de_parametrizacao","index", this.queryString());	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_parametrizacao model = new Gestao_de_parametrizacao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_area_formacao",Core.getParam("p_id_area_formacao"));
		  this.addQueryString("p_id_area_emprego",Core.getParam("p_id_area_emprego"));
		  this.addQueryString("p_id_tp_doc",Core.getParam("p_id_tp_doc"));
		  this.addQueryString("p_id_tp_con",Core.getParam("p_id_tp_con"));
		  this.addQueryString("p_id_tp_for",Core.getParam("p_id_tp_for"));
		  this.addQueryString("p_id_idioma",Core.getParam("p_id_idioma"));
		  this.addQueryString("p_id_profissao",Core.getParam("p_id_profissao"));
		  this.addQueryString("p_id_entidade",Core.getParam("p_id_entidade"));
		  return this.forward("recrutamento_rh","Inserir__alterar_area_de_formacao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(editar)----*/
			
      	this.addQueryString("p_id_entidade", Core.getParam("p_id_entidade"));
	
		this.addQueryString("isEdit", "true"); 
       
		
		/*----#end-code----*/
		return this.redirect("recrutamento_rh","Inserir__alterar_area_de_formacao","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Gestao_de_parametrizacao model = new Gestao_de_parametrizacao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_area_formacao",Core.getParam("p_id_area_formacao"));
		  this.addQueryString("p_id_area_emprego",Core.getParam("p_id_area_emprego"));
		  this.addQueryString("p_id_tp_doc",Core.getParam("p_id_tp_doc"));
		  this.addQueryString("p_id_tp_con",Core.getParam("p_id_tp_con"));
		  this.addQueryString("p_id_tp_for",Core.getParam("p_id_tp_for"));
		  this.addQueryString("p_id_idioma",Core.getParam("p_id_idioma"));
		  this.addQueryString("p_id_profissao",Core.getParam("p_id_profissao"));
		  this.addQueryString("p_id_entidade",Core.getParam("p_id_entidade"));
		  return this.forward("recrutamento_rh","Gestao_de_parametrizacao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(eliminar)----*/
		
    Session session = null;
	Transaction transaction = null;
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		SrsTEntidade srstentidade  = new SrsTEntidade();
		String isEdit = Core.getParam("isEdit");
		if(Core.isNotNull(isEdit)) {
			 srstentidade = session.find(SrsTEntidade.class, Core.getParamInt("p_id_entidade"));
		}
		if (srstentidade != null){
			srstentidade.setEstado("I");
		}
		session.persist(srstentidade);
		transaction.commit();
		Core.setMessageSuccess();
	}
	else if (!model.validate())
		Core.setMessageError();
	}catch ( Exception e ) {
		Core.setMessageError("Error: "+ e.getMessage());
		if (transaction != null)
			transaction.rollback();
	}finally {
		if (session != null && session.isOpen()) {
			session.close();
		}
	}
      
	/*	SrsTEntidade srstentidade = new SrsTEntidade().findOne(Core.getParamInt("p_id_entidade"));
	if (srstentidade != null && !srstentidade.hasError()) {
		boolean del = srstentidade.delete(Core.getParamInt("p_id_entidade"));
		if (del == true)
			Core.setMessageSuccess("Deleted from DB successfully!");
		else
			Core.setMessageError("Error deleting person from DB!");
	} else {
		Core.setMessageError(srstentidade.getError().toString());
	}
      
      */
		/*----#end-code----*/
		return this.redirect("recrutamento_rh","Gestao_de_parametrizacao","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
