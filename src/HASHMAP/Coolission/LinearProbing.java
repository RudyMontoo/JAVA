package HASHMAP.Coolission;

import java.util.Scanner;

public class LinearProbing {
    public static int size = 13;
    public static int[] HashTable = new int[size];

    public static int hashfunction(int key){
        return key % size;
    }

    public static void Insertion(int x){
        int index = hashfunction(x);
        int start = index;
        while(HashTable[index] != -1){
            if(HashTable[index] == x){
                System.out.println(x + " already exists in the hash table.");
                return;
            }
            index = (index + 1) % size;
            if(index == start){
                System.out.println("Hash table is full.");
                return;
            }
        }
        HashTable[index] = x;
        System.out.println("Successfully inserted.");
    }

    public static void Searching(int x){
        int index = hashfunction(x);
        int start = index;
        while(HashTable[index] != x){
            index = (index + 1) % size;
            if(index == start){
                System.out.println("Element not found.");
                return;
            }
        }
        System.out.println("Element found.");
    }

    public static void Deletion(int x){
        int index = hashfunction(x);
        int start = index;
        while(HashTable[index] != x){
            index = (index + 1) % size;
            if(index == start){
                System.out.println("Element not found. So cannot delete the element.");
                return;
            }
        }
        HashTable[index] = -1;
        System.out.println("Successfully deleted.");
    }

    public static void Display(){
        for(int i = 0; i < size; i++){
            System.out.println("[" + i + "] => " + HashTable[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < size; i++){
            HashTable[i] = -1;
        }

        while(true){
            System.out.println("1.Insert 2.Delete 3.Search 4.Print 5.Exit");
            System.out.print("Enter your Option: ");
            int op = sc.nextInt();
            switch(op){
                case 1:
                    System.out.print("Enter an element to be inserted: ");
                    int x = sc.nextInt();
                    Insertion(x);
                    break;
                case 2:
                    System.out.print("Enter an element to be deleted: ");
                    int y = sc.nextInt();
                    Deletion(y);
                    break;
                case 3:
                    System.out.print("Enter an element to be searched: ");
                    int z = sc.nextInt();
                    Searching(z);
                    break;
                case 4:
                    Display();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}