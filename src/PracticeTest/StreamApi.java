package PracticeTest;

import java.util.stream.Collectors;
import java.util.*;

public class StreamApi {

	public static void main(String[] args) {
		
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
		//System.out.println(names);
		
		datas.stream().filter(e->e.getSalary()>60000).map(e->e.getName().toUpperCase()).forEach(System.out::println);
		List<String> collect = datas.stream().filter(e->e.getSalary() > 60000).map(e->e.getName().toUpperCase()+ ", " +e.getSalary()).collect(Collectors.toList());
		//System.out.println(collect);
		
		Map<String, Double> collect2 = datas.stream().filter(e->e.getSalary() > 50000).collect(Collectors.toMap(e->e.getName(), e->e.getSalary()));
		//System.out.println(collect2);
		
		
		
		
		
		//datas.stream().map(e->e.getName().toUpperCase()).toList().forEach(System.out::println);
		Map<String, Double> dataa1 = datas.stream().filter(e->e.getSalary()>20000).collect(Collectors.toMap(e->e.getName().toUpperCase(), e->e.getSalary()));
//		System.out.println(dataa1);
//	
		Set<Employee> dataa2 = datas.stream().collect(Collectors.toSet());
//		System.out.println(dataa2);
//		
		Set<Double> dataa3 = datas.stream().map(e->e.getSalary()).sorted().collect(Collectors.toSet());
//		System.out.println(dataa3);
//		
		List<Double> dataa4 = datas.stream().map(e->e.getSalary()).distinct().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
//		System.out.println(dataa4);
		
		Map<String, List<Employee>> data1 = datas2.stream().collect(Collectors.groupingBy(e->e.getDept()));
		//System.out.println(data1);
		
//		data1.forEach((dept, list) -> {
//		    System.out.println("Department: " + dept);
//		    System.out.println(list);
//		});
		
		
		Map<String, List<Double>> data2 = datas2.stream().collect(Collectors.groupingBy(e->e.getDept(), Collectors.mapping(e->e.getSalary(), Collectors.toList())));
//		System.out.println(data2);
		
		Map<String, Double> data3 = datas2.stream().collect(Collectors.groupingBy(e->e.getDept(), Collectors.reducing(0.0, e->e.getSalary(), Double::max)));
//		System.out.println(data3);
		
		Map<String, Double> data4 = datas2.stream().collect(Collectors.groupingBy(e->e.getDept(), Collectors.reducing(0.0, e->e.getSalary(), Double::sum)));
//		System.out.println(data4);
		
		Map<String, Integer> data5 = datas2.stream().collect(Collectors.groupingBy(e->e.getDept(), Collectors.reducing(0, e->1, Integer::sum)));
//		System.out.println(data5);
		
		//or
		
		Map<String, Long> data6 = datas2.stream().collect(Collectors.groupingBy(e->e.getDept(), Collectors.counting()));
//		System.out.println(data6);
		
		Double data7 = datas2.stream().map(e->e.getSalary()).reduce(1.0, (a, b) -> a * b);
//		System.out.println(data7);
		
		Double data8 = datas2.stream().map(e->e.getSalary()).reduce(0.0, (a, b) -> a + b);
//		System.out.println(data8);
		
		Double data9 = datas2.stream().map(e->e.getSalary()).reduce(0.0, (a, b) -> a - b);
//		System.out.println(data9);
		
		Double data10 = datas2.stream().map(e->e.getSalary()).reduce(1.0, (a, b) -> a / b);
//		System.out.println(data10);
		
		Double data11 = datas2.stream().map(e->e.getSalary()).reduce(Double.MAX_VALUE, Double::min);
//		System.out.println(data11);
		
		//or
		
		Double data12 = datas2.stream().map(e->e.getSalary()).reduce(Double.MAX_VALUE, (a, b) -> a < b ? a : b);
//		System.out.println(data12);
		
		Double data13 = datas2.stream().map(e->e.getSalary()).reduce(Double.MIN_VALUE, Double::max);
//		System.out.println(data13);
		
		//or
		
		Double data14 = datas2.stream().map(e->e.getSalary()).reduce(Double.MIN_VALUE, (a, b) -> a > b ? a : b);
//		System.out.println(data14);
		
		//Count characters in a string using group by names
		Map<Object, Integer> data15 = datas2.stream().collect(Collectors.groupingBy(e->e.getName(), Collectors.reducing(0, e->e.getName().length(), Integer::sum)));
//		System.out.println(data15);
		
		//or
		
		Map<String, Integer> data16 = datas2.stream().collect(Collectors.toMap(e->e.getName().toUpperCase(), e->e.getName().length()));
		System.out.println(data16);
	}
	
}


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