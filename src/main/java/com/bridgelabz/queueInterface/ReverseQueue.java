//Creating the reverseQueue to reverse the queue
package com.bridgelabz.queueInterface;
import java.util.*;

public class ReverseQueue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> reverseQueue = new LinkedList<>();

        System.out.println("Enter te size:");
        int size = scanner.nextInt();

        System.out.println("Enter the elements:");
        for(int i =0; i<size; i++){
            queue.add(scanner.nextInt());
        }

        Stack<Integer> st = new Stack<>();
        while (!queue.isEmpty()){
            st.push(queue.poll());
        }

        System.out.println("Reversed Queue is:");
        while(!st.isEmpty()){
            System.out.print(st.pop()+ " ");
        }
    }
}

//Enter te size:
//        5
//Enter the elements:
//        1
//        2
//        3
//        4
//        5
//Reversed Queue is:
//        5 4 3 2 1
