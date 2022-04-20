/*
 * Hiep Tuan Luong
 * Class and Section: CIS 35A - Java Programming by Professor Sukhjit Singh
 * Lab 1
 * Due:
 * Submitted:
 */

package edu.fhda.cis;

import java.util.Scanner;

//https://deanza.instructure.com/courses/23660/assignments/678800
//5.22 (Loan Amortization Schedule): https://deanza.instructure.com/courses/23660/files/6452161/download?wrap=1
public class LoanManager {

    double interestRateAnnual, interestMonthly, principal, balance, interestRateMonthly, paymentMonthly, principalPaidMonthly = paymentMonthly - interestMonthly, loanAmount, totalPayment = paymentMonthly * 12, tbd;
    int termInYear, termInMonth = termInYear * 12;

    public LoanManager() {
        Scanner scanner = new Scanner(System.in);
        interestRateAnnual = scanInterestRateAnnual();
        loanAmount = scanLoanAmount();
        termInYear = scanTermInYear();
        balance = principal;
    }

    public void calculateAmortizationSchedule(double loanAmount, int termInYear, double annualInterestRate) {
        paymentMonthly = 0;
        for (int i = 1; i < termInMonth; i++) {
            interestMonthly = interestRateMonthly * balance;
            principal = paymentMonthly - interestMonthly;
            balance = balance - principal;
            System.out.println(i + "\t\t" + interestMonthly + "\t\t" + principal + "\t\t" + balance);
        }
//        for (int i = 1; i <= loanTime * 12; i++) {
//            float interest = (loanAmount * (interestRate / 100f) / 12);
//            float monthly_p = monthlyPayment - interest;
//            loanAmount = monthly_p;
//            System.out.printf("%-15d%-10.2f%-10.2f%-10.2f\n", i, interest, monthly_p, loanAmount);
//            sc.close();
    }

    private void printToTable() {

    }

    private void calculateMonthlyPayment() {
        interestRateMonthly = interestRateAnnual / 12;
        paymentMonthly = (loanAmount * interestRateMonthly * Math.pow(interestRateMonthly + 1, termInMonth)) / (Math.pow(interestRateMonthly + 1, termInMonth) - 1);
    }

    protected double scanInterestRateAnnual() {
//    annualInterestRate = annualInterestRate / 100;
        Scanner scanner = new Scanner(System.in);
        interestRateAnnual = scanner.nextDouble();
        return interestRateAnnual;
    }

    protected int scanTermInYear() {
        return 0;
    }

    protected float scanLoanAmount() {
        return 0;
    }
}
