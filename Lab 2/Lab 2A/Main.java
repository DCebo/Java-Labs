//Class: CSE 1322L
//Section: Section 03
//Term: Fall 2019
//Instructor: Kevin Markley
//Name: David Ceballos
//Lab #: Lab 2A

import java.util.Scanner;
import java.util.Random;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {

		Date date= new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int year = cal.get(Calendar.YEAR);
		
		Person p0 = new Person("John", "111 Street", "person@gmail.com", 678555123);
		Student s0 = new Student("Mary", "222 Street", "student@gmail.com", 678555123, "Freshman");
		Employee e0 = new Employee("Michael", "333 Street", "employee@gmail.com", 678555123, "J235", 5000, "01/05/2015");
		Faculty f0 = new Faculty("Michael", "444 Street", "faculty@gmail.com", 678555123, "A123", 120000, "04/15/2011", "Monday and Wednesday: 11am-2pm", "Dept. Chair");
		Staff st0 = new Staff("Michael", "555 Street", "staff@gmail.com", 678555123, "Z123", 40000, "04/15/2010", "Janitor");
		
		Person[] pArray = new Person[10]; // array of objects, question, how to have x amount in array
		
		pArray[0] = p0;
		pArray[1] = s0;
		pArray[2] = e0;
		pArray[3] = f0;
		pArray[4] = st0;
		
		MyDate currentDay = new MyDate(month, day, year);
		System.out.println("Person: " + pArray[0]);
		System.out.println("Student: " + pArray[1]);
		System.out.println("Employee: " + pArray[2]);
		System.out.println("Faculty Member: " + pArray[3]);
		System.out.println("Staff: " + pArray[4]);		

	}

}
