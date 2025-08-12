package recursion;

import java.util.ArrayList;
import java.util.Scanner;
//PASSING ARRAY LIST IN ARGUMENT;


//public class returnalist {
//
//    static ArrayList<Integer> findindex(int[] nums, int ele, int m,ArrayList<Integer> list) {
//        if (m == nums.length) {
//            return list; // base case: end of array
//        }
//        if (ele == nums[m]) {
//            list.add(m); // add index if match
//        }
//        return findindex(nums, ele, m + 1,list); // always recurse
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int[] numbers = new int[5];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = sc.nextInt();
//        }
//        int target = sc.nextInt();
//        ArrayList<Integer> list = new ArrayList<>(); // initialize list
//        list = findindex(numbers, target, 0, list);
//
//        System.out.println(list);
//
//        // print indices list
//    }
//}


//DONT PASSING ARRAY LIST I ARGUMENT

public class returnalist {

    static ArrayList<Integer> findindex1(int[] nums, int ele, int m) {
        ArrayList<Integer> list = new ArrayList<>();

        if (m == nums.length) {
            return list; // base case: end of array
        }
        if (ele == nums[m]) {
            list.add(m); // add index if match
        }
        ArrayList<Integer> belowcalloflist = findindex1(nums, ele, m + 1);
        list.addAll(belowcalloflist); // always recurse
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
       int target = sc.nextInt();

        System.out.println(findindex1(numbers, target, 0));

        // print indices list
    }
}

