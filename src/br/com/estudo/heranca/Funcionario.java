package br.com.estudo.heranca;
/**
 * 
 * @author Cesar
 *
 */
public class Funcionario extends Pessoa{

	private String departamento;
	
	public Funcionario(String nome, int matricula, String departamento)
	{
		//cria relação com a classe principal
		super(nome, matricula);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
}
