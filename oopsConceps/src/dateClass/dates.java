package dateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dates {

	public static void main(String args[]){
		
		//Q:print current date
		Date d=new Date();//object format of date
		d.toString();//string format of date
		System.out.println(d.toString());//print the date
		
		//Q:format of the date
		//SimpleDateFormat
		SimpleDateFormat s=new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat st=new SimpleDateFormat("MM/DD/YYYY hh:mm:ss");
		System.out.println(s.format(d));
		System.out.println(st.format(d));
		
		
		
		
		
		
		
		
		
		
	}
}
