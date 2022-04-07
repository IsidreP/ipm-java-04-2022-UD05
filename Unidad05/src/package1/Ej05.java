package package1;

import javax.swing.JOptionPane;

public class Ej05 {

	public static void main(String[] args) {
		
		double resto=0;
		
		String numero=JOptionPane.showInputDialog("Introduce un numero");
		
		double numero1=Double.parseDouble(numero);
		
		resto=numero1%2;
		
		if(resto==0) {
			System.out.print("El numero es divisible por 2");
		}else {
			System.out.print("El numero no es divisible por 2");
		}
		

	}

}
