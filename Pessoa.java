package br.IESB_POO2024_devlab1;
import java.util.Date;

public class Pessoa {
	private int id;
	private String nome;
	private String sobreNome;
	private Date dtNascimento;
	
	//construtor padrão
	public Pessoa() {}
	
	//construtor para os atributos
	public Pessoa(int id, String nome, String sobreNome, Date dtNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dtNascimento = dtNascimento;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobreNome;
	}
	
	public void setSobrenome(String sobrenome) {
		sobreNome = sobrenome;
	}
	
	public Date getDtNascimento() {
		return dtNascimento;
	}
	
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	
}
