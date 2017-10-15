package com.qlth.bus.impl;

import com.qlth.bus.NguoiDungBus;
import com.qlth.dao.NguoiDungDao;
import com.qlth.dao.impl.NguoiDungDaoImpl;
import com.qlth.model.NguoiDung;
import com.qlth.model.ResponseData;

public class NguoiDungBusImpl implements NguoiDungBus{

	private NguoiDungDao nguoiDungDao = new NguoiDungDaoImpl();
	
	public ResponseData<NguoiDung> timNguoiDung(NguoiDung nguoiDung) {
		ResponseData<NguoiDung> resNguoiDung = new ResponseData<NguoiDung>();
		NguoiDung nd = nguoiDungDao.timNguoiDung(nguoiDung);
		if(nd != null){
			resNguoiDung.setData(nguoiDung);
		}else{
			resNguoiDung.setErrorMessage("Tên đăng nhập hoặc mật khẩu không đúng.");
		}
		return resNguoiDung;
	}

}
