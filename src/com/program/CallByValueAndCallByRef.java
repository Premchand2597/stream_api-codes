package com.program;

class Person {
	String name;

	Person(String name) {
		this.name = name;
	}
}
public class CallByValueAndCallByRef {
	static void add(Integer i, Integer j) {
		i = i + j;
	}
	public static void main(String[] args) {

		Integer i = 10, j = 20;
		add(i, j);
		System.out.println("""
				Here i value will be 10 only bcz we are just passing the values to add(). whatever changes done inside the add() will not reflect to actual value
				this is called pass by value and the i value will be = """ + i+"\n");

		Person p1 = new Person("Premchand");
		changeName(p1);
		System.out.println("""
			Here Person.name value will not be changed bcz in changeName() includes new keyword and this value will be created in different memory address
			so it won't affect the p1 reference value  = """+p1.name);
	}
	static void changeName(Person p) {
		p = new Person("Punith");
	}
}