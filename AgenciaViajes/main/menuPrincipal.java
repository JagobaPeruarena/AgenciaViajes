package main;

import java.sql.SQLException;
import java.util.Scanner;
import Complementos.Menu;
import Gestores.GestorClientes;
import Gestores.GestorHoteles;
import Gestores.GestorReservas;

public class menuPrincipal {
	public static void run(Scanner scan) throws ClassNotFoundException, SQLException {
		int opcion =1;
		do {
			Menu.monstrarMenuPrincipal();
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case Menu.GESTIONAR_HOTELES:
				GestorHoteles.run(scan);
				break;
			case Menu.GESTIONAR_CLIENTES:
				GestorClientes.run(scan);
				
				break;
			case Menu.GESTIONAR_RESERVAS:
				GestorReservas.run(scan);
				break;
			case Menu.SALIR:
				System.out.println("Adiossss");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		} while (opcion!=0);
	}

}
