import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요. ");
		String str = s.nextLine();
		String[]arr = str.split(",");
		for(int i=0; i<9; i++)
		{
			System.out.println(arr[i]);
		}
	}

}
