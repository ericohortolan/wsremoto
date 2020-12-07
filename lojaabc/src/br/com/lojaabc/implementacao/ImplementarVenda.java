package br.com.lojaabc.implementacao;

import br.com.lojaabc.modelo.Cliente;
import br.com.lojaabc.modelo.Venda;

public class ImplementarVenda {

	public static void main(String[] args) {
		/*Venda venda = new Venda(
				Magic.i("Nota Fiscal"),
				new Produto(
						Magic.i("Código"),
						Magic.s("Descricao"),
						Magic.f("Valor Compra"),
						Magic.f("Valor Venda"),
						Magic.i("Qtde"),
						new Fabricante(
								Magic.s("CNPJ"),
								Magic.s("Razao Social"),
								Magic.s("Fone")
								)
						),
				new Cliente(
						Magic.i("Código do Cliente"),
						Magic.s("Nome do Cliente"),
						Magic.s("Email"),
						Magic.b("É especial?")
						),
				Magic.i("Qtde"),
				Magic.f("Total")
				);
		
		
		System.out.println(venda.toString());*/
		
		Venda venda = new Venda();
		
		venda.setQtde(10);
		venda.getProduto().setValorVenda(1500);
		venda.getProduto().getFabricante().setCnpj("123456321");
		System.out.println(venda.getProduto().getFabricante().getCnpj());
		
		Cliente cli = new Cliente();
		cli.setEmail("cliente@cliente");
		venda.setCliente(cli);
		
		
		
		
		
	
	}

}
