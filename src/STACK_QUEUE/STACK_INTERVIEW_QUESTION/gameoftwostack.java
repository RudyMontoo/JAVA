package STACK_QUEUE.STACK_INTERVIEW_QUESTION;
import java.util.*;
public class gameoftwostack {
    static int twoStacks(int x,int[] a,int [] b){
        return twoStacks(x,a,b,0,0)-1;
    }

    private static int twoStacks(int x,int [] a,int [] b,int sum,int count){
        if(sum>x){
            return count;
        }
        if(a.length==0||b.length==0){
            return count;
        }
        int ans1=twoStacks(x,Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count+1);
    int ans2=twoStacks(x,a,Arrays.copyOfRange(b,1,b.length),sum+b[0],count+1);
   return Math.max(ans1,ans2);
    }


    public static void main(String[] args) {
        int[] a=new  int[]{1,2,3,4,5,6,7,8,9,10};
        int[] b=new  int[]{1,2,3,4,5,6};
        int x=10;
        System.out.println(twoStacks(x,a,b,0,0));
    }

}
