package Array;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) 
	{
		/*Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
		 * (1) somar as duas matrizes 
		 * (2) subtrair a primeira matriz da segunda 
		 * (3) adicionar uma constante as duas matrizes
		 * (4) imprimir as matrizes 
		 * Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
		 * Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.*/
		
		Scanner ler = new Scanner(System.in);
		
		int x = 0,l,c,op;
		final int linha = 2, coluna = 2, ad = x;
		float[][] m1 = new float  [linha][coluna];
		float[][] m2 = new float  [linha][coluna];
		float[][] m3 = new float  [linha][coluna];
		
		for(l=0; l<linha; l++) 
		{
			for(c = 0; c<coluna; c++)
			{
				System.out.printf("Insira o elemento M1[%d][%d]: ",l+1,c+1);
				m1[l][c] = ler.nextInt();
			}
		}
		System.out.println();
		for(l=0; l<linha; l++) 
		{
			for(c = 0; c<coluna; c++)
			{
				System.out.printf("Insira o elemento M2[%d][%d]: ",l+1,c+1);
				m2[l][c] = ler.nextInt();
			}
		}
		System.out.println("Entre com a sua opção: \n1-Soma das matrizes\n2-Subtrair a primeira matriz da segunda\n3-Adicionar um valor sobre todos os valores das 2 matrizes\n4-Imprimir as matrizes");
		op = ler.nextInt();
		
		while(op<1 || op>4)
		{
			System.out.println("Opção inválidaEntre com a sua opção: \\n1-Soma das matrizes\\n2-Subtrair a primeira matriz da segunda\\n3-Adicionar um valor sobre todos os valores das 2 matrizes\\n4-Imprimir as matrizes");
			op = ler.nextInt();
		}
		if(op==1)
		{
			System.out.println("Soma das matrizes: ");
			for(l=0; l<linha; l++) 
			{
				for(c = 0; c<coluna; c++)
				{
					m3[l][c] = m1[l][c] + m2[l][c];
					System.out.printf("\t %.2f \t",m3[l][c]);
				}
				System.out.println();
			}
		}
		else if(op==2)
		{
			System.out.println("Diferença da matriz 1 sob a 2: ");
			for(l=0; l<linha; l++) 
			{
				for(c = 0; c<coluna; c++)
				{
					m3[l][c] = m2[l][c] - m1[l][c];
					System.out.printf("\t %.2f \t",m3[l][c]);
				}
				System.out.println();
			}
		}
		else if(op==3)
		{
			System.out.println("Entre com o valor a ser somado: ");
			x = ler.nextInt();
			System.out.println("M1 com valor adicionado: ");
			for(l=0; l<linha; l++) 
			{
				for(c = 0; c<coluna; c++)
				{
					m1[l][c] = m1[l][c] + x;
					System.out.printf("\t %.2f \t",m1[l][c]);
				}
				System.out.println();
			}
			System.out.println("M2 com valor adicionado: ");
			for(l=0; l<linha; l++) 
			{
				for(c = 0; c<coluna; c++)
				{
					m2[l][c] = m2[l][c] + x;
					System.out.printf("\t %.2f \t",m2[l][c]);
				}
				System.out.println();
			}
		}
		else if(op==4)
		{
			System.out.println("M1: ");
			for(l=0; l<linha; l++) 
			{
				for(c = 0; c<coluna; c++)
				{
					System.out.printf("\t %.2f \t",m1[l][c]);
				}
				System.out.println();
			}
			System.out.println("M2: ");
			for(l=0; l<linha; l++) 
			{
				for(c = 0; c<coluna; c++)
				{
					System.out.printf("\t %.2f \t",m2[l][c]);
				}
				System.out.println();
			}
		}
	}

}
