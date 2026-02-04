package basic.part1;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("num1 = ");
        double num1 = scanner.nextDouble();
        System.out.print("num2 = ");
        double num2 = scanner.nextDouble();
        System.out.print("num3 = ");
        double num3 = scanner.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average = " + average);
    }
}
