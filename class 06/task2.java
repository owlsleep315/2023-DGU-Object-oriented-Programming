public class task2 {

    public static void main(String[] args) {
            
        Stu[] studentArr = new Stu[5];
        int[] numberArr = {2020123456, 2021110000, 2022987654, 2023456789, 2024273645};
        String[] nameArr = {"학생1", "학생2", "학생3", "학생4", "학생5"};
        float[] scoreArr = {4.5f, 4.2f, 3.8f, 3.2f, 2.7f};
        
        for(int i = 0; i < 5; i++) {
        studentArr[i] = new Stu(numberArr[i], nameArr[i], scoreArr[i]);
        }
        
        for(int j = 0; j < 5; j++)
        {
        	Stu s = studentArr[j];
            System.out.printf("학번 : " + s.getNumber() + ", 이름 : " + s.getName() + ", 점수 : " + s.getScore() + "\n");
            // 객체지향으로 바꿀 때 클래스 내에 만들어놓은 get 함수로 값을 받아주세요!
        }
    }
}

class Stu {
	
	int number;
	String name;
	float score;
	
	public Stu(int number, String name, float score){
		this.number = number;
		this.name = name;
		this.score = score;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getName() {
		return name;
	}
	
	public float getScore() {
		return score;
	}
}