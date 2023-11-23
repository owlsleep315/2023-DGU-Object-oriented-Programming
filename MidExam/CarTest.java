abstract class Car{
	// todo: 구현하시오 (implement this)
	abstract void run();
	abstract void refuel();
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
}

class Bus extends Car{
	// todo: 구현하시오 (implement this)
	public void run() {
		System.out.println("버스가 주행합니다.");
	}
	
	public void refuel() {
		System.out.println("버스에 연료를 주유합니다.");
	}
	
	public void takePassenger() {
		System.out.println("승객을 버스에 태웁니다.");
	}
}

class AutoCar extends Car{
	// todo: 구현하시오 (implement this)
	public void run() {
		System.out.println("차가 달립니다.");
	}
	
	public void refuel() {
		System.out.println("연료를 주유합니다..");
	}
	
	public void load() {
		System.out.println("짐을 싣습니다.");
	}
}

public class CarTest {
    public static void main(String[] args) {
        Bus bus = new Bus();
        AutoCar autoCar = new AutoCar();

        bus.run();
        autoCar.run();

        System.out.println();
        bus.refuel();
        autoCar.refuel();

        System.out.println();
        bus.takePassenger();
        autoCar.load();

        System.out.println();
        bus.stop();
        autoCar.stop();
    }
}
