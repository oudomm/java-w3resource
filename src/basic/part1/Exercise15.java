package basic.part1;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Before: num1 = " + num1 + ", num2 = " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Before: num1 = " + num1 + ", num2 = " + num2);
    }
}
