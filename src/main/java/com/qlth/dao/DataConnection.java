package com.qlth.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DataConnection {
	protected Connection conn = null;
	protected String url = "jdbc:mysql://localhost:3306/quanlytruonghoc?useSSL=true";
	protected String username = "root";
	protected String password = "root";

	public Connection createConnect() {
		if (conn == null) {
			// kiem tra driver
			try {
				Class.forName("com.mysql.jdbc.Driver");
				try {
					conn = DriverManager.getConnection(url, username, password);
					return conn;
				} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Ket noi that bai");
				}
			} catch (ClassNotFoundException e) {
				JOptionPane.showMessageDialog(null, "Ket noi that bai!222");
			}
		}
		return conn;
	}

	public void disConnect() throws SQLException {
		if (conn != null || !conn.isClosed()) {
			conn.close();
			conn = null;
		}
	}
}
