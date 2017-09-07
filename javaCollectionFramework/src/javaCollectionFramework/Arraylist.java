package javaCollectionFramework;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String args[]){
		
		//ArrayList<Integer> a=new ArrayList<Integer>();
		//you need to import any collection to use them
//Q:add ele into arraylist
		ArrayList<String> b=new ArrayList<String>();
		b.add("harish");
        b.add("java");
		//add/del dynamic size
		//array is fixed size. you cannot add/del ele
		//arraylist is dynamic size
		System.out.println(b);
		b.add(0, "students");
		b.add(1, "students");//can accept duplicate data
		System.out.println(b);
//Q: get a particular ele from index
		System.out.println(b.get(2));
//Q: is the keyword present in the arraylist or not
		System.out.println(b.contains("rah"));
//Q: what is the index of the element
		System.out.println(b.indexOf("java"));
//Q: size of the array list
		System.out.println(b.size());
//Q:remove particular ele
		b.remove("harish");
		System.out.println(b);
		b.remove(1);
		System.out.println(b);
		
	}
}
