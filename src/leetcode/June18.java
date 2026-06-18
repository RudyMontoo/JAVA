package leetcode;
import java.util.*;
public class June18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int M= sc.nextInt();
        System.out.println(angleClock(H,M));
    }

        public static double angleClock(int hour, int minutes) {
            double ang=Math.abs(30*hour-(11.0*minutes)/2.0);
            return Math.min(ang,360-ang);
        }

}
