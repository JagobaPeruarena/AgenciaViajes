package GestorClases;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Clases.*;

public class GestorBBDD extends Conector {
	public ArrayList<clientes> getClientes(){

		ArrayList<clientes> clientes = new ArrayList<clientes>();
		PreparedStatement st;
		try {
			st = con.prepareStatement("");
			ResultSet rs = st.executeQuery("select * from clientes");

			clientes cliente = new clientes();
			while (rs.next()) {
				cliente.setDni(rs.getString(1));
				cliente.setNombre(rs.getString(2));
				cliente.setApellidos(rs.getString(3));
				cliente.setDireccion(rs.getString(4));	
				cliente.setLocalidad(rs.getString(5));
				
				
				clientes.add(cliente);
			}
			return clientes;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public void insertarCliente(clientes cliente) throws SQLException {
		String sent ="INSERT INTO clientes (dni,nombre,apellidos,direccion,localidad) VALUES (?,?,?,?,?)";
		PreparedStatement pt = con.prepareStatement(sent);
		pt.setString(1, cliente.getDni());
		pt.setString(2, cliente.getNombre());
		pt.setString(3, cliente.getApellidos());
		pt.setString(4, cliente.getDireccion());
		pt.setString(5, cliente.getLocalidad());
		
	}
	public void eliminarCliente(int id) throws SQLException {
		
		String sent="DELETE FROM clientes WHERE id=?";
		PreparedStatement pt = con.prepareStatement(sent);
		
		pt.setInt(1, id);
		pt.execute();
	}
	public clientes getSocio(int id) throws SQLException {
		clientes newCliente= new clientes();
		PreparedStatement pt = con.prepareStatement("SELECT * FROM clientes where ID = ?");
		pt.setInt(1, id);
		ResultSet resultado=pt.executeQuery();
			
		newCliente.setDni(resultado.getString(7));
		newCliente.setNombre(resultado.getString(2));
		newCliente.setApellidos(resultado.getString(3));
		newCliente.setDireccion(resultado.getString(4));
		newCliente.setLocalidad(resultado.getString(5));
	
		return newCliente;
		
	}

}
