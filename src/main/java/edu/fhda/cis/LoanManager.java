package edu.fhda.cis;

public class LoanManager {
    float loanAmount, annualInterestRate, monthlyInterest, monthlyPayment, balance, monthlyInterestRate,
            principal = balance,
            monthlyPrincipalPaid = monthlyPayment - monthlyInterest,
            totalPayment = monthlyPayment * 12;
    int loanTime;

    public void main() {
        loanAmount = getLoanAmount();
        loanTime = getLoanTimeInYear();
        annualInterestRate = getAnnualInterestRate();
        printToTable();
    }

    private void printToTable() {
    }

    private void calculateMonthlyPayment() {
        float i = monthlyInterestRate;
        monthlyInterestRate = annualInterestRate / 12;
        int n = loanTime * 12;
        monthlyPayment = (loanAmount * i * Math.pow(i + 1, n)) / (Math.pow(i + 1, n) - 1);
    }

    private float getAnnualInterestRate() {
//    annualInterestRate = annualInterestRate / 100;
        return 0;
    }

    private int getLoanTimeInYear() {
        return 0;
    }

    private float getLoanAmount() {
        return 0;
    }
}
