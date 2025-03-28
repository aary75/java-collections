// Creating the BInaryString class to convert from integer to string in java
package com.bridgelabz.queueInterface;
import java.util.*;

public class BInaryString {
    public static void main(String[] args){
        // Scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Enter te size:");
        int size = scanner.nextInt();

        System.out.println("Enter the elements:");
        for(int i =0; i<size; i++){
            queue.add(i+1);
        }

        for(int i = 0;i<size;i++){
            String binary = Integer.toBinaryString(queue.poll());
            System.out.println(binary);
        }
    }
}


//Enter te size:
//        5
//Enter the elements:
//        1
//        10
//        11
//        100
//        101