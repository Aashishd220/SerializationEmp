//class to read from a file
package com.assignment.serializationtest;

import java.io.*;

import com.assignment.serializationemp.Employee;

public class TestRead {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Employee employee1, employee2, employee3; //reference of employee class
		
		try (FileInputStream fis = new FileInputStream("emp.txt");//reading data from file
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			employee1 = (Employee) ois.readObject(); //reading objects from file and cast them into employee type
			employee2 = (Employee) ois.readObject();
			employee3 = (Employee) ois.readObject();
			
			System.out.println(employee1);//printing employee details
			System.out.println(employee2);
			System.out.println(employee3);

		} catch (FileNotFoundException e) {//catching the exception
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
