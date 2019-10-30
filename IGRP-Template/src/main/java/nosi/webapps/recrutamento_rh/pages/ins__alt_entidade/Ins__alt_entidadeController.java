package nosi.webapps.recrutamento_rh.pages.ins__alt_entidade;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.recrutamento_rh.dao.SrsTEntidade;
/* End-Code-Block */
/*----#start-code(packages_import)----*/


import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.recrutamento_rh.dao.SrsTEntidade;
/*----#end-code----*/
		
public class Ins__alt_entidadeController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Ins__alt_entidade model = new Ins__alt_entidade();
		model.load();
		Ins__alt_entidadeView view = new Ins__alt_entidadeView();
		/*----#start-code(index)----*/
		
		try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		SrsTEntidade srstentidadefilter = new SrsTEntidade().find();
	if(Core.isNotNullOrZero(Core.getParamInt("p_id_entidade"))){
		srstentidadefilter.andWhere("id","=",Core.getParamInt("p_id_entidade"));
	}
		SrsTEntidade srstentidade = srstentidadefilter.one();
		if (srstentidade!=null) {
			model.setId_entidade(srstentidade.getId());
	model.setNrc(srstentidade.getNrc());
	model.setCodigo(srstentidade.getCodigo());
	model.setNome(srstentidade.getNome());
	model.setNif(""+srstentidade.getNif());
	
	view.btn_gravar.addParameter("p_id_entidade", Core.getParam("p_id_entidade"));
	
	view.btn_gravar.addParameter("isEdit", "true");
		}
	}
	}catch ( Exception e ) {
		e.printStackTrace();
	}
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGravar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Ins__alt_entidade model = new Ins__alt_entidade();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("recrutamento_rh","Ins__alt_entidade","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(gravar)----*/
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
			srstentidade.setCodigo(model.getCodigo());
	srstentidade.setNrc(model.getNrc());
	srstentidade.setNif(Core.toInt(model.getNif()));
	srstentidade.setNome(model.getNome());
	srstentidade.setEstado("A");
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
		
		/*----#end-code----*/
		return this.redirect("recrutamento_rh","Ins__alt_entidade","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
