package operators;


	
	
	public class calc1{
		
	    
		public static double add(double X,double Y){
			return X+Y;
		}
		public static double multiply(double X,double Y){
			return X*Y;
		}
		public static double divide(double X,double Y){
			return X/Y;
		}
		public static double subract(double X,double Y){
			return X-Y;
		}
		
		
	public static void main(String args[]){
		double numOne=Double.parseDouble(args[0]);
		double numTwo=Double.parseDouble(args[2]);
		char c=args[1].charAt(0);
		
		System.out.println(numOne + " " + c + " " + numTwo + " = " + add(numOne,numTwo));	
		System.out.println(numOne + " " + c + " " + numTwo + " = " + multiply(numOne,numTwo));
		System.out.println(numOne + " " + c + " " + numTwo + " = " + divide(numOne,numTwo));
		System.out.println(numOne + " " + c + " " + numTwo + " = " + subract(numOne,numTwo));
			
		}
}
