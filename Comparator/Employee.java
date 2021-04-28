package com.collection.Comparable;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
    String Address;
   
    public Employee(int id, String name, String address) {
		this.id = id;
		this.name = name;
		Address = address;
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
	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}


	@Override
	public String toString() {
		return "Employee [Emp ID=" + getId() + ", Name=" + getName() + ", Address=" + getAddress() + "]";
	}

	@Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());

    }
}

