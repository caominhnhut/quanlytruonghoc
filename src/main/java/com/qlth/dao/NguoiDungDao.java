package com.qlth.dao;

import com.qlth.model.HocSinh;
import com.qlth.model.NguoiDung;

public interface NguoiDungDao {

	public Boolean timNguoiDung(NguoiDung nguoiDung);
	public Boolean themHocSinh(HocSinh hocSinh);
}
