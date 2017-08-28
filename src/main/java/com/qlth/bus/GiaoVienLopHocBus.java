package com.qlth.bus;

import java.util.ArrayList;

import com.qlth.dbprovider.GiaoVienLopHocDao;

public class GiaoVienLopHocBus {
	GiaoVienLopHocDao gvlhDao = new GiaoVienLopHocDao();

	public ArrayList<String> getDanhSachTheoGVCN(String magv) {
		return gvlhDao.getDanhSachTheoGVCN(magv);
	}
}
