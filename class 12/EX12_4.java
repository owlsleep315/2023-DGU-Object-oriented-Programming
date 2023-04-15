import java.util.ArrayList;

class NumberExtractor {
    public static ArrayList<Integer> extractNumbers(String str) {
        ArrayList<Integer> result = new ArrayList<>();
        int a = 0;
        for (char c : str.toCharArray()) {
        	if(c >= 48 && c <= 57) {
        		a = a*10+(c-48);
        	}
        	else {
        		if(a != 0) {
        			result.add(a);
        			a = 0;
        		}
        	}
        }
        return result;
    }
}
public class EX12_4 {
    public static void main(String[] args) {
        String str = "I am going to climb mountin to walk 145km and it would take more than 2 hours and 35 minutes";
        ArrayList<Integer> numbers = NumberExtractor.extractNumbers(str);
        System.out.println("Numbers in \"" + str + "\": " + numbers);

    }
}
