package br.com.estudo.heranca;
/**
 * 
 * @author Cesar
 *
 */
public class Pessoa
{
	
	private String nome;
	private int matricula;
	
	//construtor
	public Pessoa (String nome, int matricula)
	{
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMaticula() {
		return matricula;
	}

	public void setMaticula(int maticula) {
		this.matricula = maticula;
	}
	
}
