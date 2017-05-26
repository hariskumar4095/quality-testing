package arrayexamples;

import java.util.Scanner;



public class descending {
	
	public static void main(String args[]){
		
		
	Scanner d=new Scanner(System.in);
	
	System.out.println("enter the number of elements in the array");
	
	int n=d.nextInt();
	int a[]=new int [n];
	
	
	System.out.println("enter the elements in to the array");
	


	
	for(int i=0;i<n;i++)
	{
       
        	a[i]=d.nextInt();
        	   	 
	}

	
// sorting process
	
	for (int i=0;i<n;i--)
	{
		for (int j=i-1;j<n;j--)
		{
			if( a[n-1]<a[n])
					{
				int temp;
				temp=a[n];
				a[n]=a[n-1];
				a[n-1]=temp;
				
				
					}
		}
	}
	
	
	//display ele
	
	
	for (int i=0;i<n;i++)
	{
	System.out.println(a[n-1]);
	
	
	}
	

	
	}
}
	
	


