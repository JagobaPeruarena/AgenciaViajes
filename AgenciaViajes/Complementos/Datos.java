package Complementos;

import java.util.Scanner;

import Clases.clientes;
import Clases.hoteles;

public class Datos {

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
