package HASHMAP.CW;

import java.util.HashMap;

//GIVEN AN ARRAY FIND THE MST FREQUENT ELEEMNT IN IT
public class problem1 {
    public static void main(String[] args) {
        int n=6;
        int[] arr={1,3,2,1,4,1};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:arr){
            if(!mp.containsKey(i)){
                mp.put(i,1);
            }
            else{
                mp.put(i,mp.get(i)+1);
            }
        }
        System.out.println("Frequency Map");
        System.out.println(mp.entrySet());

        int maxf=-1;
        for(var e:mp.entrySet()){
            if(e.getValue()>maxf){
                maxf=e.getValue();
            }
        }
        System.out.println(maxf);

    }
}
