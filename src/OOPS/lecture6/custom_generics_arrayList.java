package OOPS.lecture6;

import java.util.Arrays;

public class custom_generics_arrayList<T> {
    private Object[] data;
    private static int Default_Size=10;
    private int size=0;
    public custom_generics_arrayList(){
        data=new  Object[Default_Size];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        Object[] new_data = new  Object[data.length*2];
        //copy the current item in it;
        for(int i=0;i<data.length;i++){
            new_data[i]=data[i];
        }
        data = new_data;
    }
    public T remove(){
        T removed=(T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int Size(){
        return size;
    }

    public void set(int index,T value){
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
        custom_generics_arrayList<Integer> list=new custom_generics_arrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        //above method are only work for single data type which we will intialize in class

    }
}
