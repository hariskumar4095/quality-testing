package constructor;

public class constructorDemo {

	//constructor//doesnt wait for a return//same name as class
	//when ever we create an obj in main then it execute/call constructor
	//initiate initiate, define variables
	          //default constructor
	public constructorDemo(){
		int i=3;
		int j=4;
		int mult=i*j;
		System.out.println("the mult using default constructor is "+mult);
		//no need to call from main function to get executed
		System.out.println("this is constructor, this is default constructor");
	}
	          //Parameterized constructor
	public constructorDemo(int a, int b){
	  int sum=a+b;
	  System.out.println("the sum using parameterized constructor is "+sum);
		
	}
	
	public void getmethod(){
		   //it is expecting something
		   //to not return anything you should mention void
		
	}
	
	public static void main(String args[]){
		//main
		//creating an object
		constructorDemo cd=new constructorDemo();
		constructorDemo c=new constructorDemo(4,5);
		
	}
}
