package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program3 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();

		System.out.println("Lista:");
		list.add("Vinicius");
		list.add("Giulia");
		list.add("Alex");
		list.add("Deise");
		list.add("Isabelly");
		list.add("Zé");
		list.add("Vitor");
		
		System.out.println("A lista contém: " + list.size() + " pessoas");
		 
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println("-------------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'Z');
		
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println("-------------------------------");
		
		System.out.println("Position - Giulia: " + list.indexOf("Giulia"));
		
		System.out.println("-------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'V').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'V').findFirst().orElse(null);
		System.out.println(name);
	}

}
