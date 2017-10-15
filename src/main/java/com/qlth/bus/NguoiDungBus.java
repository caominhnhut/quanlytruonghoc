package com.qlth.bus;

import com.qlth.model.NguoiDung;
import com.qlth.model.ResponseData;

public interface NguoiDungBus {
	
	public ResponseData<NguoiDung> timNguoiDung(NguoiDung nguoiDung);
}
