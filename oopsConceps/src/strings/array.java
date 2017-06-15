package strings;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Q:sum of all numbers in the array
		int a[]={2,3,5,1};
		
		int sum=0;
		
		for(int i=0;i<4;i++){
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		
		//Q: what is the index of 5
		
		for(int j=0;j<a.length;j++){
			
			if(a[j]==5){
				System.out.println(j);
				break;//for optimizing//stops execution and comes out of loop
			}
			
		}
		
		//Q: print all elements in the array along with the index
		
		for(int i=0;i<a.length;i++){
			System.out.println(i+"  "+a[i]);
		}
		
		//Q: mult dim array
		
		int b[][]={{1,2,4},{5,7,3}};
		//System.out.println(b[2][1]);
		
		//Q: print all ele
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				System.out.println(b[i][j]);
			}
		}
		//Q:interview question:min number among the following
		int min=b[0][0];
		int mincolumn=0;
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				
				if(b[i][j]<min){
					min=b[i][j];//this is the min value
					mincolumn=j;//this is the column name of the min value
					
					
				}
			}
		}
		
		//System.out.println("the min value in the array is ="+min+" at "+mincolumn);
		
		int max=b[0][mincolumn];
		int i=0;
				
		while(i<2){
			if(b[i][mincolumn]>max){
				max=b[i][mincolumn];
				
				
			}
			min=max;
		}
		System.out.println("new swapped min = "+min);
//Q:replace the min number and replace it with max number of that column
		
		
		
	}

}
