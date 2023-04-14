
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dice dice = new Dice(6);
		int[] hunDice = new int[100];
		int[] cntDice = new int[dice.face];
		int sum = 0;
		for(int i=0; i<100; i++) {
			hunDice[i] = dice.RollDice(dice.face);
			cntDice[hunDice[i]-1]++;
			sum += hunDice[i];
		}
		for(int j=0; j<dice.face; j++) {
			System.out.println(j+1+" 숫자는 "+cntDice[j]+"번 나왔습니다.");
		}
		System.out.println("나온 숫자의 총 합은 "+sum);
 	}

}

class Dice{
	int face;
	Dice(int n){
		this.face = n;
	}
	public static int RollDice(int n) {
		int number = (int)(Math.random()*n)+1;
		return number;
	}
}