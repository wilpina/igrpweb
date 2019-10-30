package nosi.webapps.recrutamento_rh.pages.ins__alt_tp_vinc;

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
		
public class Ins__alt_tp_vincController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Ins__alt_tp_vinc model = new Ins__alt_tp_vinc();
		model.load();
		Ins__alt_tp_vincView view = new Ins__alt_tp_vincView();
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
		Ins__alt_tp_vinc model = new Ins__alt_tp_vinc();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		 this.addQueryString("p_id","12"); //to send a query string in the URL
		 return this.forward("recrutamento_rh","ins__alt_tp_vinc","index",this.queryString()); //if submit, loads the values  ----#gen-example */
		/*----#start-code(gravar)----*/
		
		
		/*----#end-code----*/
		
		return this.redirect("recrutamento_rh","ins__alt_tp_vinc","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
