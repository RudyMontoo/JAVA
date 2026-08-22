class Solution {
    List<String> result=new ArrayList<>();
    String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {

        func(0,digits,new StringBuilder());
        return result;
    }

    public void func(int idx, String digit, StringBuilder sb){
        if(idx==digit.length()){
            result.add(sb.toString());
            return;
        }
        char dig=digit.charAt(idx);
        int index=dig-'0';
        String curr=map[index];

        for(int i=0;i<curr.length();i++){
        sb.append(curr.charAt(i));
        func(idx+1,digit,sb);
        sb.deleteCharAt(sb.length()-1);
        }

        return;
        
    }
}