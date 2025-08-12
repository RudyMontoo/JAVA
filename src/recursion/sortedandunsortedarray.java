package recursion;

import java.util.Scanner;
//WITHOUT RESCURSION

//public class sortedandunsortedarray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] numbers = new int[5];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = sc.nextInt();
//        }
//        int count=0;
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers.length-i-1; j++) {
//                if(numbers[j]>numbers[j+1]){
//                    count++;
//                }
//            }
//        }
//        if(count==0){
//            System.out.println("Sorted array");
//        }
//        else{
//            System.out.println("Not Sorted array");
//        }
//    }
//}


//WITH RECURSION
public class sortedandunsortedarray {
    static boolean check(int[] n,int m){
        if(m==n.length-1){return true;}
        boolean check1=n[m]<n[m+1];
        return (check1&&check(n,m+1));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean chck=check(numbers,0);

        if(chck){
            System.out.println("Sorted array");
        }
        else{
            System.out.println("Not Sorted array");
        }
    }
}
