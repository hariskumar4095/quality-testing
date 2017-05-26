package controlstruct;

public class reverseNumber {

	public static void main(String[] args) {
	
		
		int number=8639;
		int remainder=0;
		
		while(number!=0)
		{
			remainder=remainder*10+number%10;
			number=number/10;
			
			
		}
		
		System.out.print(remainder);
	}

}
