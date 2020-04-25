package com.org.easysolution.lineardatastructure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LinkedListTest {

    private LinkedList underTest;

    @BeforeEach
    void setUp(){
        underTest = new LinkedList<String>();
        underTest.add("TestName1");
        underTest.add("TestName2");
        underTest.add("TestName3");
    }

    @Test
    void shouldAddElementInOrderToLinkedList() {
        assertThat(underTest.get(0)).isEqualTo("TestName1");
        assertThat(underTest.get(1)).isEqualTo("TestName2");
        assertThat(underTest.get(2)).isEqualTo("TestName3");
    }

    @Test
    void shouldThrowExceptionIfIndexIsGreaterThanSize(){
        assertThrows(RuntimeException.class, () -> underTest.get(3));
    }
}