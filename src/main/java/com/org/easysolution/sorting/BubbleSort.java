package com.org.easysolution.sorting;

import static com.org.easysolution.util.CommonUtil.printElement;
import static com.org.easysolution.util.CommonUtil.swapIndexValue;

public class BubbleSort {

    public int[] sort(int[] elementsToSort) {
        int length = elementsToSort.length;
        boolean isSwapped;
        for (int forwardIndex = 0; forwardIndex < length; forwardIndex++) {
            isSwapped = false;
            for (int currentIndex = 0; currentIndex < length - 1 - forwardIndex; currentIndex++) {
                if (elementsToSort[currentIndex] > elementsToSort[currentIndex + 1]) {
                    swapIndexValue(elementsToSort, currentIndex, currentIndex + 1);
                    isSwapped = true;
                }
            }
            printElement(elementsToSort);
            if (!isSwapped) {
                break;
            }
        }
        return elementsToSort;
    }
}
