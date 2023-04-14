import java.util.ArrayList;

abstract class Car {

    public void start() {
        System.out.println("시동을 켭니다.");
    }

    // todo: 추상메소드 void drive()를 선언
    abstract void drive();
    
    // todo: 추상메소드 void stop()를 선언
    abstract void stop();
    
    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void run() {
        // todo:  내부 구현
    	this.start();
    	this.drive();
    	this.stop();
    	this.turnOff();
    }
}

class Car1 extends Car{
	void drive() {
		System.out.println("Car1 주행합니다.");
	}
	
	void stop() {
		System.out.println("Car1 정지합니다.");
	}
}

class Car2 extends Car{
	void drive() {
		System.out.println("Car2 주행합니다.");
	}
	
	void stop() {
		System.out.println("Car2 정지합니다.");
	}
}

class Car3 extends Car{
	void drive() {
		System.out.println("Car3 주행합니다.");
	}

	void stop() {
		System.out.println("Car3 정지합니다.");
	}
}

class Car4 extends Car{
	void drive() {
		System.out.println("Car4 주행합니다.");
	}
	
	void stop() {
		System.out.println("Car4 정지합니다.");
	}
}

public class EX12_CarTest {
    public static void main(String[] args) {
        ArrayList<Car> carList = new ArrayList<Car>();

        carList.add(new Car1());
        carList.add(new Car2());
        carList.add(new Car3());
        carList.add(new Car4());

        for (Car car : carList) {
            car.run();
            System.out.println("=====================");
        }
    }
}