import java.util.Scanner;
public class 배열출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int aa[]=new int[10];
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(i+"번째 짝수를 입력하세요: ");
			aa[i-1]=s.nextInt();
			if(aa[i-1]%2 != 0)
			{
				System.out.println("짝수가 아닙니다. 다시 입력하세요");
				i--;
			}
		}
		
		for(int i=9; i>=0; i--)
			System.out.println("aa["+i+"] = "+aa[i]);
	}

}
