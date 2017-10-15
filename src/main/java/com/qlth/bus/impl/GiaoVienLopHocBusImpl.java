package com.qlth.bus.impl;

import java.util.ArrayList;

import com.qlth.bus.GiaoVienLopHocBus;
import com.qlth.dao.GiaoVienLopHocDao;
import com.qlth.dao.impl.GiaoVienLopHocDaoImpl;

public class GiaoVienLopHocBusImpl implements GiaoVienLopHocBus {
	private GiaoVienLopHocDao gvlhDao = new GiaoVienLopHocDaoImpl();

	public ArrayList<String> getDanhSachLop(String magv) {
		return gvlhDao.getDanhSachLop(magv);
	}
}
