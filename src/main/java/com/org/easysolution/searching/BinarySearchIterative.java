package com.org.easysolution.searching;

public class BinarySearchIterative {

    public static void main(String[] args) {
        int[] sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int number = 15;
        int index = searchNumber(number, sorted);
        System.out.println("number is at Index: " + index);
    }

    private static int searchNumber(int number, int[] sorted) {

        int lowerBoundIndex = 0;
        int upperBoundIndex = sorted.length - 1;
        int middleIndex = (lowerBoundIndex + upperBoundIndex) / 2;
        int counter = 0;

        while (lowerBoundIndex <= upperBoundIndex) {
            if (sorted[middleIndex] == number) {
                return middleIndex;
            } else if (number > sorted[middleIndex]) {
                lowerBoundIndex = middleIndex + 1;
            } else {
                upperBoundIndex = middleIndex - 1;
            }
            middleIndex = (lowerBoundIndex + upperBoundIndex) / 2;
            counter++;
            System.out.println("Number of iteration" + counter);
        }

        return -1;
    }
}
