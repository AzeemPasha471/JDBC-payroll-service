package com.Database.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {
	static final String DB_URL = "jdbc:mysql://localhost/";
	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) {
		// Open a connection
		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

				Statement stmt = conn.createStatement();) {
			System.out.println("Connected With the database successfully");
			String sql = "CREATE DATABASE emppayroll_service";
			stmt.executeUpdate(sql);
			System.out.println("Database created successfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}