package com.bridgelabz.listInterface;


import java.util.*;

class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();

        ArrayList<Integer> inputList = new ArrayList<>();
        System.out.print("Enter the elements: ");
        for(int i = 0;i<size;i++){
            inputList.add(scanner.nextInt());
        }

        LinkedList<Integer> linked = new LinkedList<>();
        for(int i=size-1; i>=0 ;i--){
            linked.add(inputList.get(i));
        }

        inputList.clear();

        System.out.println("Printing the elements: ");
        for(int i=0;i<size;i++){
            inputList.add(linked.get(i));
            System.out.print(inputList.get(i)+" ");
        }
    }
}
