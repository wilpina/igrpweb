package nosi.webapps.recrutamento_rh.pages.nivel_de_habilitacao;

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
		
public class Nivel_de_habilitacaoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Nivel_de_habilitacao model = new Nivel_de_habilitacao();
		model.load();
		Nivel_de_habilitacaoView view = new Nivel_de_habilitacaoView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.estado.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGravar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Nivel_de_habilitacao model = new Nivel_de_habilitacao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("recrutamento_rh","Nivel_de_habilitacao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(gravar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("recrutamento_rh","Nivel_de_habilitacao","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
