package br.com.estudo.heranca;
/**
 * 
 * @author Cesar
 *
 */
public class TestePessoa {

	public static void main(String[] args) 
	{

		Pessoa jessica = new Pessoa("Jessica", 555);
		Funcionario pedro = new Funcionario("Pedro", 222, "TI");
		Pessoa maria = new Funcionario("Maria", 333, "Informatica");
		Pessoa jose = new Coordenador("Jose", 444, "CC");
		
		System.out.println(jessica.getMaticula());
		System.out.println(pedro.getDepartamento());
		System.out.println(maria.getNome());
		System.out.println(jose.getNome());

	}

}
