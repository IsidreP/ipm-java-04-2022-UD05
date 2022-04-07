package package1;

import javax.swing.JOptionPane;

public class Ej13 {

	public static void main(String[] args) {
		
		String valor1=JOptionPane.showInputDialog("Introduce un valor");
		float x=Float.parseFloat(valor1);
		
		String valor2=JOptionPane.showInputDialog("Introduce un valor");
		float y=Float.parseFloat(valor2);
		
		String signo=JOptionPane.showInputDialog("Introduce un valor");
		
		double resultado;
		
		
		switch(signo) {
		case "+":
			resultado=x+y;
			JOptionPane.showMessageDialog(null, "La operación es: "+x+" "+signo+" "+y+" = "+resultado);
			break;
		case "-":
			resultado=x-y;
			JOptionPane.showMessageDialog(null, "La operación es: "+x+" "+signo+" "+y+" = "+resultado);
			break;
		case "*":
			resultado=x*y;
			JOptionPane.showMessageDialog(null, "La operación es: "+x+" "+signo+" "+y+" = "+resultado);
			break;
		case "/":
			resultado=x/y;
			JOptionPane.showMessageDialog(null, "La operación es: "+x+" "+signo+" "+y+" = "+resultado);
			break;
		case"^":
			resultado=Math.pow(x, y);
			JOptionPane.showMessageDialog(null, "La operación es: "+x+" "+signo+" "+y+" = "+resultado);
			break;
		case "%":
			resultado=x%y;
			JOptionPane.showMessageDialog(null, "La operación es: "+x+" "+signo+" "+y+" = "+resultado);
			break;

		default:
			System.out.print("Introduce los datos correctamente");
		
		}
		
	}

}
