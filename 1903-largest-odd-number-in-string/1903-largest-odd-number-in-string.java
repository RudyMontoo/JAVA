class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        // from left side
    //     if(num.charAt(n-1)%2!=0){
    //         return num;
    //     }
    //    int i=0;
    //    int idx=-1;
    //     while(i<n){
    //         if(num.charAt(i)%2!=0){
    //             idx=i;
    //         }
    //         i++;
    //     }

    //     if(idx==-1){
    //         return "" ;
    //     }
    //     else{
    //         return num.substring(0,idx+1);
    //     }
    //     // return "";



        // from right side
        int i=n-1;
        while(i>=0){
            if(num.charAt(i)%2!=0){
                return num.substring(0,i+1);
            }
            i--;
        }
        return "";

    }
}