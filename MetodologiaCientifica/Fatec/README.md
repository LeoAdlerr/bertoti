<h2> Leonardo Adler da Silva </h2>

  Olá, sou Leonardo Adler da Silva
estudante de Banco de Dados na Fatec Jessen Vidal, na qual tive a experiência de utilizar
metodologias ageis e diversas tecnologias.  

<h3> Em 2022-2 foi trabalhado um projeto API com o parceiro acadêmico IACIT </h3> 
 
* [Link para o GitHub](https://github.com/DatatechOffice/Api_Iacit)

<h4> Visão e objetivo do projeto </h4>
    Desenvolver um sistema web, onde fosse possível realizar a extração e tratamento
  de dados meteorológicos através do site INEP fornecido pelo parceiro, além da persistência 
  dos mesmos e por fim a visualização dos dados de forma que decisões pudessem ser realizadas,
  no caso foram utilizado gráficos e a filtragem dos dados pelo usuário para tal.

<h4>Tecnologias utilizadas no Projeto</h4>

- HTML, CSS e Bootstrap: 
  <br>
    Todo o visual e design da página web foram feitas utilizando essas tecnologias, isso inclue os gráficos 
  com os dados meteorológicos auxiliando-se das lógicas do Javascript para tal;
  <br><br>
- JavaScript:
  <br>
    Lógica das páginas, seja restrições das mesmas, preenchimentos ou a filtragem dos dados selecionados pelos 
  usuários e para tal a conexão e utilização das APIs criadas em java/springboot;
  <br><br>
- Java e SpringBoot:
  <br>
    Primeiramente foram feitas rotinas para persistir a base de dados meteorológicos; 
    Depois a criação  das Apis Rest conectando o banco de dados que contém os dados meteorológicos com as páginas, 
  para tal foram criadas pesquisas aliadas a lógicas para buscar e filtrar os dados e assim enviando os resultados
  em formato JSON para que possam ser tratados pelo JavaScript;
  <br><br>
- Python: 
  <br>
    Uma rotina para captação dos dados em csv fornecidos pelo cliente foi criada, para assim criar um csv com os  
  valores de todos os períodos agregados e assim podendo envia-los num formato onde fosse possível persisti-los usando
  o java;
  <br><br>
- PostgreSQL: 
  <br>
    Foi o banco de dados de preferência da empresa contratante e o utilizado para armazenar os dados meteorológicos de 
  uma forma de uma forma que fosse possível utiliza-los num programa, além de traze-los num formato e tipo que 
  falicitassem o uso;
  <br><br>
  
- Maven: 
  <br>  
    Utilizado para versionar e enviar o código no Git, assim facilitando a todos os desenvolvedores e usuários a utilizar o
  código mais atualizado no momento, principalmente na manutenção de bibliotecas Java utilizadas, algo que durante o processo 
  e na instalação do código final facilita o uso do mesmo;
  <br><br>
  
<h4>Contribuições individuais</h4>
<details>
  <summary>Api's Rest  - Usando spring boot, criei as api's a serem consumidas, nas quais conectei com o banco sql para buscar os dados 
  filtrados pelo frontend, foi pensado em criar essa pesquisa numa lógica que contemple quaisquer pesquisas feitas, além
  do crud com as telas de Login</summary>
  <p>
    * [classe Controller exemplo](https://github.com/DatatechOffice/Api_Iacit/blob/main/api/src/main/java/com/iacit/api/controller/TemperaturaController.java)
    
  
</details>

<details>
<summary>Manipulação de dados</summary>
  <p>
  - Na persistência, participei nos scripts em java para popular o banco com os dados vindos do csv;
    </p>
    </details>
    

  
  
 <h4>Aprendizado Efetivo</h4>
  
  <details>
  <summary>Api's Rest</summary>
  <p> - Foi o principal aprendizado, pois através desse entendimento é possível criar diversos tipos de aplicativos
  web, principalmente aqueles que necessitam de algum mecanismo de busca ou até para mostrar.
    No caso, a conexão http através dos links, os tipos de retorno e como utiliza-los(enviando e recebendo JSON's), onde utilizamos POST, GET,
    PUT entre outros tipos de requests que possibilitaram a conexão entre o Banco de Dados e o Front do projeto;
  </p>
  
</details>

<details>
  <summary>Metodologia Ágil</summary>
  <p> - explicar que atuei como Scrum Master e aprendi a utilizar a metodologia ágil/Scrum entregando o projeto por sprints e </p>

</details>
  <summary>Demais Aprendizados</summary>
  <p> - Compreendem o funcionamento de interfaces e o polimorfismo na linguagem Java, o básico da linguagem Javascript, HTML e CSS(através do
  bootstrap). Além da manipulação de dados massivos, desde o download a persistência efetiva;
  </p>
  
</details>
  

  
