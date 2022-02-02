package br.com.estudo.poo;

public class MetodoSobrecarregado {
	
	public void testaMetodoSobrecarregado()
	{
		System.out.println("Salário em número inteiro: " + salario(1000));
		System.out.println("Salário em número fracionário: " + salario(7.500));
	}
	public int salario(int valorInt)
	{
		System.out.println("Salário com argumento inteiro: " + valorInt);
		return valorInt * valorInt;
	}
	public double salario(double valorDouble) 
	{
	 System.out.println("Salário com argumento double: " + valorDouble);
	 return valorDouble * valorDouble;
	}
}
