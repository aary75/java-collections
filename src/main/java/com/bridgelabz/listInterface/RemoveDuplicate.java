// Creating the RemoveDuplicate class to remove the duplicate elements from list
package com.bridgelabz.listInterface;
import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        // Scanner class to get user's input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        // Creating the list
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0;i<size;i++){
            arr.add(scanner.nextInt());5
        }

        System.out.println("Original list is: ");
        System.out.println(arr);
        ArrayList<Integer> unique = new ArrayList<>();
        for(int i = 0;i<size;i++){
            if(!unique.contains(arr.get(i))){
                unique.add(arr.get(i));
            }
        }

        System.out.println("Enter the list with unique elements: ");
        System.out.println(unique);
    }
}

//Enter the size: 5
// 2
// 1
// 3
// 3
// 4
//Original list is:
// [2, 1, 3, 3, 4]
//Enter the list with unique elements:
// [2, 1, 3, 4]
