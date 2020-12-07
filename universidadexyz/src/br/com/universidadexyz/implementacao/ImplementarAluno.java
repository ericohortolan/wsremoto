package br.com.universidadexyz.implementacao;

import br.com.universidadexyz.beans.Aluno;
import br.com.universidadexyz.util.Magic;

public class ImplementarAluno {

	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		System.out.println(aluno.getAll());
		
		
		aluno.setCpf(Magic.s("CPF"));
		aluno.setNome(Magic.s("Nome"));
		aluno.setRm(Magic.i("RM"));
		System.out.println("Nome: " + aluno.getNome());
		System.out.println("CPF.: " + aluno.getCpf());
		System.out.println("RM..: " + aluno.getRm());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
