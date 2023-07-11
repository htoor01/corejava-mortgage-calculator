package com.mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    public static void main(String[] args){

        int months = 12;
        int percent = 100;

        //   Input from terminal

        Scanner scan = new Scanner(System.in);

        System.out.print("Principal amount: ");
        int principal = scan.nextInt();

        System.out.print("Annual Interest rate: ");
        float rate = scan.nextFloat() / months / percent;

        System.out.print("Period (Years): ");
        int numberOfPayments = scan.nextInt() * months;

        //   Calculation

        double numerator = rate * (Math.pow((1+rate),numberOfPayments));

        double denominator = (Math.pow((1+rate),numberOfPayments))-1;

        double mortgage = principal * ( numerator / denominator );

        String mortgageFormat = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " + mortgageFormat);

    }

}
