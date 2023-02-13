package Complementos;

public class Menu {
	public static final int GESTIONAR_LIBROS=1;
	public static final int GESTIONAR_CLIENTES=2;
	public static final int GESTIONAR_PRESTAMOS=3;
	
	public static final int INSERTAR_LIBROS=1;
	public static final int ELIMINAR_LIBROS=2;
	public static final int VER_LIBROS=3;
	
	public static final int INSERTAR_CLIENTES=1;
	public static final int ELIMINAR_CLIENTES=2;
	public static final int VER_CLIENTES=3;
	
	public static final int REALIZAR_PRESTAMOS=1;
	
	public static final int SALIR=0;
	
	
	public static void monstrarMenuPrincipal() {
		System.out.println("Menu Principal:");
		System.out.println(GESTIONAR_LIBROS+". Gestionar Libros");
		System.out.println(GESTIONAR_CLIENTES+". Gestionar Socios");
		System.out.println(GESTIONAR_PRESTAMOS+". Gestionar Prestamos");
		System.out.println(SALIR+". Salir");
	}
	public static void mostrarMenuSocios() {
		System.out.println("Menu Socios:");
		System.out.println(INSERTAR_CLIENTES+". Insertar Socio");
		System.out.println(ELIMINAR_CLIENTES+". Eliminar Socio");
		System.out.println(VER_CLIENTES+". Ver Socios");
		System.out.println(SALIR+". Salir");
	}
}
