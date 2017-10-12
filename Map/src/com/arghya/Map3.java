package com.arghya;

import java.util.Hashtable;
import java.util.Map.Entry;
public class Map3 {
			//Hash Table
	public static void main(String[] args) {
		//Ascending order..
		//null  key and value not allowed.
		Hashtable<Integer,String> m1=new Hashtable<Integer,String>();
		//It is synchronized.
		m1.put(10640656, "Partha Chakraborty");
		m1.put(10640556,"Dharmveer Kumar");
		m1.put(10640546,"Rabin Kumar");
		m1.put(10640506,"Pradeep C ");
		m1.put(null,"Puja nandhi");//---------Error(for key and value--> null value is not allowed) --java.lang.NullPointerException
		
		System.out.println("----Obj-------"+m1);
		
		for(Entry<Integer, String> m:m1.entrySet()){  
			System.out.println(m);
			System.out.println(m.getKey()+" ..... "+m.getValue());  
			  } 
		
		
		
		
		

	}

}
