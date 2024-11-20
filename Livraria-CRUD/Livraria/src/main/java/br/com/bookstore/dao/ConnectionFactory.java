package br.com.bookstore.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionFactory {
	private static final String USER = "root";
	private static final String SENHA = "root";
	
	public static Connection conectar() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/livraria", USER, SENHA);
			return conexao;
		} catch (Exception e) {
			// throw -> jogar para cime
			// RuntimeException -> Erro que acontece enquanto o código rodava
			throw new RuntimeException();
		}
	}
}
