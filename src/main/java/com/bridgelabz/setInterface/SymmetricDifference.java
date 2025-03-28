// Creating a SymmetricDifference class to find the difference between sets
package com.bridgelabz.setInterface;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SymmetricDifference {
    public static void main(String[] args){
        // scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        // Declaration of both sets
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();

        System.out.println("Enter the size of firstSet: ");
        int firstSize = scanner.nextInt();

        System.out.println("Elements of first set:");
        for(int i=0;i<firstSize;i++){
            firstSet.add(scanner.nextInt());
        }

        System.out.println("Enter the size of secondSet: ");
        int secondSize = scanner.nextInt();

        System.out.println("Elements of second set:");
        for(int i = 0;i<secondSize;i++){;
            secondSet.add(scanner.nextInt());
        }

        Set<Integer> difference = new HashSet<>();

        for(int ele : firstSet){
            if(!secondSet.contains(ele)) difference.add(ele);
        }

        for(int ele : secondSet){
            if(!firstSet.contains(ele)) difference.add(ele);
        }

        System.out.print("Symmetric Differnce of firstSet and secondSet is: ");
        System.out.println(difference);

    }
}

//Enter the size of firstSet:
//        4
//Elements of first set:
//        1
//        2
//        3
//        4
//Enter the size of secondSet:
//        3
//Elements of second set:
//        4
//        5
//        6
//Symmetric Differnce of firstSet and secondSet is: [1, 2, 3, 5, 6]
