package arrayexamples;

public class largest {

	public static void main(String[] args) {
		
		
		int a[]={3,6,2,1,9,2,4,5,5};
		
		int larger=a[0];
		
	
		
for (int i =1;i<a.length;i++)
{
	if (a[i]>larger)
	{
		larger=a[i];
	}
	
	
}
		
System.out.println("the larger number in the array is ="+larger);
		
		
		

	}

}
