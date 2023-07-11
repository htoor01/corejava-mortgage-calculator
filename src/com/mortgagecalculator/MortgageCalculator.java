package com.mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args) {

        // Constant values that will never change

        final int months = 12;
        final int percent = 100;

        // Initialize these variables in order to access in and out of the while-loop
        // In this example, this is redundant. Cleaning up code is required.

        int principal = 0;
        float inputRate = 0;
        int inputNumberOfPayments = 0;

        //   Create scanner to read user input from terminal

        Scanner scan = new Scanner(System.in);

        //   Principal input
        //   While-loop runs through until complies with boolean, then breaks

        while (true) {
            System.out.print("Principal amount (1K - 1M): ");
            principal = scan.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1,000 and 1,000,000.");
        }

        //   Interest rate input
        //   While-loop runs through until complies with boolean, then breaks

        while (true) {
            System.out.print("Annual Interest rate: ");
            inputRate = scan.nextFloat();
            if (inputRate > 0 && inputRate < 30)
                break;
            System.out.println("Enter a rate greater than 0 and less than 30.");
        }

        //   Period length input
        //   While-loop runs through until complies with boolean, then breaks

        while (true) {
            System.out.print("Period (Years): ");
            inputNumberOfPayments = scan.nextInt();
            if (inputNumberOfPayments >= 0 && inputNumberOfPayments <= 30)
                break;
            System.out.println("Enter a period between 0 and 30 years.");
        }

        //   Calculation

        float rate = inputRate / months / percent;

        int numberOfPayments = inputNumberOfPayments * months;

        double numerator = rate * (Math.pow((1+rate),numberOfPayments));

        double denominator = (Math.pow((1+rate),numberOfPayments))-1;

        double mortgage = principal * ( numerator / denominator );

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Calculated Mortgage: " + mortgageFormat);

    }

}