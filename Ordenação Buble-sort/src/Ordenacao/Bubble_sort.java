package Ordenacao;

import java.util.Scanner;

public class Bubble_sort {
	public static void main(String[] args) {
		int x[] = new int[5];
		int n, i, aux;
		Scanner entrada = new Scanner(System.in);
		// Carregar os n�meros no vetor
		for(i=0;i<=4;i++) {
			System.out.println("Digite o"+(i+1)+"n�mero: ");
			x[i] = entrada.nextInt();
		}
		// Ordenando de forma crescente 
		// la�o com a quantidade de elementos do vetor
		for(n=1;n<=5;n++) {
			// la�o que percorre da primeira � pen�ltima posi��o do vetor
			for(i=0;i<=3;i++) {
				if(x[i] > x[i+1]) {
					aux = x[i];
					x[i] = x[i+1];
					x[i+1] = aux;
				}
			}
		}
		// Mostrando o vetor ordenado
		for(i=0;i<=4;i++) {
			System.out.println((i+1)+"� n�mero: "+x[i]);
		}
	}
}
