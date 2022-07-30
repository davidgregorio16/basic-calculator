
// 07/26/2022

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        inputNumber();
    }
    
    static void wait(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    static void clearConsole() {
        System.out.println(new String(new char[10]).replace("\0", "\r\n"));
    }
    
    static void inputNumber() {
        Scanner scan = new Scanner(System.in);
        
        clearConsole();
        System.out.print("\tNumber: ");
        int num1 = scan.nextInt();
        System.out.print("\t(+, -, *, /, %): ");
        char operator = scan.next().charAt(0);
        System.out.print("\tNumber: ");
        int num2 = scan.nextInt();
        
        switch (operator) {
            case '+':
                System.out.println("\n\tResult: " + (num2 + num1));
                wait(2000);
                clearConsole();
                inputNumber();
                break;
            case '-':
                System.out.println("\n\tResult: " + (num2 - num1));
                wait(2000);
                clearConsole();
                inputNumber();
                break;
            case '*':
                System.out.println("\n\tResult: " + (num2 * num1));
                wait(2000);
                clearConsole();
                inputNumber();
                break;
            case '/':
                System.out.println("\n\tResult: " + (num2 / num1));
                wait(2000);
                clearConsole();
                inputNumber();
                break;
            case '%':
                System.out.println("\n\tResult: " + (num2 % num1));
                wait(2000);
                clearConsole();
                inputNumber();
                break;
            default:
                System.out.println("\n\tInvalid operator!");
                wait(2000);
                clearConsole();
                inputNumber();
        }
        scan.close();
    }
    
}
