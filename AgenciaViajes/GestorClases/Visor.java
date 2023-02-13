package GestorClases;

import java.util.ArrayList;

import Clases.clientes;

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
}
