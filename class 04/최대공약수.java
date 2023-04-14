import java.util.Scanner;
public class 최대공약수 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a, b;
		System.out.println("두 숫자를 입력하세요: ");
		a = s.nextInt();
		b = s.nextInt();
		
		int max = 1;
			for(int i = 1; i<=a; i++)
				if(a%i==0 && b%i==0)
					max=i;
		System.out.println("두 수의 최대공약수는 "+max+"입니다.");
	}

}
