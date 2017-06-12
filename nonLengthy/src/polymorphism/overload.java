package polymorphism;

public class overload {
	
	{
	    public void demo(int a)
	    {
	       System.out.println ("a: " + a);
	    }
	    void demo (int a, int b)
	    {
	       System.out.println ("a and b: " + a + "," + b);
	    }
	    double demo(double a) {
	       System.out.println("double a: " + a);
	       return a*a;
	    }
	}
	class MethodOverloading
	{
	    public void main (String args [])
	    {
	        overload Obj = new overload();
	        double result;
	        Obj .demo(10);
	        Obj .demo(10, 20);
	        result = Obj .demo(5.5);
	        System.out.println("O/P : " + result);
	    }
	}
	public void demo(int i) {
		// TODO Auto-generated method stub
		
	}
	public double demo(double d) {
		// TODO Auto-generated method stub
		return 0;
	}
	public void demo(int i, int j) {
		// TODO Auto-generated method stub
		
	}

}
