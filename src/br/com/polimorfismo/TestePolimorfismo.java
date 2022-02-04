package br.com.polimorfismo;

public class TestePolimorfismo {

	public static void main(String[] args) 
	{
		PessoaFisica fisica = new PessoaFisica();
		fisica.setNome("Juliana");
		fisica.setCpf(123456);
		
		PessoaJuridica juridica = new PessoaJuridica();
		juridica.setNome("CR7");
		juridica.setCnpj(654321);
		
		Pessoa[] pessoas = new Pessoa[2];
		pessoas[0] = fisica;
		pessoas[1] = juridica;
		
		for(Pessoa pessoa:pessoas)
		{
			System.out.println(pessoa.getNome());
		}
	}

}
