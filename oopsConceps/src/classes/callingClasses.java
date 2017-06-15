package classes;

public class callingClasses {

	public static void main(String[] args) {
		
		//main method or block
		//execution takes place
		//just like a heart of program
		
		calledclass m =new calledclass();
		//calling child by the parent//defining
		//class m=new class();
		
	//using that class//this class is no argument and no return value
		m.newMethod();
	
		//using the return class
		calledclassB n=new calledclassB();
		//it is no argument with a return value
		System.out.println(n.ReturnMethod());//n.ReturnMethod=10
		
		System.out.println(n.ReturnMethod2());//n.ReturnMethod2=haris123
	}
	

}
