package finalkey;
//if you make class as final
//you cannot use in inheritance

//final class finalkey{//cannot use as a parent class//just like a access modifier

public class finalkey {


final int i=10;//error if you change the value of i
	//i=8;
	public void method1(){
		int i=5;
		i=9;//can change the value
		
		System.out.println(i);
		//you can change i here
		//o/p is 9
		
		
		//doing method as final
		//final void method2(){
		//you cannot use overriding 
		
	}
	public static void main(String args[]){
		finalkey f=new finalkey();
		f.method1();
		
		
	}
	
}
