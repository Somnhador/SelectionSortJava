package SeminarioSS;

public class SelectionSort {

	// Main
	public static void main(String[] args) {

		// Vetor com números desordenados
		int[] numeros = { 5, 2, 8, 1, 9 };

		System.out.println("vetor ANTES de ordenar:");
		mostrarVetor(numeros);

		// Método para ordenar
		selectionSort(numeros);

		System.out.println("\nvetor DEPOIS de ordenar:");
		mostrarVetor(numeros);
	}
	
	

	// Método que ordena(SelectionSort)
	public static void selectionSort(int[] vetorNumeros) {
		int tamanho = vetorNumeros.length; // Guarda o tamanho do vetor

		// Loop para cada posição do vetor
		for (int i = 0; i < tamanho - 1; i++) {

			// Por enquanto posição atual tem o menor valor
			int menorIndice = i;

			// Loop procura o menor número
			// Começa do i+1, já que já temos o primeiro índice como o menos número
			for (int j = i + 1; j < tamanho; j++) {

				// Se encontrar um número menor que o atual
				if (vetorNumeros[j] < vetorNumeros[menorIndice]) {
					menorIndice = j; // Marca a posição do menor número
				}
			}

			// Troca o número menor com o da posição i (isto se o menor não estiver já na posição i)
			if (menorIndice != i) {
				int temp = vetorNumeros[i]; // Guardamos o valor de i com uma variável temporária
				vetorNumeros[i] = vetorNumeros[menorIndice]; // Colocamos o menor em i
				vetorNumeros[menorIndice] = temp; // Antigo i vai no lugar do menor
			}
		}
	}
	
	

	// Método para visualizar a saída
	public static void mostrarVetor(int[] vetorNumeros) {
		System.out.print("[");
		for (int i = 0; i < vetorNumeros.length; i++) {
			System.out.print(vetorNumeros[i]);
			if (i < vetorNumeros.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
