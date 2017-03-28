package arrayexamples;

public class add {

	public static void main(String[] args) {
		int a[]=new int[2];
		int b[]=new int[3];
		
		
				a[0]=2;
				a[1]=4;
				
				b[0]=9;
				b[1]=6;
				int i=0;
				while(i<2)
				{
					int sum=a[i]+b[i];
					int mult=a[i]*b[i];
					float div=a[i]/b[i];
					System.out.println("sum of array"+sum);
					System.out.println("mult of array"+mult);
					System.out.println("div of array"+div);
					i=i+1;
				}
				
		  				

	}

}
