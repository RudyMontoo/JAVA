package HASHMAP.Coolission;
import java.util.*;
public class HashingImple {
    public static int size = 10;


    public static int[] HashTable = new int[size];

    public static int hashfunction(int key){
        return key%size;
    }
public static void Insertion(int x){
    int index=hashfunction(x);
    if(HashTable[index]==-1){
        HashTable[index]=x;
        System.out.println("Succesfully Inserted");

    }
    else{
        System.out.println("Collisio Occured");
    }
}
    public static void Searching(int x){
        int index=hashfunction(x);
        if(HashTable[index]==x){
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element Not Found");
        }

    }
    public static void Deletion(int x){
        int index=hashfunction(x);
        if(HashTable[index]==-1){
            System.out.println("Element not Found");
        }
        else{
            HashTable[index]=-1;
            System.out.println("Succesfully Deleted");
        }
    }
    public static void Display(){
        for(int i=0;i<size;i++){
            System.out.println(i+"->"+HashTable[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<size;i++){
            HashTable[i]=-1;
        }

        while(true){
            System.out.println("1.Insert 2.Delete 3.Search 4.Print 5.Exit");
            System.out.print("Enter your Option: ");
            int op=sc.nextInt();
            switch(op){
                case 1:int x=sc.nextInt();
                    Insertion(x);
                    break;
                    case 2:int y=sc.nextInt();
                    Deletion(y);
                    break;
                    case 3:int z=sc.nextInt();
                    Searching(z);
                    break;
                    case 4:Display();
                    break;
                    case 5:System.exit(0);
            }


        }


    }
}
