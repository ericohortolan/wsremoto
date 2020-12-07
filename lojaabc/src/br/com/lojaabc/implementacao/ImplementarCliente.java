package br.com.lojaabc.implementacao;

import br.com.lojaabc.modelo.PessoaFisica;
import br.com.lojaabc.modelo.PessoaJuridica;
import br.com.lojaabc.util.Magic;

public class ImplementarCliente {

	public static void main(String[] args) {

		char opcao = Magic.s("Digite F para pessoa Fisica").charAt(0);
		String nome = Magic.s("Nome");
		String email = Magic.s("Email").toLowerCase();
		if (opcao=='F') {
			PessoaFisica cliente = new PessoaFisica();
			cliente.setNome(nome);
			cliente.setCpf(Magic.s("CPF"));
			cliente.setEmail(email);
			cliente.setEspecial(Magic.b("Cliente Especial?"));
			cliente.setId(Magic.i("Código"));
			cliente.setNascimento(Magic.s("Nascimento"));
			cliente.setRg(Magic.s("RG"));
			System.out.println(cliente.toString());
		}else {
			PessoaJuridica cliente = new PessoaJuridica();
			cliente.setNome(nome);
			cliente.setEmail(email);
			cliente.setEspecial(Magic.b("Cliente Especial?"));
			cliente.setId(Magic.i("Código"));
			cliente.setCnpj(Magic.s("CNPJ"));
			cliente.setContato(Magic.s("Contato"));	
			System.out.println(cliente.toString());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
