import java.util.ArrayList;
import java.util.Iterator;

public class EX11_12 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("orange");
        list.add("grape");

        // Iterator를 사용하여 "apple" 요소를 삭제
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("apple")) {
                iterator.remove();
            }
        }

        // Iterator를 사용하여 "banana" 요소를 "orange" 요소 다음에 추가
        iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.equals("orange")) {
                int index = list.indexOf(item);
                list.add(index + 1, "banana");
                break;
            }
        }

        System.out.println(list);
    }
}