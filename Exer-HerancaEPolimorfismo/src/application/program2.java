package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class program2 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int N = sc.nextInt();
		sc.nextLine();
		
		for( int i = 1; i <= N; i++) {
			System.out.println();
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			String option = sc.nextLine();
			
			if(option.equals("c")) {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				sc.nextLine();
	
				
				list.add(new Product(name, price));
			}
			
			if(option.equals("u")) {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				sc.nextLine();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate data = LocalDate.parse(sc.nextLine(), fmt);
				
				list.add(new UsedProduct(name, price, data));
			}
			
			if(option.equals("i")) {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("Customs Fee: ");
				Double customsFee = sc.nextDouble();
				sc.nextLine();
				
				list.add(new ImportedProduct(name, price, customsFee));
			}	
		}
		
		System.out.println();
		System.out.println("Price Tags:");
		for (Product prod : list) {
		    System.out.println(prod.priceTag());
		    System.out.println();
		}

		sc.close();
	}
}
