package com.qlth.dao;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class DataConnection {

	protected Connection con;
	
	public Connection Connect(){
		if(con == null){
			final String url="jdbc:mysql://localhost:3306/quanlytruonghoc?useSSL=true";
			final String username="root";
			final String password="root";
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection(url,username,password);
				return con;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Ket noi that bai. Vui long kiem tra lai !");
			}
		}
		return null;
	}
	
	public void Disconnect(){
		if(con!=null){
			try{
				con.close();
				con=null;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}