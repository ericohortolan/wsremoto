package br.com.universidadexyz.implementacao;

import javax.swing.JOptionPane;

import br.com.universidadexyz.beans.Curso;

public class ImplementarCurso {

	public static void main(String[] args) {
		
		
		
		//Criar um objeto
		//Curso objeto;
		//objeto.setDescricao("ENGENHARIA");
		
		//Instanciar um objeto
		Curso curso = new Curso();
		
		
		curso.setAll(
				JOptionPane.showInputDialog("Descrição"), 
				Float.parseFloat(JOptionPane.showInputDialog("Valor")), 
				Short.parseShort(JOptionPane.showInputDialog("Carga Horária")), 
				JOptionPane.showInputDialog("Sigla"), 
				Integer.parseInt(JOptionPane.showInputDialog("ID")), 
				Integer.parseInt(JOptionPane.showInputDialog("Duracao"))
				);
		System.out.println("Valor Promocao (10%): " + curso.getPromocao());
		System.out.println(curso.getValor());
		float porcentagem = Float.parseFloat(JOptionPane.showInputDialog("Qual o desconto? "));
		System.out.println("Valor Promocao: " + curso.getPromocao(porcentagem));
		System.out.println(curso.getValor());
		curso.ajustarValor(20);
		
		System.out.println(curso.getAll());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
