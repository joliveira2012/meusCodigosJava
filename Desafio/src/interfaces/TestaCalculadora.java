package interfaces;

import javax.swing.JOptionPane;

public class TestaCalculadora {
	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		CalculadoraBasica cb = c;
		
		String vl1, vl2;
		float op1, op2;
		
		vl1 = JOptionPane.showInputDialog(null, "Insira o 1° número que deseja calcular:");
		vl2 = JOptionPane.showInputDialog(null, "Insira o 2° número que deseja calcular:");
		
		if(vl1 == null || vl2 == null) {
			System.out.println("É necessário que informe o 1° e o 2° número!");
		}
		
		op1 = Float.parseFloat(vl1);
		op2 = Float.parseFloat(vl2);

		
		System.out.println("Soma: " + op1 + " + " + op2 + "= " + cb.somar(op1, op2));
		System.out.println("------------------------------------------");
		System.out.println("Subtração: " + op1 + " - " + op2 + "= " + cb.subtrair(op1, op2));
		System.out.println("------------------------------------------");
		System.out.println("Multiplicação: " + op1 + " * " + op2 + "= " + cb.multiplicar(op1, op2));
		System.out.println("------------------------------------------");
		if(op2 == 0) {
			System.out.println("Não é possível dividir por zero!");
		} else {
			System.out.println("Dividir: " + op1 + " / " + op2 + "= " + cb.dividir(op1, op2));
		}
	}
}
