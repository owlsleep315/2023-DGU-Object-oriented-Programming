import java.util.Scanner;

interface Sort {

    // todo: ascending  descending 함수 정의
	public void ascending(int arr[]);
	public void descending(int arr[]);

    default void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
    }
}

class HeapSort implements Sort {

    @Override
    public void ascending(int[] arr) {
        System.out.println("HeapSort ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("HeapSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("HeapSort 입니다.");
    }
}


class QuickSort implements Sort{

    @Override
    public void ascending(int[] arr) {
        System.out.println("QuickSort ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("QuickSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("QuickSort 입니다.");
    }
}

class BubbleSort implements Sort {

    @Override
    public void ascending(int[] arr) {
        System.out.println("BubbleSort ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("BubbleSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("BubbleSort 입니다.");
    }
}

public class EX12_SortMain {
    public static void main(String[] args) {
        System.out.println("정렬 방식을 선택하세요.");
        System.out.println("B : BubbleSort ");
        System.out.println("H : HeapSort ");
        System.out.println("Q : QuickSort ");

        Scanner s = new Scanner(System.in);
        String str = s.next();
        Sort sort = null;

        //--------------Your Code-----------------------
        switch(str) {
        case "B":
        	BubbleSort bubblesort = new BubbleSort();
        	sort = bubblesort;
        	break;
        case "H":
        	HeapSort heapsort = new HeapSort();
        	sort = heapsort;
        	break;
        case "Q":
        	QuickSort quicksort = new QuickSort();   
        	sort = quicksort;
        	break;
        }

        //-----------------------------------------------
        int[] arr = new int[10];
        sort.ascending(arr);
        sort.descending(arr);
        sort.description();

    }
}
