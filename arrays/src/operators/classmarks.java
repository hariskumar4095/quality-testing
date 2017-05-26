package operators;

//Take the scores of ten students in an array and 
//find out the highest score from the set of scores. 
//Further, find the average of the scores of all the students. 
//Hint: For finding the highest of all the scores, iterative approach can be used and the highest score is found by traversing through all the elements of the array.

public class classmarks {
	
	public static void main(String args[]){
		int marks[]={23,25,30,22,19,29,21,21,27};
		int highest=marks[0];
		int sum=0;
		float avg;
		
	//finding highest marks
		
		for (int i=1;i<marks.length;i++)
		{
			if (marks[i]>highest)
			{
			highest=marks[i];
			
			
		}
	}
		
		//finding the avg of the marks
		
		for (int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
			
			
		}
		
		
System.out.println("the highest marks in the class ="+highest);

System.out.println("the avg marks in the class ="+sum/marks.length);

}
}
