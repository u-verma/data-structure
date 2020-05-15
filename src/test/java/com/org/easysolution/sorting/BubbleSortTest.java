package com.org.easysolution.sorting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BubbleSortTest {

    private BubbleSort underTest = new BubbleSort();
    private int[] unsorted = {6, 11, 7, 2, 4, 10, 12, 0, 5, 1, 8, 9, 3};
    private int[] sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    @Test
    void shouldSortAnIntegerArray() {
        int[] result = underTest.sort(unsorted);
        assertThat(result).isEqualTo(sorted);
    }

}