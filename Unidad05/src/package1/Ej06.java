package package1;

import javax.swing.JOptionPane;

public class Ej06 {

	public static void main(String[] args) {
		
		double iva=1.21;
		
		String precio=JOptionPane.showInputDialog("Introduce el precio");
		
		double precio1=Double.parseDouble(precio);
		
		System.out.print("El precio del producto con IVA es: "+precio1*iva);

	}

}
