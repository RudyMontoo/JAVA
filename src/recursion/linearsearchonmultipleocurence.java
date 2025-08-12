package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class linearsearchonmultipleocurence {

    static ArrayList<Integer> list = new ArrayList<>();

    static void findindex(int[] nums, int ele, int m) {
        if (m == nums.length) {
            return; // base case: end of array
        }
        if (ele == nums[m]) {
            list.add(m); // add index if match
        }
        findindex(nums, ele, m + 1); // always recurse
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        findindex(numbers, target, 0);

        System.out.println(list); // print indices list
    }
}