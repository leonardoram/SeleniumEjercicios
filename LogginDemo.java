package log4J2Demo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class LogginDemo {
	
	private static final Logger log = LogManager.getLogger(LogginDemo.class.getName());

	public static void main(String[] args) {

		log.debug("debug message logged");
		log.error("error message logged");
		log.fatal("fatal message logged");
		
	}

}
