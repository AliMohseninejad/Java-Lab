package com.examples.Calc;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in) ;

        while (true) {

            System.out.println("Enter operation:");
            String Operation = scanner.next();

            if (Operation.equals("quit")) {
                System.out.println("Program terminated!");
                break;
            }

            System.out.println("Enter the first number:");
            //float num1 = scanner.nextFloat();
            int num1 = scanner.nextInt();

            System.out.println("Enter the second number:");
            //float num2 = scanner.nextFloat();
            int num2 = scanner.nextInt();


            int Result = 0;
            switch (Operation) {

                case "add":
                    Result = num1 + num2;
                    System.out.println("Output is " + Result);
                    break;

                case "subtract":
                    Result = num1 - num2;
                    System.out.println("Output is " + Result);
                    break;

                case "multiply":
                    Result = num1 * num2;
                    System.out.println("Output is " + Result);
                    break;

                case "divide":
                    try {
                        Result = num1 / num2;
                    }
                    catch (ArithmeticException AEO){
                        System.out.println("Divide by zero!");
                        break;
                    }
                    System.out.println("Output is " + Result);
                    break;

                default:
                    System.out.println("Invalid operation!");
                    break;
                    
            }

        }

    }
}
