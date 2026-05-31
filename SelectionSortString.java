package SeminarioSS;

public class SelectionSortString {
    
    public static void selectionSort(String[] vetor) {
        int tamanho = vetor.length;
        
        for (int i = 0; i < tamanho - 1; i++) {
            int menorIndice = i;
            
            // Compara usando .compareTo()
            for (int j = i + 1; j < tamanho; j++) {

                if (vetor[j].compareTo(vetor[menorIndice]) < 0) {
                    menorIndice = j;
                }
            }
            

            if (menorIndice != i) {
                String temp = vetor[i];
                vetor[i] = vetor[menorIndice];
                vetor[menorIndice] = temp;
            }
        }
    }
    
    public static void mostrarVetor(String[] vetor) {
        System.out.print("[");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("\"" + vetor[i] + "\"");
            if (i < vetor.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        String[] palavras = {"zebra", "aranha", "manga", "banana"};
        
        System.out.println("ANTES:");
        mostrarVetor(palavras);
        
        selectionSort(palavras);
        
        System.out.println("\nDEPOIS:");
        mostrarVetor(palavras);
    }
}
