package com.qlth.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javafx.scene.chart.PieChart.Data;

public class UserDAO {

	DataConnection dc=new DataConnection();
	
	public boolean login(String username,String password){
		boolean result=false;
		try{
			dc.Connect();
			String sql="SELECT * FROM nguoidung WHERE ten_dang_nhap = ? and matkhau = ?";
			PreparedStatement ps=dc.con.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs=ps.executeQuery();
			if(rs != null && rs.next()){
				result = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		dc.Disconnect();
		return result;
		
	}
}
