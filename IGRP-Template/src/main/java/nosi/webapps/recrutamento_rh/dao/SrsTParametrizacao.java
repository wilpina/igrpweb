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
 * 2019-10-30
*/

@Entity
@Table(name="srs_t_parametrizacao",schema="public")
@NamedQuery(name="SrsTParametrizacao.findAll", query="SELECT b FROM SrsTParametrizacao b")
public class SrsTParametrizacao extends BaseActiveRecord<SrsTParametrizacao> implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id", nullable=false)
	private Integer id;
	@Column(name="codigo",nullable=false,length=2147483647)
	private String codigo;
	@Column(name="descricao",nullable=false,length=20)
	private String descricao;
	@Column(name="tipo",nullable=true,length=15)
	private String tipo;
	@Temporal(TemporalType.DATE)
	@Column(name="dt_inicio",nullable=true,length=13)
	private Date dtInicio;
	@Temporal(TemporalType.DATE)
	@Column(name="dt_fim",nullable=true,length=13)
	private Date dtFim;
	@Column(name="estado",nullable=true,length=2)
	private String estado;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}