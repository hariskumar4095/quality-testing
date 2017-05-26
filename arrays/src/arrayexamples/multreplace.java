package arrayexamples;

public class multreplace {
public static void main(String[] args) {
		
		int a[]={1,3,4,2,5,6};
		
		int mult;
		
		
		for (int i=0;i<a.length;i++)
		{
		mult=a[i]*i;
		a[i]=mult;
		System.out.println(a[i]);
		}

}
}