package br.com.estudo.poo;

/**
 * @author Cesar
 * @since 02/02/2022
 */

public class NomeCompleto {

	public static void main(String[] args) 
	{
		//criação de objeto e passagem de parâmetro
		Pessoa pessoa1 = new Pessoa("Cesar","Augusto");
		
		System.out.println(pessoa1.getNomeCompleto());
	}

}
