import entities.LogRecord;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<LogRecord> list = new ArrayList<>();

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(" ", 4);
                String dateHours = fields[0] + " " + fields[1];
                Date dateHoursFormat = sdf.parse(dateHours);
                String type = fields[2];
                String description = fields[3];

                list.add(new LogRecord(dateHoursFormat, type, description));

                line = br.readLine();
            }

            System.out.println("Line with error");

            List<String> descri = list.stream()
                    .filter(x -> x.getType().equals("ERROR"))
                    .map(LogRecord::getDescription)
                    .sorted()
                    .toList();

            descri.forEach(System.out::println);

            System.out.print("Total error(s): " + descri.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}