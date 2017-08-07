package quanlytruonghoc;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Execution {
	private static final Log log = LogFactory.getLog(Execution.class);

	public static void main(String[] args) {
		// // TODO Auto-generated method stub
		// System.out.println("Day la phan mem quan ly truong hoc");
		// Logger log=Logger.getLogger(Execution.class.getName());
		// BasicConfigurator.configure();
		// log.debug("Hello World!");
		//
		// }

		log.debug("Example debug message ..");
		log.info("Example info message ..");
		log.warn("Example warn message ..");
		log.error("Example error message ..");
		log.fatal("Example fatal message ..");

		try {
			raiseException();
		} catch (Exception e) {
			log.fatal("<Some Object>", e);
		}
	}

	private static void raiseException() throws Exception {
		throw new Exception("Test Exception");
	}
}
