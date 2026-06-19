package leetcode;
import java.util.*;
public class june19 {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
        public static  int largestAltitude(int[] gain) {
            int ans=0;
            int gained=0;
            for(int i=0;i<gain.length;i++){
                gained=gained+gain[i];
                ans=Math.max(ans,gained);
            }
            return ans;
        }

}
