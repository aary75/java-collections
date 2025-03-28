// Creating mergeset class to merge both sets
package com.bridgelabz.mapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MergeSet {
    public static void main(String[] args) {
        // Scanner class to get user's input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        // Declaration of hashmap
        Map<String, Integer> firstmap = new HashMap<>();
        Map<String, Integer> secondmap = new HashMap<>();

        System.out.println("Enter elements in first map:");
        for (int i = 0; i < size; i++) {
            String key = scanner.nextLine();
            int value = scanner.nextInt();
            scanner.nextLine();
            firstmap.put(key, value);
        }

        System.out.println("Enter elements in second map:");
        for (int i = 0; i < size; i++) {
            String key = scanner.nextLine();
            int value = scanner.nextInt();
            scanner.nextLine();
            secondmap.put(key, value);
        }

        // merging of firstset and second set
        for(Map.Entry<String,Integer> entry : secondmap.entrySet()){
            // checking the key is present or not
            if(firstmap.containsKey(entry.getKey())){
                firstmap.put(entry.getKey(), firstmap.get(entry.getKey()) + entry.getValue());
            }
            else {
                firstmap.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println("Merge set:");
        System.out.println(firstmap);
    }
}

//Enter the size:
//        3
//Enter elements in first map:
//A
//1
//B
//2
//C
//3
//Enter elements in second map:
//D
//4
//B
//3
//E
//5
//        Merge set:
//        {A=1, B=5, C=3, D=4, E=5}