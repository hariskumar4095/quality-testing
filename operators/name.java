package operators;

import java.util.Scanner;
public class name{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your name");
		String text= scan.nextLine();
		System.out.println("your name is"+text);
		System.out.println("enter your age");
		int age= scan.nextInt();
		System.out.println("your age is "+age);
	}
}


