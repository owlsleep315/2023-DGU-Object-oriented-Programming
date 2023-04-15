abstract class Pet {
    protected String name;
    protected int age;
    protected String owner;
    protected boolean isVaccinated;

    public Pet(String name, int age, String owner, boolean isVaccinated) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public abstract void makeSound();
}


interface Groomable {
    void groom();
}

interface Walkable {
    void walk();
}

class Dog extends Pet implements Groomable, Walkable {
    // todo: 내부 구현
    private String color;
    
    public Dog(String name, int age, String owner, boolean isVaccinated, String color) {
    	super(name, age, owner, isVaccinated);
    	this.color = color;
    }
    
    public void makeSound() {
    	System.out.println("Bark!");
    }
    
    public void groom() {
    	System.out.println("Grooming the dog...");
    }
    
    public void walk() {
    	System.out.println("Walking the dog...");
    }
}


class Cat extends Pet implements Groomable, Walkable {
    private String color;
    
    public Cat(String name, int age, String owner, boolean isVaccinated, String color) {
    	super(name, age, owner, isVaccinated);
    	this.color = color;
    }
    //todo: 내부 구현
    public void makeSound() {
    	System.out.println("Meow!");
    }
    
    public void groom() {
    	System.out.println("Grooming the cat...");
    }
    
    public void walk() {
    	System.out.println("Walking the cat...");
    }
}


public class EX12_3 {
    public static void main(String[] args) {
        // 펫 객체 생성
        Pet bobby = new Dog("Bobby", 3, "Alice", true, "White");
        Pet coco = new Cat("Coco", 2, "Bob", false, "Gray");

        // 펫 소리 출력 (your code)
        bobby.makeSound();
        coco.makeSound();
        // 예방 접종 여부 출력 (your code)
        System.out.println("Is Bobby vaccinated? " + bobby.isVaccinated());
        System.out.println("Is coco vaccinated? " + coco.isVaccinated());
        // 그루밍 (your code)
        Dog dog = (Dog) bobby;
        dog.groom();
        Cat cat = (Cat) coco;
        cat.groom();
        // 산책 (your code)
        dog.walk();
        cat.walk();
    }
}
