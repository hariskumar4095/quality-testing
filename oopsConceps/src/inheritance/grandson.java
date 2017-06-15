package inheritance;
//grand son has access to all grandfather, father
public class grandson extends son {
	public static void main(String args[]){
		
		grandson gs=new grandson();
		gs.country();
		gs.city();
		gs.sonactivities();
		System.out.println(gs.i);
		System.out.println(gs.add(2, 3));
		
	}

}
