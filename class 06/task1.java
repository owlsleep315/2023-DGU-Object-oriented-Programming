import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
        
            System.out.printf("고양이의 색깔을 입력해주세요 : ");
            String str1 = s.nextLine();
            System.out.printf("고양이의 이름을 입력해주세요 : ");
            String str2 = s.nextLine();
        
            // str1, str2를 이용하여 새로운 Cat 객체 1개를 생성하고, introduce 함수를 작동시켜 주세요!
            Cat cat = new Cat(str1, str2);
            cat.introduce();
        }
}

class Cat {
    
    String color; // 클래스 내의 멤버 변수
    String name; // 클래스 내의 멤버 변수
    
    public Cat(String inputColor, String inputName) // 객체가 생성될 때 자동으로 실행되는 '생성자'
    {
        // 멤버 변수 color, name에 매개 변수 inputColor, inputName을 할당해주세요!
    	this.color = inputColor;
    	this.name = inputName;
    }
    
    public void introduce() // 클래스 내의 멤버 메서드 (함수)
    {
        // System.out.println을 이용하여 (색깔) + "고양이" + (이름)의 형식으로 출력해주세요!
    	System.out.println(color + " 고양이 " + name);
    }
}