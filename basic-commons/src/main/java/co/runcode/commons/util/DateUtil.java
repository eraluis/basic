package co.runcode.commons.util;

import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil {
	
	public static Date getCurrentDate(){		
		return (new GregorianCalendar()).getTime();		
	}

}
