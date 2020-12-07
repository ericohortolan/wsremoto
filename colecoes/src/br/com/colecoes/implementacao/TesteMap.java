package br.com.colecoes.implementacao;

import java.util.HashMap;
import java.util.Map;

import br.com.colecoes.beans.Cargo;

public class TesteMap {

	public static void main(String[] args) {
		Map<Integer,Cargo> lista = new HashMap<Integer,Cargo>();
		
		lista.put(1,new Cargo("Dev","JR",4000));
		lista.put(4,new Cargo("Dev","PL",6000));
		lista.put(3,new Cargo("Dev","SR",8000));
		
		System.out.println(lista);
		
		System.out.println(lista.values());
		
		for (Cargo objeto : lista.values()) {
			System.out.println(objeto.getSalario());
			System.out.println(objeto.getNivel());
		}
		
		
	}

}
