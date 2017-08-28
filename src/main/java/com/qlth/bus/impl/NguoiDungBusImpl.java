package com.qlth.bus.impl;

import com.qlth.bus.NguoiDungBUS;
import com.qlth.dao.NguoiDungDAO;
import com.qlth.dao.impl.NguoiDungDaoImpl;
import com.qlth.model.NguoiDung;

public class NguoiDungBusImpl implements NguoiDungBUS{

	private NguoiDungDAO nguoiDungDao = new NguoiDungDaoImpl();
	
	public Boolean timNguoiDung(NguoiDung nguoiDung) {
		return nguoiDungDao.timNguoiDung(nguoiDung);
	}

}
