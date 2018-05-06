package org.launchcode.java.exercises;


import java.util.ArrayList;
import java.util.List;

public class LoopArray {
    public static void main(String[] args){
        int array[] = {1, 1, 2, 3, 5, 8};
        int temp;
        ArrayList<Integer> otherList = new ArrayList<>();

        /* Prints each on a new line */
        for(int i : array) {
            temp = i;
            System.out.println(temp);
        }

        /* Prints each on same line */
        for(int j : array) {
            temp = j;
            System.out.print(temp + ", ");
        }

        /* Adds to the otherList array, and then prints it out */
        otherList.add(6);
        otherList.add(7);
        otherList.add(8);
        otherList.add(9);
        otherList.add(12);

        for(int k : otherList) {
            temp = k;
            System.out.print(temp);
        }
    }
}
