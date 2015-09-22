package com.webapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TimeZoneService {
	
	public List<Locale> getLocales() {
		
		List<Locale> list = new ArrayList<Locale>();
		Locale[] locals = Locale.getAvailableLocales();
		
		for (Locale l : locals)  {
			list.add(l);
		}
		return list;
	}

}
