import java.util.HashMap;
import java.util.LinkedList;

class LRUCache {
    HashMap<Integer, String> data = new HashMap<Integer, String>();
    LinkedList<Integer> order = new LinkedList<Integer>();
    int capacity;

    LRUCache(int capacity) {
        this.capacity = capacity; // assigning the size of the cache while creating
    }

    void put(int key, String val) {
        // TODO:
    	if(data.size() == capacity) {
    		data.remove(order.get(order.size()-1));
    		order.remove(order.size()-1);
    	}
    	data.put(key, val);
    	order.addFirst(key);
    }

    // get
    String get(int key) {
        // TODO:
    	order.remove(key);
    	order.addFirst(key);
    	return data.get(key);
    }

    // display method
    public void display() {
        System.out.println("-----------------------");
        for (int i = 0; i < order.size(); i++) {
            int key = order.get(i);
            System.out.println(key + " => " + data.get(key));
        }
    }
}

public class FinalEx7 {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(3);
        cache.put(1, "One");
        cache.put(2, "Two");
        cache.put(3, "Three");
        cache.display();  // 출력: 1: One, 2: Two, 3: Three

        cache.get(2);  // 데이터에 접근하여 LRU 상태 유지
        cache.put(4, "Four");  // 새로운 데이터 추가하며 LRU 정책 적용
        cache.put(1, "One");  // 새로운 데이터 추가하며 LRU 정책 적용
        cache.display();  // 출력: 2: Two, 3: Three, 4: Four
    }

}