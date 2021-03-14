package calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {

    private static final Logger logger = LogManager.getLogger(Calc.class);

    public Calc(){

    }

    public static void main(String[] args) {
        Calc calculator = new Calc();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the operation that you want to perform");
            System.out.print("Press 1 to find square root\nPress 2 to Factorial\nPress 3 to Natural Log\nPress 4 to Power\n" +
                    "Press any other key to exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                System.out.println("Thank you for using the calculator");
                return;
            }

            double num;
            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter the number : ");
                        num = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("================================================");
                    System.out.println("Square root is: " + calculator.squareRoot(num));
                    System.out.println("================================================");
                    break;
                case 2:
                    try {
                        System.out.print("Enter the number : ");
                        num = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("================================================");
                    System.out.println("Factorial is: " + calculator.factorial(num));
                    System.out.println("================================================");
                    break;
                case 3:
                    try {
                        System.out.print("Enter the number : ");
                        num = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("================================================");
                    System.out.println("Natural log is : " + calculator.naturalLog(num));
                    System.out.println("================================================");
                    break;
                case 4:
                    double num2;
                    try {
                        System.out.print("Enter the first number : ");
                        num = scanner.nextDouble();
                        System.out.print("Enter the second number : ");
                        num2 = scanner.nextDouble();
                    } catch (InputMismatchException error) {
                        logger.error("Invalid input, Entered input is not a number");
                        return;
                    }
                    System.out.println("================================================");
                    System.out.println("Power result is : " + calculator.power(num, num2));
                    System.out.println("================================================");
                    break;
                default:
                    System.out.println("================================================");
                    System.out.println("Thank you for using the calculator");
                    System.out.println("================================================");
                    return;
            }
        } while (true);

    }

    public double power(double num, double num2) {
        double result;
        logger.info("Calculating Power  of two numbers " + num + " and " + num2);
        result = Math.pow(num, num2);
        logger.info("Result of power is : " + result);
        return Math.pow(num, num2);
    }

    public double naturalLog(double num) {
        double result = 0;
        try{
            logger.info("Calculating Natural log of " + num);
            if(num <= 0){
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN log of <= 0");
            }
            else{
                result = Math.log(num);
            }
        }
        catch(ArithmeticException err){
            logger.error("Number cannot be negative " + err.getMessage());
        }
        finally {
            logger.info("Result of naturalLog is : " + result);
        }
        return result;
    }

    public double factorial(double num) {
        double result = 1;
        try{
            if(num < 0) {
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN factorial if < 0");
            }

            if(num == 0 || num == 1) return 1;

            for(int i = 1; i <= num; i++){
                result *= i;
            }
        }
        catch(ArithmeticException err) {
            logger.error("Number cannot be negative " + err.getMessage());
        }
        finally {
            logger.info("Result of factorial is: " + result);
        }

        return result;
    }

    public double squareRoot(double num) {
        double result = 0;
        try{
            logger.info("Calculating Square root  of number " + num);
            if(num < 0){
                result = Double.NaN;
                throw new ArithmeticException("Case of NaN squareRoot of < 0");
            }
            else{
                result = Math.sqrt(num);
            }
        }catch(ArithmeticException err){
            logger.error("Number cannot be negative " + err.getMessage());
        }finally {
            logger.info("Result of squareRoot is : " + result);
        }

        return result;
    }
}