package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {
	public static void main(String[] args) {
		/*
		 * 
		 * Sua aplicação irá pedir, ano, mes e dia, em variáveis inteiras
		 * separadamente.
		 * 
		 * Ano => deve ser maior que 1900
		 * dia => deve estar entre 1 e 31
		 * mes => deve estar entre 1 e 12
		 * 
		 * No final, exibe a data dia/mes/ano
		 */
		
		short ano = Short.parseShort(JOptionPane.showInputDialog("Ano"));
		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Mes"));
		byte dia = Byte.parseByte(JOptionPane.showInputDialog("Dia"));
		
		while (ano<=1900) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Ano deve ser > que 1900"));
		}
		
		while (mes<1 || mes>12) {
			mes = Byte.parseByte(JOptionPane.showInputDialog("Mes deve estar entre 1 e 12"));
		}
		
		if (mes==2) {
			while (dia<1 || dia >29) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia"));
			}
		}else if(mes==4 || mes == 6 || mes == 9 || mes ==11) {
			while (dia<1 || dia >30){
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia"));
			}
		}else {
			while (dia<1 || dia >31){
				dia = Byte.parseByte(JOptionPane.showInputDialog("Dia"));
			}			
		}
		
		System.out.println("Data: " + dia + "/" + mes + "/" + ano);
		
		
		
	}
}
