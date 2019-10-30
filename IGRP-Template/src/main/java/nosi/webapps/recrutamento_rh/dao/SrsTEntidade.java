package nosi.webapps.recrutamento_rh.dao;

import nosi.base.ActiveRecord.BaseActiveRecord;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * @author: NOSI / DUA - Amandio Assunção Semedo dos Santos
 * 2019-10-29
*/

@Entity
@Table(name="srs_t_entidade",schema="public")
@NamedQuery(name="SrsTEntidade.findAll", query="SELECT b FROM SrsTEntidade b")
public class SrsTEntidade extends BaseActiveRecord<SrsTEntidade> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable=false)
	private Integer id;
	@Column(name="codigo",nullable=true,length=15)
	private String codigo;
	@Column(name="nrc",nullable=false,length=20)
	private String nrc;
	@Column(name="nif",nullable=true,length=11)
	private Integer nif;
	@Column(name="nome",nullable=true,length=50)
	private String nome;
	@Column(name="estado",nullable=true,length=10)
	private String estado;
	@Temporal(TemporalType.DATE)
	@Column(name="dt_inicio",nullable=true,length=13)
	private Date dtInicio;
	@Temporal(TemporalType.DATE)
	@Column(name="dt_fim",nullable=true,length=13)
	private Date dtFim;
	@Column(name="user_id",nullable=true,length=11)
	private Integer userId;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNrc() {
		return nrc;
	}
	public void setNrc(String nrc) {
		this.nrc = nrc;
	}
	public Integer getNif() {
		return nif;
	}
	public void setNif(Integer nif) {
		this.nif = nif;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Date getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}
	public Date getDtFim() {
		return dtFim;
	}
	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}