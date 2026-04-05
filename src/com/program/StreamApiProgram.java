package com.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
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
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public Employee(String name, double salary, String dept) {
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

public class StreamApiProgram{
	public static void main(String[] args) {
		
		int arr[] = {23, 23, 45, 34, 12, 12, 56, 67, 74};
		
		int maxx = Arrays.stream(arr).max().orElse(0);
//		System.out.println(maxx);
		
		int min = Arrays.stream(arr).min().orElse(0);
//		System.out.println(min);
		
		int sum = Arrays.stream(arr).sum();
//		System.out.println(sum);
		
		Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		
		List<Integer> obj = new ArrayList<Integer>();
		for(int data : arr) {
			obj.add(data);
		}
		
		List<Integer> sssssssssss = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).toList();
//		System.out.println(sssssssssss);
		
		String sss = "HappynewYear";
		String dist = Arrays.stream(sss.split("")).distinct().collect(Collectors.joining());
//		System.out.println(dist);
		
		Set<String> alreadyAddedChars = new HashSet<>();
		Set<String> onlyDuplicateValues = Arrays.stream(sss.split("")).filter(e -> !alreadyAddedChars.add(e)).collect(Collectors.toSet());	
//		System.out.println(onlyDuplicateValues.stream().collect(Collectors.joining()));
		
		Set<String> removeDup = new LinkedHashSet<>();
		for(int i=0; i<sss.length(); i++) {
			removeDup.add(String.valueOf(sss.charAt(i)));
		}
		
//		System.out.println(removeDup.stream().collect(Collectors.joining()));
		
		Map<Integer, Integer> squareNumbersss = Arrays.stream(arr).boxed().distinct().sorted().collect(Collectors.toMap(e->e, e->e*e));
//		System.out.println(squareNumbersss);
		
		// *** boxed() is used to convert primitive datatype to wrapper class, it supports only int -> Integer, long -> Long, double -> Double
		List<Integer> arrayToList = Arrays.stream(arr).boxed().toList();
		
		Integer fourthLargetNumber = arrayToList.stream().distinct().sorted(Comparator.reverseOrder()).skip(3).findFirst().orElseThrow();
//		System.out.println(fourthLargetNumber);
		
		Integer firstLargestNo = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).findFirst().orElse(0);
//		System.out.println(firstLargestNo);
		
		int max = obj.stream().reduce(Integer.MIN_VALUE, Integer::max);
//		System.out.println(max);
		
//		System.out.println(obj);
		
		Integer datadd1 = obj.stream().filter(e->e%2==0).reduce(0, Integer::sum);
//		System.out.println(datadd1);
		
		List<Integer> datadd2 = obj.stream().filter(e->e%2==0).sorted().distinct().toList();
//		System.out.println(datadd2);
		
//		List<Integer> datadd3 = Arrays.stream(arr).filter(e->e%2!=0).sorted().distinct().collect(Collectors.toList());
//		System.out.println(datadd3);
		
		Set<Integer> hs = new HashSet<Integer>();
		obj.stream().map(e->hs.add(e)).collect(Collectors.toSet());
//		System.out.println(hs);
		
		Set<Integer> existing = new HashSet<Integer>();
		Set<Integer> datadd4 = obj.stream().filter(e->!existing.add(e)).collect(Collectors.toSet());
//		System.out.println(datadd4);
		
//		obj.stream().findFirst().ifPresent(System.out::print);
		
//		Arrays.stream(arr).distinct().min().ifPresent(System.out::println);
		
//	-----------------------------------------------------------------------------------------------------------	
		
		
		
		List<Employee> datas = Arrays.asList(
				new Employee("prem", 10000.00),
				new Employee("Gowtham", 67000.00),
				new Employee("chand", 10000.00),
				new Employee("Arun", 50000.00),
				new Employee("Saniya", 70000.00)
			);

	List<Employee> datas2 = Arrays.asList(
			new Employee("Premchand", 20000, "IT"),
			new Employee("ArunKumar", 35000, "Design"),
			new Employee("Gowtham", 45000, "Design"),
			new Employee("Harshith", 30000, "IT"),
			new Employee("PavanLingraj", 60000, "Hardware"),
			new Employee("Saniya", 55000, "IT"),
			new Employee("Puneeth", 80000, "Firmware"),
			new Employee("Hari", 70000, "Hardware"),
			new Employee("Sabari", 75000, "Firmware")
		);
	
	List<String> names = datas.stream().map(e->e.getName().toUpperCase()).collect(Collectors.toList());
//	System.out.println(names);
	
//	datas.stream().filter(e->e.getSalary()>60000).map(e->e.getName().toUpperCase()).forEach(System.out::println);
	
	List<String> collect = datas.stream().filter(e->e.getSalary() > 60000).map(e->e.getName().toUpperCase()+ ", " +e.getSalary()).collect(Collectors.toList());
//	System.out.println(collect);
	
	Map<String, Double> collect2 = datas.stream().filter(e->e.getSalary() > 50000).collect(Collectors.toMap(e->e.getName(), e->e.getSalary()));
//	System.out.println(collect2);
	
//	datas.stream().map(e->e.getName().toUpperCase()).toList().forEach(System.out::println);
	
	Map<String, Double> dataa1 = datas.stream().filter(e->e.getSalary()>20000).collect(Collectors.toMap(e->e.getName().toUpperCase(), e->e.getSalary()));
//	System.out.println(dataa1);
//
	Set<Employee> dataa2 = datas.stream().collect(Collectors.toSet());
//	System.out.println(dataa2);
	
	Set<Double> dataa3 = datas.stream().map(e->e.getSalary()).sorted().collect(Collectors.toSet());
//	System.out.println(dataa3);
//	
	List<Double> dataa4 = datas.stream().map(e->e.getSalary()).distinct().sorted((a, b)->b.compareTo(a)).collect(Collectors.toList());
//	System.out.println(dataa4);
	
	Map<String, List<Employee>> data1 = datas2.stream().collect(Collectors.groupingBy(e->e.getDept()));
//	System.out.println(data1);
	
//	data1.forEach((dept, list) -> {
//	    System.out.println("Department: " + dept);
//	    System.out.println(list);
//	});
	
	
	Map<String, List<Double>> data2 = datas2.stream().collect(Collectors.groupingBy(e->e.getDept(), Collectors.mapping(e->e.getSalary(), Collectors.toList())));
//	System.out.println(data2);
	
	Map<String, Double> data3 = datas2.stream().collect(Collectors.groupingBy(e->e.getDept(), Collectors.reducing(0.0, e->e.getSalary(), Double::max)));
//	System.out.println(data3);
	Map<String, Double> collect5 = datas2.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.reducing(0.0, Employee::getSalary, Double::max)));
//	System.out.println(collect5);
	
	
	Map<String, Double> data4 = datas2.stream().collect(Collectors.groupingBy(e->e.getDept(), Collectors.reducing(0.0, e->e.getSalary(), Double::sum)));
//	System.out.println(data4);
	
	Map<String, Integer> data5 = datas2.stream().collect(Collectors.groupingBy(e->e.getDept(), Collectors.reducing(0, e->1, Integer::sum)));
//	System.out.println(data5);
	
	//or
	
	Map<String, Long> data6 = datas2.stream().collect(Collectors.groupingBy(e->e.getDept(), Collectors.counting()));
//	System.out.println(data6);
	
	Double data7 = datas2.stream().map(e->e.getSalary()).reduce(1.0, (a, b) -> a * b);
//	System.out.println(data7);
	
	Double data8 = datas2.stream().map(e->e.getSalary()).reduce(0.0, (a, b) -> a + b);
//	System.out.println(data8);
	
	Double data9 = datas2.stream().map(e->e.getSalary()).reduce(0.0, (a, b) -> a - b);
//	System.out.println(data9);
	
	Double data10 = datas2.stream().map(e->e.getSalary()).reduce(1.0, (a, b) -> a / b);
//	System.out.println(data10);
	
	Double data11 = datas2.stream().map(e->e.getSalary()).reduce(Double.MAX_VALUE, Double::min);
//	System.out.println(data11);
	
	//or
	
	Double data12 = datas2.stream().map(e->e.getSalary()).reduce(Double.MAX_VALUE, (a, b) -> a < b ? a : b);
//	System.out.println(data12);
	
	Double data13 = datas2.stream().map(e->e.getSalary()).reduce(Double.MIN_VALUE, Double::max);
//	System.out.println(data13);
	
	//or
	
	Double data14 = datas2.stream().map(e->e.getSalary()).reduce(Double.MIN_VALUE, (a, b) -> a > b ? a : b);
//	System.out.println(data14);
	
	//Count characters in a string using group by names
	Map<Object, Integer> data15 = datas2.stream().collect(Collectors.groupingBy(e->e.getName(), Collectors.reducing(0, e->e.getName().length(), Integer::sum)));
//	System.out.println(data15);
	
	//or
	
	Map<String, Integer> data16 = datas2.stream().collect(Collectors.toMap(e->e.getName().toUpperCase(), e->e.getName().length()));
//	System.out.println(data16);
	
	List<Object> heterogeneousData = new ArrayList<>();
	heterogeneousData.add("Prem");
	heterogeneousData.add(100);
	heterogeneousData.add(3.4f);
	heterogeneousData.add(new Employee("Chand", 20000));
//	System.out.println(heterogeneousData);
	
	String arr2[] = {"Prem", "prem", "hola", "india", "india", "Dhoni"};
	List<String> data17 = Arrays.stream(arr2).map(e->e.toLowerCase()).sorted().distinct().toList();
//	System.out.println(data17);
	
	String duplicatedValue = "madam";
	StringBuffer removedDuplicates = new StringBuffer();
	duplicatedValue.chars().distinct().forEach(c->removedDuplicates.append((char)c));
//	System.out.println(removedDuplicates.reverse());
	
	Map<String, Long> frequencyOfChar = Arrays.stream(duplicatedValue.split("")).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
//	System.out.println(frequencyOfChar);
	
	long data18 = duplicatedValue.length();
//	System.out.println(data18);
	
	Integer data19 = Arrays.stream(arr).reduce(Integer.MIN_VALUE, Integer::max);
//	System.out.println(data19);
	
	List<String> str = List.of("Premmmmmmmmmmmmmmmmmmmmmm", "prem", "India", "Karnatakaaa", "Premchand");
	Map<String, Integer> collect3 = str.stream().map(String::toLowerCase).distinct().collect(Collectors.groupingBy(String::toUpperCase, 
			Collectors.reducing(0, e->e.length(), Integer::sum)));
//	System.out.println(collect3);
	
	Map<String, Integer> collect4 = str.stream().map(String::toLowerCase).distinct().collect(Collectors.toMap(e->e, e->e.length()));
//	System.out.println(collect4);
	
	Map<String, Integer> collect6 = str.stream().collect(Collectors.groupingBy(e->e, Collectors.reducing(0, e->e.length(), Integer::sum)));
//	System.out.println(collect6);
	
	List<Integer> intData = List.of(2,4,5);
	Map<Integer, Integer> collect7 = intData.stream().collect(Collectors.groupingBy(e->e, Collectors.reducing(0, e->e*e, Integer::sum)));
//	System.out.println(collect7);
	
	//or
	
	Map<Integer, Integer> collect10 = intData.stream().collect(Collectors.toMap(e->e, e->e*e));
//	System.out.println(collect10);
	
	Map<Integer, Integer> collect8 = intData.stream().collect(Collectors.toMap(e->e, e->e*e));
//	System.out.println(collect8);
	
	Map<String, Integer> collect9 = str.stream().collect(Collectors.toMap(e->e, e->e.length()));
//	System.out.println(collect9);
	
	String longestString = str.stream().reduce("", (a,b)-> a.length() > b.length() ? a : b);
//	System.out.println(longestString);
	
	Map<Integer, Integer> squareNumbers =  Arrays.stream(arr).boxed().distinct().collect(Collectors.toMap(e->e, e->e*e));
//	System.out.println(squareNumbers);
	
	Map<String, Integer> collect11 = Arrays.stream(arr2).map(String::toLowerCase).distinct().collect(Collectors.toMap(e->e, e->e.length()));
//	System.out.println(collect11);
	
	String longestString2 = str.stream().reduce((a, b) -> a.length() > b.length() ? a : b).orElseThrow(() -> new RuntimeException("No data found!"));
//	System.out.println(longestString2);
	
	Long a = 1122223334445566333L;
	List<String> collect12 = Arrays.stream(a.toString().split("")).distinct().collect(Collectors.toList());
//	System.out.println(collect12);
	
	int maxInArray = Arrays.stream(arr).max().orElse(0);
//	System.out.println(maxInArray);
	
	String removedDuplicate1 = Arrays.stream(duplicatedValue.split("")).distinct().reduce("", (s1,s2) -> s1 + s2);
//	System.out.println(removedDuplicate1);
	
//	or
	
	String removedDuplicate2 = Arrays.stream(duplicatedValue.split("")).distinct().collect(Collectors.joining());
//	System.out.println(removedDuplicate2);
	
	Map<String, Double> datatat = datas2.stream().collect(Collectors.groupingBy(e->e.getDept(), Collectors.reducing(Double.MIN_VALUE, e->e.getSalary(), Double::max)));
//	System.out.println(datatat);
	
	List<String> datatata = Arrays.stream(duplicatedValue.split("")).distinct().toList();
//	System.out.println(datatata);
	
	Map<String, Long> collect13 = Arrays.stream(duplicatedValue.split("")).collect(Collectors.groupingBy(e->e, Collectors.counting()));
//	System.out.println(collect13);
	
	Map<String, Integer> collect14 = str.stream().collect(Collectors.groupingBy(e->e, Collectors.reducing(0, e->e.length(), Integer::sum)));
//	System.out.println(collect14);
	
	Map<String, Double> highestSalByDept = datas2.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.reducing(Double.MIN_VALUE, Employee::getSalary, Double::max)));
//	System.out.println(highestSalByDept);
	
	String longestStringgg = str.stream().reduce((x, y) -> y.length() > x.length() ? y : x).orElse("");
//	System.out.println(longestStringgg);
	
	String string = "abcdabceabcfabchab";
	String subStr = "abc";
	int count = 0;
	string = string.replaceAll(subStr, "z");
	
	for(int i = 0; i < string.length(); i++) {
		if(string.charAt(i) == 'z') {
			count++;
		}
	}
//	System.out.println(count);
	
	int[] someArray = {2,7,3,8,5,1,9};
	int targetSum = 10, counts = 0;
	
	for(int i=0; i<someArray.length; i++) {
		for(int j=i+1; j<someArray.length; j++) {
			if(someArray[i] + someArray[j] == targetSum) {
//				System.out.println(someArray[i] +" "+ someArray[j]);
				counts++;
			}
		}
	}
//	System.out.println(counts);
	
	
	int[] missingArr = {3,0,1,2,6,4};
	Arrays.sort(missingArr);
	
	for(int i = 0; i < missingArr.length; i++) {
		if(missingArr[i] != i) {
//			System.out.println(i);
		}
	}
	
	String repeatingChar = "Spring boot";
	StringBuilder nonRepeatingChar = new StringBuilder();
	for(int i = 0; i<repeatingChar.length(); i++) {
		char c1 = repeatingChar.charAt(i);
		char c2 = repeatingChar.charAt(i+1);
		if(c1 != c2) {
			nonRepeatingChar.append(c1);
		}else {
			break;
		}
	}
//	System.out.println(nonRepeatingChar);
	
	for(int i = 0; i<repeatingChar.length(); i++) {
		char c1 = repeatingChar.charAt(i);
		char c2 = repeatingChar.charAt(i+1);
		
		if(c1 == c2) {
//			System.out.println(repeatingChar.charAt(i-1));
			break;
		}
	}
	
	
	List<String> simpleGetData = new ArrayList<>();
	String[] adc = {"Hello world", "Prem chand", "Hi baby"};
	for(String i : adc) {
		String collect15 = Arrays.stream(i.split(" ")).collect(Collectors.joining(","));
		simpleGetData.add(collect15);
	}
//	System.out.println(simpleGetData);
	
	// or
	
	List<String> collect15 = Arrays.stream(adc).flatMap(strrr->Arrays.stream(strrr.split(" "))).collect(Collectors.toList());
//	System.out.println(collect15);
	
	Stream<String> stream = Arrays.stream(adc);
	System.out.println(stream.flatMap(e->Arrays.stream(e.split(" "))).toList());
	
	
	List<Student> studentObj = List.of(
				new Student("Prem", List.of("1234567890", "0987654321")),
				new Student("Guru", List.of("9898775676", "6758787788", "578575878")),
				new Student("Raj", List.of("787587788", "5435435365"))
				);
	
	List<Student> studentObjWithNickNames = List.of(
			new Student("Prem", List.of("1234567890", "0987654321"), List.of("Chand", "Handyy")),
			new Student("Guru", List.of("9898775676", "6758787788", "578575878"), List.of("Gu", "Dan")),
			new Student("Raj", List.of("787587788", "5435435365"), List.of("Har", "mann"))
			);
	
	List<Integer> list3 = studentObjWithNickNames.stream().map(Student::getNickNames).flatMap(e->e.stream()).map(e->e.length()).toList();
	System.out.println(list3);
	
	Map<String, List<String>> collect16 = studentObj.stream().collect(Collectors.groupingBy(Student::getName, Collectors.flatMapping(e->e.getPhone().stream(), 
																																		Collectors.toList())));
//	System.out.println(collect16);
	
	List<Integer> list = studentObjWithNickNames.stream().flatMap(e->e.getNickNames().stream()).toList().stream().map(e->e.length()).toList();
//	System.out.println(list);
	
	Map<String, Integer> collect17 = studentObjWithNickNames.stream().flatMap(e->e.getNickNames().stream()).collect(Collectors.toMap(e->e, e->e.length()));
	Map<String, Integer> collect18 = studentObjWithNickNames.stream().flatMap(e->e.getNickNames().stream()).toList().stream().collect(Collectors.toMap(e->e, e->e.length()));
//	System.out.println(collect18);
	
	List<String> list2 = studentObjWithNickNames.stream().flatMap(e->e.getNickNames().stream()).map(e->e.toUpperCase()).toList();
//	System.out.println(list2);
	
	String gg = "Hello world";
	String subGG = "world";
	gg = gg.replace(subGG, "K");
	boolean isPre = false;
	for(int i=0; i<gg.length(); i++) {
		if(gg.charAt(i) == 'K') {
			isPre = true;
		}
	}
//	System.out.println(isPre);
	
	
	}
}
