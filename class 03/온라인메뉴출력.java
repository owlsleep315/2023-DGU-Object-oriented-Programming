import java.util.Scanner;

public class 온라인메뉴출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int phone_number;
		int menu_number;
		
		Scanner s = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요 : ");
		name = s.nextLine();
		System.out.print("연락처를 입력하세요 : ");
		phone_number = s.nextInt();
		
		System.out.println("*********************************************************");
		System.out.println("               Welcome to Shopping Mall");
		System.out.println("               Welcome to Book Market!");
		System.out.println("*********************************************************");
		System.out.printf("%-25s\t%-25s\n", " 1. 고객 정보 확인하기", " 4. 바구니에 항목 추가하기");
		System.out.printf("%-25s\t%-25s\n", " 2. 장바구니 상품 목록 보기", " 5. 장바구니의 항목 수량 줄이기");
		System.out.printf("%-25s\t%-25s\n", " 3. 장바구니 비우기", " 6. 장바구니의 항목 삭제하기");
		System.out.printf("%-25s\t%-25s\n", " 7. 영수증 표시하기", " 8. 종료");
		System.out.println("*********************************************************");
		
		System.out.print("메뉴 번호를 선택해주세요 ");
		menu_number = s.nextInt();
		System.out.println(menu_number + "번을 선택했습니다");
	}

}
