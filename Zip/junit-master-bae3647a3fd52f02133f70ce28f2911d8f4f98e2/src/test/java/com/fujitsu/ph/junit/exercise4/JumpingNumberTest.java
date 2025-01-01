package com.fujitsu.ph.junit.exercise4;

import static org.junit.Assert.*;

import org.junit.Test;

public class JumpingNumberTest {

    @Test
    public void testIsJumpingNumber_Single() {
        assertTrue(JumpingNumber.isJumpingNumber(9));
    }

    @Test
    public void testIsJumpingNumber_DecreaseBy1() {
        assertTrue(JumpingNumber.isJumpingNumber(87));
    }

    @Test
    public void testIsJumpingNumber_NotIncreaseBy1() {
        assertFalse(JumpingNumber.isJumpingNumber(79));
    }

    @Test(expected=IllegalArgumentException.class)
    public void testIsJumpingNumber_IsNegative() {
        JumpingNumber.isJumpingNumber(-1);
    }

}
