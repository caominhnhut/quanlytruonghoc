package com.qlth.bus;

import java.util.ArrayList;

import com.qlth.model.HocSinh;
import com.qlth.model.LopHoc;

public interface HocSinhBus {
	public ArrayList<HocSinh> getDanhSachHocSinh();

	public ArrayList<HocSinh> getHocSinhTheoLop(LopHoc lop);
}
