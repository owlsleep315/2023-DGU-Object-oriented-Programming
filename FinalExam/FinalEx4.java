import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FinalEx4 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 20, "12345"));
        students.add(new Student("Alice", 22, "67890"));
        students.add(new Student("Bob", 19, "54321"));
        students.add(new Student("Sarah", 21, "98765"));

        // 객체 정보를 CSV 파일에 저장
        //saveToCSV(students, "new_students.csv");

        // CSV 파일에서 객체 정보를 불러오기
        List<Student> loadedStudents = loadFromCSV("given_students.csv");

        // 불러온 객체 정보 출력
        for (Student student : loadedStudents) {
            System.out.println(student.getName() + ", " + student.getAge() + ", " + student.getStudentId());
        }
    }

    private static void saveToCSV(List<Student> students, String fileName) {
        // TODO:
    	File file = new File("new_student.csv");
    	
    	try {
    		boolean b = file.createNewFile();
    		FileWriter writer = new FileWriter(file);
    	    for (Student student : students) {
    	                writer.write(student.toString() + "\n");
    	    }
    		} catch(IOException e) {
            	e.printStackTrace();
            }
    }

    private static List<Student> loadFromCSV(String fileName) {
        // TODO:
    	List<Student> list = new ArrayList<Student>();
    	try {
            File file = new File(fileName);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line = br.readLine()) != null) {
            	String[] tokens = line.split(",");
            	Student student = new Student(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            	list.add(student);
            }
            br.close();
            } catch(IOException e) {
            	e.printStackTrace();
            }
    	 return list;
    }
}