package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.colecoes.beans.Cargo;

public class TesteListaObjeto {
	public static void main(String[] args) {
			
		List<Cargo> lista = new ArrayList<Cargo>();
		/*
		do {
			lista.add(new Cargo(
					JOptionPane.showInputDialog("Nome"),
					JOptionPane.showInputDialog("Nível"),
					Float.parseFloat(JOptionPane.showInputDialog("Salario"))
					));
		} while (JOptionPane.showConfirmDialog(null,"Continuar?","Pergunta",JOptionPane.YES_NO_OPTION)==0);
		*/
		
		lista.add(new Cargo("Dev","PL",6000));
		lista.add(new Cargo("Dev","JR",4000));
		lista.add(new Cargo("Dev","SR",8000));
		
		System.out.println(lista);
		Collections.sort(lista);
		System.out.println(lista);
		
	}
}
