package Complementos;

import java.util.Scanner;

import Clases.clientes;
import Clases.habitaciones;
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

	public static habitaciones pedirDatosHabitaciones(Scanner scan) {
		habitaciones habitacion = new habitaciones();
		System.out.println("Introduce la id");
		habitacion.setId(Integer.parseInt(scan.nextLine()));
		System.out.println("Introduce el id_hotel");
		habitacion.setId_hotel(Integer.parseInt(scan.nextLine()));
		System.out.println("Introduce el numero de la habitacion");
		habitacion.setNumero(scan.nextLine());
		System.out.println("Introduce una descripcion");
		habitacion.setDescripcion(scan.nextLine());
		System.out.println("Introduce el precio");
		habitacion.setPrecio(Double.parseDouble(scan.nextLine()));
		return habitacion;
	}
	public static String seguir(Scanner scan) {
		String result = "";
		System.out.println("Quieres introducir otra habitacion, Y si / N no, opcion por defecto no");
		result = scan.nextLine();
		return result;
	}

}
