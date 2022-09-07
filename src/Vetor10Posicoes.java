import java.util.Random;

public class Vetor10Posicoes {
	
	static int[] vetor = new int[10];

	public static void main(String[] args) {
		
		preencherVetor();
		vetorPrint("Vetor Original: ");
		ordenarCrescente();
		vetorPrint("Vetor Ordenado: ");

	}
	
	public static void preencherVetor() {
		Random gerador = new Random();
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = gerador.nextInt(1,1000);
		}
	}
	
	public static void ordenarCrescente() {
		int elementoTemp;
		
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length - 1; j++) {
				if(vetor[j] > vetor[j + 1]) {
					elementoTemp = vetor[j];
					vetor[j] = vetor[j +1];
					vetor[j +1] = elementoTemp;
				}
			}
		}
	}
	
	public static void vetorPrint(String str) {
		System.out.printf("\n" + str);
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d \t", vetor[i]);
		}
	}

}
