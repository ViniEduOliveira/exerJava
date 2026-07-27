import entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter file full path: " );
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Funcionario> list = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {
                String [] fields = line.split(",");
                list.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2].trim())));

                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            List<String> emails = list.stream()
                    .filter(x -> x.getSalary() > salary)
                    .map(Funcionario::getEmail)
                    .sorted()
                    .toList();

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
            emails.forEach(System.out::println);

            double sum = list.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(Funcionario::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sum));

        } catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        }
        sc.close();
    }
}