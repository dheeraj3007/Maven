package log4j_example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class logging_demo
{
	private static final Logger log=LogManager.getLogger(logging_demo.class.getName());
	
	public static void main(String[] args)  
	{
		log.debug("debug massege logged");
		log.error("Error massege logged");
		log.fatal("fatel massege logged");
		
	}

}
