package com.qlth.bus;

import java.util.ArrayList;

import com.qlth.dao.GiaoVienLopHocDao;

public class GiaoVienLopHocBus {
	GiaoVienLopHocDao gvlhDao=new GiaoVienLopHocDao();
	public ArrayList<String> getDanhSachTheoGVCN(){
		return gvlhDao.getDanhSachTheoGVCN();
	}
}
