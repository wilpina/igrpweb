package nosi.webapps.recrutamento_rh.pages.inserir__alterar_idioma;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/

import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.recrutamento_rh.dao.SrsTParametrizacao;

/*----#end-code----*/
		
public class Inserir__alterar_idiomaController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Inserir__alterar_idioma model = new Inserir__alterar_idioma();
		model.load();
		Inserir__alterar_idiomaView view = new Inserir__alterar_idiomaView();
		view.estado.loadDomain("srs_estado","recrutamento_rh","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  ----#gen-example */
		/*----#start-code(index)----*/
				try{
	String isEdit = Core.getParam("isEdit");
	if (Core.isNotNull(isEdit)) {
		SrsTParametrizacao srstparametrizacaofilter = new SrsTParametrizacao().find();
	if(Core.isNotNullOrZero(Core.getParamInt("p_id_idioma"))){
		srstparametrizacaofilter.andWhere("id","=",Core.getParamInt("p_id_idioma"));
	}
		SrsTParametrizacao srstparametrizacao = srstparametrizacaofilter.one();
		if (srstparametrizacao!=null) {
			model.setCodigo(srstparametrizacao.getCodigo());
	model.setTp_idioma(srstparametrizacao.getDescricao());
	model.setEstado(srstparametrizacao.getEstado());
	
	view.btn_gravar.addParameter("p_id_idioma", Core.getParam("p_id_idioma"));
	
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
		Inserir__alterar_idioma model = new Inserir__alterar_idioma();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("recrutamento_rh","Inserir__alterar_idioma","index",this.queryString()); //if submit, loads the values
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
		SrsTParametrizacao srstparametrizacao  = new SrsTParametrizacao();
		String isEdit = Core.getParam("isEdit");
		if(Core.isNotNull(isEdit)) {
			 srstparametrizacao = session.find(SrsTParametrizacao.class, Core.getParamInt("p_id_idioma"));
		}
		if (srstparametrizacao != null){
			srstparametrizacao.setCodigo(model.getCodigo());
	srstparametrizacao.setDescricao(model.getTp_idioma() );
	srstparametrizacao.setTipo("IDIOMA");
	srstparametrizacao.setDtInicio(Core.getCurrentDate1() );
	srstparametrizacao.setEstado(model.getEstado());
	srstparametrizacao.setUserId(Core.getCurrentUser().getId() );
		}
		session.persist(srstparametrizacao);
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
		return this.redirect("recrutamento_rh","Inserir__alterar_idioma","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
