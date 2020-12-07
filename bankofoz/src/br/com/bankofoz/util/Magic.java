package br.com.bankofoz.util;

import javax.swing.JOptionPane;

public class Magic {

	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toLowerCase();
	}
	
	public static int i(String msg) {
		return Integer.parseInt(s(msg));
	}
	
	public static float f(String msg) {
		return Float.parseFloat(s(msg));
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
