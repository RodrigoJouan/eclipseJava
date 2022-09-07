v.Scanner;

public class SistemaTernario {

	public static void main(String[] args) {
		int ternario = leituraDosLados(SistemasNumericos.ternario.str);
		int decimal = ternarioToDecimal(ternario);
		System.out.println(SistemasNumericos.decimal.str + String.valueOf(decimal));

	}
	
	public static int leituraDosLados(String str) {
		Scanner ler = new Scanner(System.in);			
		System.out.printf(str);	
		return ler.nextInt();
	}
	
	enum SistemasNumericos {
		decimal("A representação deste número no sistema decimal --> "),
		ternario("Digite o número no sistema ternário --> ");
		
		private  String str = "";

		SistemasNumericos(String str) {
			this.str = str;
		}
	}
	
	public static int ternarioToDecimal(int ternario) {
		String str = String.valueOf(ternario);
		int decimal = 0;
		int mathPow = 0;
	
		for(int i = (str.length() - 1); i >= 0 ; i--) {
			String powString = String.valueOf(str.charAt(i));
			int powInt = Integer.parseInt(powString);
			decimal += powInt * Math.pow(3, mathPow++);
		}
		
		return decimal;
	}

}
