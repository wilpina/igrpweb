package nosi.webapps.recrutamento_rh.pages.candidatura;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class CandidaturaController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Candidatura model = new Candidatura();
		model.load();
		CandidaturaView view = new CandidaturaView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.area_de_formacao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.habilitacao_academica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.nivel_de_habilitacao.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionSubmeter() throws IOException, IllegalArgumentException, IllegalAccessException{
		Candidatura model = new Candidatura();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("recrutamento_rh","Pedido_de_concurso","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(submeter)----*/
		
		
		/*----#end-code----*/
		return this.redirect("recrutamento_rh","Pedido_de_concurso","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
