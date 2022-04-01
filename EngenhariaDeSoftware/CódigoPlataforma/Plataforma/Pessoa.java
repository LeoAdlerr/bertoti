package Plataforma;

public class Pessoa {
	
	private String nome;
	private String email;
	private int RA;
	private String curso;
	private int semestre;
	public Pessoa(String nome, String email, int rA, String curso, int semestre) {
		super();
		this.nome = nome;
		this.email = email;
		RA = rA;
		this.curso = curso;
		this.semestre = semestre;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRA() {
		return RA;
	}
	public void setRA(int rA) {
		RA = rA;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

}

