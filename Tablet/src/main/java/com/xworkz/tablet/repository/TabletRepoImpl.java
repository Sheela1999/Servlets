package com.xworkz.tablet.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.tablet.dto.TabletDto;

public class TabletRepoImpl implements TabletRepo {

	@Override
	public boolean save(TabletDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/class_5", "root",
					"Xworkzodc@123");
			System.out.println(connection);
			System.out.println("Database Connected");

			String query = "insert into tablet_info values(?,?,?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, dto.getId());
			statement.setString(2, dto.getTabletName());
			statement.setString(3, dto.getDosage());
			statement.setString(4, dto.getManufacturingDate());
			statement.setString(5, dto.getTabletType());
			statement.setString(6, dto.getCompanyName());
			statement.setString(7, dto.getExpiringDate());

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
	public ResultSet find(TabletDto dto, String companyName) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tablet", "root",
					"Xworkzodc@123");
			// System.out.println(connection);

			String query = "select * from tablet_info where companyName=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, companyName);

			ResultSet result = statement.executeQuery();
			
			if (result != null) {
				while (result.next()) {
					System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
							+ result.getString(4) + " " + result.getString(5) + " " + result.getString(6) + " "
							+ result.getString(7));
				}
			}

			connection.close();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return null;
	}

}
