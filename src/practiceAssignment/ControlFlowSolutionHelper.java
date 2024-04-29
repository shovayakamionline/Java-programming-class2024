package practiceAssignment;

import java.util.Scanner;
//PA 303.4.1  - Practice Assignment Control Flow (Conditional) Statements

public class ControlFlowSolutionHelper {

    //Q-1
    public void useIfStatement() {
        int x;
        x = 7;
        x = 15;
        if (x < 10) {
            System.out.println("Less than 10");
        }
    }

    //Q-2
    public void useIfStatement2() {
        int x = 7;
        x = 15;

        if (x < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }
    }

    //Q-3
    public void useIfStatement3() {
        int x;
        x = 15;
        x = 50;

        if (x < 10) {
            System.out.println("Less than 10");
        } else if (x > 10 && x < 20) {
            System.out.println("Between 10 and 20");
        } else if (x >= 20) {
            System.out.println("Greater than or equal to 20");
        } else {
            System.out.println("Print something else.");
        }
    }

    //Q-4
    public void useIfStatement4() {
        int x;
        x = 15;
        x = 5;

        if (x < 10 || x > 20) {
            System.out.println("Out of range");
        } else if (x >= 10 && x < 20) {
            System.out.println("In range");
        } else {
            System.out.println("Print something ");
        }
    }

    //Q-5
    public void useIfStatement5() {
        System.out.println("Please Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.print("A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D");
        } else if (score < 60 && score >= 0) {
            System.out.println("F");
        } else {
            System.out.println("Score out of range");
        }
    }

    //Q-6
    public void useSwitchStatement() {

        System.out.println("Enter the number of day: ");
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Out of range");
        }

    }

    //    Q-7
    public void calculateTax() {
        System.out.println("Enter the your income: ");
        Scanner scanner = new Scanner(System.in);
        double income = scanner.nextDouble();

        scanner.nextLine();
        System.out.println("Enter the filing status: ");
        String filingStatus = scanner.nextLine();

        double tax = 0.0;
        switch (filingStatus) {
            case "Single":
                if (income >= 0 && income <= 8350) {
                    tax = 0.10 * income;
                } else if (income >= 8351 && income <= 33950) {
                    tax = 0.15 * income;
                } else if (income >= 33951 && income <= 82250) {
                    tax = 0.25 * income;
                } else if (income >= 82251 && income <= 171550) {
                    tax = 0.28 * income;
                } else if (income >= 171551 && income <= 372950) {
                    tax = 0.33 * income;
                } else if (income >= 372951) {
                    tax = 0.35 * income;
                }
                break;
            case "Qulifying Widow(er)":
            case "Married Filing Jointly":
                if (income >= 0 && income <= 16700) {
                    tax = 0.10 * income;
                } else if (income >= 8351 && income <= 33950) {
                    tax = 0.15 * income;
                } else if (income >= 33951 && income <= 82250) {
                    tax = 0.25 * income;
                } else if (income >= 82251 && income <= 171550) {
                    tax = 0.28 * income;
                } else if (income >= 171551 && income <= 372950) {
                    tax = 0.33 * income;
                } else if (income >= 372951) {
                    tax = 0.35 * income;
                }
                break;
            case "Married Filing Separately":
                if (income >= 0 && income <= 8350) {
                    tax = 0.10 * income;
                } else if (income >= 8351 && income <= 33950) {
                    tax = 0.15 * income;
                } else if (income >= 33951 && income <= 82250) {
                    tax = 0.25 * income;
                } else if (income >= 82251 && income <= 171550) {
                    tax = 0.28 * income;
                } else if (income >= 171551 && income <= 186475) {
                    tax = 0.33 * income;
                } else if (income >= 186476) {
                    tax = 0.35 * income;
                }
                break;
            case "Head of Household":
                if (income >= 0 && income <= 11950) {
                    tax = 0.10 * income;
                } else if (income >= 11951 && income <= 45500) {
                    tax = 0.15 * income;
                } else if (income >= 45501 && income <= 117450) {
                    tax = 0.25 * income;
                } else if (income >= 117451 && income <= 190200) {
                    tax = 0.28 * income;
                } else if (income >= 190201 && income <= 372950) {
                    tax = 0.33 * income;
                } else if (income >= 372951) {
                    tax = 0.35 * income;
                }
        }
        System.out.println("The tax is: " + tax);
    }
}
