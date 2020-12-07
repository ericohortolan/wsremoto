package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<String>();
		lista.add("teste");
		lista.add("teste3");
		lista.add("test2");
		lista.add("test2");
		lista.add("teste7");
		
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista.get(2));
		lista.remove(2);
		
		System.out.println(lista);
		for (int cont=0;cont<lista.size();cont++) {
			System.out.println("Elemento " + (cont+1) + " é " + lista.get(cont));
		}
	}

}
