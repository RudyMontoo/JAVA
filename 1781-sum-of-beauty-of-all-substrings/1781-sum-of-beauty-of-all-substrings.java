// class Solution {
//     public int beautySum(String s) {
//         int n=s.length();
//         // so we have to tell those substring which max and min freq diffrence is not zero
//         // lets first try brute force 
//         int sum=0;
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                 int dif=diff(s,i,j);
//                sum+=dif;
//             }
//         }
//         return sum;
//     }

//     public static int diff(String s, int i, int j) {
//     HashMap<Character, Integer> map = new HashMap<>();

//     for (int x = i; x <= j; x++) {
//         char a = s.charAt(x);
//         map.put(a, map.getOrDefault(a, 0) + 1);
//     }

//     if (map.size() == 1) {
//         return 0;
//     }

//     int max = Integer.MIN_VALUE;
//     int min = Integer.MAX_VALUE;

//     for (int freq : map.values()) {
//         max = Math.max(max, freq);
//         min = Math.min(min, freq);
//     }

//     return max - min;
// }
// }


class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                map.put(c, map.getOrDefault(c, 0) + 1);

                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for (int freq : map.values()) {
                    max = Math.max(max, freq);
                    min = Math.min(min, freq);
                }

                sum += max - min;
            }
        }

        return sum;
    }
}