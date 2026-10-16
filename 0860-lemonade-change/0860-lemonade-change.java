class Solution {
    Queue<Integer> queue=new LinkedList<>();
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        if(bills[0]!=5)return false;
        queue.add(5);
        for(int i=1;i<n;i++){
            if(!check(bills[i])){
                return false;
            }
        }
        
        return true;
    }

    public boolean check(int cm){
        // if(cm!=5 && queue.isEmpty())return false;
        if(cm==5){
            queue.add(5);
            return true;
            }
        if(cm==10){
            if(queue.contains(5)){
                queue.add(10);
                queue.remove(5);
                return true;
            }
        }
        if(cm==20){
            if(queue.contains(10)&&queue.contains(5)){
                queue.add(20);
                queue.remove(10);
                queue.remove(5);
                return true;
            }
            if(Collections.frequency(queue, 5)>=3){
                queue.remove(5);
                queue.remove(5);
                queue.remove(5);
                queue.add(20);
                return true;
            }
        }
        
        return false;
    }
}