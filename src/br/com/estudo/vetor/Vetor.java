package br.com.estudo.vetor;

import java.util.Scanner;

/**
 * @author Cesar
 * @since 01/02/2022
 */
public class Vetor {

	public static void main(String[] args) {
		
		//scanner para leitura de dados
		Scanner leia = new Scanner (System.in);
		
		//criação de dois vetores
		int[] arrayUm = {12,3,5,68,9,6,73,44,456,65,321};
		int[] arrayDois = {43,42,4,8,55,21,2,45};
		
		float[] nota= new float[5];
		
		//verifica o tamanho do vetor
		if (arrayDois.length > 8) {
			System.out.println("Tamanho do ArrayDois - Maior do que 8 \n");
		}
		else {
			System.out.println("Tamanho do ArrayDois - Menor do que 8 \n");
		}
		
		String[] cars = {"Volvo","Ford","Mitsubishi \n"};
		
		//trabalhando com for-each
		for (String i:cars) {
			System.out.println(i);
		}
		
		//populando um array
		for (int i = 0; i < 5; i++) {
			System.out.println("Entre com uma nota: ");
			nota[i] = leia.nextFloat();
		}
		
		//exibindo os dados do array
		for (int i = 0; i< 5; i++) {
			System.out.println("Nota " + i+1 + " = " + nota[i]);
		}
	}

}
