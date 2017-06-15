package superKey;

public class child extends parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child c=new child();
c.getString();
c.method();


        //always obj are created in the main class
        //using c.------, you should call what ever 
	}
	public void getString(){
		
		String name="name of the student";
		System.out.println(name);
		System.out.println(super.name);
		//calling other class same variable
		//used in inheritance concept
		//and if they have some same variables
		
	}
	
	public void method(){
		System.out.println("i am child");
		super.method();
		//calling method with super key
		
	}
	public child(){
		super();//this should always be first line
		System.out.println("child constructor");
		
	}

}
