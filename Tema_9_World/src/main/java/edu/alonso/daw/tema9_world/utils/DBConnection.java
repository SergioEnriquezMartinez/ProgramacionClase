package edu.alonso.daw.tema9_world.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private final String DB_NAME = "world";
	private final String URL ="jdbc:mysql://127.0.0.1:3306/" + DB_NAME;
	private final String USER = "root";
	private final String PASS = "";

	private Connection conn = null;
	
	// Específico del singleton
	
	// Instancia de él mismo
	private static DBConnection instance;
	
	// Método para recuperar el objeto
	public static synchronized DBConnection getInstance() {
		if(instance == null) {
			instance = new DBConnection();
		}
		
		return instance;
	}

	
	// Constructor siempre privado en un singleton
	private DBConnection() {
		// Esto cambia de un singleton a otro
		System.out.println("Creando la conexión con la BBDD...");
		
		// SOLO PARA MYSQL
		// Registramos el driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			this.conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Conexión de BBDD creada con éxito!!");
		} catch (SQLException e) {
			System.err.println("Error al crear la conexión con la base de datos.");
			System.err.printf("Mensaje: %s %n", e.getMessage());
			System.err.printf("SQL Estado: %s %n", e.getSQLState());
			System.err.printf("Código de error: %s %n", e.getErrorCode());
		}
	}
	
	public Connection getConnection() {
		return conn;
	}
	
	
	public void destroyConnection() {
		try {
			System.out.println("Cerrando la conexión de BBDD...");
			this.conn.close();
			System.out.println("Conexión de BBDD cerrada con éxito!!");
		} catch (SQLException e) {
			System.err.println("Error al crear la conexión con la base de datos.");
			System.err.printf("Mensaje: %s %n", e.getMessage());
			System.err.printf("SQL Estado: %s %n", e.getSQLState());
			System.err.printf("Código de error: %s %n", e.getErrorCode());
		} finally {
			instance = null;
		}
	}
	
	
}
