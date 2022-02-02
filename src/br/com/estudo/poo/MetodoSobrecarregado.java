package br.com.estudo.poo;

public class MetodoSobrecarregado {
	
	public void testaMetodoSobrecarregado()
	{
		System.out.println("Sal�rio em n�mero inteiro: " + salario(1000));
		System.out.println("Sal�rio em n�mero fracion�rio: " + salario(7.500));
	}
	public int salario(int valorInt)
	{
		System.out.println("Sal�rio com argumento inteiro: " + valorInt);
		return valorInt * valorInt;
	}
	public double salario(double valorDouble) 
	{
	 System.out.println("Sal�rio com argumento double: " + valorDouble);
	 return valorDouble * valorDouble;
	}
}
