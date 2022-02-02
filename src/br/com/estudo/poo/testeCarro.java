package br.com.estudo.poo;
/**
 * 
 * @author Cesar
 * @since 02/02/2022
 */
public class testeCarro {

	public static void main(String[] args) 
	{
		
		Carro meuCarro = new Carro();
		
		meuCarro.cor = "Vermelho";
		meuCarro.modelo = "Passat";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 220;
		
		meuCarro.ligar();
		meuCarro.acelerar(20);
		
		System.out.println(meuCarro.velocidadeAtual);
	}

}
