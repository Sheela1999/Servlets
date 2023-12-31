package com.xworkz.beautyparlor.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.beautyparlor.dto.BeautyParlorDto;

public class BeautyParlorRepositoryImpl implements BeautyParlorRepository {

	@Override
	public boolean save(BeautyParlorDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/class_5", "root",
					"Xworkzodc@123");
			// System.out.println(connection);

			String query = "insert into appointment_info values(?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, dto.getId());		
			statement.setString(2, dto.getFirstName());
			statement.setString(3, dto.getLastName());
			statement.setString(4, dto.getGender());
			statement.setString(5, dto.getPhoneNumber());
			statement.setString(6, dto.getEmail());
			statement.setString(7, dto.getCity());
			statement.setString(8, dto.getServiceCategory());
			statement.setString(9, dto.getTreatments());
			statement.setString(10, dto.getMakeUpStyles());
			statement.setString(11, dto.getDate());
			statement.setString(12, dto.getTime());

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

	@Override
	public boolean find(String name) {
		
		return false;
	}

}
