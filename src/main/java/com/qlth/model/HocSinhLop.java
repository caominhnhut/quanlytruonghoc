package com.qlth.model;

import java.util.Date;

public class HocSinhLop {
	private String MaND;
	private String malop;
	private String nienkhoa;
	private Date ngaynhaphoc;

	public String getMaND() {
		return MaND;
	}

	public void setMaND(String maND) {
		MaND = maND;
	}

	public String getMalop() {
		return malop;
	}

	public void setMalop(String malop) {
		this.malop = malop;
	}

	public String getNienkhoa() {
		return nienkhoa;
	}

	public void setNienkhoa(String nienkhoa) {
		this.nienkhoa = nienkhoa;
	}

	public Date getNgaynhaphoc() {
		return ngaynhaphoc;
	}

	public void setNgaynhaphoc(Date ngaynhaphoc) {
		this.ngaynhaphoc = ngaynhaphoc;
	}
}
