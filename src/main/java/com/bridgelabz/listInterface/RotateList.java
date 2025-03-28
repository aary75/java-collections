// Creating the class RotateList to rotate the list by give rotatenumber
package com.bridgelabz.listInterface;
import java.util.*;

public class RotateList {
     public static void main(String[] args){
         //scanner class to get user's input
         Scanner scanner = new Scanner(System.in);
         ArrayList<Integer> arr = new ArrayList<>();

         System.out.print("Enter the size:");
         int size = scanner.nextInt();

         for(int i= 0;i<size;i++){
            arr.add(scanner.nextInt());
         }

         System.out.println("Enter the rotation number: ");
         int rotateNumber = scanner.nextInt();
         int start = 0;
         for(int i=0;i<rotateNumber;i++){
             int ele = arr.get(start);
             arr.remove(start);
             arr.add(ele);
         }

         // Printing the list
         System.out.println(arr);
}
}

// Enter the size:5
// 1
// 2
// 3
// 4
// 5
// Enter the rotation number:
// 2
// [3, 4, 5, 1, 2]





