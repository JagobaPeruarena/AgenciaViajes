package Gestores;

import java.sql.SQLException;
import java.util.Scanner;

import Clases.clientes;
import Complementos.Datos;
import Complementos.Menu;
import GestorClases.GestorBBDD;
import GestorClases.Visor;



public class GestorClientes {
	public static void run(Scanner scan) throws ClassNotFoundException, SQLException {
		int opcion=1;
		GestorBBDD gesto = new GestorBBDD();
		do {
			Menu.mostrarMenuClientes();
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case Menu.INSERTAR_CLIENTES:
				System.out.println("Insertar Socio");
				clientes nCliente = Datos.pedirDatosClientes(scan);
				gesto.Conectar();
				gesto.insertarCliente(nCliente);
				gesto.cerrar();
				break;
			case Menu.ELIMINAR_CLIENTES:
				System.out.println("Eliminar Socio");
				gesto.Conectar();
				System.out.println("Di la id");
				int op = Integer.parseInt(scan.nextLine());
				gesto.eliminarCliente(op);
				gesto.cerrar();
				break;
			case Menu.VER_CLIENTES:
				System.out.println("Ver Socios");
				gesto.Conectar();
				Visor.mostrarClientes(gesto.getClientes());
				gesto.cerrar();
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
