import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
}

public class EX22_2 {
    private static final String CSV_FILE = "data.csv";
    private static final String CSV_SPLIT_BY = ",";

    public static void main(String[] args) {
        List<Person> personList = readDataFromCSV();

        // Print the personList
        // TODO: 구현
        for(int i=0; i<personList.size(); i++) {
        	System.out.println("Name: " + personList.get(i).getName()
        			+ ", Age: " + personList.get(i).getAge()
        			+ ", City: " + personList.get(i).getCity());
        }
        // Add a new student
        addNewStudentToCSV();

        // Read the updated data from CSV
        personList = readDataFromCSV();

        // Print the personList
        // TODO: 구현
        for(int i=0; i<personList.size(); i++) {
            System.out.println("Name: " + personList.get(i).getName()
            		+ ", Age: " + personList.get(i).getAge()
            		+ ", City: " + personList.get(i).getCity());
        }
    }

    private static List<Person> readDataFromCSV() {
        List<Person> personList = new ArrayList<>();

        // TODO: 구현
        try {
        File file = new File(CSV_FILE);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while((line = br.readLine()) != null) {
        	String[] tokens = line.split(CSV_SPLIT_BY);
        	Person person = new Person(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
        	personList.add(person);
        }
        br.close();
        } catch(IOException e) {
        	e.printStackTrace();
        }

        return personList;
    }

    private static void addNewStudentToCSV() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(CSV_FILE, true))) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the name of the student: ");
            String name = scanner.nextLine();

            System.out.print("Enter the age of the student: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character

            System.out.print("Enter the city of the student: ");
            String city = scanner.nextLine();

            // TODO: 구현
            bw.write(name + "," + age + "," + city + "\n");           
            bw.close();

            System.out.println("New student added to the CSV file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}