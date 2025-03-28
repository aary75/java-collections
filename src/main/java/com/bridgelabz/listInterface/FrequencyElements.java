// Creating the FrequencyElemets class to get frequency of elements
package com.bridgelabz.listInterface;
import java.util.*;

public class FrequencyElements {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       // Creating the hashmap
       HashMap<String,Integer> mp = new HashMap<>();
       ArrayList<String> arr = new ArrayList<>();

       System.out.println("Enter the size of list: ");
       int size = scanner.nextInt();
       scanner.nextLine();

       System.out.println("Enter the elements: ");
       for(int i = 0;i<size;i++){
           String input = scanner.nextLine();
           arr.add(input);
        }

       // checking the element is already present or not
       for(int i=0;i<size;i++){
           String ele = arr.get(i);
           if(mp.containsKey(ele)){
               mp.put(ele, mp.get(ele)+1);
           }
           else{
               mp.put(ele,1);
           }
       }

       System.out.println("Print the frequency of all elements: ");
       System.out.println(mp);
    }
}

//Enter the size of list:
// 5
// Enter the elements:
// apple
// lichi
// watermelon
// apple
// banana
// Print the frequency of all elements:
// {banana=1, apple=2, lichi=1, watermelon=1}
