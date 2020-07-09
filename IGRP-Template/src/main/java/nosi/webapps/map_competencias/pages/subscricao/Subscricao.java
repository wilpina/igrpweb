package nosi.webapps.map_competencias.pages.subscricao;

import nosi.core.gui.components.IGRPLink;
import nosi.core.webapp.Report;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.webapp.SeparatorList;
import java.util.ArrayList;
import java.util.List;
import nosi.core.webapp.uploadfile.UploadFile;
import javax.validation.Valid;
import nosi.core.validator.constraints.*;

public class Subscricao extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;
	
	@RParam(rParamName = "p_picture")
	private String picture;
	@RParam(rParamName = "p_picture_uuid")
	private String picture_uuid;

	@RParam(rParamName = "p_click_na_foto_clicando")
	private String click_na_foto_clicando;

	@NotNull()
	@RParam(rParamName = "p_nome")
	private String nome;

	@NotNull()
	@RParam(rParamName = "p_email")
	private String email;

	@NotNull()
	@RParam(rParamName = "p_data_nascimento")
	private String data_nascimento;

	@NotNull()
	@RParam(rParamName = "p_habilitacao_literaria")
	private String habilitacao_literaria;

	@NotNull()
	@RParam(rParamName = "p_tipo_colaborador")
	private String tipo_colaborador;

	@NotNull()
	@Max(value="300")
	@RParam(rParamName = "p_anos_exp_professional")
	private Integer anos_exp_professional;

	@RParam(rParamName = "p_ver_cv")
	private IGRPLink ver_cv;
	@RParam(rParamName = "p_ver_cv_desc")
	private String ver_cv_desc;

	@RParam(rParamName = "p_seu_curriculum_vitae_cv")
	private UploadFile seu_curriculum_vitae_cv;

	@NotNull()
	@RParam(rParamName = "p_data_de_entrada_nosi")
	private String data_de_entrada_nosi;

	@NotNull()
	@Max(value="300")
	@RParam(rParamName = "p_salario_atual_bruto")
	private Integer salario_atual_bruto;

	@NotNull()
	@RParam(rParamName = "p_departamento_atual")
	private String departamento_atual;

	@RParam(rParamName = "p_enquadramento_pccs")
	private String enquadramento_pccs;

	@RParam(rParamName = "p_categoria")
	private String categoria;

	@RParam(rParamName = "p_nivel")
	private String nivel;

	@RParam(rParamName = "p_foto_pccs_deliberado_em_2016")
	private IGRPLink foto_pccs_deliberado_em_2016;
	@RParam(rParamName = "p_foto_pccs_deliberado_em_2016_desc")
	private String foto_pccs_deliberado_em_2016_desc;

	@RParam(rParamName = "p_uuid")
	private String uuid;

	@RParam(rParamName = "p_competencias_importantes")
	private String competencias_importantes;

	@RParam(rParamName = "p_comportamental")
	private String[] comportamental;

	@RParam(rParamName = "p_organizacionais")
	private String[] organizacionais;

	@RParam(rParamName = "p_estrategica")
	private String[] estrategica;

	@RParam(rParamName = "p_extra")
	private String extra;

	@RParam(rParamName = "p_observacao")
	private String observacao;

	@RParam(rParamName = "p_fase")
	private String fase;

	@RParam(rParamName = "p_nota_ca")
	private String nota_ca;
	
	@SeparatorList(name = Separatorlist_1.class)
	@Valid
	private List<Separatorlist_1> separatorlist_1 = new ArrayList<>();	
	public void setSeparatorlist_1(List<Separatorlist_1> separatorlist_1){
		this.separatorlist_1 = separatorlist_1;
	}
	public List<Separatorlist_1> getSeparatorlist_1(){
		return this.separatorlist_1;
	}
	@RParam(rParamName = "p_separatorlist_1_id")
	private String[] p_separatorlist_1_id;
	@RParam(rParamName = "p_separatorlist_1_del")
	private String[] p_separatorlist_1_del;
	@RParam(rParamName = "p_separatorlist_1_edit")
	private String[] p_separatorlist_1_edit;
	
	public void setP_separatorlist_1_id(String[] p_separatorlist_1_id){
		this.p_separatorlist_1_id = p_separatorlist_1_id;
	}
	public String[] getP_separatorlist_1_id(){
		return this.p_separatorlist_1_id;
	}
	
	public void setP_separatorlist_1_del(String[] p_separatorlist_1_del){
		this.p_separatorlist_1_del = p_separatorlist_1_del;
	}
	public String[] getP_separatorlist_1_del(){
		return this.p_separatorlist_1_del;
	}
	
	public void setP_separatorlist_1_edit(String[] p_separatorlist_1_edit){
		this.p_separatorlist_1_edit = p_separatorlist_1_edit;
	}
	public String[] getP_separatorlist_1_edit(){
		return this.p_separatorlist_1_edit;
	}
	
	@SeparatorList(name = Separatorlist_2.class)
	@Valid
	private List<Separatorlist_2> separatorlist_2 = new ArrayList<>();	
	public void setSeparatorlist_2(List<Separatorlist_2> separatorlist_2){
		this.separatorlist_2 = separatorlist_2;
	}
	public List<Separatorlist_2> getSeparatorlist_2(){
		return this.separatorlist_2;
	}
	@RParam(rParamName = "p_separatorlist_2_id")
	private String[] p_separatorlist_2_id;
	@RParam(rParamName = "p_separatorlist_2_del")
	private String[] p_separatorlist_2_del;
	@RParam(rParamName = "p_separatorlist_2_edit")
	private String[] p_separatorlist_2_edit;
	
	public void setP_separatorlist_2_id(String[] p_separatorlist_2_id){
		this.p_separatorlist_2_id = p_separatorlist_2_id;
	}
	public String[] getP_separatorlist_2_id(){
		return this.p_separatorlist_2_id;
	}
	
	public void setP_separatorlist_2_del(String[] p_separatorlist_2_del){
		this.p_separatorlist_2_del = p_separatorlist_2_del;
	}
	public String[] getP_separatorlist_2_del(){
		return this.p_separatorlist_2_del;
	}
	
	public void setP_separatorlist_2_edit(String[] p_separatorlist_2_edit){
		this.p_separatorlist_2_edit = p_separatorlist_2_edit;
	}
	public String[] getP_separatorlist_2_edit(){
		return this.p_separatorlist_2_edit;
	}
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setPicture(String picture){
		this.picture = picture;
	}
	public String getPicture(){
		return this.picture;
	}
	public void setPicture_uuid(String picture_uuid){
		this.picture_uuid = picture_uuid;
	}
	public String getPicture_uuid(){
		return this.picture_uuid;
	}
	
	public void setClick_na_foto_clicando(String click_na_foto_clicando){
		this.click_na_foto_clicando = click_na_foto_clicando;
	}
	public String getClick_na_foto_clicando(){
		return this.click_na_foto_clicando;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return this.email;
	}
	
	public void setData_nascimento(String data_nascimento){
		this.data_nascimento = data_nascimento;
	}
	public String getData_nascimento(){
		return this.data_nascimento;
	}
	
	public void setHabilitacao_literaria(String habilitacao_literaria){
		this.habilitacao_literaria = habilitacao_literaria;
	}
	public String getHabilitacao_literaria(){
		return this.habilitacao_literaria;
	}
	
	public void setTipo_colaborador(String tipo_colaborador){
		this.tipo_colaborador = tipo_colaborador;
	}
	public String getTipo_colaborador(){
		return this.tipo_colaborador;
	}
	
	public void setAnos_exp_professional(Integer anos_exp_professional){
		this.anos_exp_professional = anos_exp_professional;
	}
	public Integer getAnos_exp_professional(){
		return this.anos_exp_professional;
	}
	
	public IGRPLink setVer_cv(String app,String page,String action){
		this.ver_cv = new IGRPLink(app,page,action);
		return this.ver_cv;
	}
	public IGRPLink getVer_cv(){
		return this.ver_cv;
	}
	public void setVer_cv_desc(String ver_cv_desc){
		this.ver_cv_desc = ver_cv_desc;
	}
	public String getVer_cv_desc(){
		return this.ver_cv_desc;
	}
	public IGRPLink setVer_cv(String link){
		this.ver_cv = new IGRPLink(link);
		return this.ver_cv;
	}
	public IGRPLink setVer_cv(Report link){
		this.ver_cv = new IGRPLink(link);
		return this.ver_cv;
	}
	
	public void setSeu_curriculum_vitae_cv(UploadFile seu_curriculum_vitae_cv){
		this.seu_curriculum_vitae_cv = seu_curriculum_vitae_cv;
	}
	public UploadFile getSeu_curriculum_vitae_cv(){
		return this.seu_curriculum_vitae_cv;
	}
	
	public void setData_de_entrada_nosi(String data_de_entrada_nosi){
		this.data_de_entrada_nosi = data_de_entrada_nosi;
	}
	public String getData_de_entrada_nosi(){
		return this.data_de_entrada_nosi;
	}
	
	public void setSalario_atual_bruto(Integer salario_atual_bruto){
		this.salario_atual_bruto = salario_atual_bruto;
	}
	public Integer getSalario_atual_bruto(){
		return this.salario_atual_bruto;
	}
	
	public void setDepartamento_atual(String departamento_atual){
		this.departamento_atual = departamento_atual;
	}
	public String getDepartamento_atual(){
		return this.departamento_atual;
	}
	
	public void setEnquadramento_pccs(String enquadramento_pccs){
		this.enquadramento_pccs = enquadramento_pccs;
	}
	public String getEnquadramento_pccs(){
		return this.enquadramento_pccs;
	}
	
	public void setCategoria(String categoria){
		this.categoria = categoria;
	}
	public String getCategoria(){
		return this.categoria;
	}
	
	public void setNivel(String nivel){
		this.nivel = nivel;
	}
	public String getNivel(){
		return this.nivel;
	}
	
	public IGRPLink setFoto_pccs_deliberado_em_2016(String app,String page,String action){
		this.foto_pccs_deliberado_em_2016 = new IGRPLink(app,page,action);
		return this.foto_pccs_deliberado_em_2016;
	}
	public IGRPLink getFoto_pccs_deliberado_em_2016(){
		return this.foto_pccs_deliberado_em_2016;
	}
	public void setFoto_pccs_deliberado_em_2016_desc(String foto_pccs_deliberado_em_2016_desc){
		this.foto_pccs_deliberado_em_2016_desc = foto_pccs_deliberado_em_2016_desc;
	}
	public String getFoto_pccs_deliberado_em_2016_desc(){
		return this.foto_pccs_deliberado_em_2016_desc;
	}
	public IGRPLink setFoto_pccs_deliberado_em_2016(String link){
		this.foto_pccs_deliberado_em_2016 = new IGRPLink(link);
		return this.foto_pccs_deliberado_em_2016;
	}
	public IGRPLink setFoto_pccs_deliberado_em_2016(Report link){
		this.foto_pccs_deliberado_em_2016 = new IGRPLink(link);
		return this.foto_pccs_deliberado_em_2016;
	}
	
	public void setUuid(String uuid){
		this.uuid = uuid;
	}
	public String getUuid(){
		return this.uuid;
	}
	
	public void setCompetencias_importantes(String competencias_importantes){
		this.competencias_importantes = competencias_importantes;
	}
	public String getCompetencias_importantes(){
		return this.competencias_importantes;
	}
	
	public void setComportamental(String[] comportamental){
		this.comportamental = comportamental;
	}
	public String[] getComportamental(){
		return this.comportamental;
	}
	
	public void setOrganizacionais(String[] organizacionais){
		this.organizacionais = organizacionais;
	}
	public String[] getOrganizacionais(){
		return this.organizacionais;
	}
	
	public void setEstrategica(String[] estrategica){
		this.estrategica = estrategica;
	}
	public String[] getEstrategica(){
		return this.estrategica;
	}
	
	public void setExtra(String extra){
		this.extra = extra;
	}
	public String getExtra(){
		return this.extra;
	}
	
	public void setObservacao(String observacao){
		this.observacao = observacao;
	}
	public String getObservacao(){
		return this.observacao;
	}
	
	public void setFase(String fase){
		this.fase = fase;
	}
	public String getFase(){
		return this.fase;
	}
	
	public void setNota_ca(String nota_ca){
		this.nota_ca = nota_ca;
	}
	public String getNota_ca(){
		return this.nota_ca;
	}


	public static class Separatorlist_1{
		private Pair separatorlist_1_id;
private Pair funcao_desempenhada;
private Pair produto;
private Pair em_curso;
		private Pair em_curso_check;
		public void setSeparatorlist_1_id(Pair separatorlist_1_id){
			this.separatorlist_1_id = separatorlist_1_id;
		}
		public Pair getSeparatorlist_1_id(){
			return this.separatorlist_1_id;
		}
		public void setFuncao_desempenhada(Pair funcao_desempenhada){
			this.funcao_desempenhada = funcao_desempenhada;
		}
		public Pair getFuncao_desempenhada(){
			return this.funcao_desempenhada;
		}

		public void setProduto(Pair produto){
			this.produto = produto;
		}
		public Pair getProduto(){
			return this.produto;
		}

		public void setEm_curso(Pair em_curso){
			this.em_curso = em_curso;
		}
		public Pair getEm_curso(){
			return this.em_curso;
		}
		
		public void setEm_curso_check(Pair em_curso_check){
			this.em_curso_check = em_curso_check;
		}
		public Pair getEm_curso_check(){
			return this.em_curso_check;
		}

	}
	public static class Separatorlist_2{
		private Pair separatorlist_2_id;
private Pair formacao_certificacao;
	@PairMin(value="1975")
private Pair ano_de_conclusao;
private Pair fornecida_pela_nosi;
		private Pair fornecida_pela_nosi_check;
		public void setSeparatorlist_2_id(Pair separatorlist_2_id){
			this.separatorlist_2_id = separatorlist_2_id;
		}
		public Pair getSeparatorlist_2_id(){
			return this.separatorlist_2_id;
		}
		public void setFormacao_certificacao(Pair formacao_certificacao){
			this.formacao_certificacao = formacao_certificacao;
		}
		public Pair getFormacao_certificacao(){
			return this.formacao_certificacao;
		}

		public void setAno_de_conclusao(Pair ano_de_conclusao){
			this.ano_de_conclusao = ano_de_conclusao;
		}
		public Pair getAno_de_conclusao(){
			return this.ano_de_conclusao;
		}

		public void setFornecida_pela_nosi(Pair fornecida_pela_nosi){
			this.fornecida_pela_nosi = fornecida_pela_nosi;
		}
		public Pair getFornecida_pela_nosi(){
			return this.fornecida_pela_nosi;
		}
		
		public void setFornecida_pela_nosi_check(Pair fornecida_pela_nosi_check){
			this.fornecida_pela_nosi_check = fornecida_pela_nosi_check;
		}
		public Pair getFornecida_pela_nosi_check(){
			return this.fornecida_pela_nosi_check;
		}

	}

	public void loadSeparatorlist_1(BaseQueryInterface query) {
		this.setSeparatorlist_1(this.loadFormList(query,Separatorlist_1.class));
	}

	public void loadSeparatorlist_2(BaseQueryInterface query) {
		this.setSeparatorlist_2(this.loadFormList(query,Separatorlist_2.class));
	}

}
