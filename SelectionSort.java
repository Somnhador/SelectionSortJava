package SeminarioSS;

public class SelectionSort {

	// Método main - onde o programa começa
	public static void main(String[] args) {

		// Criamos um vetor com números desordenados
		int[] numeros = { 5, 2, 8, 1, 9 };

		System.out.println("vetor ANTES de ordenar:");
		mostrarVetor(numeros);

		// Chamamos o método para ordenar
		selectionSort(numeros);

		System.out.println("\nvetor DEPOIS de ordenar:");
		mostrarVetor(numeros);
	}
	
	

	// Este é o método que vai ordenar o vetor
	public static void selectionSort(int[] vetorNumeros) {
		int tamanho = vetorNumeros.length; // Quantidade de números

		// Este loop externo vai rodar para cada posição
		for (int i = 0; i < tamanho - 1; i++) {

			// Assumimos que a posição atual tem o menor valor
			int menorIndice = i;

			// Este loop interno procura o menor número
			// Começa do i+1 porque já organizamos tudo antes
			for (int j = i + 1; j < tamanho; j++) {

				// Se encontrar um número menor que o atual
				if (vetorNumeros[j] < vetorNumeros[menorIndice]) {
					menorIndice = j; // Marca a posição do menor
				}
			}

			// Agora trocamos o número menor com o da posição i
			// (isto se o menor não estiver já na posição i)
			if (menorIndice != i) {
				int temp = vetorNumeros[i]; // Guardamos o valor de i
				vetorNumeros[i] = vetorNumeros[menorIndice]; // Colocamos o menor em i
				vetorNumeros[menorIndice] = temp; // Colocamos o antigo i no lugar do menor
			}
		}
	}
	
	

	// Método para mostrar o vetor na tela
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