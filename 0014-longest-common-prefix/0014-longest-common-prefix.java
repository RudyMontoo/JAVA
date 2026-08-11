class Solution {
    public String longestCommonPrefix(String[] strs) {
        // prefix mean the starting part of the text num etc
        int preIdx=0;
        int n=strs.length;
        if(n==1)return strs[0];
         if (strs[0].length() == 0) return "";
        for(int i=0;i<strs[0].length();i++){

            char c=strs[0].charAt(i);
            boolean idx=true;
            for(int j=1;j<n;j++){
                if(i>=strs[j].length()){
                    idx=false;
                break;
                }
                if(strs[j].charAt(i)!=c ){
                    idx=false;
                    break;

                }
               
                
                
            }
            if(!idx){
                return strs[0].substring(0,i);
            }
            preIdx=i;

        }
        return strs[0].substring(0,preIdx+1);

    }
}