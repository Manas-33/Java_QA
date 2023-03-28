package f3.LinkedList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(20);
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(1,81);
//        arr.remove(2);
//        arr.set(0,100);
//        Integer i=10;
//        arr.remove(i);
//        System.out.println(arr.size());
//        System.out.println(arr.get(0));
//        for (int j = 0; j < arr.size(); j++) {
//            System.out.println(arr.get(j));
//        }

        for (int i: arr){//Enhanced For loop where i refers to the elements rather than the index
            System.out.println(i);
        }

    }
}
