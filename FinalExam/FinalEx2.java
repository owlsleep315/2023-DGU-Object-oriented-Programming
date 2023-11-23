import java.util.HashMap;

public class FinalEx2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 9, 5, 4, 6};
        int[] arr2 = {3, 4, 5, 6, 4, 3, 6, 7, 6};

        findCommonElements(arr1, arr2);
    }


    public static void findCommonElements(int[] arr1, int[] arr2) {
        // TODO: 구현
    	HashMap<Integer, Integer> count1 = new HashMap<>();
		
		for(Integer a : arr1) {
			if(count1.containsKey(a)) {
				count1.put(a, count1.get(a)+1);
			}
			else {
				count1.put(a, 1);
			}
		}
			
		HashMap<Integer, Integer> count2 = new HashMap<>();
			
		for(Integer b : arr2) {
			if(count2.containsKey(b)) {
				count2.put(b, count2.get(b)+1);
			}
			else {
				count2.put(b, 1);
			}
		}
		
		HashMap<Integer, Integer> count3 = new HashMap<>();
		
		for(int i = 0; i<10; i++) {
			if(count1.containsKey(i) && count2.containsKey(i)) {
				count3.put(i, count1.get(i)+count2.get(i));
			}
		}
		
		for(Integer c : count3.keySet()) {
			System.out.println("Element: " + c + ", Count: " + count3.get(c));
		}
		
    }
}