package practiceAssignment;

import java.util.Scanner;

public class PATaxCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the your income: ");
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Enter the filing status: ");
        String filingStatus = scanner.nextLine();

        double tax = 0.0;
        switch(filingStatus) {
            case "Single" :
                if (income >=0 && income <= 8350) {
                    tax = 0.10 * income;
                } else if (income >= 8351 && income <=33950) {
                    tax = 0.15 * income;
                } else if (income >= 33951 && income <= 82250) {
                    tax = 0.25 * income;
                } else if (income >= 82251 && income <=171550) {
                    tax = 0.28 * income;
                } else if (income >= 171551 && income <= 372950) {
                    tax = 0.33 * income;
                }else if (income >= 372951) {
                    tax = 0.35 * income;
                }
                break;
            case "Qulifying Widow(er)":
            case "Married Filing Jointly" :
                if (income >=0 && income <= 16700) {
                    tax = 0.10 * income;
                } else if (income >= 8351 && income <=33950) {
                    tax = 0.15 * income;
                } else if (income >= 33951 && income <= 82250) {
                    tax = 0.25 * income;
                } else if (income >= 82251 && income <=171550) {
                    tax = 0.28 * income;
                } else if (income >= 171551 && income <= 372950) {
                    tax = 0.33 * income;
                }else if (income >= 372951) {
                    tax = 0.35 * income;
                }
                break;
            case "Married Filing Separately" :
                if (income >=0 && income <= 8350) {
                    tax = 0.10 * income;
                } else if (income >= 8351 && income <=33950) {
                    tax = 0.15 * income;
                } else if (income >= 33951 && income <= 82250) {
                    tax = 0.25 * income;
                } else if (income >= 82251 && income <=171550) {
                    tax = 0.28 * income;
                } else if (income >= 171551 && income <= 186475) {
                    tax = 0.33 * income;
                }else if (income >= 186476) {
                    tax = 0.35 * income;
                }
                break;
            case "Head of Household":
                if (income >=0 && income <= 11950) {
                    tax = 0.10 * income;
                } else if (income >= 11951 && income <= 45500) {
                    tax = 0.15 * income;
                } else if (income >= 45501 && income <= 117450) {
                    tax = 0.25 * income;
                } else if (income >= 117451 && income <=190200) {
                    tax = 0.28 * income;
                } else if (income >= 190201 && income <= 372950) {
                    tax = 0.33 * income;
                }else if (income >= 372951) {
                    tax = 0.35 * income;
                }
        }
        System.out.println("The tax is: " + tax);
    }
}

