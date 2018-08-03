//Class to write in a file 
package com.assignment.serializationtest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.assignment.serializationemp.Employee;

public class TestWrite {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1, "Aashish", 10000000);//instantiating class
		Employee employee2 = new Employee(2, "Rohit", 1000000);
		Employee employee3 = new Employee(3, "Himanshu", 100000);

		try (FileOutputStream fos = new FileOutputStream("emp.txt");//writing data to file 
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {//enable the streams to do replacement of objects in stream
			oos.writeObject(employee1);
			oos.writeObject(employee2);
			oos.writeObject(employee3);

			System.out.println("Serialization done");
		} catch (FileNotFoundException e) {//catching exceptions

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
