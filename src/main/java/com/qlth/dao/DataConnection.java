package com.qlth.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class DataConnection {
	protected Connection conn = null;
	protected String url = "jdbc:mysql://localhost:3306/quanlytruonghoc?useSSL=true";
	protected String username = "root";
	protected String password = "root";

	public Connection con;
	
	public Connection createConnect(){
		if(con == null){
			final String url="jdbc:mysql://localhost:3306/quanlytruonghoc?useSSL=true";
			final String username="root";
			final String password="root";
			
			try{
				
				con=DriverManager.getConnection(url,username,password);
				return con;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Ket noi that bai. Vui long kiem tra lai !");
			}
		}
		return null;
	}
	
	public void disConnect(){
		if(con!=null){
			try{
				con.close();
				con=null;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		DataConnection dc=new DataConnection();
		dc.createConnect();
	}
}