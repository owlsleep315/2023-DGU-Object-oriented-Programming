import java.util.Scanner;
public class 별생성 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a;
		System.out.println("길이 : ");
		a=s.nextInt();
		
		for(int i=0; i<a; i++)
		{
			for(int j=0; j<i; j++)
				System.out.printf(" ");
			for(int j=2*a-1; j>2*i; j--)
				System.out.printf("*");
			System.out.printf("\n");
		}
	}

}
