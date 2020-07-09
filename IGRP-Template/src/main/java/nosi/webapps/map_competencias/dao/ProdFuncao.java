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
@Table(name = "prodfuncao")
@NamedQuery(name = "ProdFuncao.findAll", query = "SELECT s FROM ProdFuncao s")
public class ProdFuncao extends BaseActiveRecord<ProdFuncao> implements Serializable {

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

	private Integer em_curso;
	private String funcao_desempenhada;
	private String produto;
	
	private Integer ordem;	

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
	 * @return the em_curso
	 */
	public Integer getEm_curso() {
		return em_curso;
	}

	/**
	 * @param em_curso the em_curso to set
	 */
	public void setEm_curso(Integer em_curso) {
		this.em_curso = em_curso;
	}

	/**
	 * @return the funcao_desempenhada
	 */
	public String getFuncao_desempenhada() {
		return funcao_desempenhada;
	}

	/**
	 * @param funcao_desempenhada the funcao_desempenhada to set
	 */
	public void setFuncao_desempenhada(String funcao_desempenhada) {
		this.funcao_desempenhada = funcao_desempenhada;
	}

	/**
	 * @return the produto
	 */
	public String getProduto() {
		return produto;
	}

	/**
	 * @param produto the produto to set
	 */
	public void setProduto(String produto) {
		this.produto = produto;
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
