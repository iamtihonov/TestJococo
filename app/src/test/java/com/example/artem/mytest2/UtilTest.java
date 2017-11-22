package com.example.artem.mytest2;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilTest {
    @Test
    public void plus() throws Exception {
        assertNotNull(new Util());
        assertEquals(5, Util.plus(2, 3));
    }
}