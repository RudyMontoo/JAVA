class Solution {
    public int minAddToMakeValid(String s) {
        int ob=0;
        int cb=0;
        int i=0;
        while(i<s.length()){
            char a=s.charAt(i);
            if(a=='(')ob++;
            if(a==')'){
                if(ob==0){
                    cb++;
                }
                else ob--;
            }
            i++;
        }
        return ob+cb;
    }
}
