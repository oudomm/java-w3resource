package basic.part1;

public class Exercise14 {
    public static void main(String[] args) {
        String sixStarsLine = "* * * * * * ==================================";
        String fiveStarLine = " * * * * *  ==================================";
        String noStarLine = "==============================================";

        for (int i = 1; i <= 9; i++) {
            if (i % 2 != 0) {
                System.out.println(sixStarsLine);
            } else {
                System.out.println(fiveStarLine);
            }
        }

        for (int i = 1; i <= 6; i++) {
            System.out.println(noStarLine);
        }

    }
}
