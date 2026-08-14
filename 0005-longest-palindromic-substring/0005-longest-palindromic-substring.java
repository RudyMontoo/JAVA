class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String ans="";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(palin(s,i,j)){
                    if(ans.length()<j-i+1){
                        ans=s.substring(i,j+1);
                    }
                }
            }
        }

        return ans;
    }

    public static boolean palin(String s, int i, int j){
    while (i < j) {
        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }

        i++;
        j--;
    }

    return true;
}
    
}