package main;

import java.sql.SQLException;
import java.util.Scanner;

import Gestores.GestorClientes;
import Gestores.GestorHoteles;

public class main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sca = new Scanner(System.in);
		GestorHoteles.run(sca);
	}
	

}
