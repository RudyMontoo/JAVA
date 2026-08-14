// class Solution {
//     public int maximumLengthSubstring(String s) {
//         // THE question is asking for at most
//         int n=s.length();
//         int ans=0;
      
//         // for(int i=0;i<)
//         for(int k=n;k>=0;k--){
//             for(int i=0;i<=n-k;i++){
//                   HashMap<Character,Integer> map=new HashMap<>();
//                   boolean found=true;;
//                   for(int j=i;j<i+k;j++){
//                      map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
//                         if(map.get(s.charAt(j))>2){
//                             found=false;
//                             break;
//                         }
//                   }
//                   if(found)return k;

//             }
//         }
//         return 2;
//     }
// }

// Time complexiry n**3

class Solution {
    public int maximumLengthSubstring(String s) {
        int[] count=new int[26];
        int left=0;
        int ans=0;
        for(int right=0;right<s.length();right++){
            char A=s.charAt(right);
            count[A-'a']++;
            

            while(count[A-'a']>2){
               char leftChar = s.charAt(left); 
               count[leftChar - 'a']--;
               left++;
            }

            ans=Math.max(ans,right-left+1);

        }

        return ans;

    }
}