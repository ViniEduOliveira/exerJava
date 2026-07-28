import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();
            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",", 4);
                list.add(new Product(Integer.parseInt(fields[0].trim()), fields[1], fields[2], Double.parseDouble(fields[3].trim())));

                line = br.readLine();
            }

            List<String> eletronic = list.stream()
                    .filter(x -> x.getType().equals("Eletronicos"))
                    .sorted()
                    .map(x -> x.getIndex() + ". " + x.getName() + " R$:" + String.format("%.2f", x.getPrice()))
                    .toList();

            eletronic.forEach(System.out::println);


        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();

    }
}