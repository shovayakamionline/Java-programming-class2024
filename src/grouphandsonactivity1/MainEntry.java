package grouphandsonactivity1;

import java.util.Scanner;

public class MainEntry {
    public static void main(String[] args) {

        Calc<Integer> add = new Calc<Integer>() {
            @Override
            public Integer compute(Integer a, Integer b) {
                return a+b;
            }
        };
        Calc<Integer> subtract = new Calc<Integer>() {
            @Override
            public Integer compute(Integer a, Integer b) {
                return a-b;
            }
        };
        Calc<Integer> multiply = new Calc<Integer>() {
            @Override
            public Integer compute(Integer a, Integer b) {
                return a*b;
            }
        };
        Calc<Integer> divide = new Calc<Integer>() {
            @Override
            public Integer compute(Integer a, Integer b) {
                return a/b;
            }
        };
        Scanner input = new Scanner(System.in);
        String op ;
        Integer a;
        Integer b;


        do {
                System.out.println("Enter the first number: ");
                a = input.nextInt();
                System.out.println("Enter the second number: ");
                b = input.nextInt();
                System.out.println("Enter the operation: (add, subtract, multiply, divide, quit)");
                op = input.next();
                Integer result;
            switch (op){
                case "add":
                    result = (Integer) add.compute(a,b);
                    System.out.println("Answer: "+ result);
                    break;
                case "subtract":
                    result = (Integer) subtract.compute(a,b);
                    System.out.println("Answer: "+ result);
                    break;
                case "multiply":
                    result = (Integer) multiply.compute(a,b);
                    System.out.println("Answer: "+ result);
                    break;
                case "divide":
                    result = (Integer) divide.compute(a,b);
                    System.out.println("Answer: "+ result);
                    break;
                case "quit":
                    System.out.println("Quiting calculator");
                    break;
                default:
                    System.out.println("Invalid operation. Select from add, subtract, multiply, divide, quit");
                    break;
            }
        }while (!op.equals("quit"));

    }
}
