package com.cg.demo.strm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.cg.demo.col.Employee;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "priya", 10000));
		empList.add(new Employee(102, "kriya", 20000));
		empList.add(new Employee(103, "jriya", 30000));
		empList.add(new Employee(104, "Ariya", 40000));
		empList.add(new Employee(105, "Oriya", 90000));
		
		System.out.println(empList);
//		Iterator using iterate
		System.out.println("\nIterate using iterator");
		Iterator<Employee> empIt = empList.iterator();
		while(empIt.hasNext())
			System.out.println(empIt.next().toString());
		
//		Using forEach with anonymous inner class
		empList.forEach(new Consumer<Employee>() {
			public void accept(Employee emp) {
				System.out.println(emp.toString());
			}
		});
		
//		Using forEach with lambda expression
		empList.forEach(emp -> System.out.println(emp.toString()));
		
//		convert list to stream
		Stream<Employee> empStream = empList.stream();
		System.out.println("\nUsing filter() to get specified data");
		
		Stream<Employee> empWithMoreSal = empList.stream().filter(emp -> emp.salary > 40000);
		empWithMoreSal.forEach(emp -> System.out.println(emp.toString()));
		
//				Using limit() to get limited data
		Stream<Employee> firstThreeEmp = empList.stream().limit(3);
		firstThreeEmp.forEach(emp -> System.out.println(emp.toString()));
		
//		using skip()
		Stream<Employee> skipFirstThreeMap = empList.stream().skip(2L);
		skipFirstThreeMap.forEach(emp -> System.out.println(emp.toString()));
		
//		using map() to increase salary
		List<Double> salaryHike = empList.stream().map(emp -> emp.salary += 100).collect((Collectors.toList()));
		salaryHike.forEach(emp -> System.out.println(emp.toString()));
		
//		using IntStream to work with int values
		IntStream myInts = IntStream.of(10,20,30);
		myInts.forEach(System.out::println);
		
		IntStream myInts2 = IntStream.rangeClosed(6, 10);
		myInts2.forEach(System.out::println);
		
		
		
	}
}
