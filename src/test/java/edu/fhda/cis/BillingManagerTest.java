package edu.fhda.cis;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BillingManagerTest {
    BillingManager bill1;
    @BeforeMethod
    public void setUp() {
        bill1 = new BillingManager();
    }

    @AfterMethod
    public void tearDown() {
    }
    public void test1(){
    }

    @Test
    public void testOutputFormat() {
        bill1.calculateTotalPrice("TV",10);
    }
}