package OOPS.lecture6;

import java.util.Arrays;

public class custom_arrayList {
    private int[] data;
    private static int Default_Size=10;
    private int size=0;
    public custom_arrayList(){
        this.data=new  int[Default_Size];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        int[] new_data = new  int[data.length*2];
        //copy the current item in it;
        for(int i=0;i<data.length;i++){
            new_data[i]=data[i];
        }
        data = new_data;
    }
    public int remove(){
       int removed=data[size-1];
       return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int Size(){
        return size;
    }

    public void set(int index,int value){
         data[index]=value;
    }

@Override
public String toString() {
        return "custom_arrayList{" +
                "data" + Arrays.toString(data)+", size"
                +size+
                '}';
}


    public static void main(String[] args) {
        custom_arrayList list = new custom_arrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        //above method are only work for single data type which we will intialize in class

    }
}
