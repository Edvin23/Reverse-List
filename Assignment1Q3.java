import java.io.*;

class ReverseList{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    //set up the first number in the head then move each number unto then next node
    public static ReverseList reverse(ReverseList list, int data){
        Node newNode = new Node(data);
        if(list.head == null){
            list.head = newNode;
        }
        else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }
    public static void print(ReverseList list){
        Node temp = list.head;
        System.out.print("Reverse List: ");

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ReverseList r = new ReverseList();

        r.reverse(r,22);
        r.reverse(r,41);
        r.reverse(r,3);
        r.reverse(r,25);
        r.reverse(r,8);

        r.print(r);
    }
}