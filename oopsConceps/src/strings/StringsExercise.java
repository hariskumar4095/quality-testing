package strings;

public class StringsExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//string is a class//have lot of methods//class.methods(){}
//actually it should be as String s=new String(){s.method();}
		
		//Q: is the string containing $ in $100
	String s="payment of $100";
	System.out.println(s.charAt(8));//to know which is at 8 th position
	System.out.println(s.indexOf("$"));//to know the position of $
	System.out.println(s.contains("$"));//to know if $ is there or not
	
	 //Q: string in reverse
	
	String name="harish";
	String reverse="";
	for(int i=name.length()-1;i>=0;i--){
		reverse=reverse+name.charAt(i);
		
	}
	System.out.println(reverse);
	}

}
