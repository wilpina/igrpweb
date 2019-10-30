package nosi.webapps.recrutamento_rh.pages.ins_alt_mt_selecao;

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
		
public class Ins_alt_mt_selecaoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Ins_alt_mt_selecao model = new Ins_alt_mt_selecao();
		model.load();
		Ins_alt_mt_selecaoView view = new Ins_alt_mt_selecaoView();
		view.estado.loadDomain("d_estado","recrutamento_rh","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  ----#gen-example */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGravar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Ins_alt_mt_selecao model = new Ins_alt_mt_selecao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("recrutamento_rh","Ins_alt_mt_selecao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(gravar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("recrutamento_rh","Ins_alt_mt_selecao","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
