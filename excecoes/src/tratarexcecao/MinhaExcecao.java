package tratarexcecao;

public class MinhaExcecao {

	public static String tratar(Exception e) {
		if (e instanceof NullPointerException) {
			return "Objeto nulo";
		} else if (e instanceof NumberFormatException) {
			return "Número inválido";
		}else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor estourou";
		}else {
			e.printStackTrace();
			return "Excecao desconhecida";
		}
	
	}//fecha o método
	
}// fecha a classe
