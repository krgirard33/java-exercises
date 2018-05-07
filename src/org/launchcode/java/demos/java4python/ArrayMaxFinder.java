package org.launchcode.java.demos.java4python;

public class ArrayMaxFinder {
    private static int findMax(int[] array) {
       int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] x = {10,2,3,8,2,6,3,7,12,1};
        int answer = findMax(x);
        System.out.println(answer);
    }

}
