package com.qlth.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;


public class GiaoVienLopHocDao {
	private DataConnection dc = new DataConnection();

	public ArrayList<String> getDanhSachTheoGVCN() {
		String query = "select lh.tenlop from giaovien_chunhiem gvcn join lophoc lh on gvcn.malop=lh.malop where gvcn.mand='GV001';";
		ArrayList<String> arr=new ArrayList<String>();
		ResultSet result=null;
		try {
			result=dc.createConnect().createStatement().executeQuery(query);
			while(result.next()){
				arr.add(result.getString(1));
			}
			return arr;
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Loi load du lieu!");
			return null;
		}
		
	}
}
