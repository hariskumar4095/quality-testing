package controlstruct;
//Write a program to check whether a given string is a palindrome or not?

public class polindrome {
	
	public static void main(String args[]){
		
		
		String s="sms";
		String rev="";
		
	    int l= s.length();
	    
	    
	    for (int i=l-1;i>=0;i--)
	    {
	    	rev=rev + s.charAt(i);
	    	
	    	
	    }
	    if (rev.equals(s))
	    {
	    	System.out.println("the string is a polindrome");
	    }
	    
	    else
	    {
	    	System.out.println("the string is not a polindrome");
	    }
		
	}

}
