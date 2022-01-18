package edu.fhda.cis;

public class LoanManager {
    double annualInterestRate,
            monthlyInterest,
            balance,
            monthlyInterestRate,
            principal = balance,
            monthlyPayment,
            monthlyPrincipalPaid = monthlyPayment - monthlyInterest,
            loanAmount,
            totalPayment = monthlyPayment * 12;
    int loanTimeInYear,
            loanTimeInMonth = loanTimeInYear * 12;

    public void main() {
        loanAmount = getLoanAmount();
        loanTimeInYear = getLoanTimeInYear();
        annualInterestRate = getAnnualInterestRate();
        printToTable();
    }

    private void printToTable() {
    }

    private void calculateMonthlyPayment() {
        monthlyInterestRate = annualInterestRate / 12;
        monthlyPayment = (loanAmount * monthlyInterestRate * Math.pow(monthlyInterestRate + 1, loanTimeInMonth))
                / (Math.pow(monthlyInterestRate + 1, loanTimeInMonth) - 1);
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
