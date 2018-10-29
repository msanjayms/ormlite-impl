package com.enstage.ormlite.entity;

import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;

public class FetchIccInfo {

	public static void main(String[] args) {

		FetchIccInfo ftchInfo = new FetchIccInfo();
		try {
			JdbcConnectionSource connectionSource = ftchInfo.connectionSetup();
			Dao<IccInfo, String> iccInfoDao = DaoManager.createDao(connectionSource, IccInfo.class);
			IccInfo iccInfo = iccInfoDao.queryForId("117");
			System.out.println(iccInfo);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private JdbcConnectionSource connectionSetup() throws SQLException {
		// set up sql-connection
		String databaseUrl = "jdbc:jtds:sqlserver://192.168.106.56/SBI_PREPAID_ACCOSA;sendStringParametersAsUnicode=false";
		JdbcConnectionSource connection = new JdbcConnectionSource(databaseUrl);
		((JdbcConnectionSource) connection).setUsername("accosa_sa");
		((JdbcConnectionSource) connection).setPassword("accosa2k4");

		return connection;
	}
}
