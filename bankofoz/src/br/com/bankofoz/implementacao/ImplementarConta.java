package br.com.bankofoz.implementacao;

import br.com.bankofoz.beans.Cliente;
import br.com.bankofoz.beans.Conta;
import br.com.bankofoz.beans.Corrente;
import br.com.bankofoz.beans.Poupanca;
import br.com.bankofoz.util.Magic;

public class ImplementarConta {

	public static void main(String[] args) {
		int opcao = Magic.i("Digite <1> para Corrente ou qualquer outro valor para Poupança");
		Conta conta = null;
		if (opcao==1) {
			conta = new Corrente(
					(short) 154,
					(byte) 5,
					(short) 1451,
					0,
					new Cliente(
							1,
							"XPTO",
							"xpto@xpto.com.br",
							true
							),
					100,
					50
					);
		}else {
			conta = new Poupanca();
			conta.setAgencia(Short.parseShort(Magic.s("Agencia")));
			
		}
		System.out.println(conta.verificarSaldo());
		conta.depositar(100);
		System.out.println(conta.verificarSaldo());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
