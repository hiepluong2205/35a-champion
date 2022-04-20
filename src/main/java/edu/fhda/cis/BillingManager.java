package edu.fhda.cis;

import java.util.Scanner;

//Assignment 0: https://deanza.instructure.com/courses/23660/assignments/678799

public class BillingManager {
    String[] arrProducts = {"TV", "VCR", "Remote Controller", "CD Player", "Tape Recorder"};
    double[] arrUnitPrice = {400, 220, 35.20, 300.00, 150.00};
    double taxSales = 0.0825;
    int countTV, countVCR, countRC, countCD, countTapeRec;


    public void solution0() {
        scanItemCount();

    }

    public int[] scanItemCount() {
        Scanner in = new Scanner(System.in);

        System.out.println("How many TV's were sold? ");
        countTV = in.nextInt();

        System.out.println("How many VCR's were sold? ");
        countVCR = in.nextInt();

        System.out.println("How many remote controller's were sold? ");
        countRC = in.nextInt();

        System.out.println("How many CD's were sold? ");
        countCD = in.nextInt();

        System.out.println("How many Tape Recorder's were sold? ");
        countTapeRec = in.nextInt();

        int[] arrItemCount = {countTV, countVCR, countRC, countCD, countTapeRec};
        return arrItemCount;
    }

    public void createBill(int[] arrItemCount) {
// Print the header
        System.out.printf("\t%2s\t%-30s\t\t%15s\t\t%15s\n", "#", "Description", "Unit Price", "Total Price");
// Desc Unit Price Total Price
        System.out.printf("\t%2d\t%-30s\t\t%15.2f\t\t%15.2f\n", countTV, "TV", arrUnitPrice[0], calculateTotalPrice("TV", countTV));

        for (int i = 0; i < arrItemCount.length; i++) {

        }
    }

    public int calculateTotalPrice(String productType, int intUnitCount) {

        return 0;
    }
}
