package nosi.webapps.map_competencias.pages.subscricao;

import nosi.core.webapp.Controller;
import nosi.core.webapp.databse.helpers.ResultSet;
import nosi.core.webapp.databse.helpers.QueryInterface;
import java.io.IOException;
import nosi.core.webapp.Core;
import nosi.core.webapp.Response;
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.mail.EmailMessage;
import nosi.core.webapp.Igrp;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.webapps.map_competencias.pages.subscricao.Subscricao.Separatorlist_1;
import org.hibernate.Session;
import org.hibernate.Transaction;

import nosi.webapps.map_competencias.dao.FormaCertific;
import nosi.webapps.igrp.pages.menuorganica.MenuOrganica;
import nosi.webapps.map_competencias.dao.Colaborador;
import nosi.webapps.map_competencias.dao.ProdFuncao;

/*----#end-code----*/
		
public class SubscricaoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		Subscricao model = new Subscricao();
		model.load();
		model.setVer_cv("map_competencias","Subscricao","index");
		model.setFoto_pccs_deliberado_em_2016("map_competencias","Subscricao","index");
		SubscricaoView view = new SubscricaoView();
		view.habilitacao_literaria.loadDomain("habilitacao","map_competencias","-- Selecionar --");
		view.tipo_colaborador.loadDomain("tipo_colaborador","map_competencias","-- Selecionar --");
		view.departamento_atual.loadDomain("departamentos","map_competencias","-- Selecionar --");
		view.categoria.loadDomain("pccs","map_competencias","-- Selecionar --");
		view.nivel.loadDomain("pccs_nivel","map_competencias","-- Selecionar --");
		view.funcao_desempenhada.loadDomain("funcao","map_competencias","-- Selecionar --");
		view.produto.loadDomain("projeto_produto","map_competencias","-- Selecionar --");
		view.comportamental.loadDomain("comportamental","map_competencias","-- Selecionar --");
		view.organizacionais.loadDomain("Organizacionais","map_competencias","-- Selecionar --");
		view.estrategica.loadDomain("Estratégica","map_competencias","-- Selecionar --");
		view.fase.loadDomain("fases","map_competencias","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadSeparatorlist_1(Core.query(null,"SELECT '2' as funcao_desempenhada,'2' as produto,'1' as em_curso "));
		model.loadSeparatorlist_2(Core.query(null,"SELECT 'Voluptatem labore officia deserunt aperiam' as formacao_certificacao,'0' as ano_de_conclusao,'1' as fornecida_pela_nosi "));
		  ----#gen-example */
		/*----#start-code(index)----*/
		model.setFoto_pccs_deliberado_em_2016(Core.getLinkReport("pccs"));
		if(Core.isNotNull(Core.getParam("linkfoto"))) {
			view.picture.setValue(Core.getLinkFileByUuid(Core.getParam("linkfoto")));	
			view.click_na_foto_clicando.setVisible(false);
		}
				
			
    //  Core.getLinkReport("pccs"); //or Core.getLinkReport("pccs",new Report());
      if(Core.isNotNullOrZero(model.getUuid()) && !Boolean.parseBoolean(Core.getParam("erro"))){
          
          Colaborador colaboradorfilter = new Colaborador().find();
          colaboradorfilter.andWhere("uuid","=",model.getUuid());
          Colaborador colaborador = colaboradorfilter.one();
          if(Boolean.parseBoolean(Core.getParam("ativate"))) {
        	  colaborador.setEstado("A");
        	  colaborador.update();
        	  Core.setMessageSuccess("A sua subscrição foi ativada.");
        	  Core.setMessageInfo("Pode atualizar os dados, carregando em enviar!");
          }
        	  
            if (colaborador!=null) {	
              view.email.propertie().add("readonly","true");
              Core.mapper(colaborador,model);  
              if (Core.isNotNull( colaborador.getUpload_cv())) {
                 model.setVer_cv(Core.getLinkFileByUuid(colaborador.getUpload_cv()));
              }else{
                  view.ver_cv.setVisible(false);
              }
                
            
              if (Core.isNotNull( colaborador.getComportamental())) {
                  model.setComportamental(colaborador.getComportamental().split("; "));
              }                 
              if (Core.isNotNull(colaborador.getOrganizacionais())) {
                  model.setOrganizacionais(colaborador.getOrganizacionais().split("; "));
              }               
              if (Core.isNotNull(colaborador.getEstrategica())) {
                  model.setEstrategica(colaborador.getEstrategica().split("; "));
              }
              if(Core.isNotNull(colaborador.getPicture())) {
            	  view.picture.setValue(Core.getLinkFileByUuid(colaborador.getPicture()));
            	  view.click_na_foto_clicando.setVisible(false);
              }
             	
              
            }   
          
          
			Set<ProdFuncao> notSprodfuncaoList = colaborador.getProd_funcao();			
	          List<ProdFuncao> prodfuncaoList = new ArrayList<>(notSprodfuncaoList);          
	            Collections.sort(prodfuncaoList, new SortbyOrderF());
            if ( Core.isNotNull(prodfuncaoList) ) {
                    List <Subscricao.Separatorlist_1>  separatorlistDocs =new ArrayList<>();
                    prodfuncaoList.forEach(prodfuncao-> {
                    	Subscricao.Separatorlist_1 row = new Subscricao.Separatorlist_1();
        				row.setSeparatorlist_1_id(new Pair( ""+ prodfuncao.getId(), ""+prodfuncao.getId()));
        				row.setProduto( new Pair(prodfuncao.getProduto(),Core.findDomainDescByKey("projeto_produto",prodfuncao.getProduto())) );
        				row.setFuncao_desempenhada( new Pair(prodfuncao.getFuncao_desempenhada(),Core.findDomainDescByKey("funcao",prodfuncao.getFuncao_desempenhada())) );
        				row.setEm_curso( new Pair(""+prodfuncao.getEm_curso(),prodfuncao.getEm_curso()==1?"Em curso":"") );                        
        				separatorlistDocs.add(row);
                    });
                    model.setSeparatorlist_1( separatorlistDocs);
                }
            Set<FormaCertific> notSformaCertificList = colaborador.getFormaCertific();
            List<FormaCertific> formaCertificList = new ArrayList<>(notSformaCertificList);          
            Collections.sort(formaCertificList, new SortbyOrder());
            if ( Core.isNotNull(formaCertificList) ) {
                    List <Subscricao.Separatorlist_2>  separatorlistDocs =new ArrayList<>();
                    formaCertificList.forEach(formaCertific-> {
                    	Subscricao.Separatorlist_2 row = new Subscricao.Separatorlist_2();
        				row.setSeparatorlist_2_id(new Pair( ""+ formaCertific.getId(), ""+formaCertific.getId()));
        				row.setFormacao_certificacao(new Pair(formaCertific.getFormacao_certificacao(),formaCertific.getFormacao_certificacao()) );        				
        				String anoConc = formaCertific.getAno_de_conclusao()==0?"":""+formaCertific.getAno_de_conclusao();
						row.setAno_de_conclusao(new Pair(anoConc,anoConc));
        				row.setFornecida_pela_nosi( new Pair(""+formaCertific.getFornecida_pela_nosi(),formaCertific.getFornecida_pela_nosi()==1?"Fornecida pela nosi":"") );
                        separatorlistDocs.add(row);
                    });
                    model.setSeparatorlist_2( separatorlistDocs);
                }
           
        }else{
        	view.ver_cv.setVisible(false);
      }
      view.btn_enviar.setVisible(!Boolean.parseBoolean(Core.getParam("CA")));
      view.form_nota_ca.setVisible(Boolean.parseBoolean(Core.getParam("CA")));
  
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionEnviar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Subscricao model = new Subscricao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("map_competencias","Subscricao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(enviar)----*/
		Session session = null;
		Transaction transaction = null;
		Colaborador colaborador  = new Colaborador().find().andWhere("email","=",model.getEmail()).one();
	       
	try{
	if (model.validate()) {
		session = Core.getSession(Core.defaultConnection());
		transaction = session.getTransaction();
		transaction.begin();
		
		String uuid = "";
		String email = "";
		String uuidPic = "";
          if(Core.isNotNull(model.getUuid())) {
            //Update
              uuid=model.getUuid();                 
              colaborador = (Colaborador) session.createQuery("select t from Colaborador t where t.uuid = :_c").setParameter("_c", uuid).getSingleResult();  
              if (colaborador != null && !colaborador.hasError()){	
            	  email=colaborador.getEmail();
            	  uuidPic=colaborador.getPicture();
            	  colaborador.setEstado("A");
              }
          }else{
             if (colaborador != null && !colaborador.hasError()){
               	Core.setMessageError("Este email já está subscrito!");				
              	sendEmail(model,colaborador.getUuid());
           		Core.setMessageInfo("Verifique o email e carregue no botão de atualizar!");
          		return this.forward("map_competencias","Subscricao","index",this.queryString());
            }else{
              colaborador  = new Colaborador();
            }
           
          }
  
		if (colaborador != null){
          String fase=colaborador.getFase();
          String nota_ca=colaborador.getNota_ca();
          String upload=colaborador.getUpload_cv();
			Core.mapper(model,colaborador);   
          if(Core.isNotNull(model.getSeu_curriculum_vitae_cv()) && model.getSeu_curriculum_vitae_cv().isUploaded()){
             if(Core.isNull(upload)){
            	 upload=Core.saveFileNGetUuid(model.getSeu_curriculum_vitae_cv());
             }else{
            	
              Core.updateFile(model.getSeu_curriculum_vitae_cv(),upload);
             }
          }         
          colaborador.setUpload_cv(upload);
            if(Core.isNull(uuid)) {
                //Insert new
                   colaborador.generateUid();
                   uuid = colaborador.getUuid();
                }else{
                  //Update don't change de email and uuidPic
                  colaborador.setEmail(email);   
                  colaborador.setPicture(uuidPic);
          	      colaborador.setFase(fase);
                  colaborador.setNota_ca(nota_ca);
                 
                }
            if(model.getComportamental()!= null)
            	colaborador.setComportamental(String.join("; ",model.getComportamental()));
            if(model.getOrganizacionais()!= null)
            	colaborador.setOrganizacionais(String.join("; ",model.getOrganizacionais()));
            if(model.getEstrategica()!= null)
            	colaborador.setEstrategica(String.join("; ",model.getEstrategica()));
          
            //If a user upload a picture, picture uuid will not be null
            if(Core.isNotNull(model.getPicture_uuid()))
             	colaborador.setPicture(model.getPicture_uuid());
		}
		
		if(Core.isNotNull(model.getUuid()))
			session.update(colaborador);
		else
			session.persist(colaborador);
   	
		List<String> prodfuncaoeditList = new ArrayList<>();
		String [] prodfuncaodeletedIdsArray = model.getP_separatorlist_1_del();
		if(model.getP_separatorlist_1_edit() != null){
			prodfuncaoeditList =  new ArrayList<>(Arrays.asList(model.getP_separatorlist_1_edit()));
		}
		int orderP=0;
		for(Subscricao.Separatorlist_1 row : model.getSeparatorlist_1()){
			ProdFuncao prodfuncao = new ProdFuncao();
			if( Core.isNotNullMultiple(row.getSeparatorlist_1_id(),row.getSeparatorlist_1_id().getKey()) ){
//				if(!prodfuncaoeditList.isEmpty() && prodfuncaoeditList.remove(row.getSeparatorlist_1_id().getKey())) {		
				
				if(Core.isNotNull(prodfuncaodeletedIdsArray) && prodfuncaodeletedIdsArray.toString().contains(row.getSeparatorlist_1_id().getKey()))
					continue;
					prodfuncao = session.find(ProdFuncao.class, Core.toInt(row.getSeparatorlist_1_id().getKey()));							
			}
			
			
			
			prodfuncao.setColaborador(colaborador);
			prodfuncao.setEm_curso(Core.toInt(row.getEm_curso().getKey()));
			prodfuncao.setProduto(row.getProduto().getKey());
			prodfuncao.setFuncao_desempenhada(row.getFuncao_desempenhada().getKey());
			prodfuncao.setOrdem(++orderP);
			if(Core.isNotNullOrZero(prodfuncao.getId()))
				session.update(prodfuncao);
			else
				session.persist(prodfuncao);			
		}		
	
		if ( Core.isNotNull(prodfuncaodeletedIdsArray ) ) {
		for ( String docId : prodfuncaodeletedIdsArray ) {
			if ( Core.isNotNull( docId ) && !docId.isEmpty() ) {
				ProdFuncao prodfuncao = session.find(ProdFuncao.class, Core.toInt(docId));
				session.delete(prodfuncao);
				}
			}
		}
		List<String> formacertificeditList = new ArrayList<>();
		String [] formacertificdeletedIdsArray = model.getP_separatorlist_2_del();
		if(model.getP_separatorlist_2_edit() != null){
			formacertificeditList =  new ArrayList<>(Arrays.asList(model.getP_separatorlist_2_edit()));
		}
		int orderF=0;
		for(Subscricao.Separatorlist_2 row : model.getSeparatorlist_2()){
			FormaCertific formacertific = new FormaCertific();
			if( Core.isNotNull( row.getSeparatorlist_2_id()) && Core.isNotNull( row.getSeparatorlist_2_id().getKey())){
				//if(!formacertificeditList.isEmpty() && formacertificeditList.remove(row.getSeparatorlist_2_id().getKey())) {
					
				if(Core.isNotNull(formacertificdeletedIdsArray) && formacertificdeletedIdsArray.toString().contains(row.getSeparatorlist_2_id().getKey()))
					continue;
				formacertific = session.find(FormaCertific.class, Core.toInt(row.getSeparatorlist_2_id().getKey()));
					
//					continue;
			}
			formacertific.setColaborador(colaborador);	
			formacertific.setFornecida_pela_nosi(Core.toInt(row.getFornecida_pela_nosi().getKey()));
			formacertific.setFormacao_certificacao(row.getFormacao_certificacao().getKey());
			formacertific.setAno_de_conclusao(Core.toInt(row.getAno_de_conclusao().getKey()));
			formacertific.setOrdem(++orderF);
			if(Core.isNotNullOrZero(formacertific.getId()))
				session.update(formacertific);
			else
				session.persist(formacertific);
		
		}
		
		if ( Core.isNotNull(formacertificdeletedIdsArray ) ) {
		for ( String docId : formacertificdeletedIdsArray ) {
			if ( Core.isNotNull( docId ) && !docId.isEmpty() ) {
				FormaCertific formacertific = session.find(FormaCertific.class, Core.toInt(docId));
				session.delete(formacertific);
				}
			}
		}
		
		transaction.commit();
		sendEmail(model,uuid);
		Core.setMessageSuccess();
      
	}
	else{   
		this.addQueryString("erro", true);
		this.addQueryString("linkfoto",colaborador.getPicture());
        return this.forward("map_competencias","Subscricao","index",this.queryString());
    }
		
	}catch ( Exception e ) {
		Core.setMessageError("Error: "+ e.getLocalizedMessage());
		if (transaction != null)
			transaction.rollback();
		this.addQueryString("erro", true);
		this.addQueryString("linkfoto",colaborador.getPicture());
      return this.forward("map_competencias","Subscricao","index",this.queryString());
	}finally {
		if (session != null && session.isOpen()) {
			session.close();
		}
	}
	
		if(Core.isNotNull(model.getUuid()))
			this.addQueryString("p_uuid", model.getUuid());
	
		/*----#end-code----*/
		return this.redirect("map_competencias","Subscricao","index", this.queryString());	
	}
	
	public Response actionGuardar() throws IOException, IllegalArgumentException, IllegalAccessException{
		Subscricao model = new Subscricao();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("map_competencias","Subscricao","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/*----#start-code(guardar)----*/
		Colaborador colaborador = new Colaborador().find().andWhere("uuid","=",model.getUuid()).one();
        this.addQueryString("CA",true);
          if(colaborador!=null){
            colaborador.setFase(model.getFase());
            colaborador.setNota_ca(model.getNota_ca());
            colaborador.update();
            if(!colaborador.hasError())
              Core.setMessageSuccess();
            else
                Core.setMessageError();   
            return this.forward("map_competencias","Subscricao","index",this.queryString()); 
          }
		
		/*----#end-code----*/
		return this.redirect("map_competencias","Subscricao","index", this.queryString());	
	}
	
		
		
/*----#start-code(custom_actions)----*/
	
	class SortbyOrder implements Comparator<FormaCertific> {
		public int compare(FormaCertific a, FormaCertific b) {
			if(Core.isNotNullMultiple(b.getOrdem(),a.getOrdem()))
				return a.getOrdem() - b.getOrdem();
			else
				return 0;
		}

	}
	class SortbyOrderF implements Comparator<ProdFuncao> {
		public int compare(ProdFuncao a, ProdFuncao b) {
			if(Core.isNotNullMultiple(b.getOrdem(),a.getOrdem()))
				return a.getOrdem() - b.getOrdem();
			else
				return 0;
		}

	}
	
	private void sendEmail(final Subscricao model, final String uuid) {
		   
		    String url_ = Igrp.getInstance().getRequest().getRequestURL() + "?r=map_competencias/Subscricao/index&dad=map_competencias&isPublic=1&target=_blank&lang=pt_PT&p_uuid="+ uuid;
		    if(Core.isNull(uuid)){
		        final String msg = "<p>Sua subscrição, foi registada com sucesso!</p><p>Seu identificador único é " + uuid + ".</p>";
		      
		            if (Core.mail("no-reply@nosi.cv", model.getEmail(), "NOSi - confirmação da sua subscrição", EmailMessage.PdexTemplate.getCorpoFormatado("Mapeamento de competências", "Caro(a) Sr(a). " + model.getNome() + ".", new String[] { msg },  new String[] { "Ative a sua subscrição!" }, new String[] { url_+"&ativate=True" }, "https://nosi.cv/"), "utf-8", "html", null, "no-reply@nosi.cv")) {
		                Core.setMessageInfo("Email de ativação enviado para " + model.getEmail()+"!");
		            }
		            else {
		                Core.setMessageError("Email não foi enviado.");
		            }
		      

		      }else{
		              final String msg = "<p>Sua subscrição está ativa e atualizada com sucesso!</p>";
		       
		            if (Core.mail("no-reply@nosi.cv", model.getEmail(), "NOSi - atualização da sua subscrição", EmailMessage.PdexTemplate.getCorpoFormatado("Mapeamento de competências", "Caro(a) Sr(a). " + model.getNome() + ".", new String[] { msg }, new String[] { "Atualize a sua subscrição" }, new String[] { url_ }, "https://nosi.cv/"), "utf-8", "html", null, "no-reply@nosi.cv")) {
		                Core.setMessageInfo("Email enviado para " + model.getEmail());
		            }
		            else {
		                Core.setMessageError("Email não foi enviado.");
		            }
		        
   
		      
		    }
		    }

/*----#end-code----*/
}
