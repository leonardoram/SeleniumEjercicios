package log4J2Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;;


public class LogginDemo2 {
	
	private static final Logger log = LogManager.getLogger(LogginDemo2.class.getName());

	public static void main(String[] args) {
		
		log.debug("debug message logged ");
		log.error("error message logged ");

	}
 
}
