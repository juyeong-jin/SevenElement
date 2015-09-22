package com.webapp.service;

import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TimeZoneServiceTest {

	static Log log = LogFactory.getLog(TimeZoneServiceTest.class);
	
	public static void main(String[] args) {
		
		String[] tzs = TimeZone.getAvailableIDs();
		
		for (String tz : tzs) {
			log.info(tz);
		}
		
	}
		

}
