import java.util.Scanner;

public class JurosSimples {

	public static void main(String[] args) {
		
		double principal = 0.0;
		double taxa = 0.0;
		int prazo = 0;
		String str = Emprestimo.juros.str;
		
		while(true) {
			principal = leituraDosLados(Emprestimo.principal.str);
			
			if(principal != -1) {
				taxa = leituraDosLados(Emprestimo.taxaDeJuros.str);
				prazo = (int)leituraDosLados(Emprestimo.prazo.str);
				String juros = String.format("%.2f", calcularJuros(principal, taxa, prazo));
				str += juros + "\n";
				System.out.println(str);
				str = Emprestimo.juros.str;
			} else {
				break;
			}
		}

	}
	
	public static double leituraDosLados(String str) {
		Scanner ler = new Scanner(System.in);
			
		System.out.printf(str);	
		return ler.nextDouble();
		
	}
	
	enum Emprestimo {
		principal("Informe o valor principal do empréstimo (-1 para terminar) -> R$ "),
		taxaDeJuros("Informe a taxa de juros (valor entre 0 e 1) -> "),
		prazo("Informe o prazo do empréstimo em dias -> "),
		juros("O valor dos juros é de R$ ");
		
		private  String str = "";

		Emprestimo(String str) {
			this.str = str;
		}
	}
	
	public static double calcularJuros(double principal, double taxa, int prazo) {
		return ((principal * taxa * prazo) / 365);
	}

}
