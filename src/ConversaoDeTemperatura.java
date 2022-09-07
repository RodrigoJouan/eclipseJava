import java.util.Scanner;

import org.ietf.jgss.Oid;

public class ConversaoDeTemperatura {

	public static void main(String[] args) {
		double fahrenheit = 0.0;
		double tempInicial = 0.0;
		double tempFinal = 0.0;
		
		tempInicial = leituraDosLados(Temperatura.temperaturaInicial.str);
		tempFinal = leituraDosLados(Temperatura.temperaturaFinal.str);
		System.out.println("");
		
		for(int i = 0; i <= ((int)tempFinal - (int)tempInicial); i++) {
			double result = conversaoDeTemperatura(tempInicial + i);
			System.out.println(String.format("%.4f", (tempInicial + i) ) + Temperatura.seta.str + String.format("%.4f", result));
		}
		

	}
	
	public static double leituraDosLados(String str) {
		Scanner ler = new Scanner(System.in);
			
		System.out.printf(str);
		return ler.nextDouble();
		
	}
	
	enum Temperatura {
		temperaturaInicial("Temperatura inicial (mínima) --> "),
		temperaturaFinal("Temperatura final (máxima) --> "),
		seta(" --> ");
		
		private  String str = "";

		Temperatura(String str) {
			this.str = str;
		}
	}
	
	public static double conversaoDeTemperatura(double celsius) {
		return (((9 * celsius)/5) + 32);
	}

}
