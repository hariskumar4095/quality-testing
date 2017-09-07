package javaCollectionFramework;

import java.util.ArrayList;

public class cillectionProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]={2,5,5,6,1,9,9,9};
		
		//each number repeatation 
	//Prep empty array list
		
		/*empty array list--pass 2 in to arraylist--check another 2 is there or not
		 *increment the k variable if any more 2
		 *loop it and count it
		 **/
		
		//Q:print unique number from the list
		
		/*declare a array list*/
		ArrayList<Integer>al=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++){
			int k=0;
			if(!al.contains(a[i])){
				al.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++){
					if(a[i]==a[j]){
					k++;
					
					}
				}
			}
			System.out.println(k);
			System.out.println(al);
			if(k==1){
				System.out.println(a[i]+" is a unique number");
			}
		}
		
		
		
		
	}

}
