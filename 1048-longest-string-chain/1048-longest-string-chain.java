class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        int n=words.length;
        int[] dp=new int[n];
      
        Arrays.fill(dp,1);
        int len=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(predecessor(words[j],words[i])){
                    dp[i]=Math.max(dp[i],dp[j]+1);

                }
            }
            len=Math.max(len,dp[i]);
        }
        return len;
    }

    public boolean predecessor(String a, String b){
        if(a.length()+1 !=b.length())return false;
        int i=0,j=0;

        while(i<a.length()&& j<b.length()){
            if(a.charAt(i)==b.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i==a.length();

    }
}