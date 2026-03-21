package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class matriz {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		System.out.print("Digite a quantidade de linhas: ");
		int m = sc.nextInt();
		System.out.print("Digite a quantidade de colunas: ");
		int n = sc.nextInt();
		
		int[][] mat = new int [m][n];
		
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println(Arrays.deepToString(mat));
		System.out.println();
		
		
		boolean Encontrou = false;
		while (!Encontrou) {
			System.out.print("Escolha um número que esteja na matriz: ");
			int num = sc.nextInt();
			
			for (int i = 0; i < mat.length; i++) {
				for (int j = 0; j < mat[i].length; j++) {
					if (num == mat[i][j]) {
						Encontrou = true;
						System.out.println();
						System.out.println("Position: Linha= " + i + " | Coluna= " + j);
						
						if(j > 0) {
							System.out.println("Left: Linha= " + i + " | Coluna= " + (j - 1) + " | result= " + mat[i][j - 1]);
						}
						
						if(j < mat[i].length - 1) {
							System.out.println("Right: Linha= " + i + " | Coluna= " + (j + 1) + " | result= " + mat[i][j + 1]);
						}
						
						if(i > 0) {
							System.out.println("Up: Linha= " + (i - 1) + " | Coluna= " + j + " | result= " + mat[i - 1][j]);
						}
						
						if(i < mat.length - 1) {
							System.out.println("Down: Linha= " + (i + 1) + " | Coluna= " + j + " | result= " + mat[i + 1][j]);
						}
					}
				}	
			}
			if (!Encontrou) {
				System.out.println("Número não encontrado");
			}
			System.out.println();
		}
		sc.close();
	}
}
