package javaCollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet<String> hs=new HashSet<String>();
		hs.add("usa");
		hs.add("usa");//does not display duplicate values
		hs.add("uk");
		hs.add("india");
		System.out.println(hs);//no garentee of order
		System.out.println(hs.remove("usa"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//iterator
		Iterator<String>i=hs.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
	     
		while(i.hasNext()){
		System.out.println(i.next());
		}
		
		//ALSO YOU CAN USE EXCEPTION OUT OF BOUND
		try{
			System.out.println(i.next());
		}
		catch(Exception e){
			System.out.println("out of bound");
		
		}
	}

}
