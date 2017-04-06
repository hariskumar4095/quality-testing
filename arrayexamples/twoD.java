package arrayexamples;

import java.util.Scanner;



public class twoD {
	public static void main(String args[]){
	
		int a[][]=new int[2][3];
		int b[][]=new int[2][3];
	
		
		System.out.println("enter new array");
		
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			
			Scanner NUM =new Scanner(System.in);
			
			
	 a[i][j] =NUM.nextInt();
	 b[i][j] = NUM.nextInt();
		
	 
		}
		
		

	}
	 
	
			
		}

		
	
	
	
	}	

// int sum = a[i][j]+b[i][j];
//double div = a[i][j]/b[i][j];
//int mult= a[i][j]*b[i][j];

//System.out.println("sum="+sum); 
//System.out.println("div="+div); 
//System.out.println("mult="+mult); 
