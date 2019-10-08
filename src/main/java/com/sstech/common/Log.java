package com.sstech.common;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {
	public static Logger log;
	
	public static Logger setupLog() {
		log=Logger.getLogger("TestLogOutFuctionality");
		PropertyConfigurator.configure("log4j.properties");
		
		return log;
		
	}

}
