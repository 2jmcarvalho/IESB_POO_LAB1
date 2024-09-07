package br.IESB_POO2024_devlab1;
import java.util.Date;


public class Professor extends Pessoa{

	private int id;
	private String departamento;
	private String cargoProfessor;
	private Date dtContratacao;
	private boolean isOrientador;
	
	public Professor() {}//construtor opcional
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public String getCargoProfessor() {
		return cargoProfessor;
	}
	
	public void setCargoProfessor(String cargoProfessor) {
		this.cargoProfessor = cargoProfessor;
	}
	
	public Date getDtContratacao() {
		return dtContratacao;
	}
	
	public void setDtContratacao(Date dtContratacao) {
		this.dtContratacao = dtContratacao;
	}
	
	public boolean isOrientador() {
		return isOrientador;
	}
	
	public void setOrientador(boolean isOrientador) {
		this.isOrientador = isOrientador;
	}
	
	
	
}
