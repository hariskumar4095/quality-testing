
//command line args for an integer

//the output is 0

public class Echo {
	public static void main(String[] args) {
    int [] a = new int[args.length];

    for(int i = 0;i<args.length;i++) {
        System.out.print(a[i]);
    }
    }
}

/**
*sh-4.3$ javac Echo.java                                                                                                                                              
h-4.3$ java Echo                                                                                                                                                    
sh-4.3$ java Echo 10 20 30 19 20 34 12      
0000000                                                                                                                  
**/

