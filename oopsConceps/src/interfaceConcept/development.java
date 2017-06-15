package interfaceConcept;

public class development implements bankingclient,domainclient {
	//development is responsible to implement all methods in banking client
	//dont miss anything
	//so press implement unimplemented method//so it overrides
	//you can implement many interfaces
	
	public static void main(String args[]){
	//public can be accessed anywhere
		//interfaces are by default public
	development d=new development();
	d.paycreditcard();
	d.transferbalance();
	d.checkingbalance();
	d.investments();
	d.login("haris", "password");
	
	//calling all methods from this class
	bankingclient b=new development();
	b.paycreditcard();
	b.transferbalance();
	b.checkingbalance();
	//no login 
	//it is used only for the methods in interface
	//error if you say b.login();
	//this is called run time polymorphism
	
	domainclient d1=new development();
	d1.investments();
	//this has access to only investment method
	//this is called only particular method of particular interface
	
}	

	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		System.out.println("select credit card");
	}

	@Override
	public void transferbalance() {
		// TODO Auto-generated method stub
		System.out.println("select amout to be transfered");
		
	}

	@Override
	public void checkingbalance() {
		// TODO Auto-generated method stub
		System.out.println("check the balance");
	}
//you can also create some independent methods
	public void login(String username, String password){
		System.out.println("your login details are "+username+"  and "+password);
	}


@Override
public void investments() {
	// TODO Auto-generated method stub
	System.out.println("enter your amount");
	
}
}
