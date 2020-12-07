package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.colecoes.beans.Cargo;

public class TesteListaObjeto {
	public static void main(String[] args) {
			
		List<Cargo> lista = new ArrayList<Cargo>();
		
		do {
			lista.add(new Cargo(
					JOptionPane.showInputDialog("Nome"),
					JOptionPane.showInputDialog("Nivel"),
					Float.parseFloat(JOptionPane.showInputDialog("Salario"))
					));
		} while (JOptionPane.showConfirmDialog(null,"Continuar?","Pergunta",JOptionPane.YES_NO_OPTION)==0);
		
		System.out.println(lista);
		Collections.sort(lista);
		
		
	}
}
