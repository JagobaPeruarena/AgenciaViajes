package Gestores;

import java.sql.SQLException;
import java.util.Scanner;


import Clases.hoteles;
import Complementos.Menu;
import GestorClases.GestorBBDD;
import GestorClases.Visor;

public class GestorHoteles {
	public static void run(Scanner scan) throws ClassNotFoundException, SQLException {
		int opcion=1;
		GestorBBDD gesto = new GestorBBDD();
		do {
			Menu.mostrarMenuHotel();
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case Menu.INSERTAR_HOTELES:
				System.out.println("Insertar Hoteles");
				hoteles nHoteles = pedirDatosHoteles(scan);
				gesto.Conectar();
				gesto.insertarHotel(nHoteles);
				gesto.cerrar();
				break;
			case Menu.ELIMINAR_HOTELES:
				System.out.println("Eliminar Hotel");
				gesto.Conectar();
				System.out.println("Di la id");
				int op = Integer.parseInt(scan.nextLine());
				gesto.eliminarHotel(op);
				gesto.cerrar();
				break;
			case Menu.VER_HOTELES:
				System.out.println("Ver Hoteles");
				Visor.mostrarMensaje(null);
				break;
			case Menu.SALIR:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Numero incorrecto, intente de nuevo");
				break;
			}
		} while (opcion!=0);
	}
	public static hoteles pedirDatosHoteles(Scanner scan) {
		hoteles hotel = new hoteles();
		System.out.println("Introduce el CIF");
		hotel.setCif(scan.nextLine());
		System.out.println("Introduce el Nombre");
		hotel.setNombre(scan.nextLine());
		System.out.println("Introduce el Gerente");
		hotel.setGerente(scan.nextLine());
		System.out.println("Introduce el numero de estrellas");
		hotel.setEstrellas(Integer.parseInt(scan.nextLine()));
		System.out.println("Introduce el compania");
		hotel.setCompania(scan.nextLine());
	
		

		return hotel;
	}
}
