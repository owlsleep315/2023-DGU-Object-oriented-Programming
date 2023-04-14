
public class 합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<1000; i+=2)
		{
			if(i % 7 != 0)
				sum+=i;
		}
		System.out.println("1000보다 작은 홀수 중 7의 배수가 아닌 값들의 합: "+sum);
	}

}
