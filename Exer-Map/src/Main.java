import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new TreeMap<>();

        System.out.println("Enter file full path: " );
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {


            String line = br.readLine();

            while (line != null) {
                String [] fields = line.split(",");
                String name = fields[0];
                int votos = Integer.parseInt(fields[1].trim());

                map.put(name, map.getOrDefault(name, 0) + votos);

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        }

        for (String name : map.keySet()) {
            System.out.println(name + ": " + map.get(name));
        }

        sc.close();
    }
}