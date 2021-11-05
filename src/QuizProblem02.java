import java.util.Scanner;

public class QuizProblem02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        System.out.print("0 1 ");
        fibonacci(n, 0, 1);
    }

    private static void fibonacci(int n, int first, int second) {
        int current = first + second;

        if (current > n)
            return;

        System.out.print(current + " ");

        fibonacci(n, second, current);
    }
}
