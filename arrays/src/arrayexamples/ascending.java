package arrayexamples;

public class ascending {
	public static void main(String args[]){
		
		int a[]=new int[5];
		
		a[0]=2;
		a[1]=9;
		a[2]=4;
		a[3]=6;
		a[4]=1;
		
		
		
		int i;
		int j=1;
	
		
		
		
		for(i=0;i<4;i++)
		
		{
		
			
		 if (a[i]>a[j]){ 
			 
			 int t=5;
			a[i]=t;
			 a[j]=a[i];
			 t=a[i];
			 
			 System.out.println(t);
			 
			 j=i+1;
		 }
			
		 
		 else
		 {
			 System.out.println(a[i]);
			 
			 
			 

		 }
		 
		}
	}
}




		
		
		
	


