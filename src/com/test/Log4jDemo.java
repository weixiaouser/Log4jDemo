package com.test;

import org.apache.log4j.Logger;

public class Log4jDemo {

	static Logger logger = Logger.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.debug("����debug��־");
		logger.info("����info��־");
		logger.warn("����warn��־");
		logger.error("����error��־");

	}

}
