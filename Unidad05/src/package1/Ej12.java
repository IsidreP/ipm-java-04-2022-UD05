package package1;

import javax.swing.JOptionPane;

public class Ej12 {

	public static void main(String[] args) {
		
		int num=0;
		long pass;
		
		do {
			String password=JOptionPane.showInputDialog("Introduce tu password");
			pass=Long.parseLong(password);
			num++;
		}while(num!=3 && pass!=123456);
			if (pass!=123456) {
				JOptionPane.showMessageDialog(null, "No has entrado");
			}else {
				JOptionPane.showMessageDialog(null, "Enhorabuena, estas dentro");
			}
			
		}
		
	}


