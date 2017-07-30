package com.test;

import org.apache.log4j.Logger;

public class Log4jDemo {

	static Logger logger = Logger.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.debug("我是debug日志");
		logger.info("我是info日志");
		logger.warn("我是warn日志");
		logger.error("我是error日志");

	}

}
