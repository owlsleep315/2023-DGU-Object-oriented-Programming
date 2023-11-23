class Person {	
	public void doIt( Role role) {
		role.doIt();
	}
}

class Role {

    public void doIt() {
        // 역할을 수행하는 기본 동작
        System.out.println("Person is doing something.");
    }
}

class Driver extends Role {

    @Override
    public void doIt() {
        System.out.println("Driving");  // 오버라이딩
    }
}

class SoccerPlayer extends Role {

    @Override
    public void doIt() {
        System.out.println("Playing Soccer");
    }
}

class Worker extends Role { 

    @Override
    public void doIt() {
        System.out.println("Working");  // 오버라이딩
    }
}

public class EX18_2 {
    public static void main(String[] args) {

        Person person = new Person();  // 사람 객체 생성
        Role role = new Role();

        person.doIt(role);  // 기본 동작 수행

        role = new Driver();  // 운전자로 역할 변경
        person.doIt(role);

        role = new Worker();  // 직장인으로 역할 변경
        person.doIt(role);

        role = new SoccerPlayer(); // 축구 선수로 역할 변경
        person.doIt(role);
    }
}