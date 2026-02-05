package leetcode;

public class Feb5 {
        public int[] constructTransformedArray(int[] nums) {
            int[] arr=new int[nums.length];
            for(int i=0;i<nums.length;i++){
// next index  = (i + 1) % n
// prev index  = (i - 1 + n) % n
                int a=nums[i];
                if(a>0){
                    arr[i]=nums[(i+a)%nums.length];
                }
                else if(a<0){

                    arr[i]=nums[((i + a) % nums.length + nums.length) % nums.length];
                }

                else{
                    arr[i]=nums[i];
                }

            }
            return arr;
        }

        public static void main(String[] args) {
            int[] arr={-1,-2,-3};
            Feb5 obj=new Feb5();
            obj.constructTransformedArray(arr);
        }
    }




