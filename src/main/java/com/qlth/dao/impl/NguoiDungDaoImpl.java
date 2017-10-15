package com.qlth.dao.impl;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.mysql.jdbc.CallableStatement;
import com.qlth.dao.NguoiDungDao;
import com.qlth.dbprovider.DataConnection;
import com.qlth.model.HocSinh;
import com.qlth.model.NguoiDung;
import com.qlth.model.PhuHuynh;

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

	public Boolean themHocSinh(HocSinh hocSinh, PhuHuynh phuHuynh) {
		Boolean result = null;
		try {
			dc.createConnect();
			CallableStatement proc = (CallableStatement) dc.createConnect()
					.prepareCall("{call themHocSinh(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			proc.setString(1, hocSinh.getMaND());
			proc.setString(2, hocSinh.getTenDN());
			proc.setString(3, hocSinh.getMatkhau());
			proc.setString(4, hocSinh.getHoten());
			proc.setString(5, hocSinh.getCmnd());
			proc.setDate(6, (Date) hocSinh.getNgaycap());
			proc.setString(7, hocSinh.getNoicap());
			proc.setString(8, hocSinh.getSdt());
			proc.setDate(9, (Date) hocSinh.getNgaysinh());
			proc.setString(10, hocSinh.getDantoc());
			proc.setString(11, hocSinh.getTongiao());
			proc.setString(12, hocSinh.getQuoctich());
			proc.setString(13, hocSinh.getGioitinh());
			proc.setString(14, hocSinh.getHinhanh());
			proc.setString(15, hocSinh.getDiachi());
			proc.setString(16, hocSinh.getTrangthai());
			proc.setString(17, hocSinh.getLoaiND());
			proc.setString(18, hocSinh.getDoituonguutien());
			proc.setString(19, phuHuynh.getMaPH());
			proc.setString(20, phuHuynh.getHoten());
			proc.setDate(21, (Date) phuHuynh.getNamsinh());
			proc.setString(22, phuHuynh.getDienthoai());
			proc.setString(23, phuHuynh.getNghenghiep());
			proc.setString(24, phuHuynh.getQuanhe());
			
			ResultSet rs = proc.executeQuery();
			if(rs.next()){
				logger.info("Them thanh cong!!!");
			}

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
