package ua.com.foxminded.dynamicweb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AddBooksDatabase {
	public void AddBooksDatabase {
		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
				"postgres", "123")) {
			System.out.println("Java JDBC PostgreSQL Example");

			System.out.println("Connected to PostgreSQL database!");
			Statement statement = connection.createStatement();
			String insertTableSQL = "INSERT INTO BOOKS"
					+ "(ID, NAME)";
			}
		    catch (SQLException e) {
			System.out.println("Connection failure.");
			e.printStackTrace();
		}
	}
}


