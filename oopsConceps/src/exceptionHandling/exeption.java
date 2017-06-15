package exceptionHandling;

public class exeption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//try catch method 
		//it shows error report exception
		//you can use when it is suspected
		
		int b=7;
		int c=0;
	try{	
		//if the block of code may fail
		int div=b/c;
	
		System.out.println(div);
	}
	//catch(Exception e){
		//then what you have to do
		//System.out.println("infinite");
		//you can use multiple catch blocks
		catch(ArithmeticException a){
			System.out.println("infinite");
		}
	catch(IndexOutOfBoundsException b1){
		System.out.println("reduce the size of index");
	}
	finally{
		//this can be run even if the prog is good or errored
		//though if block fails at any catch then it comes to finally
		//ex: some times you want to close the browser or delete the cookies 
		//there may not be catch when you use finally
		System.out.println("delete cookies");
	}
	}
	/*when you want to skip the failure you should use try catch method
	 * highly used in the transactions
	 * ex: if the transaction fail, then it should display and code for retry
	 * 1 try can have many catch
	 * catch blocks should follow try block for sure
	 *types of exceptions:1. arithmetic /2. out of bound ...
	 *you can also specify the type of exeption in catch block saying..
	 *catch(ArithmaticException a){}
	 **/
	
	
	

}
