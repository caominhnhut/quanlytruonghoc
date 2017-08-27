package com.qlth.model;

public class LopHoc {
	private String malop;
	private String tenlop;
	private String khoihoc;
	
	
	public LopHoc(String malop, String tenlop, String khoihoc) {
		super();
		this.malop = malop;
		this.tenlop = tenlop;
		this.khoihoc = khoihoc;
	}

	public String getMalop() {
		return malop;
	}

	public void setMalop(String malop) {
		this.malop = malop;
	}

	public String getTenlop() {
		return tenlop;
	}

	public void setTenlop(String tenlop) {
		this.tenlop = tenlop;
	}

	public String getKhoihoc() {
		return khoihoc;
	}

	public void setKhoihoc(String khoihoc) {
		this.khoihoc = khoihoc;
	}

}
