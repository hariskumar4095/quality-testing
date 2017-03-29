//scan and print the input from the keyboard

import java.util.Scanner;
public class Name{
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

/**
*enter your name(keyboard input)
*harish
*your name is harish(o/p)
*enter your age
*23
*your age is 23
**/

