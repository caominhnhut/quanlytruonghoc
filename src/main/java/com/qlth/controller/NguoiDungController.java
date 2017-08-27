package com.qlth.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.qlth.model.NguoiDung;

public class NguoiDungController {
	
	private static final Log logger=LogFactory.getLog(NguoiDungController.class);
	public NguoiDung login(NguoiDung nguoiDung){
		logger.info(nguoiDung.getTenDN());
		logger.info(nguoiDung.getMatkhau());
		return null;
	}
}
