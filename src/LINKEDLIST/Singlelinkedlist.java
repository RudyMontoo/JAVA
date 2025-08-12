package LINKEDLIST;

public class Singlelinkedlist {
    //intialize node structure
    static class Node {
        int data;
        Node next;

        //constructor
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }


    //create a linked class to manage node
    static class Linkedlist {
        Node head;

        public void insert(int data) {
            Node newnode = new Node(data);
            if (head == null) {
                head = newnode;

            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newnode;
            }
        }


        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");

        }
    }

    public static void main(String[] args) {
        Linkedlist list=new Linkedlist();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.display();
    }
}
