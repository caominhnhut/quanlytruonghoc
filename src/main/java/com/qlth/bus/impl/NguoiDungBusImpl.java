package com.qlth.bus.impl;

import com.qlth.bus.NguoiDungBus;
import com.qlth.dao.NguoiDungDao;
import com.qlth.dao.impl.NguoiDungDaoImpl;
import com.qlth.model.NguoiDung;

public class NguoiDungBusImpl implements NguoiDungBus {

	private NguoiDungDao nguoiDungDao = new NguoiDungDaoImpl();

	public Boolean timNguoiDung(NguoiDung nguoiDung) {
		return nguoiDungDao.timNguoiDung(nguoiDung);
	}

}
