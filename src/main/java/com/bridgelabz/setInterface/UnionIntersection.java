// Creating the UnionIntersection class for union and intersection
package com.bridgelabz.setInterface;
import  java.util.*;

public class UnionIntersection {
    public static void main(String[] args){
        // scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        // Declaration of both sets
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();

        System.out.println("Enter the size: ");
        int size = scanner.nextInt();

        System.out.println("Elements of first set:");
        for(int i=0;i<size;i++){
            firstSet.add(scanner.nextInt());
        }

        System.out.println("Elements of second set:");
        for(int i = 0;i<size;i++){;
            secondSet.add(scanner.nextInt());
        }

        Set<Integer> union = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for(int ele : firstSet){
            union.add(ele);
        }

        for(int ele : secondSet){
            union.add(ele);
            if(firstSet.contains(ele)) intersection.add(ele);
        }

        System.out.print("Union of firstSet and secondSet is: ");
        System.out.println(union);

        System.out.print("Intersection of firstSet and secondSet is: ");
        System.out.println(intersection);


    }
}


//Enter the size:
//        5
//Elements of first set:
//        1
//        2
//        3
//        4
//        5
//Elements of second set:
//        5
//        7
//        8
//        9
//        6
//Union of firstSet and secondSet is: [1, 2, 3, 4, 5, 6, 7, 8, 9]
//Intersection of firstSet and secondSet is:
//        [5]