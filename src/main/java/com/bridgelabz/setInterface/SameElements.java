// Creating the SameElements class to find elements are same in both sets are not
package com.bridgelabz.setInterface;
import java.util.*;

public class SameElements {
    // method for checking
    public static void check(Set<Integer> firstSet, Set<Integer> secondSet, int size){
        if(firstSet.size() != secondSet.size()) return ;

        for(int ele : firstSet){
            secondSet.add(ele);
        }

        if(secondSet.size() == size){
            System.out.println("Both set have same elements");
        }
        else{
            System.out.println("Both sets do not have same elements");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int size = 5;

        // calling the sets
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();

        System.out.println("Enter the elements for firstSet:");
        for(int i = 0;i<5;i++){
            firstSet.add(scanner.nextInt());
        }

        System.out.println("Enter the elements for secondSet:");
        for(int i=0; i<5;i++){
            secondSet.add(scanner.nextInt());
        }

        check(firstSet,secondSet,size);
    }
}

//Enter the elements for firstSet:
//        5
//        7
//        8
//        2
//        4
//Enter the elements for secondSet:
//        4
//        2
//        7
//        8
//        5
//Both set have same elements
