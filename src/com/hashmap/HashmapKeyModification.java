package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashmapKeyModification {

	public static void main(String[] args) {
		Map<Emp, String> map = new HashMap<>();
		Emp e1 = new Emp(1, "ABC");
		Emp e2 = new Emp(1, "XYZ");
		
		map.put(e1, e1.getName());
		map.put(e2, e2.getName());
		
		//e2.setName("ABC");
		//e2 = null;
		System.out.println(map);
		System.out.println(map.get(e2));

	}

}

class Emp {
	
	private int id;
	private String name;
	
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
