package thiskey;

public class thisDemo {

	int a=5;//for total class//global variable//use this for using this variable
	
	public void method(){
		
		int a=3;//only for this method//local variable
		System.out.println(a);
		System.out.println(this.a);
		System.out.print(a+this.a);
	}
	
	public static void main(String args[]){
		
		thisDemo t=new thisDemo();
		t.method();
	}
}
