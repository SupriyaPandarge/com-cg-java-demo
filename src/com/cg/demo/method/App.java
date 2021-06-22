package com.cg.demo.method;

public class App {

	 public static void main(String[] args) {

		 int num = 10;

		 Employee obj = new Employee();
		 obj.id = 101;
         obj.name = "Abc";
         obj.salary = 10.5;
         System.out.println(obj.toString());
         
         Employee obj1 = new Employee();
         obj1.id = 102;
         obj1.name = "Def";
         obj1.salary = 12.5;
         System.out.println(obj1.toString());
         
         Employee obj2 = new Employee();
         obj2.id = 103;
         obj2.name = "Xyz";
         obj2.salary = 16.2;
         System.out.println(obj2.toString());
         
         Employee obj3 = new Employee(104, "Lmn", 25.5);
         System.out.println(obj3.toString());
         
         Employee obj4 = new Employee(105, "Pqr");
         System.out.println(obj4.toString());




 

    }

 

}
