package edu.fhda.cis;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoanManagerTest {
    LoanManager loanManager;

    @BeforeMethod
    public void setUp() {
        loanManager = new LoanManager();
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void test1() {
        double loanAmount, interestRateAnnual;
        int termInYear;

        loanAmount = loanManager.scanLoanAmount();
        interestRateAnnual = loanManager.scanInterestRateAnnual();
        termInYear = loanManager.scanTermInYear();

        loanManager.calculateAmortizationSchedule(loanAmount, termInYear, interestRateAnnual);
    }
}