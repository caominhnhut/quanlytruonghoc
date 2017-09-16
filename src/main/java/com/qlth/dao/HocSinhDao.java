package com.qlth.dao;

import java.util.ArrayList;

import com.qlth.model.HocSinh;
import com.qlth.model.LopHoc;

public interface HocSinhDao {
	public ArrayList<HocSinh> getDanhSachHocSinh();

	public ArrayList<HocSinh> getHocSinhTheoLop(LopHoc lop);
}
