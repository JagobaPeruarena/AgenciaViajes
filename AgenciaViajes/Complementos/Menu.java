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
	
	public static final int REALIZAR_PRESTAMOS=1;
	
	public static final int SALIR=0;
	
	
	public static void monstrarMenuPrincipal() {
		System.out.println("Menu Principal:");
		System.out.println(GESTIONAR_HOTELES+". Gestionar Libros");
		System.out.println(GESTIONAR_CLIENTES+". Gestionar Socios");
		System.out.println(GESTIONAR_RESERVAS+". Gestionar Prestamos");
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
}
