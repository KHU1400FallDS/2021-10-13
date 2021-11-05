import java.util.Scanner;

public class QuizProblem04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        collatz(n);
    }

    private static void collatz(int current) {
        if (current == 1) {
            System.out.println("1");
            return;
        }

        System.out.print(current + " ");

        if (current % 2 == 0)
            collatz(current / 2);
        else
            collatz(3 * current + 1);
    }
}
