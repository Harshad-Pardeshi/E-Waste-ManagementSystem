package com.ewaste.business.helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {

	static public Date getDate(String strDate){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
		Date date=null;
		try {

			date = formatter.parse(strDate);

		} catch (ParseException e) {
			e.printStackTrace();

		}
		return date;
	}

}
