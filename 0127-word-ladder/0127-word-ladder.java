class pair{
    String word;
    int level;
    public pair(String word, int level){
        this.word=word;
        this.level=level;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord))return 0;
        HashSet<String> set=new HashSet<>();
        for(var x : wordList){
            set.add(x);
        }
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(beginWord,1));
        set.remove(beginWord);
        while(!q.isEmpty()){
             pair curr = q.poll();
            String word = curr.word;
            int level = curr.level;
            for(int i=0;i<word.length();i++){
                for(int j=0;j<26;j++){
                    char c = (char) ('a' + j);
                    String pword=word.substring(0,i)+c+word.substring(i+1);
                    if(pword.equals(endWord))return level+1;
                    if(set.contains(pword)){
                        q.add(new pair(pword,level+1));
                        set.remove(pword);
                    }
                }
            }

        }
        return 0;

    }
}