package com.collection.Comparable;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set set = new TreeSet(); //will provide default natural sorting -ascending
		
		Employee e1=new Employee(101, "Sham", "Pune");
		Employee e2=new Employee(102, "Amar", "Kolhpur");
		Employee e3=new Employee(103, "Ram", "Satara");
		Employee e4=new Employee(104, "Nihal", "Hydrabad");
		Employee e5=new Employee(105, "Prawin", "bangalore");
		
		set.add(e3);
		set.add(e1);
		set.add(e5);
		set.add(e2);
		set.add(e4);
		
		for (Object o : set) {
            System.out.println(o);
        }
	}

}
