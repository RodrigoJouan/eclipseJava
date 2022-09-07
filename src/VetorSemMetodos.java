import java.util.Random;

public class VetorSemMetodos {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		int elementoTemp;
		
		Random gerador = new Random();
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = gerador.nextInt(1,1000);
		}
		
		System.out.printf("\n Vetor Original: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d \t", vetor[i]);
		}
		
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length - 1; j++) {
				if(vetor[j] > vetor[j + 1]) {
					elementoTemp = vetor[j];
					vetor[j] = vetor[j +1];
					vetor[j +1] = elementoTemp;
				}
			}
		}
		
		System.out.printf("\n Vetor Ordenado: ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%d \t", vetor[i]);
		}

	}

}
