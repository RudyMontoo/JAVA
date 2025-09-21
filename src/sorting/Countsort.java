package sorting;

public class Countsort {
    public static void main(String[] args) {
        int[] arr={3,4,1,3,2,5,2,8};
        int largest=0;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        int[] count=new int[largest+1];
        for(int num:arr){
            count[num]++;
        }
        int k=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[k++]=i;
                count[i]--;
            }
        }

        for(int num: arr){
            System.out.printf("%d ",num);
        }
    }
}
