class Solution {
    public int candy(int[] ratings) {
        // ratings = [3, 2, 1]  ->left-> right not work
        int n=ratings.length;
        int[] arr=new int[n];
        Arrays.fill(arr,1);
        // Left → Right pass ADD KAR
        for(int i=1; i<n; i++){
            if(ratings[i] > ratings[i-1]){
                arr[i] = arr[i-1] + 1;
            }
        }

        // Right → Left pass — i>=0 fix kar
        for(int i=n-2; i>=0; i--){
            if(ratings[i] > ratings[i+1]){
                arr[i] = Math.max(arr[i], arr[i+1]+1);
            }
        }
        return Arrays.stream(arr).sum();
    }
}