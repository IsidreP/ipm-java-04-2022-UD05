package package1;

import javax.swing.JOptionPane;

public class Ej11 {

	public static void main(String[] args) {
		
		String dia=JOptionPane.showInputDialog("Introduce un dia de la semana");
		
		
		
		switch(dia) {
		case "Lunes":
			System.out.print("El "+dia+" es un dia laboral");
			break;
		case "Martes":
			System.out.print("El "+dia+" es un dia laboral");
			break;
		case "Miercoles":
			System.out.print("El "+dia+" es un dia laboral");
			break;
		case "Jueves":
			System.out.print("El "+dia+" es un dia laboral");
			break;
		case "Viernes":
			System.out.print("El "+dia+" es un dia laboral");
			break;
		case "Sabado":
			System.out.print("El "+dia+" es un dia festivo");
			break;
		case "Domingo":
			System.out.print("El "+dia+" es un dia festivo");
			break;
		default:
			System.out.print("Has introducido un dia de la semana incorrecto");
		
		}
	}

}
