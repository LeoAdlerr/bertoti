package Plataforma;

import java.util.LinkedList;
import java.util.List;

public class Plataforma {
	
	 private List<Disciplina> disciplinas = new LinkedList<Disciplina>(); 
     private List<Pessoa> pessoas = new LinkedList<Pessoa>();
     
     public void cadastrarDisciplina(Disciplina disciplina) {
    	 disciplinas.add(disciplina);
     }

     public void cadastrarPessoa(Pessoa pessoa){
          pessoas.add(pessoa);
     }

     public Pessoa buscarPessoaNome(String nome){
           for(Pessoa pessoa:pessoas){
                if(pessoa.getNome().equals(nome));
                return pessoa;
           }                  
     return null;
     }
     public Disciplina buscarDisciplinaNome(String nome){
    	 for(Disciplina disciplina:disciplinas) {
    		 if(disciplina.getNome().equals(nome));
    		 return disciplina;
    	 }
    	 return null;
     }
     
     public static void main (String[] args) {
    	 
     }
}

