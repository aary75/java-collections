// Creating the Subset class to find one set is subset of second or not
package com.bridgelabz.setInterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Subset {
    public static void main(String[] args){
        // scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        // Declaration of both sets
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();

        System.out.println("Enter the size of first set: ");
        int firstSize = scanner.nextInt();

        System.out.println("Elements of first set:");
        for(int i=0;i<firstSize;i++){
            firstSet.add(scanner.nextInt());
        }

        System.out.println("Enter the size of second set: ");
        int secondSize = scanner.nextInt();

        System.out.println("Elements of second set:");
        for(int i = 0;i<secondSize;i++){;
            secondSet.add(scanner.nextInt());
        }

        // Checking element of second set is present in first set or not
        int count = 0;
        for(int ele : secondSet){
            if(!firstSet.contains(ele)) {
                count++;
                break;
            }
        }

        if(count == 0){
            System.out.println("Second set is subset of first set");
        }
        else{
            System.out.println("Second set is not subset of first set");
        }

    }
}

//Enter the size of first set:
//        5
//Elements of first set:
//        1
//        2
//        3
//        4
//        5
//Enter the size of second set:
//        4
//Elements of second set:
//        1
//        2
//        3
//        4
//Second set is subset of first set