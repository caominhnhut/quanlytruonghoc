package com.qlth.model;

import java.util.Date;

public class NguoiDung {
	protected String MaND;
	protected String tenDN;
	protected String matkhau;
	protected String hoten;
	protected String cmnd;
	protected Date ngaycap;
	protected String noicap;
	protected String sdt;
	protected Date ngaysinh;
	protected String dantoc;
	protected String tongiao;
	protected String quoctich;
	protected String gioitinh;
	protected String hinhanh;
	protected String diachi;
	protected String trangthai;
	protected String loaiND;

	public NguoiDung(String maND, String tenDN, String matkhau, String hoten, String cmnd, Date ngaycap, String noicap,
			String sdt, Date ngaysinh, String dantoc, String tongiao, String quoctich, String gioitinh, String hinhanh,
			String diachi, String trangthai, String loaiND) {
		super();
		MaND = maND;
		this.tenDN = tenDN;
		this.matkhau = matkhau;
		this.hoten = hoten;
		this.cmnd = cmnd;
		this.ngaycap = ngaycap;
		this.noicap = noicap;
		this.sdt = sdt;
		this.ngaysinh = ngaysinh;
		this.dantoc = dantoc;
		this.tongiao = tongiao;
		this.quoctich = quoctich;
		this.gioitinh = gioitinh;
		this.hinhanh = hinhanh;
		this.diachi = diachi;
		this.trangthai = trangthai;
		this.loaiND = loaiND;
	}
	
	public NguoiDung() {
		super();
	}

	public String getMaND() {
		return MaND;
	}

	public void setMaND(String maND) {
		MaND = maND;
	}

	public String getTenDN() {
		return tenDN;
	}

	public void setTenDN(String tenDN) {
		this.tenDN = tenDN;
	}

	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public Date getNgaycap() {
		return ngaycap;
	}

	public void setNgaycap(Date ngaycap) {
		this.ngaycap = ngaycap;
	}

	public String getNoicap() {
		return noicap;
	}

	public void setNoicap(String noicap) {
		this.noicap = noicap;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getDantoc() {
		return dantoc;
	}

	public void setDantoc(String dantoc) {
		this.dantoc = dantoc;
	}

	public String getTongiao() {
		return tongiao;
	}

	public void setTongiao(String tongiao) {
		this.tongiao = tongiao;
	}

	public String getQuoctich() {
		return quoctich;
	}

	public void setQuoctich(String quoctich) {
		this.quoctich = quoctich;
	}

	public String getGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getTrangthai() {
		return trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}

	public String getLoaiND() {
		return loaiND;
	}

	public void setLoaiND(String loaiND) {
		this.loaiND = loaiND;
	}

}
