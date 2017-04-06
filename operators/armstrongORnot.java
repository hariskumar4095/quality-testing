package operators;
import java.lang.Math;


//Write a program to find whether a number is Armstrong number or not? 
//(hint :Armstrong number is a number whose digits when powered with the total 
//number of digits would sum to the original number eg: 153=1^3+5^3+3^3)

public class armstrongORnot {

	public static void main(String[] args) {
		
		int num=254;
		
	    String n= Integer.toString(num);
		
		double req=0;
		int l=String.valueOf(num).length();
		int mod=0;
		
		for (int i=0;i<l;i++)
		{
			
			mod=n.charAt(i);
			double pow=Math.pow(mod,l);
			req=req + pow;
			
			
			
		}
		
		System.out.print(req);
		
		
		
		

	}

	
}
