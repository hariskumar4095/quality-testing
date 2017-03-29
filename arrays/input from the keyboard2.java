//here take i/p from keyboard and soklve problem

import java.util.Scanner;
public class Value{
	public static void main(String args[]){
	
		int a;
		int b;
	
		
			Scanner keyboard = new Scanner(System.in);
		
		
		
		
		System.out.println("enter your name");
		String Name= keyboard.nextLine();
		System.out.println("enter a");
	a= keyboard.nextInt();
		System.out.println("enter b");
	b= keyboard.nextInt();
    float z = (float) a / (float) b ;
		
		System.out.println("your name, a, b, result values are>"+Name+a+b);
		System.out.println("sum of a,b="+(a+b));
		System.out.println("multiplication of a,b="+(a*b));
		System.out.println("division of a,b="+(z));
	}
}


/**
*enter your name                                                                                                                                                      
harish                                                                                                                                                               
enter a                                                                                                                                                              
12                                                                                                                                                                   
enter b                                                                                                                                                              
24                                                                                                                                                                   
your name, a, b, result values are>harish1224 
sum of a,b=36                                                                                                                                                        
multiplication of a,b=288                                                                                                                                            
division of a,b=0.5 
**/

