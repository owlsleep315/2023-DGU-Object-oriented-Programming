import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import java.util.Scanner;

class Person implements Comparable<Person> {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person other) {
        return this.age.compareTo(other.getAge());
    }
    
}

public class ArrayListObjectSortExample {
    public static void main(String[] args) {
    	
    	Scanner s = new Scanner(System.in);
    	
    	System.out.print("Enter the number of people you want to add: ");
    	int size = s.nextInt();
        List<Person> people = new ArrayList<>(size);
        
        //요소 추가
        String name;
        int age;
        for(int i = 0; i<size; i++) {
        	System.out.println("Enter name and age for person " + (i+1) + ": ");
        	name = s.next();
        	age = s.nextInt();
        	people.add(new Person(name, age));
        }
        System.out.println("Person List : " + people);
        
        //삭제
        System.out.print("Enter the index of the person you want to remove: ");
        int index = s.nextInt();
        if(index >= 0 && index < people.size()) {
        	people.remove(index);
        	System.out.println("Person removed from index " + index + ". Updated person list: " + people);
        } else {
        	System.out.println("Invalid index. Person not removed.");
        }
        
        //수정
        System.out.print("Enter the index of the person you want to modify: ");
        index = s.nextInt();
        if(index >= 0 && index < people.size()) {
        	System.out.println("Enter updated name and age for person at index " + index + ": ");
        	name = s.next();
        	age = s.nextInt();
        	people.get(index).setName(name);
        	people.get(index).setAge(age);
        	System.out.println("Person at index " + index + " updated. Updated person list: " + people);
        } else {
        	System.out.println("Invalid index. Person not modified.");
        }
        
        //검색
        System.out.print("Enter the name of the person you want to search: ");
        name = s.next();
        index = -1;
        for(int i=0; i<size; i++) {
        	if(name.equals(people.get(i).getName())) {
        		index = i;
        		break;
        	}
        }
        if(index == -1)
        	System.out.println("Person not found.");
        else
        	System.out.println("Person found: " + people.get(index));
        
        //모두 출력
        System.out.println("All persons: ");
        for(int i = 0; i<people.size(); i++) {
        	System.out.println(people.get(i));
        }
        
        // Sort by natural order (age)
        people.sort(Comparator.naturalOrder());

        // Collections.sort(people); # 다른 표현
        System.out.println("Sorted Person List by Age : " + people);

        // Sort by name
        Collections.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Sorted Person List by Name : " + people);
    }
}