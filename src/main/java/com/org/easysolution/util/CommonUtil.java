package com.org.easysolution.util;

import lombok.experimental.UtilityClass;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@UtilityClass
public class CommonUtil {

    private static final Logger LOG = Logger.getLogger(CommonUtil.class.getName());

    public static void swapIndexValue(int[] unsorted, int currentIndex, int index) {
        int temp = unsorted[currentIndex];
        unsorted[currentIndex] = unsorted[index];
        unsorted[index] = temp;
    }

    public static void printElement(int[] elementsToSort) {
        LOG.log(Level.INFO, IntStream.of(elementsToSort)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining(", ")));
    }
}
