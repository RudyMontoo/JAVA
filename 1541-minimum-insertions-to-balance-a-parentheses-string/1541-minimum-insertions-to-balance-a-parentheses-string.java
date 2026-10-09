class Solution {
    public int minInsertions(String s) {
        int ob=0;
        int ans=0;
        int i=0;
        int n=s.length();
        while(i<n){
            char brac=s.charAt(i);
            if(brac=='('){
                ob++;
                i++;
            }
            else if(brac==')'){
                if(i+1<n && s.charAt(i+1)==')'){
                    if(ob>0)ob--;
                    else ans++;
                 i+=2; 
                }
                else{
                    ans++;
                    if(ob>0)ob--;
                    else ans++;
                    i++;
                }
               
            }
        }
        ans+=ob*2;
        return ans;
    }
}