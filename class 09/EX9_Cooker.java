import java.util.Scanner;

public class EX9_Cooker {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        ElectronicRiceCooker erc = new ElectronicRiceCooker();
        PressureRiceCooker prc = new PressureRiceCooker();
        RiceCookerManager rcm = new RiceCookerManager();

        while(true)
        {
            System.out.println("\n밥솥 관리 시스템에 오신 것을 환영합니다!");
            System.out.println("\n===== 밥솥 목록 =====");
            System.out.println("[1] 전기밥솥, [2] 압력밥솥");
            System.out.println("\n===== 명령어 입력 예시 =====");
            System.out.println("[전기밥솥 취사] : 1 입력 후 온도 입력");
            System.out.println("[압력밥솥 취사] : 2 입력 후 압력 입력");
            System.out.println("[프로그램 종료] : 3");
            System.out.println("취사할 밥솥과 명령어를 입력해주세요.\n");

            int command = s.nextInt();
            int value;

            switch(command)
            {
                case 1:
                    System.out.println("온도를 입력해주세요.");
                    value = s.nextInt();
                    rcm.cookStart(erc, value);
                    rcm.cookFinish(erc);
                    break;

                case 2:
                    System.out.println("압력을 입력해주세요.");
                    value = s.nextInt();
                    rcm.cookStart(prc, value);
                    rcm.cookFinish(prc);
                    break;

                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }
}

interface RiceCooker
{
    public void cookStart(int value);
    public void cookFinish();
}

class ElectronicRiceCooker implements RiceCooker
{
    // 몇 도의 온도로 취사 시작을 알리는 cookStart 함수를 구현해주세요!
	public void cookStart(int value) {
		System.out.println(value + "도의 온도로 취사 시작하겠습니다.");
	}
    // 취사 종료를 알리는 cookFinish 함수를 구현해주세요!
	public void cookFinish() {
		System.out.println("취사 종료되었습니다.");
	}
}

class PressureRiceCooker implements RiceCooker
{
    // 얼마의 압력으로 취사 시작을 알리는 cookStart 함수를 구현해주세요!
	public void cookStart(int value) {
		System.out.println(value + "G의 압력으로 맛있는 밥을 취사하겠습니다.");
	}
    // 취사 종료를 알리는 cookFinish 함수를 구현해주세요! (위의 함수와 같음)
	public void cookFinish() {
		System.out.println("취사 종료되었습니다.");
	}
}

class RiceCookerManager
{
    public void cookStart(RiceCooker cook, int value){
        cook.cookStart(value);
    }

    // 바로 위의 cookStart 함수를 참고하여 RiceCooker 자료형을 이용하여 cookFinish 함수를 호출해주세요!
    public void cookFinish(RiceCooker cook) {
    	cook.cookFinish();
    }
}
