package antbuild;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

//import log4j_Demo.log4j_demo;

public class logtest {
	static final Logger logger=LogManager.getLogger(logtest.class.getName());
	@Test
	public void axy()
	{
		DOMConfigurator.configure("log4j.xml");
		logger.info("#################");
		logger.info("Test is started");
		logger.info("################");
		logger.info("test is ended");
		System.out.println("test");
		
	}
}
