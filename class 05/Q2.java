import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		String name = s.nextLine();
		System.out.println("성이 몇 글자인가요?");
		int a = s.nextInt();
		
		if(a > name.length())
			System.out.println("성의 글자수가 이름의 글자수보다 큽니다.");
		else
		{
			System.out.println(name.substring(0,a));
			System.out.println(name.substring(a));
		}
	}

}
