package package1;

import javax.swing.JOptionPane;

public class Ej10 {

	public static void main(String[] args) {
		
		int venta2=0;
		
		for(int i=0; i<4; i++) {
			
			String venta=JOptionPane.showInputDialog("Introduce la venta");
			
			int venta1=Integer.parseInt(venta);
			
			venta2+=venta1;
			
			
			
		}
		
		System.out.println(venta2);

	}

}
