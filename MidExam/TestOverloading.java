public class TestOverloading {
    public static void main(String... str) {
        add(3.0, 5.0);
        add(7, 5.0);
        add(7, 2.12f);
    }
    // todo: add 메소드들을 구현하시오. (implement add methods)
 	public static void add(double a, double b) {
 		System.out.println("(double, double) is called, result="+(a+b));
 	}
 	public static void add(int a, double b) {
 		System.out.println("(int, double) is called, result="+(a+b));
 	}
 	public static void add(int a, float b) {
 		System.out.println("(int, float) is called, result="+(a+b));
 	}

}