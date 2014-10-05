package com.petermuller.pile;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test class for the RESTful API
 */
public class PileAppTest {

    /**
     * Tests to show that testing works
     */
    @Test
    public void testPing() {
        Assert.assertEquals(new SimpleResponse("Pong! (Success!)"),PileApp.ping());
    }
}
