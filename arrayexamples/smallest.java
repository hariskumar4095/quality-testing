package arrayexamples;

public class smallest {
	


	public static void main(String[] args) {
		
		
		int a[]={3,6,2,1,9,2,4,5,5};
		
		int smaller=a[0];
		
	
		
for (int i =1;i<a.length;i++)
{
	if (a[i]<smaller)
	{
		smaller=a[i];
	}
	
	
}
		
System.out.println("the larger number in the array is ="+smaller);
		
		
		
	}
}
