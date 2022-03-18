package Plataforma;

public class Disciplina {
	
	private String nome;
	private String curso;
	private String professor;
	private int semestre;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public Disciplina(String nome, String curso, String professor, int semestre) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.professor = professor;
		this.semestre = semestre;
	}
}
