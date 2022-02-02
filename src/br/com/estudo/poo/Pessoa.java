package br.com.estudo.poo;

/**
 * @author Cesar
 * @since 02/02/2022
 */

public class Pessoa {

		//private -> somente a classe pessoa pode manipular
		private String nome;
		private String sobrenome;
		
		/* construtor -> sempre com o nome da classe seguido pelos par�metros
		   public -> este construtor pode ser invocado por qualquer classe
		*/
		public Pessoa (String nomeTeste, String sobrenomeTeste) 
		{
			nome = nomeTeste;
			sobrenome = sobrenomeTeste;
		}
		
		//M�todo
		public String getNomeCompleto()
		{
			String nomeCompleto = nome + " " + sobrenome;
			return nomeCompleto;
		}
}
