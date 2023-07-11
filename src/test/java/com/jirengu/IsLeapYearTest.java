package com.jirengu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsLeapYearTest {

    @Test
    public void testIsLeapYear() {
        assertTrue(IsLeapYear.isLeapYear(2000));
        assertFalse(IsLeapYear.isLeapYear(1900));
        assertTrue(IsLeapYear.isLeapYear(2004));
        assertFalse(IsLeapYear.isLeapYear(2001));
    }

}
