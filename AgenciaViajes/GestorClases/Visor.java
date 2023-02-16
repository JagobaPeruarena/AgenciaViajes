package GestorClases;

import java.util.ArrayList;
import java.util.Iterator;

import Clases.clientes;
import Clases.hoteles;
import Clases.reservas;

public class Visor {
	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	public static void mostrarClientes(ArrayList<clientes> clientes) {
		for (clientes cliente: clientes) {
			System.out.println(cliente.toString());
		}
	}
	public static void mostrarCliente(clientes cliente) {
		System.out.println(cliente.toString());
	}
	public static void mostrarHoteles(ArrayList<hoteles> hoteles) {
		for (hoteles hotel: hoteles) {
			System.out.println(hotel.toString());
		}
	}
	public static void mostrarReservas(ArrayList<reservas> reservas) {
		for (reservas reserva: reservas) {
			System.out.println(reserva.toString());
		}
	}
}
