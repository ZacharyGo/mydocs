package com.fujitsu.ph.junit.exercise1;

import static org.junit.Assert.*;

import org.junit.Test;

public class KeepHydratedTest {

    @Test
    public void testComputeLiters() {
        KeepHydrated keepHydrated = new KeepHydrated();
        //TODO: assertEquals(expected, keepHydrated.computeLiters(value), 0.01);
    }

    @Test //TODO(expected=exception here)
    public void testComputeLiters_NotAPositiveNumber() {
        KeepHydrated keepHydrated = new KeepHydrated();
        //TODO: keepHydrated.computeLiters(value);
    }

}