package Gestores;


import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import Clases.reservas;
import Complementos.Datos;
import Complementos.Menu;
import GestorClases.GestorBBDD;
import GestorClases.Visor;

public class GestorReservas {
	public static void run(Scanner scan) throws ClassNotFoundException, SQLException, ParseException {
		int opcion =1;
		GestorBBDD gesto = new GestorBBDD();
		do {
			Menu.mostrarMenuReservas();
			opcion = Integer.parseInt(scan.nextLine());
			switch (opcion) {
			case Menu.REALIZAR_RESERVA:
				
				reservas nReserva = new reservas();
				System.out.println("Realizar Reserva");
				System.out.println("Di un dni");
				String dniR = scan.nextLine();
				gesto.Conectar();
				System.out.println("Di un hotel");
				int IdR = Integer.parseInt(scan.nextLine());
				Visor.mostrarHabitaciones(gesto.getHabitaciones(IdR));
				System.out.println("Di la id de la habitacion");
				int IdHabiR = Integer.parseInt(scan.nextLine());
				
				Date inicioF = Datos.preguntarFecha("Inicio", scan);
				Date finalF = Datos.preguntarFecha("Final", scan); 
				
				nReserva.setId_habitacion(IdHabiR);
				nReserva.setDni(dniR);
				nReserva.setDesde(inicioF);
				nReserva.setHasta(finalF);
				
				gesto.realizarReserva(nReserva);
				gesto.cerrar();
				break;
			case Menu.ANULAR_RESERVA:
				System.out.println("Anular Reserva");
				gesto.Conectar();
				System.out.println("Di la id de la reserva");
				int op = Integer.parseInt(scan.nextLine());
				gesto.eliminarReserva(op);
				gesto.cerrar();
				
				break;
			case Menu.VER_RESERVAS:
				System.out.println("Ver Reservas");
				gesto.Conectar();
				Visor.mostrarReservas(gesto.getReservas());
				
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
