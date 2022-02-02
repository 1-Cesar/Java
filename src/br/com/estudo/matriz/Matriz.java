package br.com.estudo.matriz;

import java.util.Scanner;
/**
 * @author Cesar
 * @since 01/02/2022
 */
public class Matriz {

	public static void main(String[] args) {
		
		//criação da matriz
		int[][] matriz = new int[3][3];
		
		//scanner para leitura de dados
		Scanner leia = new Scanner(System.in);
				
		System.out.println("Matriz M[3][3] \n");
		
		//populando a matriz
		for (int linha = 0; linha < 3; linha ++) {
			for(int coluna = 0; coluna < 3; coluna ++) {
				System.out.printf("Insira o elemento M[%d][%d]: ", linha+1,coluna+1);
				matriz[linha][coluna] = leia.nextInt();
			}
		}
		
		//exibição da matriz no console
		System.out.println("\n A matriz ficou: \n");
		for (int linha = 0; linha < 3; linha++) {
			for(int coluna = 0; coluna < 3; coluna ++) {
				System.out.printf("\t %d \t", matriz[linha][coluna]);
			}
			System.out.println("\n");
		}
	}

}
