package variaveis;

public class ManipulaString {
	
	public static void main(String[] args) {
		String email = "xpto@fiap.com.br";
		System.out.println("Original: " + email);
		System.out.println("Maiuscula: " + email.toUpperCase());
		System.out.println("Minusculos: " + email.toLowerCase());
		System.out.println("Qtde Caracteres: " + email.length());
		System.out.println("Tem @? " + email.contains("@"));
		System.out.println("@ na Posição: " + email.indexOf("@"));
		System.out.println("Parte da string: " + email.substring(2,4));
		System.out.println("Primeira Parte: " + email.substring(0,email.length()/2));
		if (email.contains("@")==true)
		{
			System.out.println("Usuario: " + email.substring(0, email.indexOf("@")));
			System.out.println("Servidor: " + email.substring(email.indexOf("@")+1));
			// Exibir somente o servidor do email
		}	
		//x P t @ x g a M a . c o m
		//0 1 2 3 4 5

		
		
		
		
		
		
		
		
	}

}
