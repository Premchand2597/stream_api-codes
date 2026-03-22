package com.program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
	private String name;
	private List<String> phone;
	private List<String> nickNames;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Student() {
		super();
	}
	public Student(String name, List<String> phone, List<String> nickNames) {
		super();
		this.name = name;
		this.phone = phone;
		this.nickNames = nickNames;
	}
	public List<String> getNickNames() {
		return nickNames;
	}
	public void setNickNames(List<String> nickNames) {
		this.nickNames = nickNames;
	}
	public Student(String name, List<String> phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + "]";
	}
}

public class SimpleDemo {
	

	public static void main(String[] args) {
		List<String> str = List.of("aadded","gdfdcsd","sdsdds","mmmksds");
		
//		Map<String, Long> collect = str.stream().collect(Collectors.groupingBy(e->e, Collectors.counting()));
//		System.out.println(collect);
//		
//		String s = "aadded";
//		Map<String, Long> collect2 = Arrays.stream(s.split("")).collect(Collectors.groupingBy(e->e, Collectors.counting()));
//		System.out.println(collect2);
//		
//		Map<String, Long> collect3 = new HashMap<>();
//		for(int i=0; i<str.size(); i++) {
//			String catchString = str.get(i);
//			Map<String, Long> collect4 = Arrays.stream(catchString.split("")).collect(Collectors.groupingBy(e->e, Collectors.counting()));
//			collect3.putAll(collect4);
//		}
//		System.out.println(collect3);
		
		
		// or
		
		Map<String, Long> collect4 = str.stream().flatMap(e->Arrays.stream(e.split(""))).collect(Collectors.groupingBy(e->e, Collectors.counting()));
		System.out.println(collect4);
		
	}
}
