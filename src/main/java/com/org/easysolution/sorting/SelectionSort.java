package com.org.easysolution.sorting;

import static com.org.easysolution.util.CommonUtil.printElement;
import static com.org.easysolution.util.CommonUtil.swapIndexValue;

public class SelectionSort {

    public int[] sort(int[] elementsToSort) {
        for (int currentIndex = 0; currentIndex < elementsToSort.length; currentIndex++) {
            for (int index = currentIndex + 1; index < elementsToSort.length; index++) {
                if (elementsToSort[index] < elementsToSort[currentIndex]) {
                    swapIndexValue(elementsToSort, currentIndex, index);
                }
            }
            printElement(elementsToSort);
        }
        return elementsToSort;
    }

}
