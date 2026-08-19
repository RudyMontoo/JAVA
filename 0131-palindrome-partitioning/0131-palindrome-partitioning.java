class Solution {
    final List<List<String>> result=new ArrayList<>();
    public List<List<String>> partition(String s) {
        func(0,s,new ArrayList<>());
        return result;
    }
    public  void func(int idx, String s, List<String> list){
        if(idx==s.length()){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int len = 1; len <= s.length() - idx; len++) {

    if(isPalin(idx, idx + len - 1, s)) {

        list.add(s.substring(idx, idx + len));

        func(idx + len, s, list);

        list.remove(list.size() - 1);
    }
}
        return;
    }


   public  boolean isPalin(int i, int j, String s) {
    // Base case: crossed or met in the middle
    if (i >= j) {
        return true;
    }

    // Mismatch
    if (s.charAt(i) != s.charAt(j)) {
        return false;
    }

    // Move both pointers inward
    return isPalin(i + 1, j - 1, s);
}
}
