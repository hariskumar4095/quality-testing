


package arrayexamples;


import java.util.Scanner;

public class twoDarr{
	

public static void main(String args[]){

	
	try{
Scanner S =new Scanner(System.in);

System.out.println("enter no:of rows");

int rows= S.nextInt();


System.out.println("enter no:of columns");
int columns= S.nextInt();


int a[][]=new int[rows][columns];
int b[][]=new int[rows][columns];

System.out.println("enter the first matrix");

for(int i=0;i<7;i++)
     {
	 
	 for (int j=0;j<7;j++)
	 {
	 a[i][j]=S.nextInt();
	 
	 }
	 }

System.out.println("\n enter the second matrix");

for(int i=0;i<7;i++)
     {
	 
	 for (int j=0;j<7;j++)
	 {
	 b[i][j]=S.nextInt();
	 
	 }
	 }
	
	 
int c[][]=new int[rows][columns];

for(int i=0;i<7;i++)
     {
	 
	 for (int j=0;j<7;j++)
	 {
	 c[i][j]=a[i][j]+b[i][j];
	 System.out.print("\n"+c[i][j]);
	 }
	 }

	}
}
}
	


