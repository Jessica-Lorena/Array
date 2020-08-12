package Array;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) 
	{
		/*Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/
		
		Scanner ler = new Scanner(System.in);
		
		final int linha = 3, coluna = 3;
		int[][] matriz = new int  [linha][coluna];
		int l, c,m10=0;
		
		for(l=0; l<linha; l++)
		{
			for( c= 0; c<coluna; c++)
			{
				System.out.printf("Insira o elemento M[%d][%d]: ",l+1,c+1);
				matriz[l][c] = ler.nextInt();
				if(matriz[l][c] >10)
				{
					m10++;
				}
			}
		}
		System.out.println("A matriz contém " + m10 + " valores maiores que  10");		
	}

}
