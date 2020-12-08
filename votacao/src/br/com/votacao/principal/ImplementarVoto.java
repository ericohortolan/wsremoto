package br.com.votacao.principal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.votacao.beans.Candidato;
import br.com.votacao.beans.Eleitor;
import br.com.votacao.beans.Urna;
import br.com.votacao.beans.Voto;

public class ImplementarVoto {

	public static void main(String[] args) {
		List<Urna> listaUrnas = new ArrayList<Urna>();
		List<Voto> votos = new ArrayList<Voto>();
		Urna urna = new Urna();
		int totalvotos = 0;
		
		do {
			votos.add(new Voto(
					new Eleitor(Integer.parseInt(JOptionPane.showInputDialog("Titulo")),true),
					new Candidato(Integer.parseInt(JOptionPane.showInputDialog("Numero candidato")),JOptionPane.showInputDialog("Cargo Candidato"),JOptionPane.showInputDialog("Partido Candidato")),
					true
					));
		} while (JOptionPane.showConfirmDialog(null,"Continuar?","Pergunta",JOptionPane.YES_NO_OPTION)==0);
		
		votos.add(new Voto(new Eleitor(1,true), new Candidato(10,"Senador","Part1"), true));
		votos.add(new Voto(new Eleitor(1,true), new Candidato(10,"Prefeito","Part1"), true));
		votos.add(new Voto(new Eleitor(2,true), new Candidato(20,"Senador","Part2"), true));
		urna = new Urna(1, 1, "Sao Paulo", votos);
		System.out.println("Numero de votos: " + urna.totalVotos());
		
		do {
			listaUrnas.add(new Urna(Integer.parseInt(JOptionPane.showInputDialog("Zona")),
					Integer.parseInt(JOptionPane.showInputDialog("Secao")),
					JOptionPane.showInputDialog("Cidade"),
					new ArrayList<Voto>()
					));
		} while (JOptionPane.showConfirmDialog(null,"Continuar?","Pergunta",JOptionPane.YES_NO_OPTION)==0);
		
		System.out.println("Quantidade de urnas: " + listaUrnas.size());
		
		for (Urna urnaC : listaUrnas) {
			totalvotos += urnaC.totalVotos();
		}
		
		System.out.println("Quantidade de votos antes: " + totalvotos);
		
		listaUrnas.get(0).setVotos(votos);
		listaUrnas.get(1).setVotos(votos);
		
		for (Urna urnaC : listaUrnas) {
			totalvotos += urnaC.totalVotos();
		}
		System.out.println("Quantidade de votos depois: " + totalvotos);
		
		
	}

}
