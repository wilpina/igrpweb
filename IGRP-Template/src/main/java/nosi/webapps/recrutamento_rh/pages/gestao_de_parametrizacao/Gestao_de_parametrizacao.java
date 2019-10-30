package nosi.webapps.recrutamento_rh.pages.gestao_de_parametrizacao;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Gestao_de_parametrizacao extends Model{		

	@RParam(rParamName = "p_gest_parametrizacao_text")
	private String gest_parametrizacao_text;

	@RParam(rParamName = "p_entidade")
	private String entidade;

	@RParam(rParamName = "p_areas_formacao")
	private String areas_formacao;

	@RParam(rParamName = "p_area_de_emprego")
	private String area_de_emprego;

	@RParam(rParamName = "p_tp_doc")
	private String tp_doc;

	@RParam(rParamName = "p_tipo_de_concurso")
	private String tipo_de_concurso;

	@RParam(rParamName = "p_tp_form")
	private String tp_form;

	@RParam(rParamName = "p_idioma")
	private String idioma;

	@RParam(rParamName = "p_profissao")
	private String profissao;

	@RParam(rParamName = "p_cargos")
	private String cargos;

	@RParam(rParamName = "p_f_nome")
	private String f_nome;

	@RParam(rParamName = "p_f_codigo")
	private String f_codigo;

	@RParam(rParamName = "p_f_nif")
	private Integer f_nif;
	
	private List<Lista_af> lista_af = new ArrayList<>();	
	public void setLista_af(List<Lista_af> lista_af){
		this.lista_af = lista_af;
	}
	public List<Lista_af> getLista_af(){
		return this.lista_af;
	}

	
	private List<Table_3> table_3 = new ArrayList<>();	
	public void setTable_3(List<Table_3> table_3){
		this.table_3 = table_3;
	}
	public List<Table_3> getTable_3(){
		return this.table_3;
	}

	
	private List<Table_2> table_2 = new ArrayList<>();	
	public void setTable_2(List<Table_2> table_2){
		this.table_2 = table_2;
	}
	public List<Table_2> getTable_2(){
		return this.table_2;
	}

	
	private List<Tp_concurso> tp_concurso = new ArrayList<>();	
	public void setTp_concurso(List<Tp_concurso> tp_concurso){
		this.tp_concurso = tp_concurso;
	}
	public List<Tp_concurso> getTp_concurso(){
		return this.tp_concurso;
	}

	
	private List<Lista_forma> lista_forma = new ArrayList<>();	
	public void setLista_forma(List<Lista_forma> lista_forma){
		this.lista_forma = lista_forma;
	}
	public List<Lista_forma> getLista_forma(){
		return this.lista_forma;
	}

	
	private List<Lista_idioma> lista_idioma = new ArrayList<>();	
	public void setLista_idioma(List<Lista_idioma> lista_idioma){
		this.lista_idioma = lista_idioma;
	}
	public List<Lista_idioma> getLista_idioma(){
		return this.lista_idioma;
	}

	
	private List<Lista_profissao> lista_profissao = new ArrayList<>();	
	public void setLista_profissao(List<Lista_profissao> lista_profissao){
		this.lista_profissao = lista_profissao;
	}
	public List<Lista_profissao> getLista_profissao(){
		return this.lista_profissao;
	}

	
	private List<List_cargo> list_cargo = new ArrayList<>();	
	public void setList_cargo(List<List_cargo> list_cargo){
		this.list_cargo = list_cargo;
	}
	public List<List_cargo> getList_cargo(){
		return this.list_cargo;
	}

	
	private List<Lista_entidade> lista_entidade = new ArrayList<>();	
	public void setLista_entidade(List<Lista_entidade> lista_entidade){
		this.lista_entidade = lista_entidade;
	}
	public List<Lista_entidade> getLista_entidade(){
		return this.lista_entidade;
	}

	
	public void setGest_parametrizacao_text(String gest_parametrizacao_text){
		this.gest_parametrizacao_text = gest_parametrizacao_text;
	}
	public String getGest_parametrizacao_text(){
		return this.gest_parametrizacao_text;
	}
	
	public void setEntidade(String entidade){
		this.entidade = entidade;
	}
	public String getEntidade(){
		return this.entidade;
	}
	
	public void setAreas_formacao(String areas_formacao){
		this.areas_formacao = areas_formacao;
	}
	public String getAreas_formacao(){
		return this.areas_formacao;
	}
	
	public void setArea_de_emprego(String area_de_emprego){
		this.area_de_emprego = area_de_emprego;
	}
	public String getArea_de_emprego(){
		return this.area_de_emprego;
	}
	
	public void setTp_doc(String tp_doc){
		this.tp_doc = tp_doc;
	}
	public String getTp_doc(){
		return this.tp_doc;
	}
	
	public void setTipo_de_concurso(String tipo_de_concurso){
		this.tipo_de_concurso = tipo_de_concurso;
	}
	public String getTipo_de_concurso(){
		return this.tipo_de_concurso;
	}
	
	public void setTp_form(String tp_form){
		this.tp_form = tp_form;
	}
	public String getTp_form(){
		return this.tp_form;
	}
	
	public void setIdioma(String idioma){
		this.idioma = idioma;
	}
	public String getIdioma(){
		return this.idioma;
	}
	
	public void setProfissao(String profissao){
		this.profissao = profissao;
	}
	public String getProfissao(){
		return this.profissao;
	}
	
	public void setCargos(String cargos){
		this.cargos = cargos;
	}
	public String getCargos(){
		return this.cargos;
	}
	
	public void setF_nome(String f_nome){
		this.f_nome = f_nome;
	}
	public String getF_nome(){
		return this.f_nome;
	}
	
	public void setF_codigo(String f_codigo){
		this.f_codigo = f_codigo;
	}
	public String getF_codigo(){
		return this.f_codigo;
	}
	
	public void setF_nif(Integer f_nif){
		this.f_nif = f_nif;
	}
	public Integer getF_nif(){
		return this.f_nif;
	}


	public static class Lista_af extends IGRPTable.Table{
		private String area_de_formacao;
		private String f_estado;
		private String id_area_formacao;
		public void setArea_de_formacao(String area_de_formacao){
			this.area_de_formacao = area_de_formacao;
		}
		public String getArea_de_formacao(){
			return this.area_de_formacao;
		}

		public void setF_estado(String f_estado){
			this.f_estado = f_estado;
		}
		public String getF_estado(){
			return this.f_estado;
		}

		public void setId_area_formacao(String id_area_formacao){
			this.id_area_formacao = id_area_formacao;
		}
		public String getId_area_formacao(){
			return this.id_area_formacao;
		}

	}
	public static class Table_3 extends IGRPTable.Table{
		private String emp_codigo;
		private String emp_descricao;
		private String estado_emp;
		private String id_area_emprego;
		public void setEmp_codigo(String emp_codigo){
			this.emp_codigo = emp_codigo;
		}
		public String getEmp_codigo(){
			return this.emp_codigo;
		}

		public void setEmp_descricao(String emp_descricao){
			this.emp_descricao = emp_descricao;
		}
		public String getEmp_descricao(){
			return this.emp_descricao;
		}

		public void setEstado_emp(String estado_emp){
			this.estado_emp = estado_emp;
		}
		public String getEstado_emp(){
			return this.estado_emp;
		}

		public void setId_area_emprego(String id_area_emprego){
			this.id_area_emprego = id_area_emprego;
		}
		public String getId_area_emprego(){
			return this.id_area_emprego;
		}

	}
	public static class Table_2 extends IGRPTable.Table{
		private String doc_codigo;
		private String doc_descricao;
		private String doc_estado;
		private String id_tp_doc;
		public void setDoc_codigo(String doc_codigo){
			this.doc_codigo = doc_codigo;
		}
		public String getDoc_codigo(){
			return this.doc_codigo;
		}

		public void setDoc_descricao(String doc_descricao){
			this.doc_descricao = doc_descricao;
		}
		public String getDoc_descricao(){
			return this.doc_descricao;
		}

		public void setDoc_estado(String doc_estado){
			this.doc_estado = doc_estado;
		}
		public String getDoc_estado(){
			return this.doc_estado;
		}

		public void setId_tp_doc(String id_tp_doc){
			this.id_tp_doc = id_tp_doc;
		}
		public String getId_tp_doc(){
			return this.id_tp_doc;
		}

	}
	public static class Tp_concurso extends IGRPTable.Table{
		private String codigo;
		private String descricao_tpconcurso;
		private String estado_tc;
		private String id_tp_con;
		public void setCodigo(String codigo){
			this.codigo = codigo;
		}
		public String getCodigo(){
			return this.codigo;
		}

		public void setDescricao_tpconcurso(String descricao_tpconcurso){
			this.descricao_tpconcurso = descricao_tpconcurso;
		}
		public String getDescricao_tpconcurso(){
			return this.descricao_tpconcurso;
		}

		public void setEstado_tc(String estado_tc){
			this.estado_tc = estado_tc;
		}
		public String getEstado_tc(){
			return this.estado_tc;
		}

		public void setId_tp_con(String id_tp_con){
			this.id_tp_con = id_tp_con;
		}
		public String getId_tp_con(){
			return this.id_tp_con;
		}

	}
	public static class Lista_forma extends IGRPTable.Table{
		private String codigo_tp_form;
		private String descri_tp_form;
		private String estado_tp_form;
		private String id_tp_for;
		public void setCodigo_tp_form(String codigo_tp_form){
			this.codigo_tp_form = codigo_tp_form;
		}
		public String getCodigo_tp_form(){
			return this.codigo_tp_form;
		}

		public void setDescri_tp_form(String descri_tp_form){
			this.descri_tp_form = descri_tp_form;
		}
		public String getDescri_tp_form(){
			return this.descri_tp_form;
		}

		public void setEstado_tp_form(String estado_tp_form){
			this.estado_tp_form = estado_tp_form;
		}
		public String getEstado_tp_form(){
			return this.estado_tp_form;
		}

		public void setId_tp_for(String id_tp_for){
			this.id_tp_for = id_tp_for;
		}
		public String getId_tp_for(){
			return this.id_tp_for;
		}

	}
	public static class Lista_idioma extends IGRPTable.Table{
		private String codigo_idioma;
		private String tp_idioma;
		private String estado_idioma;
		private String id_idioma;
		public void setCodigo_idioma(String codigo_idioma){
			this.codigo_idioma = codigo_idioma;
		}
		public String getCodigo_idioma(){
			return this.codigo_idioma;
		}

		public void setTp_idioma(String tp_idioma){
			this.tp_idioma = tp_idioma;
		}
		public String getTp_idioma(){
			return this.tp_idioma;
		}

		public void setEstado_idioma(String estado_idioma){
			this.estado_idioma = estado_idioma;
		}
		public String getEstado_idioma(){
			return this.estado_idioma;
		}

		public void setId_idioma(String id_idioma){
			this.id_idioma = id_idioma;
		}
		public String getId_idioma(){
			return this.id_idioma;
		}

	}
	public static class Lista_profissao extends IGRPTable.Table{
		private String codigo_prof;
		private String descricao_profissao;
		private String estado_prof;
		private String id_profissao;
		public void setCodigo_prof(String codigo_prof){
			this.codigo_prof = codigo_prof;
		}
		public String getCodigo_prof(){
			return this.codigo_prof;
		}

		public void setDescricao_profissao(String descricao_profissao){
			this.descricao_profissao = descricao_profissao;
		}
		public String getDescricao_profissao(){
			return this.descricao_profissao;
		}

		public void setEstado_prof(String estado_prof){
			this.estado_prof = estado_prof;
		}
		public String getEstado_prof(){
			return this.estado_prof;
		}

		public void setId_profissao(String id_profissao){
			this.id_profissao = id_profissao;
		}
		public String getId_profissao(){
			return this.id_profissao;
		}

	}
	public static class List_cargo extends IGRPTable.Table{
		private String cargo;
		private String estado_cargo;
		private String id_cargo;
		public void setCargo(String cargo){
			this.cargo = cargo;
		}
		public String getCargo(){
			return this.cargo;
		}

		public void setEstado_cargo(String estado_cargo){
			this.estado_cargo = estado_cargo;
		}
		public String getEstado_cargo(){
			return this.estado_cargo;
		}

		public void setId_cargo(String id_cargo){
			this.id_cargo = id_cargo;
		}
		public String getId_cargo(){
			return this.id_cargo;
		}

	}
	public static class Lista_entidade extends IGRPTable.Table{
		private String codigo_entidade;
		private Integer nif;
		private String nome;
		private String estado;
		private String id_entidade;
		public void setCodigo_entidade(String codigo_entidade){
			this.codigo_entidade = codigo_entidade;
		}
		public String getCodigo_entidade(){
			return this.codigo_entidade;
		}

		public void setNif(Integer nif){
			this.nif = nif;
		}
		public Integer getNif(){
			return this.nif;
		}

		public void setNome(String nome){
			this.nome = nome;
		}
		public String getNome(){
			return this.nome;
		}

		public void setEstado(String estado){
			this.estado = estado;
		}
		public String getEstado(){
			return this.estado;
		}

		public void setId_entidade(String id_entidade){
			this.id_entidade = id_entidade;
		}
		public String getId_entidade(){
			return this.id_entidade;
		}

	}

	public void loadLista_af(BaseQueryInterface query) {
		this.setLista_af(this.loadTable(query,Lista_af.class));
	}

	public void loadTable_3(BaseQueryInterface query) {
		this.setTable_3(this.loadTable(query,Table_3.class));
	}

	public void loadTable_2(BaseQueryInterface query) {
		this.setTable_2(this.loadTable(query,Table_2.class));
	}

	public void loadTp_concurso(BaseQueryInterface query) {
		this.setTp_concurso(this.loadTable(query,Tp_concurso.class));
	}

	public void loadLista_forma(BaseQueryInterface query) {
		this.setLista_forma(this.loadTable(query,Lista_forma.class));
	}

	public void loadLista_idioma(BaseQueryInterface query) {
		this.setLista_idioma(this.loadTable(query,Lista_idioma.class));
	}

	public void loadLista_profissao(BaseQueryInterface query) {
		this.setLista_profissao(this.loadTable(query,Lista_profissao.class));
	}

	public void loadList_cargo(BaseQueryInterface query) {
		this.setList_cargo(this.loadTable(query,List_cargo.class));
	}

	public void loadLista_entidade(BaseQueryInterface query) {
		this.setLista_entidade(this.loadTable(query,Lista_entidade.class));
	}

}
