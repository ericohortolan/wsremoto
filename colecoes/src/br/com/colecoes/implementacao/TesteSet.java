package br.com.colecoes.implementacao;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		Set<String> lista = new HashSet<String>();
		lista.add("item1");
		lista.add("ite1");
		lista.add("item2");
		lista.add("item2");
		System.out.println(lista);
		
		for (String item : lista) {
			System.out.println("Item: " + item);
		}
	}

}
