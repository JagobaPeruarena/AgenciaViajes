package Gestores;

import java.sql.SQLException;
import java.util.Scanner;

import Clases.clientes;
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
				clientes nCliente = pedirDatosClientes(scan);
				gesto.Conectar();
				gesto.insertarCliente(nCliente);
				gesto.cerrar();
				break;
			case Menu.ELIMINAR_CLIENTES:
				System.out.println("Eliminar Socio");
				gesto.Conectar();
				gesto.eliminarCliente(opcion);
				gesto.cerrar();
				break;
			case Menu.VER_CLIENTES:
				System.out.println("Ver Socios");
				gesto.Conectar();
				Visor.mostrarClientes(gesto.getClientes());
				gesto.cerrar();
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
	public static clientes pedirDatosClientes(Scanner scan) {
		clientes cliente = new clientes();
		System.out.println("Introduce el DNI");
		cliente.setDni(scan.nextLine());
		System.out.println("Introduce el Nombre");
		cliente.setNombre(scan.nextLine());
		System.out.println("Introduce el Apellido");
		cliente.setApellidos(scan.nextLine());
		System.out.println("Introduce el Direccion");
		cliente.setDireccion(scan.nextLine());
		System.out.println("Introduce el Localidad");
		cliente.setLocalidad(scan.nextLine());
	
		

		return cliente;
	}

}
