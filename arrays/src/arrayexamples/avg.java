package arrayexamples;



public class avg {

	public static void main(String[] args) {
		
		int a[]={1,3,4,2,5,6};
		
		
		int sum=0;
		
		for (int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		float avg=sum/a.length;
		
System.out.println("average of array elements ="+avg);
	}

}
