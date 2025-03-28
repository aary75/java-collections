package com.bridgelabz.setInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SortedSet {
    public static void main(String[] args){
        // scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        // Declaration of set
        Set<Integer> firstSet = new HashSet<>();
        ArrayList<Integer> sortedList = new ArrayList<>();

        System.out.println("Enter the size: ");
        int firstSize = scanner.nextInt();

        System.out.println("Elements of set:");
        for(int i=0;i<firstSize;i++){
            firstSet.add(scanner.nextInt());
        }

        // Sort the set using bubble sort
        for(int fixed : firstSet){
            for(int ele : firstSet) {
                if (ele < fixed) {
                    int tem = fixed;
                    fixed = ele;
                    ele = tem;
                }
            }
        }

        // Transfer elements from set to arrayList
        for(int ele : firstSet){
             sortedList.add(ele);
        }

        // Printing the set
        System.out.print("Sorted Set: ");
        System.out.println(sortedList);

    }
}

//Enter the size:
//        5
//Elements of set:
//        9
//        5
//        7
//        8
//        10
//Sorted Set: [5, 7, 8, 9, 10]

