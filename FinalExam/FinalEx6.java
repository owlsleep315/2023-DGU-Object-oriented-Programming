public class FinalEx6 {

	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.demo();

	}

}

interface Super1 {
	default void demo() {
		System.out.println("Super1 demo");
	}
}

interface Super2 {
	default void demo() {
		System.out.println("Super2 demo");
	}
}

class Child1 implements Super2{
}