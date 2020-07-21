package nosi.webapps.map_competencias.dao;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
* igrpweb@nosi.cv
* 26-11-2019
*/
import nosi.base.ActiveRecord.BaseActiveRecord;

@Entity
@Table(name = "colaborador")
@NamedQuery(name = "Colaborador.findAll", query = "SELECT s FROM Colaborador s")
public class Colaborador extends BaseActiveRecord<Colaborador> implements Serializable {

	private static final long serialVersionUID = 261347633815879489L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private Integer id;

	@CreationTimestamp
	private LocalDateTime createDateTime;

	@UpdateTimestamp
	private LocalDateTime updateDateTime;

	private String uuid;
	@Column(nullable = false)
	private String nome;

	@Column(nullable = false, unique = true)
	private String email;
	private String data_nascimento;
	private Integer anos_exp_professional;
	private String data_de_entrada_nosi;
	private String departamento_atual;
	private Integer salario_atual_bruto;
	private String categoria;
	private String nivel;
	private String estado = "I"; // A -> Ativo; I -> InAtivo
	@Column(length = 4000)
	private String observacao;
	@Column(length = 4000)
	private String nota_ca;
	private String picture;
	private String habilitacao_literaria;
	private String comportamental;
	private String organizacionais;
	private String estrategica;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, mappedBy = "colaborador")
	private Set<ProdFuncao> prod_funcao;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, mappedBy = "colaborador")
	private Set<FormaCertific> formaCertific;
	private String fase="1REC";
	private String tipo_colaborador;
	private String upload_cv;
	

	public void generateUid() {
		this.uuid = java.util.UUID.randomUUID().toString().replaceAll("-", "");
	}

	public Integer getAnos_exp_professional() {
		return this.anos_exp_professional;
	}

	public String getCategoria() {
		return this.categoria;
	}

	/**
	 * @return the comportamental
	 */
	public String getComportamental() {
		return comportamental;
	}

	public String getData_de_entrada_nosi() {
		return this.data_de_entrada_nosi;
	}

	public String getData_nascimento() {
		return this.data_nascimento;
	}
	public String getDepartamento_atual() {
		return this.departamento_atual;
	}
	public String getEmail() {
		return this.email;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	public String getEstrategica() {
		return estrategica;
	}

	public String getFase() {
		return fase;
	}

	public Set<FormaCertific> getFormaCertific() {
		return formaCertific;
	}

	/**
	 * @return the habilitacao_literaria
	 */
	public String getHabilitacao_literaria() {
		return habilitacao_literaria;
	}

	public Integer getId() {
		return id;
	}

	public String getNivel() {
		return this.nivel;
	}

	public String getNome() {
		return this.nome;
	}

	public String getNota_ca() {
		return nota_ca;
	}

	public String getObservacao() {
		return observacao;
	}

	public String getOrganizacionais() {
		return organizacionais;
	}

	/**
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}

	public Set<ProdFuncao> getProd_funcao() {
		return prod_funcao;
	}

	public Integer getSalario_atual_bruto() {
		return this.salario_atual_bruto;
	}

	/**
	 * @return the tipo_colaborador
	 */
	public String getTipo_colaborador() {
		return tipo_colaborador;
	}

	/**
	 * @return the upload_cv
	 */
	public String getUpload_cv() {
		return upload_cv;
	}

	public String getUuid() {
		return uuid;
	}

	public void setAnos_exp_professional(Integer anos_exp_professional) {
		this.anos_exp_professional = anos_exp_professional;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * @param comportamental the comportamental to set
	 */
	public void setComportamental(String comportamental) {
		this.comportamental = comportamental;
	}

	public void setData_de_entrada_nosi(String data_de_entrada_nosi) {
		this.data_de_entrada_nosi = data_de_entrada_nosi;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public void setDepartamento_atual(String departamento_atual) {
		this.departamento_atual = departamento_atual;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setEstrategica(String estrategica) {
		this.estrategica = estrategica;
	}

	public void setFase(String fase) {
		this.fase = fase;
	}

	public void setFormaCertific(Set<FormaCertific> formaCertific) {
		this.formaCertific = formaCertific;
	}

	/**
	 * @param habilitacao_literaria the habilitacao_literaria to set
	 */
	public void setHabilitacao_literaria(String habilitacao_literaria) {
		this.habilitacao_literaria = habilitacao_literaria;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNota_ca(String nota_ca) {
		this.nota_ca = nota_ca;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public void setOrganizacionais(String organizacionais) {
		this.organizacionais = organizacionais;
	}

	/**
	 * @param picture the picture to set
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}

	public void setProd_funcao(Set<ProdFuncao> prod_funcao) {
		this.prod_funcao = prod_funcao;
	}

	public void setSalario_atual_bruto(Integer salario_atual_bruto) {
		this.salario_atual_bruto = salario_atual_bruto;
	}

	/**
	 * @param tipo_colaborador the tipo_colaborador to set
	 */
	public void setTipo_colaborador(String tipo_colaborador) {
		this.tipo_colaborador = tipo_colaborador;
	}

	/**
	 * @param upload_cv the upload_cv to set
	 */
	public void setUpload_cv(String upload_cv) {
		this.upload_cv = upload_cv;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}
