import java.util.Scanner;

public class PlanoCartesiano {

	public static void main(String[] args) {
		int qtDePontos = 0;
		int[] pontoA = {0,0};
		double maxDist = 0.0;
		int[] pontoMaxDist = {0,0};
		
		qtDePontos = (int) leituraDosLados(Cartesiano.quantidadeDePontos.str);
		
		for(int i = 1; i <= qtDePontos; i++) {
			pontoA[0] = (int) leituraDosLados(Cartesiano.ponto.str + String.valueOf(i) + ":\n" + Cartesiano.x.str);
			pontoA[1] = (int) leituraDosLados(Cartesiano.y.str);
			double result = calcularDistanciaAteOrigem(pontoA);
			if(result > maxDist) {
				maxDist = result;
				pontoMaxDist[0] = pontoA[0];
				pontoMaxDist[1] = pontoA[1];
			}
			System.out.println(Cartesiano.distanciaDaOrigem.str + String.format("%.4f", result));
		}
		
		System.out.println("\n" + Cartesiano.pontoMaisDistante.str + "(" + String.valueOf(pontoMaxDist[0]) + ", " + String.valueOf(pontoMaxDist[1]) + ")\n");
	}
	
	public static double leituraDosLados(String str) {
		Scanner ler = new Scanner(System.in);
			
		System.out.printf(str);	
		return ler.nextDouble();
		
	}
	
	enum Cartesiano {
		quantidadeDePontos("Qual a quantidade de pontos que serão informados? --> "),
		ponto("\nPonto "),
		x("x --> "),
		y("y --> "),
		distanciaDaOrigem("Distância até a origem --> "),
		pontoMaisDistante("O ponto mais distante tem coordenadas --> ");
		
		private  String str = "";

		Cartesiano(String str) {
			this.str = str;
		}
	}
	
	public static double calcularDistanciaAteOrigem(int[] a) {
		double result = 0.0;	
		result = Math.sqrt(Math.pow((a[0]), 2) + Math.pow((a[1]), 2));
		return result;
	}

}
