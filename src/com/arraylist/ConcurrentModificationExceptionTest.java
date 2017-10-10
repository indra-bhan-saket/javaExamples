package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ConcurrentModificationExceptionTest {

	public static void main(String[] args) {
		Employee ee1 = new Employee("a", 5);
		Employee ee2 = new Employee("b", 6);
		Employee ee3 = new Employee("c", 8);
		Employee ee4 = new Employee("d", 3);
		List<Employee> list = new ArrayList<>();
		list.add(ee1);
		list.add(ee2);
		list.add(ee3);
		list.add(ee4);
		
		for(Employee e : list) {
			if(e.getId() > 5) {
				//it will through concurrent modification exception
				//list.remove(e);
			}
		}
		System.out.println("BEFORE: " + list);
		Iterator<Employee> it = list.iterator();
		while(it.hasNext()) {
			if(it.next().getId() > 5) {
				//use iterator remove method to remove data from the list to avoid concurrent modification exception
				it.remove();
			}
		}
		System.out.println("AFTER: " + list);

	}

}

class Employee {
	String name;
	int id;
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
}
