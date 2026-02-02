package leet;

public class Feb2 {

    public static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int len = 1; len <= n; len += 2) {      // odd lengths
            for (int i = 0; i + len <= n; i++) {     // start index
                for (int j = i; j < i + len; j++) {  // sum subarray
                    sum += arr[j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(sumOddLengthSubarrays(arr)); // 58
    }
}
