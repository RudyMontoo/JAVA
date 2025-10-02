package HASHMAP.Coolission;

import java.util.LinkedList;
import java.util.Scanner;

public class SeparateChaining {
    public static final int SIZE = 13;
    // Hash table: array of linked lists
    public static LinkedList<Integer>[] HashTable = new LinkedList[SIZE];

    public static int hashFunction(int key) {
        return key % SIZE;
    }

    public static void insertion(int x) {
        int index = hashFunction(x);
        if (!HashTable[index].contains(x)) {
            HashTable[index].add(x);
            System.out.println("Successfully inserted.");
        } else {
            System.out.println(x + " already exists in the hash table.");
        }
    }

    public static void searching(int x) {
        int index = hashFunction(x);
        if (HashTable[index].contains(x)) {
            System.out.println("Element found.");
        } else {
            System.out.println("Element not found.");
        }
    }

    public static void deletion(int x) {
        int index = hashFunction(x);
        if (HashTable[index].remove((Integer)x)) {
            System.out.println("Successfully deleted.");
        } else {
            System.out.println("Element not found. So cannot delete the element.");
        }
    }

    public static void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("[" + i + "] => ");
            System.out.println(HashTable[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Initialize each chain
        for (int i = 0; i < SIZE; i++) {
            HashTable[i] = new LinkedList<>();
        }

        while (true) {
            System.out.println("1.Insert 2.Delete 3.Search 4.Print 5.Exit");
            System.out.print("Enter your Option: ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Enter an element to be inserted: ");
                    int x = sc.nextInt();
                    insertion(x);
                    break;
                case 2:
                    System.out.print("Enter an element to be deleted: ");
                    int y = sc.nextInt();
                    deletion(y);
                    break;
                case 3:
                    System.out.print("Enter an element to be searched: ");
                    int z = sc.nextInt();
                    searching(z);
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}