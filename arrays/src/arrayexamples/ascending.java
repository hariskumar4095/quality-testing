package arrayexamples;

public class ascending {
	public static void main(String args[]){
		
		int a[]=new int[5];
		
		a[0]=2;
		a[1]=9;
		a[2]=4;
		a[3]=6;
		a[4]=1;
		
		
		
		
	
		
		
		
		for(int i=0;i<5;i++)
		
		{
		   for (int j=i+1;j<5;j++)
		   {
			
		 if (a[i]>a[j]){ 
			 
			 int temp;
			 temp=a[i];
			a[i]=a[j];
			 a[j]=temp;
			 
		 }
		 
		   }
		   
		}
		
		//for printing the o/p
		
		
	for (int i=0;i<5;i++)
		{
        
		 System.out.println(a[i]);
				 
			 
			 
		 }
		
		
	}
}
			
		 
		




		
		
		
	


