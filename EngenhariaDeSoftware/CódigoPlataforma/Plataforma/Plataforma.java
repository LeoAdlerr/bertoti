package Plataforma;

import java.util.LinkedList;
import java.util.List;

public class Plataforma {

     private List<Pessoa> pessoas = new LinkedList<Pessoa>();

     public void cadastrarPessoa(Pessoa pessoa){
          pessoas.add(pessoa);
     }

     public List<Pessoa> buscarPessoaPorRA(RA ra){
           List<Pessoa> pessoasEncontradas = new LinkedList<Pessoa>();
           for(Pessoa pessoa:pessoas){
                if(pessoa.getRA().equals(RA)) pessoasEncontradas.add(pessoa);
           }
           return pessoasEncontradas;
     }

     private List<Disciplina> disciplinas = new LinkedList<Pessoa>();
     
     public void cadastrarDisciplina(Disciplina disciplina){
          disciplinas.add(disciplina);
     }
     
     public List<Pessoa> buscarDisciplinaPorNome(Nome nome){
    	 List<Pessoa> disciplinasEncontradas = new LinkedList<Disciplina>();
    	 for(Disciplina disciplina:disciplinas) {
    		 if(disciplina.getNome().equals(Nome)) disciplinasEncontradas.add(disciplina);
    	 }
    	 return disciplinasEncontradas;
          }
}
