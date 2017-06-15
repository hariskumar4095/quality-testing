package inheritance;
//son inheriting parent
public class son extends parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
son s=new son();
 s.city();
//son inherited parents city
s.country();
//calling function
//always call from main

System.out.println(s.i);
	}

	public void sonactivities(){
		System.out.println("add");
		
	}

}
