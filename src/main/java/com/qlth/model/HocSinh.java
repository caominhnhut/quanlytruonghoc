package com.qlth.model;

import java.util.Date;

public class HocSinh extends NguoiDung {
	private String doituonguutien;

	public HocSinh(String maND, String tenDN, String matkhau, String hoten, String cmnd, Date ngaycap, String noicap,
			String sdt, Date ngaysinh, String dantoc, String tongiao, String quoctich, String gioitinh, String hinhanh,
			String diachi, String trangthai, String loaiND) {
		super(maND, tenDN, matkhau, hoten, cmnd, ngaycap, noicap, sdt, ngaysinh, dantoc, tongiao, quoctich, gioitinh,
				hinhanh, diachi, trangthai, loaiND);
	}
	public String getDoituonguutien() {
		return doituonguutien;
	}

	public void setDoituonguutien(String doituonguutien) {
		this.doituonguutien = doituonguutien;
	}
}
