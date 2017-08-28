package com.qlth.dao.impl;

import java.sql.ResultSet;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.mysql.jdbc.CallableStatement;
import com.qlth.dao.DataConnection;
import com.qlth.dao.NguoiDungDAO;
import com.qlth.model.NguoiDung;

public class NguoiDungDaoImpl implements NguoiDungDAO{
	
	public static final Log logger=LogFactory.getLog(NguoiDungDAO.class);
	
	DataConnection dc=new DataConnection();
	
	public Boolean timNguoiDung(NguoiDung nguoiDung) {
		Boolean result=false;
		try{
			dc.createConnect();
			logger.info("Processing for authentication");
			CallableStatement proc=(CallableStatement) dc.con.prepareCall("{call dangNhap(?,?)}");
			proc.setString(1, nguoiDung.getTenDN());
			proc.setString(2, nguoiDung.getMatkhau());
			logger.info(proc);
			ResultSet rs=proc.executeQuery();
			if(rs.next()){
				result = true;
			}
			logger.info("Authentication is finished");
		}catch(Exception e){
			logger.error(e.getMessage());
		}finally {
			dc.disConnect();
		}
		return result;
	}
}
