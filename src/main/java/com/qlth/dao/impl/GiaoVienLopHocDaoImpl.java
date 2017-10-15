package com.qlth.dao.impl;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.commons.logging.Log;

import com.qlth.dao.GiaoVienLopHocDao;
import com.qlth.dbprovider.DataConnection;


public class GiaoVienLopHocDaoImpl implements GiaoVienLopHocDao {
	private DataConnection dc = new DataConnection();
	private static final Log logger=org.apache.commons.logging.LogFactory.getLog(GiaoVienLopHocDaoImpl.class);

	public ArrayList<String> getDanhSachLop(String magv) {
		String query = "{CALL getTenLop(?)}";
		ArrayList<String> arr=new ArrayList<String>();
		try {
			CallableStatement st=dc.createConnect().prepareCall(query);
			st.setString(1,magv);
			logger.info("Querying to database...");
			ResultSet result=st.executeQuery();
			logger.info("Queried");
			while(result.next()){
				arr.add(result.getString(1));
			}
		} catch (SQLException e) {
			logger.error(e.getMessage());
		}
		return arr;
	}
}
