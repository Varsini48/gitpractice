package com.hexaware.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample 
{
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> per = new ArrayList<>();
		per.add(new Person("Joy",34));
		per.add(new Person("Riya",23));
		per.add(new Person("Jia",34));
		per.add(new Person("Niti",89));
		
		Collections.sort(per);
		
		
		for(Person p : per)
		{
			
			System.out.println("Name : " + p.getName() + " Age : " + p.getAge());
		}
	}
 
}


