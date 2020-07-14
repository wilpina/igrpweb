package nosi.webapps.map_competencias.dao;

/**
* igrpweb@nosi.cv
* 26-11-2019
*/
import nosi.base.ActiveRecord.BaseActiveRecord;
import java.io.Serializable;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.time.LocalDateTime;

import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.validator.constraints.*;

@Entity
@Table(name = "formacertific")
@NamedQuery(name = "FormaCertific.findAll", query = "SELECT s FROM FormaCertific s")
public class FormaCertific extends BaseActiveRecord<FormaCertific> implements Serializable {

	private static final long serialVersionUID = 26134763765879489L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false)
	private Integer id;

	@UpdateTimestamp
	private LocalDateTime updateDateTime;

	@ManyToOne
	@JoinColumn(name = "colaborador_fk", foreignKey = @ForeignKey(name = "Colaborador_ProdFuncao_FK"), nullable = true)
	private Colaborador colaborador;	
	
	private Integer fornecida_pela_nosi;
	@Column(length = 1000)
	private String formacao_certificacao;
	private Integer ano_de_conclusao;	
	
	private Integer ordem;	


	public Integer getFornecida_pela_nosi() {
		return fornecida_pela_nosi;
	}

	public void setFornecida_pela_nosi(Integer fornecida_pela_nosi) {
		this.fornecida_pela_nosi = fornecida_pela_nosi;
	}

	public String getFormacao_certificacao() {
		return formacao_certificacao;
	}

	public void setFormacao_certificacao(String formacao_certificacao) {
		this.formacao_certificacao = formacao_certificacao;
	}

	public Integer getAno_de_conclusao() {
		return ano_de_conclusao;
	}

	public void setAno_de_conclusao(Integer ano_de_conclusao) {
		this.ano_de_conclusao = ano_de_conclusao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	/**
	 * @return the ordem
	 */
	public Integer getOrdem() {
		return ordem;
	}

	/**
	 * @param ordem the ordem to set
	 */
	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	

}
