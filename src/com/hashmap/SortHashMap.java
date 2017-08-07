package com.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMap {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Emp1", 10000);
		Employee e2 = new Employee(3, "Emp3", 2000);
		Employee e3 = new Employee(5, "Emp5", 5000);
		Employee e4 = new Employee(7, "Emp7", 7000);
		Employee e5 = new Employee(10, "Emp10", 4000);
		
		Map<Integer, Employee> map = new HashMap<>();
		map.put(e1.getId(), e1);
		map.put(e2.getId(), e2);
		map.put(e3.getId(), e3);
		map.put(e4.getId(), e4);
		map.put(e5.getId(), e5);
		
		System.out.println("BEFORE: " + map);
		
		Set<Entry<Integer, Employee>> entrySet = map.entrySet();
		
		List<Entry<Integer, Employee>> list = new ArrayList<>(entrySet);
		
		Collections.sort(list, new Comparator<Map.Entry<Integer, Employee>>() {
            public int compare(Map.Entry<Integer, Employee> o1,
                               Map.Entry<Integer, Employee> o2) {
                return o1.getValue().getSalary().compareTo(o2.getValue().getSalary());
            }
        });
		
		Map<Integer, Employee> sortedMap = new LinkedHashMap<Integer, Employee>();
        for (Map.Entry<Integer, Employee> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        
        System.out.println("AFTER: " + sortedMap);

	}

}

class Employee implements Comparable<Integer>{ 
	private Integer id;
	private String name;
	private Integer salary;
	
	public Employee(Integer id, String name, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
