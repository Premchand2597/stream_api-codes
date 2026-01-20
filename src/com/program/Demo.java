package com.program;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Employees{
	private String name;
	private double salary;
	private String dept;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employees(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public Employees(String name, double salary, String dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
}

public class Demo {
	
	private static Demo demo;
	
	private Demo() {};
	
	public static Demo getDemoObj() {
		if(demo == null) {
			synchronized (Demo.class) {
				if(demo == null) {
					demo = new Demo();
				}
			}
		}
		return demo;
	}
	
	public static void main(String[] args) {
		
		List<Employees> listEmps = List.of(
				new Employees("Premchand", 25323, "Software"),
				new Employees("premchand", 29323, "Software"),
				new Employees("Arun Kumar", 35230, "Firmware"),
				new Employees("Saniya", 42523, "Software"),
				new Employees("Puneeth", 25230, "Firmware"),
				new Employees("Varun", 65143, "Testing"),
				new Employees("Jagadeeshan", 70765, "Testing"),
				new Employees("Manikandan", 54367, "Hardware"),
				new Employees("Vijayakumar", 150230, "IT"),
				new Employees("Rahul", 43265, "Design"),
				new Employees("Nilesh", 46543, "Design"),
				new Employees("Drupad", 58000, "CEO"),
				new Employees("Nithya", 65780, "Cloud Computing")
				);
		
		int arr[] = {23, 23, 45, 34, 12, 12, 56, 67, 74};
		
		// *** boxed() is used to convert primitive datatype to wrapper class, it supports only int -> Integer, long -> Long, double -> Double
		List<Integer> arrayToList = Arrays.stream(arr).boxed().toList();
		
		Integer fourthLargetNumber = arrayToList.stream().distinct().sorted(Comparator.reverseOrder()).skip(3).findFirst().orElseThrow();
//		System.out.println(fourthLargetNumber);
		
		Map<String, Double> highestSalBasedOnDept = listEmps.stream().collect(Collectors.groupingBy(Employees::getDept, 
																	Collectors.reducing(Double.MIN_VALUE, Employees::getSalary, Double::max)));
		
//		System.out.println(highestSalBasedOnDept);
		
		List<String> empNamesDescending = listEmps.stream().map(Employees::getName).sorted(Comparator.reverseOrder()).toList();
//		System.out.println(empNamesDescending);
		
		Map<String, Long> namesWithCount = listEmps.stream().collect(Collectors.groupingBy(e->e.getName().toLowerCase(), Collectors.counting()));
//		System.out.println(namesWithCount);
		
		String str = "Madam";
		
		Map<String, Long> collect = Arrays.stream(str.split("")).collect(Collectors.groupingBy(e->e.toLowerCase(), Collectors.counting()));
//		System.out.println(collect);
		
		StringBuffer sb = new StringBuffer();
		str.toLowerCase().chars().distinct().forEach((e)-> sb.append((char) e));
//		System.out.println(sb);
		
		Demo ob1 = Demo.getDemoObj();
//		System.out.println(ob1.hashCode());
		
		Demo ob2 = Demo.getDemoObj();
//		System.out.println(ob2.hashCode());
		
		Map<String, Long> c = listEmps.stream().collect(Collectors.groupingBy(e->e.getName().toLowerCase(), Collectors.counting()));
//		System.out.println(c);
		
		Map<String, Integer> d = listEmps.stream().collect(Collectors.toMap(Employees::getName, e->e.getName().length()));
//		System.out.println(d);
		
		Integer cr = str.length();
//		System.out.println(cr);
		
		long dc = str.chars().reduce(0, (a, b)->a + 1);
//		System.out.println(dc);
		
		String strArray[] = {"Prem", "prem", "hola", "India", "india"};
		
		Set<String> uniqueStr1 = Arrays.stream(strArray).map(e->e.toLowerCase()).distinct().collect(Collectors.toSet());
//		System.out.println(uniqueStr1);
		
		Set<String> uniqueStr2 = listEmps.stream().map(e->e.getName().toLowerCase()).distinct().collect(Collectors.toSet());
//		System.out.println(uniqueStr2);
		
		Map<String, List<Double>> deptWiseSalary = listEmps.stream().collect(Collectors.groupingBy(Employees::getDept, Collectors.mapping(e->e.getSalary(), 
																																		Collectors.toList())));
		
//		System.out.println(deptWiseSalary);
		
		long duplicateNumbers = 655655656544543546L;
		List<String> uniqueNumbers = Arrays.stream(String.valueOf(duplicateNumbers).split("")).distinct().toList();
//		System.out.println(uniqueNumbers);
		
		int maxValueInArray = Arrays.stream(arr).max().orElseThrow();
//		System.out.println(maxValueInArray);
		
		String s1 = "Silent";
		String s2 = "Listen";
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] st1 = s1.toCharArray();
		char[] st2 = s2.toCharArray();
		
		Arrays.sort(st1);
		Arrays.sort(st2);
		
		if(Arrays.equals(st1, st2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not anagram");
		}
		
		List<String> stringArray = List.of("prem", "chand", "Premchand");
		List<String> listStringBasedOnDescendingLength = stringArray.stream().sorted((a, b) -> b.length() - a.length()).toList();
		System.out.println(listStringBasedOnDescendingLength);
		
//		or
		
		List<String> listStringBasedOnDescendingLength2 = stringArray.stream().sorted((a, b) -> Integer.compare(b.length(), a.length())).toList();
		System.out.println(listStringBasedOnDescendingLength2);
		
		
	}
}
