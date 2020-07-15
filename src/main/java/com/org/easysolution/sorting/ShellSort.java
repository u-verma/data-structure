package com.org.easysolution.sorting;

import static com.org.easysolution.util.CommonUtil.printElement;
import static com.org.easysolution.util.CommonUtil.swap;

public class ShellSort {

    public static void main(String[] args) {
        int[] unsorted = {6, 3, 7, 2, 10, 4, 5, 0, 12, 6, 1, 8, 9, 3, 11};
        new ShellSort().sort(unsorted);
    }

    private void sort(int[] elements) {
        int size = elements.length;
        int gapSequence = nextGap(size);
        while (gapSequence > 0) {
            for (int currentIndex = 0; currentIndex + gapSequence < size; currentIndex++) {
                if (elements[currentIndex] > elements[currentIndex + gapSequence]) {
                    swap(elements, currentIndex, currentIndex + gapSequence);
                }
                printElement(elements);
            }
            gapSequence = nextGap(gapSequence);
        }
        printElement(elements);
    }

    private int nextGap(int gap) {
        return gap <= 1 ? 0 : ((gap / 2) + (2*gap % 2) ) - (gap % 2);
    }
}
