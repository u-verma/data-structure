package com.org.easysolution.sorting;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SelectionSortTest {

    private SelectionSort underTest =  new SelectionSort();
    private int[] unsorted = {6, 8, 10, 7, 2, 3, 9, 12, 0, 8, 1, 4, 5, 11};
    private int[] sorted = {0, 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 11, 12};

    @Test
    void shouldSortAnIntegerArray() {
        int[] result = underTest.sort(unsorted);
        assertThat(result).isEqualTo(sorted);
    }
}