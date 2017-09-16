package com.qlth.bus.impl;


import java.util.ArrayList;

import com.qlth.bus.HocSinhBus;
import com.qlth.dao.impl.HocSinhDaoImpl;
import com.qlth.model.HocSinh;
import com.qlth.model.LopHoc;

public class HocSinhBusImpl implements HocSinhBus{
	HocSinhDaoImpl hsDao=new HocSinhDaoImpl();
	public ArrayList<HocSinh> getDanhSachHocSinh(){
		return hsDao.getDanhSachHocSinh();
	}
	public ArrayList<HocSinh> getHocSinhTheoLop(LopHoc lop){
		return hsDao.getHocSinhTheoLop(lop);
	}
}
