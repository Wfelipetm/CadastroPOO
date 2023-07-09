

#  1 - Título da Prática;
  Iniciando o caminho pelo Java

#  2 - Objetivo da Prática;
  Utilizar herança e polimorfismo na  definição de entidades.
  
  Utilizar persistência de objetos em arquivos binários.
  
  Implementar uma interface cadastral em modo texto.
  
  Utilizar o controle de exceções da plataforma Java.
  
  No final do projeto, o aluno terá implementado um sistema cadastral em Java,
  utilizando os recursos da programação orientada a objetos e a persistência em
  arquivos binários.

#  3 - Todos os códigos solicitados neste roteiro de aula;
  
  CadastroPOO.java: classe principal que contém o método main que interage com o usuário através do console.
	
  Pacote model:
 	
  Pessoa.java: classe abstrata que representa uma pessoa, com os atributos id e nome, e métodos para exibição e manipulação desses 	 
  dados.
	
  PessoaFisica.java: classe que herda de Pessoa e adiciona os atributos cpf e idade, além de métodos específicos.
 
  PessoaJuridica.java: classe que herda de Pessoa e adiciona o atributo cnpj, além de métodos específicos.
	
  PessoaFisicaRepo.java: classe de gerenciamento para entidades de pessoa física, com métodos para inserir, alterar, excluir e dados,     
  além de persistência e recuperação em arquivos.
	
  PessoaJuridicaRepo.java: classe de gerenciamento para entidades de pessoa jurídica, com métodos para inserir, alterar, excluir e dados, 
  além de permanência e recuperação em arquivos.

#  4 - Os resultados da execução dos códigos também devem ser apresentados;

👉 1º Procedimento | Criação das Entidades e Sistema de Persistência
![image](https://github.com/Wfelipetm/MissaoPraticaN1_Mundo3/assets/108297008/bdee556e-468d-4f2d-8b5d-0130e89525ee)

👉 2º Procedimento | Criação do Cadastro em Modo Texto
![image](https://github.com/Wfelipetm/MissaoPraticaN1_Mundo3/assets/108297008/f491c90b-7352-4a0e-8332-9dac64c3057d)



