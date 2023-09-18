package com.alura.jdbc.pruebas;

import java.sql.Connection;
import java.sql.SQLException;

import com.alura.jdbc.factory.ConnectionFactory;

public class PruebaPoolConexiones {
	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionfactory= new ConnectionFactory();
		
		for(int i =0 ; i <20 ; i++) {
			Connection conexion = connectionfactory.recuperaConexion();
			System.out.println("conexion numero " + (i+1));
		}
	}
}
