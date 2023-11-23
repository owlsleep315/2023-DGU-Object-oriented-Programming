class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }
}

public class DogTest {
	public static void main(String[] args) {
        // todo: 테이블을 활용하여 dogs 를 초기화 하시오 (initialize the array dogs using the table on the exam paper)
		Dog dog1 = new Dog("Buddy", "Golden Retriever");
		Dog dog2 = new Dog("Charlie", "Labrador Retriever");
		Dog dog3 = new Dog("Max", "German Shepherd");
		Dog dog4 = new Dog("Daisy", "Poodle");
		Dog dog5 = new Dog("Rocky", "Siberian Husky");
        String format = "| %-10s | %-20s |%n";
        // todo: 위의 format과 printf를 활용하여 출력하시오 (use the upper format and printf method)
        System.out.printf("| %-10s | %-20s |%n", dog1.getName(), dog1.getBreed());
        System.out.printf("| %-10s | %-20s |%n", dog2.getName(), dog2.getBreed());
        System.out.printf("| %-10s | %-20s |%n", dog3.getName(), dog3.getBreed());
        System.out.printf("| %-10s | %-20s |%n", dog4.getName(), dog4.getBreed());
        System.out.printf("| %-10s | %-20s |%n", dog5.getName(), dog5.getBreed());
	}

}
