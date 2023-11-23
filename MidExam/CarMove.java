class CarCreat {

    int regNum;
    private static int num = 1000;

    CarCreat() {
        regNum = num++;
    }

    void showDetails(String name) {
    	System.out.println(name + "'s number is " + regNum);
    }

    void start() {
        System.out.println("Car Starts. ");
    }

}

class Driver {
    String name;
    CarCreat c = new CarCreat();
    Driver(String n) {
        name = n;
    }
}

public class CarMove {
    public static void main(String[] args) {

        Driver dr = new Driver("xyz");
        dr.c.showDetails(dr.name);
        dr.c.start();

        Driver dr1 = new Driver("abc");
        dr1.c.showDetails(dr1.name);
        dr1.c.start();
    }
}