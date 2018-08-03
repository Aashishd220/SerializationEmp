//For serialization Employee class is made with some attributes
package com.assignment.serializationemp;

import java.io.Serializable;

public class Employee implements Serializable {
	private int id;
	private String name;
	private long salary;

	/**
	 * @param id
	 * @param name
	 * @param salary
	 */
	public Employee(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
