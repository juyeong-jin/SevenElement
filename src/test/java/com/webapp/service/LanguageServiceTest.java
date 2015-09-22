package com.webapp.service;

import java.util.List;
import java.util.Locale;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LanguageServiceTest {

	static Log log = LogFactory.getLog(LanguageServiceTest.class);
	
	public static void main(String[] args) {
		// Controller (jsp, servlet)
		LanguageService service = new LanguageService();
		List<Locale> locales = service.getLocales();
		// Scope 객체에 Model 저장한다.
		// View 로 Forwarding  처리한다.
		
		// View (jsp)
		for(Locale l : locales){
		log.info(l.getDisplayName());	
		log.info(l.getDisplayCountry() + "_" + l.getDisplayLanguage());
		
		}
		
	}
		

}
