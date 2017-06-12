package method_overloading;

public class overloading {
//main class it calls other method.
	//
	public static void main(String[] args) {
		
		
		       DisplayOverloading d = new DisplayOverloading();
		       //this is the way to call other class
		       d.disp('b');
		       //values are given here 
		       //belongs to d class
		       d.disp('a',10);
		       //
		   }
		// TODO Auto-generated method stub

	}



class DisplayOverloading
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}


