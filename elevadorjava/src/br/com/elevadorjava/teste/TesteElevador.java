package br.com.elevadorjava.teste;

import br.com.elevadorjava.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		Elevador elevador = new Elevador();
		
		elevador.definirValores(
				"TorreB",
				(short) 10, 
				(short)-1,
				(byte) 5
				);
		
		System.out.println(elevador.exibirDados());
		elevador.entrar((byte) 3);
		elevador.subir();
		elevador.subir();
		System.out.println(elevador.exibirDados());
		elevador.entrar((byte) 5);
		elevador.subir((byte) 20);
		elevador.subir();
		System.out.println(elevador.exibirDados());
		elevador.sair((byte)2);
		System.out.println(elevador.exibirDados());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
