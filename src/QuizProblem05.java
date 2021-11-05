import java.util.Scanner;

public class QuizProblem05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        drawShape(n);
    }

    private static void drawShape(int current) {
        if (current == 1) {
            System.out.println("*");
            return;
        }

        drawLine(current);
        drawShape(current - 1);
        drawLine(current);
    }

    private static void drawLine(int remainingStarCount) {
        if (remainingStarCount == 0) {
            System.out.println();
            return;
        }

        System.out.print("*");

        drawLine(remainingStarCount - 1);
    }
}
