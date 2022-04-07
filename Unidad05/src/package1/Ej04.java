package package1;

import javax.swing.JOptionPane;

public class Ej04 {

	public static void main(String[] args) {
		
		double a=2;
		double cuadrado;
		
		String radio=JOptionPane.showInputDialog("Introduce el radio del circulo");
		
		double radio2=Double.parseDouble(radio);
		
		cuadrado=Math.pow(radio2, a);
		
		System.out.print("El area de la circumferencia es: "+Math.PI*cuadrado);

		
	}

}
