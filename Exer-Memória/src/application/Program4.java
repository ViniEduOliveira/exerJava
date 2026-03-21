package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class Program4 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		
		System.out.print("How many employees will be registered ?:");
		int n = sc.nextInt();
		sc.nextLine();
		
	
		for (int i = 0; i < n; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i + 1));
			System.out.print("ID: ");
			int id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.print("Id already taken! try again: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			list.add(emp);	
		}
		
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("This id does not exist");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		
		System.out.println("List of eployees:");
		for (Employee endList : list) {
			System.out.println(endList);
		}
	
		sc.close();
	}	
	
	public static boolean hasId (List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
