class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        if(s.length()!=goal.length())return false;
        for(int i=0;i<n;i++){
            String s1=shift(s,i);
            if(s1.equals(goal))return true;
        }
        return false;
    }

    public static String shift(String s, int k){
        if(k!=0){
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        sb.append(s.substring(k,n));
        sb.append(s.substring(0,k));
        return sb.toString();
        
        }
        else{
            return s;
        }
    }
}