package MergeSort;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		int x[] = new int [10];
		int i;
		Scanner entrada = new Scanner(System.in);
		// Carregando os n�meros no vetor 
		for(i=0; i<=9; i++) {
			System.out.println("Digite o "+(i+1)+"� n�mero: ");
			x[i] = entrada.nextInt();
		}
		// Ordenado de forma crescente
		merge(x,0,9);
		// mostrando o vetor ordenado
		for(i=0; i<=9;i++) {
			System.out.println((i+1)+"� n�mero: "+x[i]);
		}
	}
	public static void merge(int x[], int inicio,int fim) {
		int meio;
		if(inicio < fim) {
			meio = (inicio + fim)/2;
			merge(x,inicio,meio);
			merge(x,meio+1,fim);
			intercala(x, inicio, fim, meio);
		}
	}
	public static void intercala(int x[], int inicio, int fim, int meio) {
		int poslivre, inicioVetor1, inicioVetor2, i;
		int aux[] = new int[10];
		inicioVetor1 = inicio;
		inicioVetor2 = meio+1;
		poslivre = inicio;
		while(inicioVetor1 <= meio && inicioVetor2 <= fim) {
			if(x[inicioVetor1] <= x[inicioVetor2]) {
				aux[poslivre] = x[inicioVetor1];
				inicioVetor1++;
			}
			else {
				aux[poslivre] = x[inicioVetor2];
				inicioVetor2++;
			}
			poslivre++;
		}
		// Se ainda existem n�meros no primeiro vetor que n�o foram intercalados
		for(i=inicioVetor1; i<=meio;i++) {
			aux[poslivre] = x[i];
			poslivre++;
		}
		// se ainda existem n�meros no segundo vetor que n�o foram intercalados
		for(i=inicioVetor2; i<=fim; i++) {
			aux[poslivre] = x[i];
			poslivre++;
		}
		// Retorna os valores do vetor aux para o vetor x
		for(i=inicio; i<=fim; i++) {
			x[i] = aux[i];
		}
	}
}
