package nosi.webapps.map_competencias.pages.colaboradorlist;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class ColaboradorList extends Model{		

	@RParam(rParamName = "p_departamento")
	private String departamento;

	@RParam(rParamName = "p_tipo_colaborador")
	private String tipo_colaborador;

	@RParam(rParamName = "p_form_1_img_1")
	private String form_1_img_1;
	@RParam(rParamName = "p_form_1_img_1_uuid")
	private String form_1_img_1_uuid;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	public String getDepartamento(){
		return this.departamento;
	}
	
	public void setTipo_colaborador(String tipo_colaborador){
		this.tipo_colaborador = tipo_colaborador;
	}
	public String getTipo_colaborador(){
		return this.tipo_colaborador;
	}
	
	public void setForm_1_img_1(String form_1_img_1){
		this.form_1_img_1 = form_1_img_1;
	}
	public String getForm_1_img_1(){
		return this.form_1_img_1;
	}
	public void setForm_1_img_1_uuid(String form_1_img_1_uuid){
		this.form_1_img_1_uuid = form_1_img_1_uuid;
	}
	public String getForm_1_img_1_uuid(){
		return this.form_1_img_1_uuid;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String fase;
		private String picture="../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg";
		private String picture_uuid;
		private String nome;
		private String email;
		private String data_nascimento;
		private String departamento_atual;
		private Integer salario_atual_bruto;
		private String data_de_entrada_nosi;
		private String pccs;
		private String habilitacao_literaria;
		private Integer id;
		private String uuid;
		public void setFase(String fase){
			this.fase = fase;
		}
		public String getFase(){
			return this.fase;
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

		public void setDepartamento_atual(String departamento_atual){
			this.departamento_atual = departamento_atual;
		}
		public String getDepartamento_atual(){
			return this.departamento_atual;
		}

		public void setSalario_atual_bruto(Integer salario_atual_bruto){
			this.salario_atual_bruto = salario_atual_bruto;
		}
		public Integer getSalario_atual_bruto(){
			return this.salario_atual_bruto;
		}

		public void setData_de_entrada_nosi(String data_de_entrada_nosi){
			this.data_de_entrada_nosi = data_de_entrada_nosi;
		}
		public String getData_de_entrada_nosi(){
			return this.data_de_entrada_nosi;
		}

		public void setPccs(String pccs){
			this.pccs = pccs;
		}
		public String getPccs(){
			return this.pccs;
		}

		public void setHabilitacao_literaria(String habilitacao_literaria){
			this.habilitacao_literaria = habilitacao_literaria;
		}
		public String getHabilitacao_literaria(){
			return this.habilitacao_literaria;
		}

		public void setId(Integer id){
			this.id = id;
		}
		public Integer getId(){
			return this.id;
		}

		public void setUuid(String uuid){
			this.uuid = uuid;
		}
		public String getUuid(){
			return this.uuid;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
