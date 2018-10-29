package com.enstage.ormlite.performance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FindMaxRequests {

	public static void main(String[] args) throws SQLException {
		String sql = "select * from prepaid_api_interface_log where "
				+ "id between '51370985' and '51667876'"
				+ "and local_request_datetime between '2018-06-22 10:00:12.927000' and '2018-06-22 10:30:12.927000' "
				+ "and message_code=1048";
		Connection connection = connectionSetup();
		
		Statement statement = connection.createStatement();
		
		ResultSet rs = statement.executeQuery(sql);
	}

	private static Connection connectionSetup() throws SQLException {

		String databaseUrl = "jdbc:log4jdbc:mysql://192.168.106.52:3306/hdfc_prepaid";
		
		/*
		 * JdbcConnectionSource connection = new JdbcConnectionSource(databaseUrl);
		 * ((JdbcConnectionSource) connection).setUsername("accosa_sa");
		 * ((JdbcConnectionSource) connection).setPassword("accosa2k4");
		 */
		Connection connection = DriverManager.getConnection(databaseUrl, "aero_app", "accosa2k4");
		return connection;
	}
}