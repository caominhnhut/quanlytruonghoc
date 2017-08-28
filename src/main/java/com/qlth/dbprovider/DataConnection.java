package com.qlth.dbprovider;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DataConnection {
	
	private static final Log logger = LogFactory.getLog(DataConnection.class);
	
	private Connection conn = null;

	public Connection createConnect() {
		try {
			InputStream input = getClass().getClassLoader().getResourceAsStream("db.properties");
			Properties pro = new Properties();
			pro.load(input);
			String url = pro.getProperty("url");
			String username = pro.getProperty("username");
			String password = pro.getProperty("password");
			try {
				logger.info("Connecting to db with connection string: " + url);
				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
				conn = DriverManager.getConnection(url, username, password);
				logger.info("Connected to db");
			} catch (SQLException e) {
				logger.error(e.getMessage());
			}
		} catch (FileNotFoundException e) {
			logger.error(e.getMessage());
		} catch (IOException e) {
			logger.error(e.getMessage());
		}
		return conn;
	}

	public void disConnect() throws SQLException {
		if (conn != null || !conn.isClosed()) {
			conn.close();
			conn = null;
			logger.info("Disconnected");
		}
	}

}
