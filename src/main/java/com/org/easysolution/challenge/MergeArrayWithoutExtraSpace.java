package com.org.easysolution.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.stream.Stream;

import static com.org.easysolution.util.CommonUtil.printElement;

public class MergeArrayWithoutExtraSpace {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read fist line
        StringTokenizer numberOfTestCases = new StringTokenizer(br.readLine());
        int testCases = Integer.parseInt(numberOfTestCases.nextToken());

        while (testCases > 0) {

            //reading the length of array;
            br.readLine();

            int[] sortedArray1 = Stream.of(br.readLine().split(" "))
                    .mapToInt(token -> Integer.parseInt(token))
                    .toArray();

            int[] sortedArray2 = Stream.of(br.readLine().split(" "))
                    .mapToInt(token -> Integer.parseInt(token))
                    .toArray();

            mergeArray(sortedArray1, sortedArray2);
            testCases--;
        }

    }

    private static void mergeArray(int[] elements1, int[] elements2) {
        int lastIndex = elements1.length - 1;
        int firstIndex = 0;

        while (elements1[lastIndex] > elements2[firstIndex]) {
            swap(elements1, elements2, lastIndex, firstIndex);

            // perform insertion sort on each array seperatly
            // insertion sort is faster on nearly sorted array;
            sort(elements1);
            sort(elements2);
        }

        System.out.println(Arrays.toString(elements1));
        System.out.println(Arrays.toString(elements2));

    }

    private static void sort(int[] elements) {
        int lastIndex = elements.length - 1;
        for (int outerIndex = 0; outerIndex < lastIndex; outerIndex++) {
            int sortedIndex = outerIndex + 1;
            while (sortedIndex > 0 && elements[sortedIndex] < elements[sortedIndex - 1]) {
                swap(elements, sortedIndex, sortedIndex - 1);
                sortedIndex--;
            }
        }
    }

    private static void swap(int[] elements1, int[] elements2, int index1, int index2) {
        int temp = elements1[index1];
        elements1[index1] = elements2[index2];
        elements2[index2] = temp;
    }

    private static void swap(int[] elements, int index1, int index2) {
        int temp = elements[index1];
        elements[index1] = elements[index2];
        elements[index2] = temp;
    }

    private void shellSort(int[] elements) {
        int arrayLength = elements.length;
        int gapSequence = elements.length/ 4;
        while (gapSequence > 0) {
            for (int currentIndex = 0; currentIndex < arrayLength; currentIndex++) {
                int swapIndex = currentIndex + gapSequence;
                if (swapIndex >= arrayLength) {
                    break;
                } else if (elements[currentIndex] > elements[swapIndex]) {
                    swap(elements, currentIndex, swapIndex);
                }
                printElement(elements);
            }
            gapSequence--;
        }
        printElement(elements);
    }

}