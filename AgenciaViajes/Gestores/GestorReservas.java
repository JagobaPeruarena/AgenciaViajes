package Gestores;

import java.sql.SQLException;
import java.util.Scanner;

import Complementos.Menu;

public class GestorReservas {
	public static void run(Scanner scan) throws ClassNotFoundException, SQLException {
		int opcion =1;
		do {
			Menu.mostrarMenuReservas();
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case Menu.REALIZAR_RESERVA:
				
				break;
			case Menu.ANULAR_RESERVA:
			
				
				break;
			case Menu.VER_RESERVAS:
				
				break;
			case Menu.SALIR:
				System.out.println("Saliendo al menu");
				break;
			default:
				System.out.println("Numero incorrecto, intente de nuevo");
				break;
			}
		} while (opcion!=0);
	}
}
