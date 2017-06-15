package dateClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class calender {

	public static void main(String args[]){
		
		Calendar C=Calendar.getInstance();		
		System.out.println(C.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(C.get(Calendar.DAY_OF_MONTH));
		System.out.println(C.get(Calendar.AM_PM));
		
		
		Date D=new Date();
		SimpleDateFormat sd=new SimpleDateFormat("MM/DD/YYYY hh/mm/ss");
		System.out.println(sd.format(D));
	}
}
