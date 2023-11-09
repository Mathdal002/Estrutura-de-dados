package br.gov.go.sefaz.array;

//Utilizando gráficos de barras para exibir dados de array graficament
public class BarChart{
	public static void main(String[] args) {
		int[] array = {  0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };
		System.out.println("Distribuidor de grade");
		// para cada elemento de array, gera saída de uma barra do gráfico
		for(int counter =0; counter < array.length; counter++) {
			// gera saída do rótulo de barra("00-09: ",...,"90-99: ", "100: ")
			if(counter ==10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);
			// Imprime a barra de asteriscos 
			for(int stars = 0; stars < array[counter]; stars++)
				System.out.print("*");
			System.out.println();
		}
	}
}