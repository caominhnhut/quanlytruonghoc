package com.qlth.bus;

import java.util.ArrayList;

import com.qlth.dao.HocSinhDao;
import com.qlth.model.HocSinh;

public class HocSinhBus {
	HocSinhDao hsDao=new HocSinhDao();
	public ArrayList<HocSinh> getDanhSachHocSinh(){
		return hsDao.getDanhSachHocSinh();
	}
}
