// class Solution {
//     public int candy(int[] ratings) {
//         // ratings = [3, 2, 1]  ->left-> right not work
//         int n=ratings.length;
//         int[] arr=new int[n];
//         Arrays.fill(arr,1);
//         // Left → Right pass ADD KAR
//         for(int i=1; i<n; i++){
//             if(ratings[i] > ratings[i-1]){
//                 arr[i] = arr[i-1] + 1;
//             }
//         }

//         // Right → Left pass — i>=0 fix kar
//         for(int i=n-2; i>=0; i--){
//             if(ratings[i] > ratings[i+1]){
//                 arr[i] = Math.max(arr[i], arr[i+1]+1);
//             }
//         }
//         return Arrays.stream(arr).sum();
//     }
// }


class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int sum = 1, i = 1;

        while (i < n) {

            // FLAT
            if (ratings[i] == ratings[i - 1]) {
                sum += 1;
                i++;
                continue;
            }

            // UPHILL
            int peak = 1;
            while (i < n && ratings[i] > ratings[i - 1]) {
                peak++;
                sum += peak;
                i++;
            }

            // DOWNHILL
            int down = 1;
            while (i < n && ratings[i] < ratings[i - 1]) {
                sum += down;
                i++;
                down++;
            }

            // PEAK ADJUST
            if (down > peak) {
                sum += down - peak;
            }
        }

        return sum;
    }
}