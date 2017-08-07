package com.quanlytruonghoc.main;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Execution {

	private static final Log logger = LogFactory.getLog(Execution.class);

	public static void main(String[] args) {
		Execution exec = new Execution();
		exec.runMe("Nhut Nguyen");
	}

	private void runMe(String parameter) {

		if (logger.isDebugEnabled()) {
			logger.debug("This is debug : " + parameter);
		}

		if (logger.isInfoEnabled()) {
			logger.info("This is info : " + parameter);
		}
		
		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);

	}
}
