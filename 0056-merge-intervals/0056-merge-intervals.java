class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        // int i = 0;
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        list.add(intervals[0]);       //Add the first interval (existing int[])\
        for(int i=1;i<intervals.length;i++){
            if(list.get(list.size()-1)[1]>=intervals[i][0]){
                 list.get(list.size() - 1)[1] =Math.max(list.get(list.size() - 1)[1], intervals[i][1]);
            }
            else{
                list.add(intervals[i]); 
            }
        }
       
       

        return list.toArray(new int[0][]);
    }
}