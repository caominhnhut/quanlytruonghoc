package com.qlth.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.mysql.jdbc.CallableStatement;
import com.qlth.dao.NguoiDungDao;
import com.qlth.dbprovider.DataConnection;
import com.qlth.model.NguoiDung;

public class NguoiDungDaoImpl implements NguoiDungDao {

	public static final Log logger = LogFactory.getLog(NguoiDungDao.class);

	private DataConnection dc = new DataConnection();

	public Boolean timNguoiDung(NguoiDung nguoiDung) {
		Boolean result = false;
		try {
			dc.createConnect();
			logger.info("Processing for authentication");
			CallableStatement proc = (CallableStatement) dc.createConnect().prepareCall("{call dangNhap(?,?)}");
			proc.setString(1, nguoiDung.getTenDN());
			proc.setString(2, nguoiDung.getMatkhau());
			logger.info(proc);
			ResultSet rs = proc.executeQuery();
			if (rs.next()) {
				result = true;
			}
			logger.info("Authentication is finished");
		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			try {
				dc.disConnect();
				logger.info("Disconnected");
			} catch (SQLException e) {
				logger.error(e.getMessage());
			}
		}
		return result;
	}
}
