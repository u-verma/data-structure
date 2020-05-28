package com.org.easysolution.searching;

public class BinarySearchRecursive {

    public static void main(String[] args) {
        int[] sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int number = 11;
        int index = search(number, sorted, 0, sorted.length - 1);
        System.out.println("number is at Index: " + index);
    }

    private static int search(int number, int[] sorted, int lowerBound, int upperBound) {
        if (lowerBound < upperBound) {
            int middleIndex = (lowerBound + upperBound) / 2;
            if (sorted[middleIndex] == number) {
                return middleIndex;
            } else if (number > sorted[middleIndex]) {
                return search(number, sorted, middleIndex + 1, upperBound);
            } else {
                return search(number, sorted, lowerBound, middleIndex - 1);
            }
        }
        return -1;
    }

}
