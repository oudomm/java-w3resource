package basic.part1;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input width = ");
        double width = scanner.nextDouble();
        System.out.print("Input height = ");
        double height = scanner.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.printf("Area is " + width + " * " + height + " = %.2f\n", area);
        System.out.printf("Perimeter is 2 * (" + width + " + " + height + ") = %.2f", perimeter);
    }
}
