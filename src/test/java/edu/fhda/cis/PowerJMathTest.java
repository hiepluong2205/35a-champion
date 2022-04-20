package edu.fhda.cis;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PowerJMathTest {

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testSqrt() {
        double accuracyRate = 0.0001;
        long n1 = 35;

        PowerJMath powerJMath1 = new PowerJMath(accuracyRate);
        double result = powerJMath1.sqrt(n1);
        System.out.println(result);
    }
}