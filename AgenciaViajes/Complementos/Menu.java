package Complementos;

public class Menu {
	public static final int GESTIONAR_HOTELES=1;
	public static final int GESTIONAR_CLIENTES=2;
	public static final int GESTIONAR_RESERVAS=3;
	
	public static final int INSERTAR_HOTELES=1;
	public static final int ELIMINAR_HOTELES=2;
	public static final int VER_HOTELES=3;
	
	public static final int INSERTAR_CLIENTES=1;
	public static final int ELIMINAR_CLIENTES=2;
	public static final int VER_CLIENTES=3;
	
	public static final int REALIZAR_RESERVA=1;
	public static final int ANULAR_RESERVA=2;
	public static final int VER_RESERVAS=3;
	
	
	public static final int SALIR=0;
	
	
	public static void monstrarMenuPrincipal() {
		System.out.println("Menu Principal:");
		System.out.println(GESTIONAR_HOTELES+". Gestionar Hoteles");
		System.out.println(GESTIONAR_CLIENTES+". Gestionar Clientes");
		System.out.println(GESTIONAR_RESERVAS+". Gestionar Reservas");
		System.out.println(SALIR+". Salir");
	}
	public static void mostrarMenuClientes() {
		System.out.println("Menu Socios:");
		System.out.println(INSERTAR_CLIENTES+". Insertar Cliente");
		System.out.println(ELIMINAR_CLIENTES+". Eliminar Cliente");
		System.out.println(VER_CLIENTES+". Ver Clientes");
		System.out.println(SALIR+". Salir");
	}
	public static void mostrarMenuHotel() {
		System.out.println("Menu Hoteles:");
		System.out.println(INSERTAR_HOTELES+". Insertar Hotel");
		System.out.println(ELIMINAR_HOTELES+". Eliminar Hotel");
		System.out.println(VER_HOTELES+". Ver Hoteles");
		System.out.println(SALIR+". Salir");
		
	}
	public static void mostrarMenuReservas() {
		System.out.println("Menu Reservas:");
		System.out.println(REALIZAR_RESERVA+". Realizar Reservas");
		System.out.println(ANULAR_RESERVA+". Anular Reservas");
		System.out.println(VER_RESERVAS+". Ver Reservas");
		System.out.println(SALIR+". Salir");
		
	}
}
