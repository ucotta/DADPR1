package edu.uoc.ds.adt;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0ArrayTest {
    PR0Array pr0Array;

    @Before
    public void setUp() {
        this.pr0Array = new PR0Array();

        assertNotNull(this.pr0Array.getArray());
    }

    @After
    public void release() {
        this.pr0Array = null;
    }


    @Test
    public void arrayTest() {
        int[] v = this.pr0Array.getArray();
        assertEquals(0, v[0]); assertEquals(2, v[1]); assertEquals(4, v[2]); assertEquals(6, v[3]); assertEquals(8, v[4]); // ..
        assertEquals(98, v[49]);
    }

    @Test
    public void searchArray() {
        int index = this.pr0Array.getIndexOf(41); assertEquals(-1, index);
        index = this.pr0Array.getIndexOf(14); assertEquals(7, index);
        index = this.pr0Array.getIndexOf(48);
        assertEquals(24, index);
    }

    @Test
    public void binarySearchArray() {
        int index = this.pr0Array.binarySearch(41); assertEquals(-1, index);
        index = this.pr0Array.binarySearch(14);
        assertEquals(7, index);
    }

    @Test
    public void binarySearchArrayFull() {
        // test limits upper/lower
        assertEquals(-1, this.pr0Array.binarySearch(1500));
        assertEquals(-1, this.pr0Array.binarySearch(-1));

        // test all values and not existing values
        for(int i=0; i<50; i++) {
            assertEquals(this.pr0Array.binarySearch(i*2), i);
            assertEquals(this.pr0Array.binarySearch(i*2-1), -1);
        }
    }


}
