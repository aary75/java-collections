// Creating te SecondFromLast to find the last element without calculating its size
package com.bridgelabz.listInterface;
import java.util.*;

public class SecondFromLast {
    // Creating a node class
static class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

// creating the linked list class
static class linkedlist{
    Node tail = null;
    Node head = null;

    // inserting at end
 void insertAtTail(int data){
    Node tem = new Node(data);

    if(tail == null){
        tail = tem;
        head = tem;
    }
    else{
        tail.next = tem;
        tail = tem;
    }
}

 int findElement(){
    Node fast = head;
    Node slow = head;

    fast = fast.next;
    fast = fast.next;

    while(fast != null){
        slow = slow.next;
        fast = fast.next;
    }

    return slow.data;
}
}
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Creating a linkedlist object
        linkedlist li = new linkedlist();

        // adding the elements
        li.insertAtTail(23);
        li.insertAtTail(43);
        li.insertAtTail(54);
        li.insertAtTail(100);

        //finding the element
        int ans = li.findElement();

        System.out.println("The answer is: ");
        System.out.println(ans);
    }
}

//The answer is:
//        54