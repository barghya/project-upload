package com.arghya;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Map2 {
			//Tree Map
	public static void main(String[] args) {
		//Ascending order..
		//null key not allowed.
		TreeMap<Integer,String> m1=new TreeMap<Integer,String>();
		
		m1.put(10640656, "Partha Chakraborty");
		m1.put(10640556,"Dharmveer Kumar");
		m1.put(10640546,"Rabin Kumar");
		m1.put(10640506,"Pradeep C ");
		m1.put(null,"Puja nandhi");//---------Error(for null key-----null value is allowed) --java.lang.NullPointerException
		
		System.out.println("----Obj-------"+m1);
		
		for(Entry<Integer, String> m:m1.entrySet()){  
			System.out.println(m);
			 //System.out.println(m.getKey()+" ..... "+m.getValue());  
			  } 
		
		
		
		
		

	}

}
