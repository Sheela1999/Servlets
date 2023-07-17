package com.xworkz.pizzahut.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.pizzahut.dto.PizzaHutDto;

public class PizzaHutRepositoryImpl implements PizzaHutRepository {

	@Override
	public boolean save(PizzaHutDto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/class_5", "root",
					"Xworkzodc@123");
			//System.out.println(connection);

			String query = "insert into pizzaorder_info values(?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, dto.getPizzaName());
			statement.setString(2, dto.getPizzaType());
			statement.setString(3, dto.getSize());
			statement.setString(4, dto.getLocation());
			statement.setString(5, dto.getPaymentMode());

			int i = statement.executeUpdate();
			System.out.println("effected rows:" + i);

			connection.close();

			if (i > 0) {
				System.out.println("records inserted");
			} else {
				System.out.println("records are inserted");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

}
